package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that owns the parent inventory source group. The parent partner will not have access to this assigned inventory source.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the inventory source group to which the assignment will be assigned.
    */
  var inventorySourceGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that owns the parent inventory source group. Only this partner will have write access to this assigned inventory source.
    */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAssignedInventorySource] = js.undefined
}
object ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate {
  
  inline def apply(): ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate]
  }
  
  extension [Self <: ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setInventorySourceGroupId(value: String): Self = StObject.set(x, "inventorySourceGroupId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceGroupIdUndefined: Self = StObject.set(x, "inventorySourceGroupId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setRequestBody(value: SchemaAssignedInventorySource): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
