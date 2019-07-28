package typings.leafletDashCurve

import typings.leaflet.leafletMod.Path
import typings.leaflet.leafletMod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet")
@js.native
object leafletMod extends js.Object {
  /**
  	 * Drawing Bezier curves and other complex shapes.
  	 */
  def curve(path: js.Array[_]): Path = js.native
  def curve(path: js.Array[_], options: PathOptions): Path = js.native
}

