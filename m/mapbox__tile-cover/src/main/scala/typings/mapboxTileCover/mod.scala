package typings.mapboxTileCover

import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/tile-cover", "geojson")
  @js.native
  def geojson(geom: Geometry, limits: Limits): FeatureCollection[Geometry, GeoJsonProperties] = js.native
  
  @JSImport("@mapbox/tile-cover", "indexes")
  @js.native
  def indexes(geom: Geometry, limits: Limits): js.Array[String] = js.native
  
  @JSImport("@mapbox/tile-cover", "tiles")
  @js.native
  def tiles(geom: Geometry, limits: Limits): js.Array[js.Array[Double]] = js.native
  
  @js.native
  trait Limits extends StObject {
    
    var max_zoom: Double = js.native
    
    var min_zoom: Double = js.native
  }
  object Limits {
    
    @scala.inline
    def apply(max_zoom: Double, min_zoom: Double): Limits = {
      val __obj = js.Dynamic.literal(max_zoom = max_zoom.asInstanceOf[js.Any], min_zoom = min_zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limits]
    }
    
    @scala.inline
    implicit class LimitsMutableBuilder[Self <: Limits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax_zoom(value: Double): Self = StObject.set(x, "max_zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin_zoom(value: Double): Self = StObject.set(x, "min_zoom", value.asInstanceOf[js.Any])
    }
  }
}
