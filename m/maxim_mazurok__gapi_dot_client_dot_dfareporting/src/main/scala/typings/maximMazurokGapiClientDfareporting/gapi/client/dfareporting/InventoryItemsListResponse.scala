package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryItemsListResponse extends StObject {
  
  /** Inventory item collection */
  var inventoryItems: js.UndefOr[js.Array[InventoryItem]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#inventoryItemsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object InventoryItemsListResponse {
  
  @scala.inline
  def apply(): InventoryItemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryItemsListResponse]
  }
  
  @scala.inline
  implicit class InventoryItemsListResponseMutableBuilder[Self <: InventoryItemsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInventoryItems(value: js.Array[InventoryItem]): Self = StObject.set(x, "inventoryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryItemsUndefined: Self = StObject.set(x, "inventoryItems", js.undefined)
    
    @scala.inline
    def setInventoryItemsVarargs(value: InventoryItem*): Self = StObject.set(x, "inventoryItems", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
