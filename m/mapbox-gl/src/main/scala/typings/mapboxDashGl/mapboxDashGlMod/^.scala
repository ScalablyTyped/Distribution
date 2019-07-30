package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.Anon_FailIfMajorPerformanceCaveat
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var accessToken: String = js.native
  var baseApiUrl: String = js.native
  var version: String = js.native
  def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def supported(): Boolean = js.native
  def supported(options: Anon_FailIfMajorPerformanceCaveat): Boolean = js.native
}

