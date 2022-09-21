package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCreativesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The account the creative belongs to.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the creative to retrieve.
    */
  var creativeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsCreativesGet {
  
  inline def apply(): ParamsResourceAccountsCreativesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCreativesGet]
  }
  
  extension [Self <: ParamsResourceAccountsCreativesGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
  }
}
