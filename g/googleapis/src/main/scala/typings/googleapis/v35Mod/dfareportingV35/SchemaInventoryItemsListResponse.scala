package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventoryItemsListResponse extends StObject {
  
  /**
    * Inventory item collection
    */
  var inventoryItems: js.UndefOr[js.Array[SchemaInventoryItem]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#inventoryItemsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventoryItemsListResponse {
  
  inline def apply(): SchemaInventoryItemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryItemsListResponse]
  }
  
  extension [Self <: SchemaInventoryItemsListResponse](x: Self) {
    
    inline def setInventoryItems(value: js.Array[SchemaInventoryItem]): Self = StObject.set(x, "inventoryItems", value.asInstanceOf[js.Any])
    
    inline def setInventoryItemsUndefined: Self = StObject.set(x, "inventoryItems", js.undefined)
    
    inline def setInventoryItemsVarargs(value: SchemaInventoryItem*): Self = StObject.set(x, "inventoryItems", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
