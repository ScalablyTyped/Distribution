package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the inventory source group to which the assignments are assigned.
    */
  var inventorySourceGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBulkEditAssignedInventorySourcesRequest] = js.undefined
}
object ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit {
  
  inline def apply(): ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit]
  }
  
  extension [Self <: ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit](x: Self) {
    
    inline def setInventorySourceGroupId(value: String): Self = StObject.set(x, "inventorySourceGroupId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceGroupIdUndefined: Self = StObject.set(x, "inventorySourceGroupId", js.undefined)
    
    inline def setRequestBody(value: SchemaBulkEditAssignedInventorySourcesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
