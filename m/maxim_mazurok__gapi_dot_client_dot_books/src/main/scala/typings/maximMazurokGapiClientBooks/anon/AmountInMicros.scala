package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmountInMicros extends js.Object {
  
  var amountInMicros: js.UndefOr[Double] = js.native
  
  var currencyCode: js.UndefOr[String] = js.native
  
  var releaseNumber: js.UndefOr[String] = js.native
  
  var releaseTime: js.UndefOr[String] = js.native
}
object AmountInMicros {
  
  @scala.inline
  def apply(): AmountInMicros = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmountInMicros]
  }
  
  @scala.inline
  implicit class AmountInMicrosOps[Self <: AmountInMicros] (val x: Self) extends AnyVal {
    
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
    def setAmountInMicros(value: Double): Self = this.set("amountInMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmountInMicros: Self = this.set("amountInMicros", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setReleaseNumber(value: String): Self = this.set("releaseNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseNumber: Self = this.set("releaseNumber", js.undefined)
    
    @scala.inline
    def setReleaseTime(value: String): Self = this.set("releaseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseTime: Self = this.set("releaseTime", js.undefined)
  }
}
