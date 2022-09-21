package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBudgetGet
  extends StObject
     with StandardParameters {
  
  /**
    * The account id to get the budget information for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The billing id to get the budget information for.
    */
  var billingId: js.UndefOr[String] = js.undefined
}
object ParamsResourceBudgetGet {
  
  inline def apply(): ParamsResourceBudgetGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBudgetGet]
  }
  
  extension [Self <: ParamsResourceBudgetGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBillingId(value: String): Self = StObject.set(x, "billingId", value.asInstanceOf[js.Any])
    
    inline def setBillingIdUndefined: Self = StObject.set(x, "billingId", js.undefined)
  }
}
