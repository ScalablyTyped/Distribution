package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReturnpolicyonlineList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the merchant for which to retrieve the return policy online object.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceReturnpolicyonlineList {
  
  inline def apply(): ParamsResourceReturnpolicyonlineList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReturnpolicyonlineList]
  }
  
  extension [Self <: ParamsResourceReturnpolicyonlineList](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
