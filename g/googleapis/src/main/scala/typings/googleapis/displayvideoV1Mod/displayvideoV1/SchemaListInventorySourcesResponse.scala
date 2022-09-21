package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListInventorySourcesResponse extends StObject {
  
  /**
    * The list of inventory sources. This list will be absent if empty.
    */
  var inventorySources: js.UndefOr[js.Array[SchemaInventorySource]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListInventorySources` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListInventorySourcesResponse {
  
  inline def apply(): SchemaListInventorySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInventorySourcesResponse]
  }
  
  extension [Self <: SchemaListInventorySourcesResponse](x: Self) {
    
    inline def setInventorySources(value: js.Array[SchemaInventorySource]): Self = StObject.set(x, "inventorySources", value.asInstanceOf[js.Any])
    
    inline def setInventorySourcesUndefined: Self = StObject.set(x, "inventorySources", js.undefined)
    
    inline def setInventorySourcesVarargs(value: SchemaInventorySource*): Self = StObject.set(x, "inventorySources", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
