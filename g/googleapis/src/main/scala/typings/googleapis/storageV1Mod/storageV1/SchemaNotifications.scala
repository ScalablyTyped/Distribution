package typings.googleapis.storageV1Mod.storageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of notification subscriptions.
  */
@js.native
trait SchemaNotifications extends js.Object {
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[SchemaNotification]] = js.native
  /**
    * The kind of item this is. For lists of notifications, this is always
    * storage#notifications.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaNotifications {
  @scala.inline
  def apply(items: js.Array[SchemaNotification] = null, kind: String = null): SchemaNotifications = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNotifications]
  }
}

