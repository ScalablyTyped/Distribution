package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var accessToken: java.lang.String = js.native
  var version: java.lang.String = js.native
  def setRTLTextPlugin(pluginURL: java.lang.String, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def supported(): scala.Boolean = js.native
  def supported(options: mapboxDashGlLib.Anon_FailIfMajorPerformanceCaveat): scala.Boolean = js.native
}

