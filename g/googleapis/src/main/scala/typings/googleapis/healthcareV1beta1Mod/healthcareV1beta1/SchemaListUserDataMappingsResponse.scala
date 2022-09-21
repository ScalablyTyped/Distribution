package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListUserDataMappingsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The returned User data mappings. The maximum number of User data mappings returned is determined by the value of page_size in the ListUserDataMappingsRequest.
    */
  var userDataMappings: js.UndefOr[js.Array[SchemaUserDataMapping]] = js.undefined
}
object SchemaListUserDataMappingsResponse {
  
  inline def apply(): SchemaListUserDataMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUserDataMappingsResponse]
  }
  
  extension [Self <: SchemaListUserDataMappingsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserDataMappings(value: js.Array[SchemaUserDataMapping]): Self = StObject.set(x, "userDataMappings", value.asInstanceOf[js.Any])
    
    inline def setUserDataMappingsUndefined: Self = StObject.set(x, "userDataMappings", js.undefined)
    
    inline def setUserDataMappingsVarargs(value: SchemaUserDataMapping*): Self = StObject.set(x, "userDataMappings", js.Array(value*))
  }
}
