package typings.leaflet.global.L

import typings.leaflet.leafletBooleans.`false`
import typings.leaflet.mod.LatLngExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineUtil {
  
  @JSGlobal("L.LineUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clipSegment(a: typings.leaflet.mod.Point_, b: typings.leaflet.mod.Point_, bounds: typings.leaflet.mod.Bounds_): (js.Tuple2[typings.leaflet.mod.Point_, typings.leaflet.mod.Point_]) | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("clipSegment")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[typings.leaflet.mod.Point_, typings.leaflet.mod.Point_]) | `false`]
  inline def clipSegment(
    a: typings.leaflet.mod.Point_,
    b: typings.leaflet.mod.Point_,
    bounds: typings.leaflet.mod.Bounds_,
    useLastCode: Boolean
  ): (js.Tuple2[typings.leaflet.mod.Point_, typings.leaflet.mod.Point_]) | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("clipSegment")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], useLastCode.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[typings.leaflet.mod.Point_, typings.leaflet.mod.Point_]) | `false`]
  inline def clipSegment(
    a: typings.leaflet.mod.Point_,
    b: typings.leaflet.mod.Point_,
    bounds: typings.leaflet.mod.Bounds_,
    useLastCode: Boolean,
    round: Boolean
  ): (js.Tuple2[typings.leaflet.mod.Point_, typings.leaflet.mod.Point_]) | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("clipSegment")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], useLastCode.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[typings.leaflet.mod.Point_, typings.leaflet.mod.Point_]) | `false`]
  inline def clipSegment(
    a: typings.leaflet.mod.Point_,
    b: typings.leaflet.mod.Point_,
    bounds: typings.leaflet.mod.Bounds_,
    useLastCode: Unit,
    round: Boolean
  ): (js.Tuple2[typings.leaflet.mod.Point_, typings.leaflet.mod.Point_]) | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("clipSegment")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], useLastCode.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[typings.leaflet.mod.Point_, typings.leaflet.mod.Point_]) | `false`]
  
  inline def closestPointOnSegment(p: typings.leaflet.mod.Point_, p1: typings.leaflet.mod.Point_, p2: typings.leaflet.mod.Point_): typings.leaflet.mod.Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("closestPointOnSegment")(p.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Point_]
  
  inline def isFlat(latlngs: js.Array[LatLngExpression]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlat")(latlngs.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pointToSegmentDistance(p: typings.leaflet.mod.Point_, p1: typings.leaflet.mod.Point_, p2: typings.leaflet.mod.Point_): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToSegmentDistance")(p.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def polylineCenter(latlngs: js.Array[LatLngExpression], crs: typings.leaflet.mod.CRS): typings.leaflet.mod.LatLng_ = (^.asInstanceOf[js.Dynamic].applyDynamic("polylineCenter")(latlngs.asInstanceOf[js.Any], crs.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LatLng_]
  
  inline def simplify(points: js.Array[typings.leaflet.mod.Point_], tolerance: Double): js.Array[typings.leaflet.mod.Point_] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(points.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.leaflet.mod.Point_]]
}
