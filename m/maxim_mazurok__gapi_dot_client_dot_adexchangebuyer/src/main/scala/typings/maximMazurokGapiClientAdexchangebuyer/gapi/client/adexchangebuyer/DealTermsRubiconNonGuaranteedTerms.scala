package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DealTermsRubiconNonGuaranteedTerms extends StObject {
  
  /** Optional price for Rubicon priority access in the auction. */
  var priorityPrice: js.UndefOr[Price] = js.undefined
  
  /** Optional price for Rubicon standard access in the auction. */
  var standardPrice: js.UndefOr[Price] = js.undefined
}
object DealTermsRubiconNonGuaranteedTerms {
  
  inline def apply(): DealTermsRubiconNonGuaranteedTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsRubiconNonGuaranteedTerms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DealTermsRubiconNonGuaranteedTerms] (val x: Self) extends AnyVal {
    
    inline def setPriorityPrice(value: Price): Self = StObject.set(x, "priorityPrice", value.asInstanceOf[js.Any])
    
    inline def setPriorityPriceUndefined: Self = StObject.set(x, "priorityPrice", js.undefined)
    
    inline def setStandardPrice(value: Price): Self = StObject.set(x, "standardPrice", value.asInstanceOf[js.Any])
    
    inline def setStandardPriceUndefined: Self = StObject.set(x, "standardPrice", js.undefined)
  }
}
