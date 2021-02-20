package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Terms for Programmatic Guaranteed Deals.
  */
@js.native
trait SchemaGuaranteedFixedPriceTerms extends StObject {
  
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
  
  /**
    * Guaranteed impressions as a percentage. This is the percentage of
    * guaranteed looks that the buyer is guaranteeing to buy.
    */
  var guaranteedImpressions: js.UndefOr[String] = js.native
  
  /**
    * Count of guaranteed looks. Required for deal, optional for product.
    */
  var guaranteedLooks: js.UndefOr[String] = js.native
  
  /**
    * Daily minimum looks for CPD deal types.
    */
  var minimumDailyLooks: js.UndefOr[String] = js.native
}
object SchemaGuaranteedFixedPriceTerms {
  
  @scala.inline
  def apply(): SchemaGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuaranteedFixedPriceTerms]
  }
  
  @scala.inline
  implicit class SchemaGuaranteedFixedPriceTermsMutableBuilder[Self <: SchemaGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedPrices(value: js.Array[SchemaPricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    @scala.inline
    def setFixedPricesVarargs(value: SchemaPricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value :_*))
    
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
