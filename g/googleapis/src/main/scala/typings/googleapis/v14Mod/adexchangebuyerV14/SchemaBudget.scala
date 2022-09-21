package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBudget extends StObject {
  
  /**
    * The id of the account. This is required for get and update requests.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The billing id to determine which adgroup to provide budget information for. This is required for get and update requests.
    */
  var billingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The daily budget amount in unit amount of the account currency to apply for the billingId provided. This is required for update requests.
    */
  var budgetAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The currency code for the buyer. This cannot be altered here.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique id that describes this item.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of the resource, i.e. "adexchangebuyer#budget".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaBudget {
  
  inline def apply(): SchemaBudget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBudget]
  }
  
  extension [Self <: SchemaBudget](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBillingId(value: String): Self = StObject.set(x, "billingId", value.asInstanceOf[js.Any])
    
    inline def setBillingIdNull: Self = StObject.set(x, "billingId", null)
    
    inline def setBillingIdUndefined: Self = StObject.set(x, "billingId", js.undefined)
    
    inline def setBudgetAmount(value: String): Self = StObject.set(x, "budgetAmount", value.asInstanceOf[js.Any])
    
    inline def setBudgetAmountNull: Self = StObject.set(x, "budgetAmount", null)
    
    inline def setBudgetAmountUndefined: Self = StObject.set(x, "budgetAmount", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
