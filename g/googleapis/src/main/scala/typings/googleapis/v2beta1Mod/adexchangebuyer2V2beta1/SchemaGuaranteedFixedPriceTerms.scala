package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGuaranteedFixedPriceTerms extends StObject {
  
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.undefined
  
  /**
    * Guaranteed impressions as a percentage. This is the percentage of guaranteed looks that the buyer is guaranteeing to buy.
    */
  var guaranteedImpressions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of guaranteed looks. Required for deal, optional for product.
    */
  var guaranteedLooks: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The lifetime impression cap for CPM sponsorship deals. The deal will stop serving when the cap is reached.
    */
  var impressionCap: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Daily minimum looks for CPD deal types.
    */
  var minimumDailyLooks: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For sponsorship deals, this is the percentage of the seller's eligible impressions that the deal will serve until the cap is reached.
    */
  var percentShareOfVoice: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reservation type for a Programmatic Guaranteed deal. This indicates whether the number of impressions is fixed, or a percent of available impressions. If not specified, the default reservation type is STANDARD.
    */
  var reservationType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGuaranteedFixedPriceTerms {
  
  inline def apply(): SchemaGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuaranteedFixedPriceTerms]
  }
  
  extension [Self <: SchemaGuaranteedFixedPriceTerms](x: Self) {
    
    inline def setFixedPrices(value: js.Array[SchemaPricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    inline def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    inline def setFixedPricesVarargs(value: SchemaPricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value*))
    
    inline def setGuaranteedImpressions(value: String): Self = StObject.set(x, "guaranteedImpressions", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedImpressionsNull: Self = StObject.set(x, "guaranteedImpressions", null)
    
    inline def setGuaranteedImpressionsUndefined: Self = StObject.set(x, "guaranteedImpressions", js.undefined)
    
    inline def setGuaranteedLooks(value: String): Self = StObject.set(x, "guaranteedLooks", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedLooksNull: Self = StObject.set(x, "guaranteedLooks", null)
    
    inline def setGuaranteedLooksUndefined: Self = StObject.set(x, "guaranteedLooks", js.undefined)
    
    inline def setImpressionCap(value: String): Self = StObject.set(x, "impressionCap", value.asInstanceOf[js.Any])
    
    inline def setImpressionCapNull: Self = StObject.set(x, "impressionCap", null)
    
    inline def setImpressionCapUndefined: Self = StObject.set(x, "impressionCap", js.undefined)
    
    inline def setMinimumDailyLooks(value: String): Self = StObject.set(x, "minimumDailyLooks", value.asInstanceOf[js.Any])
    
    inline def setMinimumDailyLooksNull: Self = StObject.set(x, "minimumDailyLooks", null)
    
    inline def setMinimumDailyLooksUndefined: Self = StObject.set(x, "minimumDailyLooks", js.undefined)
    
    inline def setPercentShareOfVoice(value: String): Self = StObject.set(x, "percentShareOfVoice", value.asInstanceOf[js.Any])
    
    inline def setPercentShareOfVoiceNull: Self = StObject.set(x, "percentShareOfVoice", null)
    
    inline def setPercentShareOfVoiceUndefined: Self = StObject.set(x, "percentShareOfVoice", js.undefined)
    
    inline def setReservationType(value: String): Self = StObject.set(x, "reservationType", value.asInstanceOf[js.Any])
    
    inline def setReservationTypeNull: Self = StObject.set(x, "reservationType", null)
    
    inline def setReservationTypeUndefined: Self = StObject.set(x, "reservationType", js.undefined)
  }
}
