package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.webglcontextlost
import typings.mapboxDashGl.mapboxDashGlStrings.webglcontextrestored
import typings.std.WebGLContextEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContextEvent extends MapboxEvent[WebGLContextEvent] {
  @JSName("type")
  var type_MapContextEvent: webglcontextlost | webglcontextrestored = js.native
}

