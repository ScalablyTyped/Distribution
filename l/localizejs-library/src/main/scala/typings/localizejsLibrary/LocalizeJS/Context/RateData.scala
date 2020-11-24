package typings.localizejsLibrary.LocalizeJS.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateData extends js.Object {
  
  var fromCurrency: String = js.native
  
  var rate: String = js.native
  
  var toCurrency: String = js.native
}
object RateData {
  
  @scala.inline
  def apply(fromCurrency: String, rate: String, toCurrency: String): RateData = {
    val __obj = js.Dynamic.literal(fromCurrency = fromCurrency.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], toCurrency = toCurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateData]
  }
  
  @scala.inline
  implicit class RateDataOps[Self <: RateData] (val x: Self) extends AnyVal {
    
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
    def setFromCurrency(value: String): Self = this.set("fromCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRate(value: String): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCurrency(value: String): Self = this.set("toCurrency", value.asInstanceOf[js.Any])
  }
}
