package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DealTerms extends StObject {
  
  /** Visibility of the URL in bid requests. */
  var brandingType: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that this ExternalDealId exists under at least two different AdxInventoryDeals. Currently, the only case that the same ExternalDealId will exist is programmatic cross sell
    * case.
    */
  var crossListedExternalDealIdType: js.UndefOr[String] = js.undefined
  
  /** Description for the proposed terms of the deal. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Non-binding estimate of the estimated gross spend for this deal Can be set by buyer or seller. */
  var estimatedGrossSpend: js.UndefOr[Price] = js.undefined
  
  /** Non-binding estimate of the impressions served per day Can be set by buyer or seller. */
  var estimatedImpressionsPerDay: js.UndefOr[String] = js.undefined
  
  /** The terms for guaranteed fixed price deals. */
  var guaranteedFixedPriceTerms: js.UndefOr[DealTermsGuaranteedFixedPriceTerms] = js.undefined
  
  /** The terms for non-guaranteed auction deals. */
  var nonGuaranteedAuctionTerms: js.UndefOr[DealTermsNonGuaranteedAuctionTerms] = js.undefined
  
  /** The terms for non-guaranteed fixed price deals. */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[DealTermsNonGuaranteedFixedPriceTerms] = js.undefined
  
  /** The terms for rubicon non-guaranteed deals. */
  var rubiconNonGuaranteedTerms: js.UndefOr[DealTermsRubiconNonGuaranteedTerms] = js.undefined
  
  /** For deals with Cost Per Day billing, defines the timezone used to mark the boundaries of a day (buyer-readonly) */
  var sellerTimeZone: js.UndefOr[String] = js.undefined
}
object DealTerms {
  
  inline def apply(): DealTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTerms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DealTerms] (val x: Self) extends AnyVal {
    
    inline def setBrandingType(value: String): Self = StObject.set(x, "brandingType", value.asInstanceOf[js.Any])
    
    inline def setBrandingTypeUndefined: Self = StObject.set(x, "brandingType", js.undefined)
    
    inline def setCrossListedExternalDealIdType(value: String): Self = StObject.set(x, "crossListedExternalDealIdType", value.asInstanceOf[js.Any])
    
    inline def setCrossListedExternalDealIdTypeUndefined: Self = StObject.set(x, "crossListedExternalDealIdType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEstimatedGrossSpend(value: Price): Self = StObject.set(x, "estimatedGrossSpend", value.asInstanceOf[js.Any])
    
    inline def setEstimatedGrossSpendUndefined: Self = StObject.set(x, "estimatedGrossSpend", js.undefined)
    
    inline def setEstimatedImpressionsPerDay(value: String): Self = StObject.set(x, "estimatedImpressionsPerDay", value.asInstanceOf[js.Any])
    
    inline def setEstimatedImpressionsPerDayUndefined: Self = StObject.set(x, "estimatedImpressionsPerDay", js.undefined)
    
    inline def setGuaranteedFixedPriceTerms(value: DealTermsGuaranteedFixedPriceTerms): Self = StObject.set(x, "guaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedFixedPriceTermsUndefined: Self = StObject.set(x, "guaranteedFixedPriceTerms", js.undefined)
    
    inline def setNonGuaranteedAuctionTerms(value: DealTermsNonGuaranteedAuctionTerms): Self = StObject.set(x, "nonGuaranteedAuctionTerms", value.asInstanceOf[js.Any])
    
    inline def setNonGuaranteedAuctionTermsUndefined: Self = StObject.set(x, "nonGuaranteedAuctionTerms", js.undefined)
    
    inline def setNonGuaranteedFixedPriceTerms(value: DealTermsNonGuaranteedFixedPriceTerms): Self = StObject.set(x, "nonGuaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    inline def setNonGuaranteedFixedPriceTermsUndefined: Self = StObject.set(x, "nonGuaranteedFixedPriceTerms", js.undefined)
    
    inline def setRubiconNonGuaranteedTerms(value: DealTermsRubiconNonGuaranteedTerms): Self = StObject.set(x, "rubiconNonGuaranteedTerms", value.asInstanceOf[js.Any])
    
    inline def setRubiconNonGuaranteedTermsUndefined: Self = StObject.set(x, "rubiconNonGuaranteedTerms", js.undefined)
    
    inline def setSellerTimeZone(value: String): Self = StObject.set(x, "sellerTimeZone", value.asInstanceOf[js.Any])
    
    inline def setSellerTimeZoneUndefined: Self = StObject.set(x, "sellerTimeZone", js.undefined)
  }
}
