package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealTerms extends StObject {
  
  /** Visibility of the URL in bid requests. */
  var brandingType: js.UndefOr[String] = js.native
  
  /**
    * Indicates that this ExternalDealId exists under at least two different AdxInventoryDeals. Currently, the only case that the same ExternalDealId will exist is programmatic cross sell
    * case.
    */
  var crossListedExternalDealIdType: js.UndefOr[String] = js.native
  
  /** Description for the proposed terms of the deal. */
  var description: js.UndefOr[String] = js.native
  
  /** Non-binding estimate of the estimated gross spend for this deal Can be set by buyer or seller. */
  var estimatedGrossSpend: js.UndefOr[Price] = js.native
  
  /** Non-binding estimate of the impressions served per day Can be set by buyer or seller. */
  var estimatedImpressionsPerDay: js.UndefOr[String] = js.native
  
  /** The terms for guaranteed fixed price deals. */
  var guaranteedFixedPriceTerms: js.UndefOr[DealTermsGuaranteedFixedPriceTerms] = js.native
  
  /** The terms for non-guaranteed auction deals. */
  var nonGuaranteedAuctionTerms: js.UndefOr[DealTermsNonGuaranteedAuctionTerms] = js.native
  
  /** The terms for non-guaranteed fixed price deals. */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[DealTermsNonGuaranteedFixedPriceTerms] = js.native
  
  /** The terms for rubicon non-guaranteed deals. */
  var rubiconNonGuaranteedTerms: js.UndefOr[DealTermsRubiconNonGuaranteedTerms] = js.native
  
  /** For deals with Cost Per Day billing, defines the timezone used to mark the boundaries of a day (buyer-readonly) */
  var sellerTimeZone: js.UndefOr[String] = js.native
}
object DealTerms {
  
  @scala.inline
  def apply(): DealTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTerms]
  }
  
  @scala.inline
  implicit class DealTermsMutableBuilder[Self <: DealTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrandingType(value: String): Self = StObject.set(x, "brandingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandingTypeUndefined: Self = StObject.set(x, "brandingType", js.undefined)
    
    @scala.inline
    def setCrossListedExternalDealIdType(value: String): Self = StObject.set(x, "crossListedExternalDealIdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossListedExternalDealIdTypeUndefined: Self = StObject.set(x, "crossListedExternalDealIdType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEstimatedGrossSpend(value: Price): Self = StObject.set(x, "estimatedGrossSpend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedGrossSpendUndefined: Self = StObject.set(x, "estimatedGrossSpend", js.undefined)
    
    @scala.inline
    def setEstimatedImpressionsPerDay(value: String): Self = StObject.set(x, "estimatedImpressionsPerDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedImpressionsPerDayUndefined: Self = StObject.set(x, "estimatedImpressionsPerDay", js.undefined)
    
    @scala.inline
    def setGuaranteedFixedPriceTerms(value: DealTermsGuaranteedFixedPriceTerms): Self = StObject.set(x, "guaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuaranteedFixedPriceTermsUndefined: Self = StObject.set(x, "guaranteedFixedPriceTerms", js.undefined)
    
    @scala.inline
    def setNonGuaranteedAuctionTerms(value: DealTermsNonGuaranteedAuctionTerms): Self = StObject.set(x, "nonGuaranteedAuctionTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonGuaranteedAuctionTermsUndefined: Self = StObject.set(x, "nonGuaranteedAuctionTerms", js.undefined)
    
    @scala.inline
    def setNonGuaranteedFixedPriceTerms(value: DealTermsNonGuaranteedFixedPriceTerms): Self = StObject.set(x, "nonGuaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonGuaranteedFixedPriceTermsUndefined: Self = StObject.set(x, "nonGuaranteedFixedPriceTerms", js.undefined)
    
    @scala.inline
    def setRubiconNonGuaranteedTerms(value: DealTermsRubiconNonGuaranteedTerms): Self = StObject.set(x, "rubiconNonGuaranteedTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRubiconNonGuaranteedTermsUndefined: Self = StObject.set(x, "rubiconNonGuaranteedTerms", js.undefined)
    
    @scala.inline
    def setSellerTimeZone(value: String): Self = StObject.set(x, "sellerTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerTimeZoneUndefined: Self = StObject.set(x, "sellerTimeZone", js.undefined)
  }
}
