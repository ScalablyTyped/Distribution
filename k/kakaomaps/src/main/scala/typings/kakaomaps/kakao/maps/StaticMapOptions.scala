package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticMapOptions extends StObject {
  
  var center: LatLng
  
  var level: Double
  
  var mapTypeId: MapTypeId
  
  var marker: js.Object | js.Array[js.Object]
}
object StaticMapOptions {
  
  inline def apply(center: LatLng, level: Double, mapTypeId: MapTypeId, marker: js.Object | js.Array[js.Object]): StaticMapOptions = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], mapTypeId = mapTypeId.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapOptions]
  }
  
  extension [Self <: StaticMapOptions](x: Self) {
    
    inline def setCenter(value: LatLng): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMapTypeId(value: MapTypeId): Self = StObject.set(x, "mapTypeId", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: js.Object | js.Array[js.Object]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerVarargs(value: js.Object*): Self = StObject.set(x, "marker", js.Array(value*))
  }
}
