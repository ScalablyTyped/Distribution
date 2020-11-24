package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonGuaranteedFixedPriceTerms extends js.Object {
  
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
  implicit class NonGuaranteedFixedPriceTermsOps[Self <: NonGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFixedPricesVarargs(value: PricePerBuyer*): Self = this.set("fixedPrices", js.Array(value :_*))
    
    @scala.inline
    def setFixedPrices(value: js.Array[PricePerBuyer]): Self = this.set("fixedPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedPrices: Self = this.set("fixedPrices", js.undefined)
  }
}
