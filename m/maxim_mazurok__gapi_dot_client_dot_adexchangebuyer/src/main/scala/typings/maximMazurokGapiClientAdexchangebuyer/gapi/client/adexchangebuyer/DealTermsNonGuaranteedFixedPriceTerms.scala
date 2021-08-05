package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DealTermsNonGuaranteedFixedPriceTerms extends StObject {
  
  /** Fixed price for the specified buyer. */
  var fixedPrices: js.UndefOr[js.Array[PricePerBuyer]] = js.undefined
}
object DealTermsNonGuaranteedFixedPriceTerms {
  
  inline def apply(): DealTermsNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsNonGuaranteedFixedPriceTerms]
  }
  
  extension [Self <: DealTermsNonGuaranteedFixedPriceTerms](x: Self) {
    
    inline def setFixedPrices(value: js.Array[PricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    inline def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    inline def setFixedPricesVarargs(value: PricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value :_*))
  }
}
