package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineUtil {
  
  @JSImport("leaflet", "LineUtil.closestPointOnSegment")
  @js.native
  def closestPointOnSegment(p: Point_, p1: Point_, p2: Point_): Point_ = js.native
  
  @JSImport("leaflet", "LineUtil.isFlat")
  @js.native
  def isFlat(latlngs: js.Array[LatLngExpression]): Boolean = js.native
  
  @JSImport("leaflet", "LineUtil.pointToSegmentDistance")
  @js.native
  def pointToSegmentDistance(p: Point_, p1: Point_, p2: Point_): Double = js.native
  
  @JSImport("leaflet", "LineUtil.simplify")
  @js.native
  def simplify(points: js.Array[Point_], tolerance: Double): js.Array[Point_] = js.native
}
