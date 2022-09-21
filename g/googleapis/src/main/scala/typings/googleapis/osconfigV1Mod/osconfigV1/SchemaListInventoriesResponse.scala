package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListInventoriesResponse extends StObject {
  
  /**
    * List of inventory objects.
    */
  var inventories: js.UndefOr[js.Array[SchemaInventory]] = js.undefined
  
  /**
    * The pagination token to retrieve the next page of inventory objects.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListInventoriesResponse {
  
  inline def apply(): SchemaListInventoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInventoriesResponse]
  }
  
  extension [Self <: SchemaListInventoriesResponse](x: Self) {
    
    inline def setInventories(value: js.Array[SchemaInventory]): Self = StObject.set(x, "inventories", value.asInstanceOf[js.Any])
    
    inline def setInventoriesUndefined: Self = StObject.set(x, "inventories", js.undefined)
    
    inline def setInventoriesVarargs(value: SchemaInventory*): Self = StObject.set(x, "inventories", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
