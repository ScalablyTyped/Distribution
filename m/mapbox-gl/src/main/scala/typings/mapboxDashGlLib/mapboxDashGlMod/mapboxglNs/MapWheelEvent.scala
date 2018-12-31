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

