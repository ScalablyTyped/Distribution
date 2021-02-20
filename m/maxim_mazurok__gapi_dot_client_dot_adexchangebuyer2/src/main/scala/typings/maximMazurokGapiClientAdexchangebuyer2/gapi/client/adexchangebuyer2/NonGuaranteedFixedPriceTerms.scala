package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonGuaranteedFixedPriceTerms extends StObject {
  
  /** Fixed price for the specified buyer. */
  var fixedPrices: js.UndefOr[js.Array[PricePerBuyer]] = js.native
}
object NonGuaranteedFixedPriceTerms {
  
  @scala.inline
  def apply(): NonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonGuaranteedFixedPriceTerms]
  }
  
  @scala.inline
  implicit class NonGuaranteedFixedPriceTermsMutableBuilder[Self <: NonGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedPrices(value: js.Array[PricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    @scala.inline
    def setFixedPricesVarargs(value: PricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value :_*))
  }
}
