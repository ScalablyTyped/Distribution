package typings.mapboxTileCover

import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/tile-cover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def geojson(geom: Geometry, limits: Limits): FeatureCollection[Geometry, GeoJsonProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("geojson")(geom.asInstanceOf[js.Any], limits.asInstanceOf[js.Any])).asInstanceOf[FeatureCollection[Geometry, GeoJsonProperties]]
  
  inline def indexes(geom: Geometry, limits: Limits): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexes")(geom.asInstanceOf[js.Any], limits.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def tiles(geom: Geometry, limits: Limits): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tiles")(geom.asInstanceOf[js.Any], limits.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  trait Limits extends StObject {
    
    var max_zoom: Double
    
    var min_zoom: Double
  }
  object Limits {
    
    inline def apply(max_zoom: Double, min_zoom: Double): Limits = {
      val __obj = js.Dynamic.literal(max_zoom = max_zoom.asInstanceOf[js.Any], min_zoom = min_zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limits]
    }
    
    extension [Self <: Limits](x: Self) {
      
      inline def setMax_zoom(value: Double): Self = StObject.set(x, "max_zoom", value.asInstanceOf[js.Any])
      
      inline def setMin_zoom(value: Double): Self = StObject.set(x, "min_zoom", value.asInstanceOf[js.Any])
    }
  }
}
