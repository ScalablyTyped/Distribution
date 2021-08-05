package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circle extends StObject {
  
  var circle: String
  
  var circlemarker: String
  
  var marker: String
  
  var polygon: String
  
  var polyline: String
  
  var rectangle: String
}
object Circle {
  
  inline def apply(
    circle: String,
    circlemarker: String,
    marker: String,
    polygon: String,
    polyline: String,
    rectangle: String
  ): Circle = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circlemarker = circlemarker.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
  
  extension [Self <: Circle](x: Self) {
    
    inline def setCircle(value: String): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCirclemarker(value: String): Self = StObject.set(x, "circlemarker", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setPolygon(value: String): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    inline def setPolyline(value: String): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    inline def setRectangle(value: String): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
  }
}
