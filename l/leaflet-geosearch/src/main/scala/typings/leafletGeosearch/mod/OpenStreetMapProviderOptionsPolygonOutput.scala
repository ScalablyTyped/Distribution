package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenStreetMapProviderOptionsPolygonOutput extends StObject {
  
  var polygon_geojson: js.UndefOr[Double] = js.undefined
  
  var polygon_kml: js.UndefOr[Double] = js.undefined
  
  var polygon_svg: js.UndefOr[Double] = js.undefined
  
  var polygon_text: js.UndefOr[Double] = js.undefined
  
  var polygon_threshold: js.UndefOr[String] = js.undefined
}
object OpenStreetMapProviderOptionsPolygonOutput {
  
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsPolygonOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsPolygonOutput]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderOptionsPolygonOutputMutableBuilder[Self <: OpenStreetMapProviderOptionsPolygonOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolygon_geojson(value: Double): Self = StObject.set(x, "polygon_geojson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygon_geojsonUndefined: Self = StObject.set(x, "polygon_geojson", js.undefined)
    
    @scala.inline
    def setPolygon_kml(value: Double): Self = StObject.set(x, "polygon_kml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygon_kmlUndefined: Self = StObject.set(x, "polygon_kml", js.undefined)
    
    @scala.inline
    def setPolygon_svg(value: Double): Self = StObject.set(x, "polygon_svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygon_svgUndefined: Self = StObject.set(x, "polygon_svg", js.undefined)
    
    @scala.inline
    def setPolygon_text(value: Double): Self = StObject.set(x, "polygon_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygon_textUndefined: Self = StObject.set(x, "polygon_text", js.undefined)
    
    @scala.inline
    def setPolygon_threshold(value: String): Self = StObject.set(x, "polygon_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygon_thresholdUndefined: Self = StObject.set(x, "polygon_threshold", js.undefined)
  }
}
