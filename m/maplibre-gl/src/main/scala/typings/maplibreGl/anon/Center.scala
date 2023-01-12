package typings.maplibreGl.anon

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.mod.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var center: ^
  
  var handlerName: String
  
  var lngLat: LngLat
  
  var point: ^
}
object Center {
  
  inline def apply(center: ^, handlerName: String, lngLat: LngLat, point: ^): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], handlerName = handlerName.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: ^): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setHandlerName(value: String): Self = StObject.set(x, "handlerName", value.asInstanceOf[js.Any])
    
    inline def setLngLat(value: LngLat): Self = StObject.set(x, "lngLat", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: ^): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
