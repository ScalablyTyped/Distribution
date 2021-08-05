package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inventory item List Response
  */
trait SchemaInventoryItemsListResponse extends StObject {
  
  /**
    * Inventory item collection
    */
  var inventoryItems: js.UndefOr[js.Array[SchemaInventoryItem]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#inventoryItemsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaInventoryItemsListResponse {
  
  inline def apply(): SchemaInventoryItemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryItemsListResponse]
  }
  
  extension [Self <: SchemaInventoryItemsListResponse](x: Self) {
    
    inline def setInventoryItems(value: js.Array[SchemaInventoryItem]): Self = StObject.set(x, "inventoryItems", value.asInstanceOf[js.Any])
    
    inline def setInventoryItemsUndefined: Self = StObject.set(x, "inventoryItems", js.undefined)
    
    inline def setInventoryItemsVarargs(value: SchemaInventoryItem*): Self = StObject.set(x, "inventoryItems", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
