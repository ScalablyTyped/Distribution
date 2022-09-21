package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSettlementreportsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The Merchant Center account of the settlement report.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The Google-provided ID of the settlement.
    */
  var settlementId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSettlementreportsGet {
  
  inline def apply(): ParamsResourceSettlementreportsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSettlementreportsGet]
  }
  
  extension [Self <: ParamsResourceSettlementreportsGet](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setSettlementId(value: String): Self = StObject.set(x, "settlementId", value.asInstanceOf[js.Any])
    
    inline def setSettlementIdUndefined: Self = StObject.set(x, "settlementId", js.undefined)
  }
}
