package typings.googleapis.networkconnectivityV1Mod.networkconnectivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListHubsResponse extends StObject {
  
  /**
    * The requested hubs.
    */
  var hubs: js.UndefOr[js.Array[SchemaHub]] = js.undefined
  
  /**
    * The next pagination token in the List response. It should be used as page_token for the following request. An empty value means no more result.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListHubsResponse {
  
  inline def apply(): SchemaListHubsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHubsResponse]
  }
  
  extension [Self <: SchemaListHubsResponse](x: Self) {
    
    inline def setHubs(value: js.Array[SchemaHub]): Self = StObject.set(x, "hubs", value.asInstanceOf[js.Any])
    
    inline def setHubsUndefined: Self = StObject.set(x, "hubs", js.undefined)
    
    inline def setHubsVarargs(value: SchemaHub*): Self = StObject.set(x, "hubs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
