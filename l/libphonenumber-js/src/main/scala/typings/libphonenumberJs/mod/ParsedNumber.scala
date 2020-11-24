package typings.libphonenumberJs.mod

import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.Extension
import typings.libphonenumberJs.typesMod.NationalNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedNumber extends js.Object {
  
  var country: CountryCode = js.native
  
  var countryCallingCode: js.UndefOr[CountryCallingCode] = js.native
  
  var ext: js.UndefOr[Extension] = js.native
  
  var phone: NationalNumber = js.native
  
  var possible: js.UndefOr[Boolean] = js.native
  
  var valid: js.UndefOr[Boolean] = js.native
}
object ParsedNumber {
  
  @scala.inline
  def apply(country: CountryCode, phone: NationalNumber): ParsedNumber = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedNumber]
  }
  
  @scala.inline
  implicit class ParsedNumberOps[Self <: ParsedNumber] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: CountryCode): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: NationalNumber): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCallingCode(value: CountryCallingCode): Self = this.set("countryCallingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCallingCode: Self = this.set("countryCallingCode", js.undefined)
    
    @scala.inline
    def setExt(value: Extension): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setPossible(value: Boolean): Self = this.set("possible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePossible: Self = this.set("possible", js.undefined)
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
}
