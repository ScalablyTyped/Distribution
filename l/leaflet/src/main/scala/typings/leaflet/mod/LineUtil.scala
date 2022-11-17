package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineUtil {
  
  @JSImport("leaflet", "LineUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clipSegment(a: Point_, b: Point_, bounds: Bounds_): (js.Tuple2[Point_, Point_]) | false = (^.asInstanceOf[js.Dynamic].applyDynamic("clipSegment")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[Point_, Point_]) | false]
  inline def clipSegment(a: Point_, b: Point_, bounds: Bounds_, useLastCode: Boolean): (js.Tuple2[Point_, Point_]) | false = (^.asInstanceOf[js.Dynamic].applyDynamic("clipSegment")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], useLastCode.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[Point_, Point_]) | false]
  inline def clipSegment(a: Point_, b: Point_, bounds: Bounds_, useLastCode: Boolean, round: Boolean): (js.Tuple2[Point_, Point_]) | false = (^.asInstanceOf[js.Dynamic].applyDynamic("clipSegment")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], useLastCode.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[Point_, Point_]) | false]
  inline def clipSegment(a: Point_, b: Point_, bounds: Bounds_, useLastCode: Unit, round: Boolean): (js.Tuple2[Point_, Point_]) | false = (^.asInstanceOf[js.Dynamic].applyDynamic("clipSegment")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], useLastCode.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[Point_, Point_]) | false]
  
  inline def closestPointOnSegment(p: Point_, p1: Point_, p2: Point_): Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("closestPointOnSegment")(p.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Point_]
  
  inline def isFlat(latlngs: js.Array[LatLngExpression]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlat")(latlngs.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pointToSegmentDistance(p: Point_, p1: Point_, p2: Point_): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToSegmentDistance")(p.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def polylineCenter(latlngs: js.Array[LatLngExpression], crs: CRS): LatLng_ = (^.asInstanceOf[js.Dynamic].applyDynamic("polylineCenter")(latlngs.asInstanceOf[js.Any], crs.asInstanceOf[js.Any])).asInstanceOf[LatLng_]
  
  inline def simplify(points: js.Array[Point_], tolerance: Double): js.Array[Point_] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(points.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[js.Array[Point_]]
}
