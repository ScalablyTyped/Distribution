package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDealTerms extends StObject {
  
  /**
    * Visibility of the URL in bid requests.
    */
  var brandingType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates that this ExternalDealId exists under at least two different AdxInventoryDeals. Currently, the only case that the same ExternalDealId will exist is programmatic cross sell case.
    */
  var crossListedExternalDealIdType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description for the proposed terms of the deal.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Non-binding estimate of the estimated gross spend for this deal Can be set by buyer or seller.
    */
  var estimatedGrossSpend: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Non-binding estimate of the impressions served per day Can be set by buyer or seller.
    */
  var estimatedImpressionsPerDay: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The terms for guaranteed fixed price deals.
    */
  var guaranteedFixedPriceTerms: js.UndefOr[SchemaDealTermsGuaranteedFixedPriceTerms] = js.undefined
  
  /**
    * The terms for non-guaranteed auction deals.
    */
  var nonGuaranteedAuctionTerms: js.UndefOr[SchemaDealTermsNonGuaranteedAuctionTerms] = js.undefined
  
  /**
    * The terms for non-guaranteed fixed price deals.
    */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[SchemaDealTermsNonGuaranteedFixedPriceTerms] = js.undefined
  
  /**
    * The terms for rubicon non-guaranteed deals.
    */
  var rubiconNonGuaranteedTerms: js.UndefOr[SchemaDealTermsRubiconNonGuaranteedTerms] = js.undefined
  
  /**
    * For deals with Cost Per Day billing, defines the timezone used to mark the boundaries of a day (buyer-readonly)
    */
  var sellerTimeZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaDealTerms {
  
  inline def apply(): SchemaDealTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTerms]
  }
  
  extension [Self <: SchemaDealTerms](x: Self) {
    
    inline def setBrandingType(value: String): Self = StObject.set(x, "brandingType", value.asInstanceOf[js.Any])
    
    inline def setBrandingTypeNull: Self = StObject.set(x, "brandingType", null)
    
    inline def setBrandingTypeUndefined: Self = StObject.set(x, "brandingType", js.undefined)
    
    inline def setCrossListedExternalDealIdType(value: String): Self = StObject.set(x, "crossListedExternalDealIdType", value.asInstanceOf[js.Any])
    
    inline def setCrossListedExternalDealIdTypeNull: Self = StObject.set(x, "crossListedExternalDealIdType", null)
    
    inline def setCrossListedExternalDealIdTypeUndefined: Self = StObject.set(x, "crossListedExternalDealIdType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEstimatedGrossSpend(value: SchemaPrice): Self = StObject.set(x, "estimatedGrossSpend", value.asInstanceOf[js.Any])
    
    inline def setEstimatedGrossSpendUndefined: Self = StObject.set(x, "estimatedGrossSpend", js.undefined)
    
    inline def setEstimatedImpressionsPerDay(value: String): Self = StObject.set(x, "estimatedImpressionsPerDay", value.asInstanceOf[js.Any])
    
    inline def setEstimatedImpressionsPerDayNull: Self = StObject.set(x, "estimatedImpressionsPerDay", null)
    
    inline def setEstimatedImpressionsPerDayUndefined: Self = StObject.set(x, "estimatedImpressionsPerDay", js.undefined)
    
    inline def setGuaranteedFixedPriceTerms(value: SchemaDealTermsGuaranteedFixedPriceTerms): Self = StObject.set(x, "guaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedFixedPriceTermsUndefined: Self = StObject.set(x, "guaranteedFixedPriceTerms", js.undefined)
    
    inline def setNonGuaranteedAuctionTerms(value: SchemaDealTermsNonGuaranteedAuctionTerms): Self = StObject.set(x, "nonGuaranteedAuctionTerms", value.asInstanceOf[js.Any])
    
    inline def setNonGuaranteedAuctionTermsUndefined: Self = StObject.set(x, "nonGuaranteedAuctionTerms", js.undefined)
    
    inline def setNonGuaranteedFixedPriceTerms(value: SchemaDealTermsNonGuaranteedFixedPriceTerms): Self = StObject.set(x, "nonGuaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    inline def setNonGuaranteedFixedPriceTermsUndefined: Self = StObject.set(x, "nonGuaranteedFixedPriceTerms", js.undefined)
    
    inline def setRubiconNonGuaranteedTerms(value: SchemaDealTermsRubiconNonGuaranteedTerms): Self = StObject.set(x, "rubiconNonGuaranteedTerms", value.asInstanceOf[js.Any])
    
    inline def setRubiconNonGuaranteedTermsUndefined: Self = StObject.set(x, "rubiconNonGuaranteedTerms", js.undefined)
    
    inline def setSellerTimeZone(value: String): Self = StObject.set(x, "sellerTimeZone", value.asInstanceOf[js.Any])
    
    inline def setSellerTimeZoneNull: Self = StObject.set(x, "sellerTimeZone", null)
    
    inline def setSellerTimeZoneUndefined: Self = StObject.set(x, "sellerTimeZone", js.undefined)
  }
}
