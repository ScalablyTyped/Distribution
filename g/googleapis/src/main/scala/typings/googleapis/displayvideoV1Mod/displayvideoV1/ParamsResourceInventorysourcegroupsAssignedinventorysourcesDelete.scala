package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that owns the parent inventory source group. The parent partner does not have access to this assigned inventory source.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the assigned inventory source to delete.
    */
  var assignedInventorySourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the inventory source group to which this assignment is assigned.
    */
  var inventorySourceGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that owns the parent inventory source group. Only this partner has write access to this assigned inventory source.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete {
  
  inline def apply(): ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete]
  }
  
  extension [Self <: ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAssignedInventorySourceId(value: String): Self = StObject.set(x, "assignedInventorySourceId", value.asInstanceOf[js.Any])
    
    inline def setAssignedInventorySourceIdUndefined: Self = StObject.set(x, "assignedInventorySourceId", js.undefined)
    
    inline def setInventorySourceGroupId(value: String): Self = StObject.set(x, "inventorySourceGroupId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceGroupIdUndefined: Self = StObject.set(x, "inventorySourceGroupId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
