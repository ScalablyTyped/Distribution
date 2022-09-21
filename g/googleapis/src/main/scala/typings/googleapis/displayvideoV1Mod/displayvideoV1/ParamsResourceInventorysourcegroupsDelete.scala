package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInventorysourcegroupsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that owns the inventory source group. The parent partner does not have access to this group.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the inventory source group to delete.
    */
  var inventorySourceGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that owns the inventory source group. Only this partner has write access to this group.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceInventorysourcegroupsDelete {
  
  inline def apply(): ParamsResourceInventorysourcegroupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInventorysourcegroupsDelete]
  }
  
  extension [Self <: ParamsResourceInventorysourcegroupsDelete](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setInventorySourceGroupId(value: String): Self = StObject.set(x, "inventorySourceGroupId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceGroupIdUndefined: Self = StObject.set(x, "inventorySourceGroupId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
