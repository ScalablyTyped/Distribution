package typings.libphonenumberJs.mod

import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseNumberOptions extends js.Object {
  
  var defaultCountry: js.UndefOr[CountryCode] = js.native
  
  var extended: js.UndefOr[Boolean] = js.native
}
object ParseNumberOptions {
  
  @scala.inline
  def apply(): ParseNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseNumberOptions]
  }
  
  @scala.inline
  implicit class ParseNumberOptionsOps[Self <: ParseNumberOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultCountry(value: CountryCode): Self = this.set("defaultCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCountry: Self = this.set("defaultCountry", js.undefined)
    
    @scala.inline
    def setExtended(value: Boolean): Self = this.set("extended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtended: Self = this.set("extended", js.undefined)
  }
}
