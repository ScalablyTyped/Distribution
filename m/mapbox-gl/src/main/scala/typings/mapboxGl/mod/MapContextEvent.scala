package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.webglcontextlost
import typings.mapboxGl.mapboxGlStrings.webglcontextrestored
import typings.std.WebGLContextEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContextEvent extends MapboxEvent[WebGLContextEvent] {
  @JSName("type")
  var type_MapContextEvent: webglcontextlost | webglcontextrestored = js.native
}

