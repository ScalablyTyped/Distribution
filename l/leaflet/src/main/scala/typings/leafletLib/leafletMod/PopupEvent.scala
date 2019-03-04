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
    val __obj = js.Dynamic.literal(popup = popup, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PopupEvent]
  }
}

