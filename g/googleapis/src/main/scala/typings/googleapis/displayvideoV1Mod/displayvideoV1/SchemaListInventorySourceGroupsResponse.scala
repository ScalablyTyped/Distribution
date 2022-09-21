package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListInventorySourceGroupsResponse extends StObject {
  
  /**
    * The list of inventory source groups. This list will be absent if empty.
    */
  var inventorySourceGroups: js.UndefOr[js.Array[SchemaInventorySourceGroup]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListInventorySourceGroups` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListInventorySourceGroupsResponse {
  
  inline def apply(): SchemaListInventorySourceGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInventorySourceGroupsResponse]
  }
  
  extension [Self <: SchemaListInventorySourceGroupsResponse](x: Self) {
    
    inline def setInventorySourceGroups(value: js.Array[SchemaInventorySourceGroup]): Self = StObject.set(x, "inventorySourceGroups", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceGroupsUndefined: Self = StObject.set(x, "inventorySourceGroups", js.undefined)
    
    inline def setInventorySourceGroupsVarargs(value: SchemaInventorySourceGroup*): Self = StObject.set(x, "inventorySourceGroups", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
