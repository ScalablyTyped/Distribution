package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBudgetSummary extends StObject {
  
  /**
    * Corresponds to the external_budget_id of a campaign budget. If the value is not set in the campaign budget, this field will be empty.
    */
  var externalBudgetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sum of charges made under this budget before taxes, in micros of the invoice's currency. For example, if currency_code is `USD`, then 1000000 represents one US dollar.
    */
  var preTaxAmountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Relevant client, product, and estimate codes from the Mediaocean Prisma tool. Only applicable for campaign budgets with an external_budget_source of EXTERNAL_BUDGET_SOURCE_MEDIA_OCEAN.
    */
  var prismaCpeCode: js.UndefOr[SchemaPrismaCpeCode] = js.undefined
  
  /**
    * The amount of tax applied to charges under this budget, in micros of the invoice's currency. For example, if currency_code is `USD`, then 1000000 represents one US dollar.
    */
  var taxAmountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total sum of charges made under this budget, including tax, in micros of the invoice's currency. For example, if currency_code is `USD`, then 1000000 represents one US dollar.
    */
  var totalAmountMicros: js.UndefOr[String | Null] = js.undefined
}
object SchemaBudgetSummary {
  
  inline def apply(): SchemaBudgetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBudgetSummary]
  }
  
  extension [Self <: SchemaBudgetSummary](x: Self) {
    
    inline def setExternalBudgetId(value: String): Self = StObject.set(x, "externalBudgetId", value.asInstanceOf[js.Any])
    
    inline def setExternalBudgetIdNull: Self = StObject.set(x, "externalBudgetId", null)
    
    inline def setExternalBudgetIdUndefined: Self = StObject.set(x, "externalBudgetId", js.undefined)
    
    inline def setPreTaxAmountMicros(value: String): Self = StObject.set(x, "preTaxAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setPreTaxAmountMicrosNull: Self = StObject.set(x, "preTaxAmountMicros", null)
    
    inline def setPreTaxAmountMicrosUndefined: Self = StObject.set(x, "preTaxAmountMicros", js.undefined)
    
    inline def setPrismaCpeCode(value: SchemaPrismaCpeCode): Self = StObject.set(x, "prismaCpeCode", value.asInstanceOf[js.Any])
    
    inline def setPrismaCpeCodeUndefined: Self = StObject.set(x, "prismaCpeCode", js.undefined)
    
    inline def setTaxAmountMicros(value: String): Self = StObject.set(x, "taxAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountMicrosNull: Self = StObject.set(x, "taxAmountMicros", null)
    
    inline def setTaxAmountMicrosUndefined: Self = StObject.set(x, "taxAmountMicros", js.undefined)
    
    inline def setTotalAmountMicros(value: String): Self = StObject.set(x, "totalAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setTotalAmountMicrosNull: Self = StObject.set(x, "totalAmountMicros", null)
    
    inline def setTotalAmountMicrosUndefined: Self = StObject.set(x, "totalAmountMicros", js.undefined)
  }
}
