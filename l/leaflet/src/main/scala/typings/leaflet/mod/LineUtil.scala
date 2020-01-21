package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "LineUtil")
@js.native
object LineUtil extends js.Object {
  def closestPointOnSegment(p: Point_, p1: Point_, p2: Point_): Point_ = js.native
  def isFlat(latlngs: js.Array[LatLngExpression]): Boolean = js.native
  def pointToSegmentDistance(p: Point_, p1: Point_, p2: Point_): Double = js.native
  def simplify(points: js.Array[Point_], tolerance: Double): js.Array[Point_] = js.native
}

