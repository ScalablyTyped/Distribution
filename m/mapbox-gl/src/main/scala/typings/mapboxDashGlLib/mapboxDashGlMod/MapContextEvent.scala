package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContextEvent
  extends MapboxEvent[stdLib.WebGLContextEvent] {
  @JSName("type")
  var type_MapContextEvent: mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextlost | mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextrestored = js.native
}

