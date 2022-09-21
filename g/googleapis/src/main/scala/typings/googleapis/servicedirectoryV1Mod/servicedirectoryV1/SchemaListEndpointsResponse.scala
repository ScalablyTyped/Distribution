package typings.googleapis.servicedirectoryV1Mod.servicedirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListEndpointsResponse extends StObject {
  
  /**
    * The list of endpoints.
    */
  var endpoints: js.UndefOr[js.Array[SchemaEndpoint]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListEndpointsResponse {
  
  inline def apply(): SchemaListEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEndpointsResponse]
  }
  
  extension [Self <: SchemaListEndpointsResponse](x: Self) {
    
    inline def setEndpoints(value: js.Array[SchemaEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: SchemaEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
