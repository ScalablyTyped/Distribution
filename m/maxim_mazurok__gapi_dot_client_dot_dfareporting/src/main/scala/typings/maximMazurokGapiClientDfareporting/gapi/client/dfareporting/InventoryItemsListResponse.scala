package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryItemsListResponse extends StObject {
  
  /** Inventory item collection */
  var inventoryItems: js.UndefOr[js.Array[InventoryItem]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#inventoryItemsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object InventoryItemsListResponse {
  
  inline def apply(): InventoryItemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryItemsListResponse]
  }
  
  extension [Self <: InventoryItemsListResponse](x: Self) {
    
    inline def setInventoryItems(value: js.Array[InventoryItem]): Self = StObject.set(x, "inventoryItems", value.asInstanceOf[js.Any])
    
    inline def setInventoryItemsUndefined: Self = StObject.set(x, "inventoryItems", js.undefined)
    
    inline def setInventoryItemsVarargs(value: InventoryItem*): Self = StObject.set(x, "inventoryItems", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
