package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BudgetSummary extends StObject {
  
  /** Corresponds to the external_budget_id of a campaign budget. If the value is not set in the campaign budget, this field will be empty. */
  var externalBudgetId: js.UndefOr[String] = js.undefined
  
  /** The sum of charges made under this budget before taxes, in micros of the invoice's currency. For example, if currency_code is `USD`, then 1000000 represents one US dollar. */
  var preTaxAmountMicros: js.UndefOr[String] = js.undefined
  
  /**
    * Relevant client, product, and estimate codes from the Mediaocean Prisma tool. Only applicable for campaign budgets with an external_budget_source of
    * EXTERNAL_BUDGET_SOURCE_MEDIA_OCEAN.
    */
  var prismaCpeCode: js.UndefOr[PrismaCpeCode] = js.undefined
  
  /** The amount of tax applied to charges under this budget, in micros of the invoice's currency. For example, if currency_code is `USD`, then 1000000 represents one US dollar. */
  var taxAmountMicros: js.UndefOr[String] = js.undefined
  
  /** The total sum of charges made under this budget, including tax, in micros of the invoice's currency. For example, if currency_code is `USD`, then 1000000 represents one US dollar. */
  var totalAmountMicros: js.UndefOr[String] = js.undefined
}
object BudgetSummary {
  
  inline def apply(): BudgetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BudgetSummary] (val x: Self) extends AnyVal {
    
    inline def setExternalBudgetId(value: String): Self = StObject.set(x, "externalBudgetId", value.asInstanceOf[js.Any])
    
    inline def setExternalBudgetIdUndefined: Self = StObject.set(x, "externalBudgetId", js.undefined)
    
    inline def setPreTaxAmountMicros(value: String): Self = StObject.set(x, "preTaxAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setPreTaxAmountMicrosUndefined: Self = StObject.set(x, "preTaxAmountMicros", js.undefined)
    
    inline def setPrismaCpeCode(value: PrismaCpeCode): Self = StObject.set(x, "prismaCpeCode", value.asInstanceOf[js.Any])
    
    inline def setPrismaCpeCodeUndefined: Self = StObject.set(x, "prismaCpeCode", js.undefined)
    
    inline def setTaxAmountMicros(value: String): Self = StObject.set(x, "taxAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountMicrosUndefined: Self = StObject.set(x, "taxAmountMicros", js.undefined)
    
    inline def setTotalAmountMicros(value: String): Self = StObject.set(x, "totalAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setTotalAmountMicrosUndefined: Self = StObject.set(x, "totalAmountMicros", js.undefined)
  }
}
