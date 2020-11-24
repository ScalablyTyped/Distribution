package typings.libphonenumberJs.mod

import typings.libphonenumberJs.typesMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatNumberOptionsWithoutIDD extends js.Object {
  
  var formatExtension: js.UndefOr[FormatExtension] = js.native
  
  var v2: js.UndefOr[Boolean] = js.native
}
object FormatNumberOptionsWithoutIDD {
  
  @scala.inline
  def apply(): FormatNumberOptionsWithoutIDD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatNumberOptionsWithoutIDD]
  }
  
  @scala.inline
  implicit class FormatNumberOptionsWithoutIDDOps[Self <: FormatNumberOptionsWithoutIDD] (val x: Self) extends AnyVal {
    
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
    def setFormatExtension(value: (/* number */ String, /* extension */ String, /* metadata */ Metadata) => String): Self = this.set("formatExtension", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormatExtension: Self = this.set("formatExtension", js.undefined)
    
    @scala.inline
    def setV2(value: Boolean): Self = this.set("v2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV2: Self = this.set("v2", js.undefined)
  }
}
