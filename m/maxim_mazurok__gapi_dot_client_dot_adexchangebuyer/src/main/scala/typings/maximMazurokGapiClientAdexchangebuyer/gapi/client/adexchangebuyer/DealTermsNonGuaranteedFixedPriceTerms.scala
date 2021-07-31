package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DealTermsNonGuaranteedFixedPriceTerms extends StObject {
  
  /** Fixed price for the specified buyer. */
  var fixedPrices: js.UndefOr[js.Array[PricePerBuyer]] = js.undefined
}
object DealTermsNonGuaranteedFixedPriceTerms {
  
  @scala.inline
  def apply(): DealTermsNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsNonGuaranteedFixedPriceTerms]
  }
  
  @scala.inline
  implicit class DealTermsNonGuaranteedFixedPriceTermsMutableBuilder[Self <: DealTermsNonGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedPrices(value: js.Array[PricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    @scala.inline
    def setFixedPricesVarargs(value: PricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value :_*))
  }
}
