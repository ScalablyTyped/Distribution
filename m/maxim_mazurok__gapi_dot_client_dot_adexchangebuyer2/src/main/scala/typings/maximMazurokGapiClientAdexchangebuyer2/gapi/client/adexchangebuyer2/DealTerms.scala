package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealTerms extends StObject {
  
  /** Visibility of the URL in bid requests. (default: BRANDED) */
  var brandingType: js.UndefOr[String] = js.native
  
  /** Publisher provided description for the terms. */
  var description: js.UndefOr[String] = js.native
  
  /** Non-binding estimate of the estimated gross spend for this deal. Can be set by buyer or seller. */
  var estimatedGrossSpend: js.UndefOr[Price] = js.native
  
  /** Non-binding estimate of the impressions served per day. Can be set by buyer or seller. */
  var estimatedImpressionsPerDay: js.UndefOr[String] = js.native
  
  /** The terms for guaranteed fixed price deals. */
  var guaranteedFixedPriceTerms: js.UndefOr[GuaranteedFixedPriceTerms] = js.native
  
  /** The terms for non-guaranteed auction deals. */
  var nonGuaranteedAuctionTerms: js.UndefOr[NonGuaranteedAuctionTerms] = js.native
  
  /** The terms for non-guaranteed fixed price deals. */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[NonGuaranteedFixedPriceTerms] = js.native
  
  /**
    * The time zone name. For deals with Cost Per Day billing, defines the time zone used to mark the boundaries of a day. It should be an IANA TZ name, such as "America/Los_Angeles". For
    * more information, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
    */
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
    def setGuaranteedFixedPriceTerms(value: GuaranteedFixedPriceTerms): Self = StObject.set(x, "guaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuaranteedFixedPriceTermsUndefined: Self = StObject.set(x, "guaranteedFixedPriceTerms", js.undefined)
    
    @scala.inline
    def setNonGuaranteedAuctionTerms(value: NonGuaranteedAuctionTerms): Self = StObject.set(x, "nonGuaranteedAuctionTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonGuaranteedAuctionTermsUndefined: Self = StObject.set(x, "nonGuaranteedAuctionTerms", js.undefined)
    
    @scala.inline
    def setNonGuaranteedFixedPriceTerms(value: NonGuaranteedFixedPriceTerms): Self = StObject.set(x, "nonGuaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonGuaranteedFixedPriceTermsUndefined: Self = StObject.set(x, "nonGuaranteedFixedPriceTerms", js.undefined)
    
    @scala.inline
    def setSellerTimeZone(value: String): Self = StObject.set(x, "sellerTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerTimeZoneUndefined: Self = StObject.set(x, "sellerTimeZone", js.undefined)
  }
}
