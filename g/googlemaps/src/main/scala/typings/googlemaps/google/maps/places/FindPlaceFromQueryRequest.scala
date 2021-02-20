package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindPlaceFromQueryRequest extends StObject {
  
  var fields: js.Array[String] = js.native
  
  var locationBias: js.UndefOr[LocationBias] = js.native
  
  var query: String = js.native
}
object FindPlaceFromQueryRequest {
  
  @scala.inline
  def apply(fields: js.Array[String], query: String): FindPlaceFromQueryRequest = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromQueryRequest]
  }
  
  @scala.inline
  implicit class FindPlaceFromQueryRequestMutableBuilder[Self <: FindPlaceFromQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setLocationBias(value: LocationBias): Self = StObject.set(x, "locationBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationBiasUndefined: Self = StObject.set(x, "locationBias", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
