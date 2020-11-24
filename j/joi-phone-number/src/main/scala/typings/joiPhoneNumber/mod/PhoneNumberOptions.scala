package typings.joiPhoneNumber.mod

import typings.joiPhoneNumber.joiPhoneNumberStrings.e164
import typings.joiPhoneNumber.joiPhoneNumberStrings.international
import typings.joiPhoneNumber.joiPhoneNumberStrings.national
import typings.joiPhoneNumber.joiPhoneNumberStrings.rfc3966
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberOptions extends js.Object {
  
  var defaultCountry: js.UndefOr[js.Array[String] | String] = js.native
  
  var format: js.UndefOr[e164 | international | national | rfc3966] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object PhoneNumberOptions {
  
  @scala.inline
  def apply(): PhoneNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberOptions]
  }
  
  @scala.inline
  implicit class PhoneNumberOptionsOps[Self <: PhoneNumberOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultCountryVarargs(value: String*): Self = this.set("defaultCountry", js.Array(value :_*))
    
    @scala.inline
    def setDefaultCountry(value: js.Array[String] | String): Self = this.set("defaultCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCountry: Self = this.set("defaultCountry", js.undefined)
    
    @scala.inline
    def setFormat(value: e164 | international | national | rfc3966): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
