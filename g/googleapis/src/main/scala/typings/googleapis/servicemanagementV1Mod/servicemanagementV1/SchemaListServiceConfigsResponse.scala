package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListServiceConfigsResponse extends StObject {
  
  /**
    * The token of the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of service configuration resources.
    */
  var serviceConfigs: js.UndefOr[js.Array[SchemaService]] = js.undefined
}
object SchemaListServiceConfigsResponse {
  
  inline def apply(): SchemaListServiceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceConfigsResponse]
  }
  
  extension [Self <: SchemaListServiceConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setServiceConfigs(value: js.Array[SchemaService]): Self = StObject.set(x, "serviceConfigs", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigsUndefined: Self = StObject.set(x, "serviceConfigs", js.undefined)
    
    inline def setServiceConfigsVarargs(value: SchemaService*): Self = StObject.set(x, "serviceConfigs", js.Array(value*))
  }
}
