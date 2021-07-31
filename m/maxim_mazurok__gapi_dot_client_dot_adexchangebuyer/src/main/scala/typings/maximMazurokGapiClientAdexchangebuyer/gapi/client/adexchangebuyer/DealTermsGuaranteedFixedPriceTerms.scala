package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DealTermsGuaranteedFixedPriceTerms extends StObject {
  
  /** External billing info for this Deal. This field is relevant when external billing info such as price has a different currency code than DFP/AdX. */
  var billingInfo: js.UndefOr[DealTermsGuaranteedFixedPriceTermsBillingInfo] = js.undefined
  
  /** Fixed price for the specified buyer. */
  var fixedPrices: js.UndefOr[js.Array[PricePerBuyer]] = js.undefined
  
  /** Guaranteed impressions as a percentage. This is the percentage of guaranteed looks that the buyer is guaranteeing to buy. */
  var guaranteedImpressions: js.UndefOr[String] = js.undefined
  
  /** Count of guaranteed looks. Required for deal, optional for product. For CPD deals, buyer changes to guaranteed_looks will be ignored. */
  var guaranteedLooks: js.UndefOr[String] = js.undefined
  
  /** Count of minimum daily looks for a CPD deal. For CPD deals, buyer should negotiate on this field instead of guaranteed_looks. */
  var minimumDailyLooks: js.UndefOr[String] = js.undefined
}
object DealTermsGuaranteedFixedPriceTerms {
  
  @scala.inline
  def apply(): DealTermsGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsGuaranteedFixedPriceTerms]
  }
  
  @scala.inline
  implicit class DealTermsGuaranteedFixedPriceTermsMutableBuilder[Self <: DealTermsGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingInfo(value: DealTermsGuaranteedFixedPriceTermsBillingInfo): Self = StObject.set(x, "billingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingInfoUndefined: Self = StObject.set(x, "billingInfo", js.undefined)
    
    @scala.inline
    def setFixedPrices(value: js.Array[PricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    @scala.inline
    def setFixedPricesVarargs(value: PricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value :_*))
    
    @scala.inline
    def setGuaranteedImpressions(value: String): Self = StObject.set(x, "guaranteedImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuaranteedImpressionsUndefined: Self = StObject.set(x, "guaranteedImpressions", js.undefined)
    
    @scala.inline
    def setGuaranteedLooks(value: String): Self = StObject.set(x, "guaranteedLooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuaranteedLooksUndefined: Self = StObject.set(x, "guaranteedLooks", js.undefined)
    
    @scala.inline
    def setMinimumDailyLooks(value: String): Self = StObject.set(x, "minimumDailyLooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumDailyLooksUndefined: Self = StObject.set(x, "minimumDailyLooks", js.undefined)
  }
}
