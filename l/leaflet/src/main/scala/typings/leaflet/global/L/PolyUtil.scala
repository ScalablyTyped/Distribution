package typings.leaflet.global.L

import typings.leaflet.mod.BoundsExpression
import typings.leaflet.mod.LatLngExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PolyUtil {
  
  @JSGlobal("L.PolyUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clipPolygon(points: js.Array[typings.leaflet.mod.Point_], bounds: BoundsExpression): js.Array[typings.leaflet.mod.Point_] = (^.asInstanceOf[js.Dynamic].applyDynamic("clipPolygon")(points.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.leaflet.mod.Point_]]
  inline def clipPolygon(points: js.Array[typings.leaflet.mod.Point_], bounds: BoundsExpression, round: Boolean): js.Array[typings.leaflet.mod.Point_] = (^.asInstanceOf[js.Dynamic].applyDynamic("clipPolygon")(points.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.leaflet.mod.Point_]]
  
  inline def polygonCenter(latlngs: js.Array[LatLngExpression], crs: typings.leaflet.mod.CRS): typings.leaflet.mod.LatLng_ = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonCenter")(latlngs.asInstanceOf[js.Any], crs.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LatLng_]
}
