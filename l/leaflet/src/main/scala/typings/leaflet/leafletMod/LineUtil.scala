package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "LineUtil")
@js.native
object LineUtil extends js.Object {
  def closestPointOnSegment(p: Point, p1: Point, p2: Point): Point = js.native
  def isFlat(latlngs: js.Array[LatLngExpression]): Boolean = js.native
  def pointToSegmentDistance(p: Point, p1: Point, p2: Point): Double = js.native
  def simplify(points: js.Array[Point], tolerance: Double): js.Array[Point] = js.native
}

