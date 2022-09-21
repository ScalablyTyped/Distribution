package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of inventory source to update.
    */
  var inventorySourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEditInventorySourceReadWriteAccessorsRequest] = js.undefined
}
object ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors {
  
  inline def apply(): ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors]
  }
  
  extension [Self <: ParamsResourceInventorysourcesEditinventorysourcereadwriteaccessors](x: Self) {
    
    inline def setInventorySourceId(value: String): Self = StObject.set(x, "inventorySourceId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceIdUndefined: Self = StObject.set(x, "inventorySourceId", js.undefined)
    
    inline def setRequestBody(value: SchemaEditInventorySourceReadWriteAccessorsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
