package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inventory item List Response
  */
@js.native
trait SchemaInventoryItemsListResponse extends StObject {
  
  /**
    * Inventory item collection
    */
  var inventoryItems: js.UndefOr[js.Array[SchemaInventoryItem]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#inventoryItemsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaInventoryItemsListResponse {
  
  @scala.inline
  def apply(): SchemaInventoryItemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryItemsListResponse]
  }
  
  @scala.inline
  implicit class SchemaInventoryItemsListResponseMutableBuilder[Self <: SchemaInventoryItemsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInventoryItems(value: js.Array[SchemaInventoryItem]): Self = StObject.set(x, "inventoryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryItemsUndefined: Self = StObject.set(x, "inventoryItems", js.undefined)
    
    @scala.inline
    def setInventoryItemsVarargs(value: SchemaInventoryItem*): Self = StObject.set(x, "inventoryItems", js.Array(value :_*))
    
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
