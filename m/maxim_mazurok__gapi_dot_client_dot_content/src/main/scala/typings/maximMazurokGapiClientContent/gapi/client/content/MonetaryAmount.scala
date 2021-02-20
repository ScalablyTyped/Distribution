package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonetaryAmount extends StObject {
  
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
  implicit class MonetaryAmountMutableBuilder[Self <: MonetaryAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriceAmount(value: Price): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: Price): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
