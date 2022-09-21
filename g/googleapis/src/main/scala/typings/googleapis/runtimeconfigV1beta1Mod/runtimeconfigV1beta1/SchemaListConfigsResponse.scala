package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListConfigsResponse extends StObject {
  
  /**
    * A list of the configurations in the project. The order of returned objects is arbitrary; that is, it is not ordered in any particular way.
    */
  var configs: js.UndefOr[js.Array[SchemaRuntimeConfig]] = js.undefined
  
  /**
    * This token allows you to get the next page of results for list requests. If the number of results is larger than `pageSize`, use the `nextPageToken` as a value for the query parameter `pageToken` in the next list request. Subsequent list requests will have their own `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListConfigsResponse {
  
  inline def apply(): SchemaListConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConfigsResponse]
  }
  
  extension [Self <: SchemaListConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaRuntimeConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaRuntimeConfig*): Self = StObject.set(x, "configs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
