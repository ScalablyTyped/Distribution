package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomSource[T]
  extends StObject
     with Source {
  
  var _implementation: CustomSourceInterface[T]
  
  var attribution: String
  
  var id: String
  
  var maxzoom: Double
  
  var minzoom: Double
  
  var scheme: String
  
  var tileSize: Double
  
  @JSName("type")
  var type_CustomSource: custom
}
object CustomSource {
  
  inline def apply[T](
    _implementation: CustomSourceInterface[T],
    attribution: String,
    id: String,
    maxzoom: Double,
    minzoom: Double,
    scheme: String,
    tileSize: Double
  ): CustomSource[T] = {
    val __obj = js.Dynamic.literal(_implementation = _implementation.asInstanceOf[js.Any], attribution = attribution.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxzoom = maxzoom.asInstanceOf[js.Any], minzoom = minzoom.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[CustomSource[T]]
  }
  
  extension [Self <: CustomSource[?], T](x: Self & CustomSource[T]) {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_implementation(value: CustomSourceInterface[T]): Self = StObject.set(x, "_implementation", value.asInstanceOf[js.Any])
  }
}
