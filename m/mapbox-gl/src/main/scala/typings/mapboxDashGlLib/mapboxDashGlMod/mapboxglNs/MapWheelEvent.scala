package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapWheelEvent
  extends MapboxEvent[stdLib.WheelEvent] {
  var defaultPrevented: scala.Boolean
  @JSName("type")
  var type_MapWheelEvent: mapboxDashGlLib.mapboxDashGlLibStrings.wheel
  def preventDefault(): scala.Unit
}

object MapWheelEvent {
  @scala.inline
  def apply(
    defaultPrevented: scala.Boolean,
    originalEvent: stdLib.WheelEvent,
    preventDefault: js.Function0[scala.Unit],
    target: Map,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.wheel
  ): MapWheelEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[MapWheelEvent]
  }
}

