package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInventorysourcesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the inventory source to fetch.
    */
  var inventorySourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the DV360 partner to which the fetched inventory source is permissioned.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceInventorysourcesGet {
  
  inline def apply(): ParamsResourceInventorysourcesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInventorysourcesGet]
  }
  
  extension [Self <: ParamsResourceInventorysourcesGet](x: Self) {
    
    inline def setInventorySourceId(value: String): Self = StObject.set(x, "inventorySourceId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceIdUndefined: Self = StObject.set(x, "inventorySourceId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
