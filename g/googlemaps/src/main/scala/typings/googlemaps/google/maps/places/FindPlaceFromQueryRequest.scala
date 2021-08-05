package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindPlaceFromQueryRequest extends StObject {
  
  var fields: js.Array[String]
  
  var locationBias: js.UndefOr[LocationBias] = js.undefined
  
  var query: String
}
object FindPlaceFromQueryRequest {
  
  inline def apply(fields: js.Array[String], query: String): FindPlaceFromQueryRequest = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromQueryRequest]
  }
  
  extension [Self <: FindPlaceFromQueryRequest](x: Self) {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setLocationBias(value: LocationBias): Self = StObject.set(x, "locationBias", value.asInstanceOf[js.Any])
    
    inline def setLocationBiasUndefined: Self = StObject.set(x, "locationBias", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
