package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountryInfo extends js.Object {
  
  var country: String = js.native
  
  var fiatCurrency: js.UndefOr[String] = js.native
}
object CountryInfo {
  
  @scala.inline
  def apply(country: String): CountryInfo = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryInfo]
  }
  
  @scala.inline
  implicit class CountryInfoOps[Self <: CountryInfo] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiatCurrency(value: String): Self = this.set("fiatCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiatCurrency: Self = this.set("fiatCurrency", js.undefined)
  }
}
