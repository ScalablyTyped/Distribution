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
    preventDefault: () => scala.Unit,
    target: Map,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.wheel
  ): MapWheelEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented, originalEvent = originalEvent, preventDefault = js.Any.fromFunction0(preventDefault), target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapWheelEvent]
  }
}

