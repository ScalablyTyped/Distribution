package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Terms for Programmatic Guaranteed Deals.
  */
trait SchemaGuaranteedFixedPriceTerms extends StObject {
  
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.undefined
  
  /**
    * Guaranteed impressions as a percentage. This is the percentage of
    * guaranteed looks that the buyer is guaranteeing to buy.
    */
  var guaranteedImpressions: js.UndefOr[String] = js.undefined
  
  /**
    * Count of guaranteed looks. Required for deal, optional for product.
    */
  var guaranteedLooks: js.UndefOr[String] = js.undefined
  
  /**
    * Daily minimum looks for CPD deal types.
    */
  var minimumDailyLooks: js.UndefOr[String] = js.undefined
}
object SchemaGuaranteedFixedPriceTerms {
  
  inline def apply(): SchemaGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuaranteedFixedPriceTerms]
  }
  
  extension [Self <: SchemaGuaranteedFixedPriceTerms](x: Self) {
    
    inline def setFixedPrices(value: js.Array[SchemaPricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    inline def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    inline def setFixedPricesVarargs(value: SchemaPricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value :_*))
    
    inline def setGuaranteedImpressions(value: String): Self = StObject.set(x, "guaranteedImpressions", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedImpressionsUndefined: Self = StObject.set(x, "guaranteedImpressions", js.undefined)
    
    inline def setGuaranteedLooks(value: String): Self = StObject.set(x, "guaranteedLooks", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedLooksUndefined: Self = StObject.set(x, "guaranteedLooks", js.undefined)
    
    inline def setMinimumDailyLooks(value: String): Self = StObject.set(x, "minimumDailyLooks", value.asInstanceOf[js.Any])
    
    inline def setMinimumDailyLooksUndefined: Self = StObject.set(x, "minimumDailyLooks", js.undefined)
  }
}
