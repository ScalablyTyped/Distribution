package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Customer-level settings.
  */
@js.native
trait SchemaSettings extends js.Object {
  /**
    * The list of notifications.
    */
  var notifications: js.UndefOr[js.Array[SchemaNotification]] = js.native
}

object SchemaSettings {
  @scala.inline
  def apply(notifications: js.Array[SchemaNotification] = null): SchemaSettings = {
    val __obj = js.Dynamic.literal()
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSettings]
  }
}

