package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupEvent extends LeafletEvent {
  var popup: Popup
}

object PopupEvent {
  @scala.inline
  def apply(popup: Popup, target: js.Any, `type`: java.lang.String): PopupEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("popup")(popup)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[PopupEvent]
  }
}

