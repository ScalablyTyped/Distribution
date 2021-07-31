package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration data for Ad Exchange RTB - Budget API.
  */
trait SchemaBudget extends StObject {
  
  /**
    * The id of the account. This is required for get and update requests.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The billing id to determine which adgroup to provide budget information
    * for. This is required for get and update requests.
    */
  var billingId: js.UndefOr[String] = js.undefined
  
  /**
    * The daily budget amount in unit amount of the account currency to apply
    * for the billingId provided. This is required for update requests.
    */
  var budgetAmount: js.UndefOr[String] = js.undefined
  
  /**
    * The currency code for the buyer. This cannot be altered here.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * The unique id that describes this item.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of the resource, i.e. &quot;adexchangebuyer#budget&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaBudget {
  
  @scala.inline
  def apply(): SchemaBudget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBudget]
  }
  
  @scala.inline
  implicit class SchemaBudgetMutableBuilder[Self <: SchemaBudget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBillingId(value: String): Self = StObject.set(x, "billingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingIdUndefined: Self = StObject.set(x, "billingId", js.undefined)
    
    @scala.inline
    def setBudgetAmount(value: String): Self = StObject.set(x, "budgetAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetAmountUndefined: Self = StObject.set(x, "budgetAmount", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
