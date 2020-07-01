package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for notifications list response.
  */
@js.native
trait SchemaNotifications extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * List of notifications in this page.
    */
  var items: js.UndefOr[js.Array[SchemaNotification]] = js.native
  /**
    * The type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token for fetching the next page of notifications.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Number of unread notification for the domain.
    */
  var unreadNotificationsCount: js.UndefOr[Double] = js.native
}

object SchemaNotifications {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[SchemaNotification] = null,
    kind: String = null,
    nextPageToken: String = null,
    unreadNotificationsCount: js.UndefOr[Double] = js.undefined
  ): SchemaNotifications = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(unreadNotificationsCount)) __obj.updateDynamic("unreadNotificationsCount")(unreadNotificationsCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNotifications]
  }
}

