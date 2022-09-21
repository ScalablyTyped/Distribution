package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the merchant for which to delete region definition.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The id of the region to delete.
    */
  var regionId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegionsDelete {
  
  inline def apply(): ParamsResourceRegionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegionsDelete]
  }
  
  extension [Self <: ParamsResourceRegionsDelete](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRegionId(value: String): Self = StObject.set(x, "regionId", value.asInstanceOf[js.Any])
    
    inline def setRegionIdUndefined: Self = StObject.set(x, "regionId", js.undefined)
  }
}
