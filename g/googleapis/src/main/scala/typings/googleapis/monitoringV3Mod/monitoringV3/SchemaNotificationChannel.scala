package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A NotificationChannel is a medium through which an alert is delivered when
  * a policy violation is detected. Examples of channels include email, SMS,
  * and third-party messaging applications. Fields containing sensitive
  * information like authentication tokens or contact info are only partially
  * populated on retrieval.
  */
@js.native
trait SchemaNotificationChannel extends js.Object {
  /**
    * An optional human-readable description of this notification channel. This
    * description may provide additional details, beyond the display name, for
    * the channel. This may not exceed 1024 Unicode characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * An optional human-readable name for this notification channel. It is
    * recommended that you specify a non-empty and unique name in order to make
    * it easier to identify the channels in your project, though this is not
    * enforced. The display name is limited to 512 Unicode characters.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Whether notifications are forwarded to the described channel. This makes
    * it possible to disable delivery of notifications to a particular channel
    * without removing the channel from all alerting policies that reference
    * the channel. This is a more convenient approach when the change is
    * temporary and you want to receive notifications from the same set of
    * alerting policies on the channel at some point in the future.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Configuration fields that define the channel and its behavior. The
    * permissible and required labels are specified in the
    * NotificationChannelDescriptor.labels of the NotificationChannelDescriptor
    * corresponding to the type field.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The full REST resource name for this channel. The syntax is:
    * projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID]
    * is automatically assigned by the server on creation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the notification channel. This field matches the value of the
    * NotificationChannelDescriptor.type field.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * User-supplied key/value data that does not need to conform to the
    * corresponding NotificationChannelDescriptor&#39;s schema, unlike the
    * labels field. This field is intended to be used for organizing and
    * identifying the NotificationChannel objects.The field can contain up to
    * 64 entries. Each key and value is limited to 63 Unicode characters or 128
    * bytes, whichever is smaller. Labels and values can contain only lowercase
    * letters, numerals, underscores, and dashes. Keys must begin with a
    * letter.
    */
  var userLabels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Indicates whether this channel has been verified or not. On a
    * ListNotificationChannels or GetNotificationChannel operation, this field
    * is expected to be populated.If the value is UNVERIFIED, then it indicates
    * that the channel is non-functioning (it both requires verification and
    * lacks verification); otherwise, it is assumed that the channel works.If
    * the channel is neither VERIFIED nor UNVERIFIED, it implies that the
    * channel is of a type that does not require verification or that this
    * specific channel has been exempted from verification because it was
    * created prior to verification being required for channels of this
    * type.This field cannot be modified using a standard
    * UpdateNotificationChannel operation. To change the value of this field,
    * you must call VerifyNotificationChannel.
    */
  var verificationStatus: js.UndefOr[String] = js.native
}

object SchemaNotificationChannel {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    labels: StringDictionary[String] = null,
    name: String = null,
    `type`: String = null,
    userLabels: StringDictionary[String] = null,
    verificationStatus: String = null
  ): SchemaNotificationChannel = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userLabels != null) __obj.updateDynamic("userLabels")(userLabels.asInstanceOf[js.Any])
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNotificationChannel]
  }
}

