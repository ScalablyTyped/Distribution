package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceShoppingadsprogramGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceShoppingadsprogramGet {
  
  inline def apply(): ParamsResourceShoppingadsprogramGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceShoppingadsprogramGet]
  }
  
  extension [Self <: ParamsResourceShoppingadsprogramGet](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
