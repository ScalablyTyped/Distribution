package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCreativesListdeals
  extends StObject
     with StandardParameters {
  
  /**
    * The id for the account that will serve this creative.
    */
  var accountId: js.UndefOr[Double] = js.undefined
  
  /**
    * The buyer-specific id for this creative.
    */
  var buyerCreativeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCreativesListdeals {
  
  inline def apply(): ParamsResourceCreativesListdeals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativesListdeals]
  }
  
  extension [Self <: ParamsResourceCreativesListdeals](x: Self) {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBuyerCreativeId(value: String): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
    
    inline def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
  }
}
