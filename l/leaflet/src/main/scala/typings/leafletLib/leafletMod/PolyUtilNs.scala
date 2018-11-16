package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "PolyUtil")
@js.native
object PolyUtilNs extends js.Object {
  def clipPolygon(points: js.Array[leafletLib.leafletMod.Point], bounds: leafletLib.leafletMod.BoundsExpression): js.Array[leafletLib.leafletMod.Point] = js.native
  def clipPolygon(
    points: js.Array[leafletLib.leafletMod.Point],
    bounds: leafletLib.leafletMod.BoundsExpression,
    round: scala.Boolean
  ): js.Array[leafletLib.leafletMod.Point] = js.native
}

