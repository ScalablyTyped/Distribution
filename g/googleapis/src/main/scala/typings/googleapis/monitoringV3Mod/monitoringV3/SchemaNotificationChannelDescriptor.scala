package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of a notification channel. The descriptor includes the
  * properties of the channel and the set of labels or fields that must be
  * specified to configure channels of a given type.
  */
@js.native
trait SchemaNotificationChannelDescriptor extends js.Object {
  /**
    * A human-readable description of the notification channel type. The
    * description may include a description of the properties of the channel
    * and pointers to external documentation.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A human-readable name for the notification channel type. This form of the
    * name is suitable for a user interface.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The set of labels that must be defined to identify a particular channel
    * of the corresponding type. Each label includes a description for how that
    * field should be populated.
    */
  var labels: js.UndefOr[js.Array[SchemaLabelDescriptor]] = js.native
  /**
    * The full REST resource name for this descriptor. The syntax is:
    * projects/[PROJECT_ID]/notificationChannelDescriptors/[TYPE] In the above,
    * [TYPE] is the value of the type field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The tiers that support this notification channel; the project service
    * tier must be one of the supported_tiers.
    */
  var supportedTiers: js.UndefOr[js.Array[String]] = js.native
  /**
    * The type of notification channel, such as &quot;email&quot;,
    * &quot;sms&quot;, etc. Notification channel types are globally unique.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaNotificationChannelDescriptor {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    labels: js.Array[SchemaLabelDescriptor] = null,
    name: String = null,
    supportedTiers: js.Array[String] = null,
    `type`: String = null
  ): SchemaNotificationChannelDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (supportedTiers != null) __obj.updateDynamic("supportedTiers")(supportedTiers.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNotificationChannelDescriptor]
  }
}

