package typings.libphonenumberJs.anon

import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultCallingCode extends js.Object {
  
  var defaultCallingCode: js.UndefOr[String] = js.native
  
  var defaultCountry: js.UndefOr[CountryCode] = js.native
}
object DefaultCallingCode {
  
  @scala.inline
  def apply(): DefaultCallingCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultCallingCode]
  }
  
  @scala.inline
  implicit class DefaultCallingCodeOps[Self <: DefaultCallingCode] (val x: Self) extends AnyVal {
    
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
    def setDefaultCallingCode(value: String): Self = this.set("defaultCallingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCallingCode: Self = this.set("defaultCallingCode", js.undefined)
    
    @scala.inline
    def setDefaultCountry(value: CountryCode): Self = this.set("defaultCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCountry: Self = this.set("defaultCountry", js.undefined)
  }
}
