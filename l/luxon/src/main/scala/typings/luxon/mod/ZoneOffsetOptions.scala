package typings.luxon.mod

import typings.luxon.luxonStrings.long
import typings.luxon.luxonStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneOffsetOptions extends js.Object {
  
  var format: js.UndefOr[short | long] = js.native
  
  var locale: js.UndefOr[String] = js.native
}
object ZoneOffsetOptions {
  
  @scala.inline
  def apply(): ZoneOffsetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneOffsetOptions]
  }
  
  @scala.inline
  implicit class ZoneOffsetOptionsOps[Self <: ZoneOffsetOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: short | long): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
}
