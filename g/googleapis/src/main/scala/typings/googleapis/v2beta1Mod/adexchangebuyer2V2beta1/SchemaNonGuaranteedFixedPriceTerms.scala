package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Terms for Preferred Deals. Note that Preferred Deals cannot be created via
  * the API at this time, but can be returned in a get or list request.
  */
@js.native
trait SchemaNonGuaranteedFixedPriceTerms extends js.Object {
  
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
}
object SchemaNonGuaranteedFixedPriceTerms {
  
  @scala.inline
  def apply(): SchemaNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonGuaranteedFixedPriceTerms]
  }
  
  @scala.inline
  implicit class SchemaNonGuaranteedFixedPriceTermsOps[Self <: SchemaNonGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    
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
    def setFixedPricesVarargs(value: SchemaPricePerBuyer*): Self = this.set("fixedPrices", js.Array(value :_*))
    
    @scala.inline
    def setFixedPrices(value: js.Array[SchemaPricePerBuyer]): Self = this.set("fixedPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedPrices: Self = this.set("fixedPrices", js.undefined)
  }
}
