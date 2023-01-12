package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuaranteedFixedPriceTerms extends StObject {
  
  /** Fixed price for the specified buyer. */
  var fixedPrices: js.UndefOr[js.Array[PricePerBuyer]] = js.undefined
  
  /** Guaranteed impressions as a percentage. This is the percentage of guaranteed looks that the buyer is guaranteeing to buy. */
  var guaranteedImpressions: js.UndefOr[String] = js.undefined
  
  /** Count of guaranteed looks. Required for deal, optional for product. */
  var guaranteedLooks: js.UndefOr[String] = js.undefined
  
  /** The lifetime impression cap for CPM sponsorship deals. The deal will stop serving when the cap is reached. */
  var impressionCap: js.UndefOr[String] = js.undefined
  
  /** Daily minimum looks for CPD deal types. */
  var minimumDailyLooks: js.UndefOr[String] = js.undefined
  
  /** For sponsorship deals, this is the percentage of the seller's eligible impressions that the deal will serve until the cap is reached. */
  var percentShareOfVoice: js.UndefOr[String] = js.undefined
  
  /**
    * The reservation type for a Programmatic Guaranteed deal. This indicates whether the number of impressions is fixed, or a percent of available impressions. If not specified, the
    * default reservation type is STANDARD.
    */
  var reservationType: js.UndefOr[String] = js.undefined
}
object GuaranteedFixedPriceTerms {
  
  inline def apply(): GuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuaranteedFixedPriceTerms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    
    inline def setFixedPrices(value: js.Array[PricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    inline def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    inline def setFixedPricesVarargs(value: PricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value*))
    
    inline def setGuaranteedImpressions(value: String): Self = StObject.set(x, "guaranteedImpressions", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedImpressionsUndefined: Self = StObject.set(x, "guaranteedImpressions", js.undefined)
    
    inline def setGuaranteedLooks(value: String): Self = StObject.set(x, "guaranteedLooks", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedLooksUndefined: Self = StObject.set(x, "guaranteedLooks", js.undefined)
    
    inline def setImpressionCap(value: String): Self = StObject.set(x, "impressionCap", value.asInstanceOf[js.Any])
    
    inline def setImpressionCapUndefined: Self = StObject.set(x, "impressionCap", js.undefined)
    
    inline def setMinimumDailyLooks(value: String): Self = StObject.set(x, "minimumDailyLooks", value.asInstanceOf[js.Any])
    
    inline def setMinimumDailyLooksUndefined: Self = StObject.set(x, "minimumDailyLooks", js.undefined)
    
    inline def setPercentShareOfVoice(value: String): Self = StObject.set(x, "percentShareOfVoice", value.asInstanceOf[js.Any])
    
    inline def setPercentShareOfVoiceUndefined: Self = StObject.set(x, "percentShareOfVoice", js.undefined)
    
    inline def setReservationType(value: String): Self = StObject.set(x, "reservationType", value.asInstanceOf[js.Any])
    
    inline def setReservationTypeUndefined: Self = StObject.set(x, "reservationType", js.undefined)
  }
}
