package typings.libphonenumberJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatNumberOptions extends js.Object {
  
  var formatExtension: js.UndefOr[FormatExtension] = js.native
  
  var fromCountry: js.UndefOr[CountryCode] = js.native
  
  var humanReadable: js.UndefOr[Boolean] = js.native
  
  var nationalPrefix: js.UndefOr[Boolean] = js.native
  
  var v2: js.UndefOr[Boolean] = js.native
}
object FormatNumberOptions {
  
  @scala.inline
  def apply(): FormatNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatNumberOptions]
  }
  
  @scala.inline
  implicit class FormatNumberOptionsOps[Self <: FormatNumberOptions] (val x: Self) extends AnyVal {
    
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
    def setFormatExtension(
      value: (/* formattedNumber */ String, /* extension */ Extension, /* metadata */ Metadata) => String
    ): Self = this.set("formatExtension", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormatExtension: Self = this.set("formatExtension", js.undefined)
    
    @scala.inline
    def setFromCountry(value: CountryCode): Self = this.set("fromCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromCountry: Self = this.set("fromCountry", js.undefined)
    
    @scala.inline
    def setHumanReadable(value: Boolean): Self = this.set("humanReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanReadable: Self = this.set("humanReadable", js.undefined)
    
    @scala.inline
    def setNationalPrefix(value: Boolean): Self = this.set("nationalPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNationalPrefix: Self = this.set("nationalPrefix", js.undefined)
    
    @scala.inline
    def setV2(value: Boolean): Self = this.set("v2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV2: Self = this.set("v2", js.undefined)
  }
}
