package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReturnpolicyList
  extends StObject
     with StandardParameters {
  
  /**
    * The Merchant Center account to list return policies for.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceReturnpolicyList {
  
  inline def apply(): ParamsResourceReturnpolicyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReturnpolicyList]
  }
  
  extension [Self <: ParamsResourceReturnpolicyList](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
