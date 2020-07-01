package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for a notification resource.
  */
@js.native
trait SchemaNotification extends js.Object {
  /**
    * Body of the notification (Read-only)
    */
  var body: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Address from which the notification is received (Read-only)
    */
  var fromAddress: js.UndefOr[String] = js.native
  /**
    * Boolean indicating whether the notification is unread or not.
    */
  var isUnread: js.UndefOr[Boolean] = js.native
  /**
    * The type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  var notificationId: js.UndefOr[String] = js.native
  /**
    * Time at which notification was sent (Read-only)
    */
  var sendTime: js.UndefOr[String] = js.native
  /**
    * Subject of the notification (Read-only)
    */
  var subject: js.UndefOr[String] = js.native
}

object SchemaNotification {
  @scala.inline
  def apply(
    body: String = null,
    etag: String = null,
    fromAddress: String = null,
    isUnread: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    notificationId: String = null,
    sendTime: String = null,
    subject: String = null
  ): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fromAddress != null) __obj.updateDynamic("fromAddress")(fromAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnread)) __obj.updateDynamic("isUnread")(isUnread.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notificationId != null) __obj.updateDynamic("notificationId")(notificationId.asInstanceOf[js.Any])
    if (sendTime != null) __obj.updateDynamic("sendTime")(sendTime.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNotification]
  }
}

