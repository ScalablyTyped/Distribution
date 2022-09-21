package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAssignedInventorySourcesResponse extends StObject {
  
  /**
    * The list of assigned inventory sources. This list will be absent if empty.
    */
  var assignedInventorySources: js.UndefOr[js.Array[SchemaAssignedInventorySource]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListAssignedInventorySources` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAssignedInventorySourcesResponse {
  
  inline def apply(): SchemaListAssignedInventorySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAssignedInventorySourcesResponse]
  }
  
  extension [Self <: SchemaListAssignedInventorySourcesResponse](x: Self) {
    
    inline def setAssignedInventorySources(value: js.Array[SchemaAssignedInventorySource]): Self = StObject.set(x, "assignedInventorySources", value.asInstanceOf[js.Any])
    
    inline def setAssignedInventorySourcesUndefined: Self = StObject.set(x, "assignedInventorySources", js.undefined)
    
    inline def setAssignedInventorySourcesVarargs(value: SchemaAssignedInventorySource*): Self = StObject.set(x, "assignedInventorySources", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
