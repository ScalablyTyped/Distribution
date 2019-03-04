package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContextEvent
  extends MapboxEvent[stdLib.WebGLContextEvent] {
  @JSName("type")
  var type_MapContextEvent: mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextlost | mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextrestored
}

object MapContextEvent {
  @scala.inline
  def apply(
    originalEvent: stdLib.WebGLContextEvent,
    target: Map,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextlost | mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextrestored
  ): MapContextEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, target = target)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextEvent]
  }
}

