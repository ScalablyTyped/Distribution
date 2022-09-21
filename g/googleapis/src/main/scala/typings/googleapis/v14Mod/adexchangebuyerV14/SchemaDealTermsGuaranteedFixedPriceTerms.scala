package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDealTermsGuaranteedFixedPriceTerms extends StObject {
  
  /**
    * External billing info for this Deal. This field is relevant when external billing info such as price has a different currency code than DFP/AdX.
    */
  var billingInfo: js.UndefOr[SchemaDealTermsGuaranteedFixedPriceTermsBillingInfo] = js.undefined
  
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.undefined
  
  /**
    * Guaranteed impressions as a percentage. This is the percentage of guaranteed looks that the buyer is guaranteeing to buy.
    */
  var guaranteedImpressions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of guaranteed looks. Required for deal, optional for product. For CPD deals, buyer changes to guaranteed_looks will be ignored.
    */
  var guaranteedLooks: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of minimum daily looks for a CPD deal. For CPD deals, buyer should negotiate on this field instead of guaranteed_looks.
    */
  var minimumDailyLooks: js.UndefOr[String | Null] = js.undefined
}
object SchemaDealTermsGuaranteedFixedPriceTerms {
  
  inline def apply(): SchemaDealTermsGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsGuaranteedFixedPriceTerms]
  }
  
  extension [Self <: SchemaDealTermsGuaranteedFixedPriceTerms](x: Self) {
    
    inline def setBillingInfo(value: SchemaDealTermsGuaranteedFixedPriceTermsBillingInfo): Self = StObject.set(x, "billingInfo", value.asInstanceOf[js.Any])
    
    inline def setBillingInfoUndefined: Self = StObject.set(x, "billingInfo", js.undefined)
    
    inline def setFixedPrices(value: js.Array[SchemaPricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    inline def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    inline def setFixedPricesVarargs(value: SchemaPricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value*))
    
    inline def setGuaranteedImpressions(value: String): Self = StObject.set(x, "guaranteedImpressions", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedImpressionsNull: Self = StObject.set(x, "guaranteedImpressions", null)
    
    inline def setGuaranteedImpressionsUndefined: Self = StObject.set(x, "guaranteedImpressions", js.undefined)
    
    inline def setGuaranteedLooks(value: String): Self = StObject.set(x, "guaranteedLooks", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedLooksNull: Self = StObject.set(x, "guaranteedLooks", null)
    
    inline def setGuaranteedLooksUndefined: Self = StObject.set(x, "guaranteedLooks", js.undefined)
    
    inline def setMinimumDailyLooks(value: String): Self = StObject.set(x, "minimumDailyLooks", value.asInstanceOf[js.Any])
    
    inline def setMinimumDailyLooksNull: Self = StObject.set(x, "minimumDailyLooks", null)
    
    inline def setMinimumDailyLooksUndefined: Self = StObject.set(x, "minimumDailyLooks", js.undefined)
  }
}
