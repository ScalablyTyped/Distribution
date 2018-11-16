package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "LineUtil")
@js.native
object LineUtilNs extends js.Object {
  def closestPointOnSegment(p: leafletLib.leafletMod.Point, p1: leafletLib.leafletMod.Point, p2: leafletLib.leafletMod.Point): leafletLib.leafletMod.Point = js.native
  def isFlat(latlngs: js.Array[leafletLib.leafletMod.LatLngExpression]): scala.Boolean = js.native
  def pointToSegmentDistance(p: leafletLib.leafletMod.Point, p1: leafletLib.leafletMod.Point, p2: leafletLib.leafletMod.Point): scala.Double = js.native
  def simplify(points: js.Array[leafletLib.leafletMod.Point], tolerance: scala.Double): js.Array[leafletLib.leafletMod.Point] = js.native
}

