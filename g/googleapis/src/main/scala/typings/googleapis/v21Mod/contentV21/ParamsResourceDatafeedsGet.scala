package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDatafeedsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the datafeed.
    */
  var datafeedId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceDatafeedsGet {
  
  inline def apply(): ParamsResourceDatafeedsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatafeedsGet]
  }
  
  extension [Self <: ParamsResourceDatafeedsGet](x: Self) {
    
    inline def setDatafeedId(value: String): Self = StObject.set(x, "datafeedId", value.asInstanceOf[js.Any])
    
    inline def setDatafeedIdUndefined: Self = StObject.set(x, "datafeedId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
