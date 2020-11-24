package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonetaryAmount extends js.Object {
  
  /**
    * The pre-tax or post-tax price depends on the location of the order. - For countries (e.g. US) where price attribute excludes tax, this field corresponds to the pre-tax value. - For
    * coutries (e.g. France) where price attribute includes tax, this field corresponds to the post-tax value .
    */
  var priceAmount: js.UndefOr[Price] = js.native
  
  /** Tax value, present only for countries where price attribute excludes tax (e.g. US). No tax is referenced as 0 value with the corresponding `currency`. */
  var taxAmount: js.UndefOr[Price] = js.native
}
object MonetaryAmount {
  
  @scala.inline
  def apply(): MonetaryAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonetaryAmount]
  }
  
  @scala.inline
  implicit class MonetaryAmountOps[Self <: MonetaryAmount] (val x: Self) extends AnyVal {
    
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
    def setPriceAmount(value: Price): Self = this.set("priceAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceAmount: Self = this.set("priceAmount", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: Price): Self = this.set("taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxAmount: Self = this.set("taxAmount", js.undefined)
  }
}
