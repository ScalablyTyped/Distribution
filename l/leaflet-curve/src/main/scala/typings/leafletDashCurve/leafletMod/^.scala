package typings.leafletDashCurve.leafletMod

import typings.leaflet.leafletMod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet")
@js.native
object ^ extends js.Object {
  /*
    * Drawing Bezier curves and other complex shapes.
    */
  def curve(path: js.Array[_]): Curve = js.native
  def curve(path: js.Array[_], options: PathOptions): Curve = js.native
}

