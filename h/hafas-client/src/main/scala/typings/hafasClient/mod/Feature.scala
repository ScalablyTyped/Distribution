package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  var geometry: Geometry
  
  var properties: Station | Stop | Location | js.Object
  
  var `type`: typings.hafasClient.hafasClientStrings.Feature
}
object Feature {
  
  inline def apply(geometry: Geometry, properties: Station | Stop | Location | js.Object): Feature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Feature")
    __obj.asInstanceOf[Feature]
  }
  
  extension [Self <: Feature](x: Self) {
    
    inline def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Station | Stop | Location | js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.hafasClient.hafasClientStrings.Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
