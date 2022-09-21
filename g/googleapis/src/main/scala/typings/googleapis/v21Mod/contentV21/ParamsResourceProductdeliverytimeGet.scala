package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductdeliverytimeGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Google merchant ID of the account that contains the product. This account cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Content API ID of the product, in the form `channel:contentLanguage:targetCountry:offerId`.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProductdeliverytimeGet {
  
  inline def apply(): ParamsResourceProductdeliverytimeGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductdeliverytimeGet]
  }
  
  extension [Self <: ParamsResourceProductdeliverytimeGet](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
