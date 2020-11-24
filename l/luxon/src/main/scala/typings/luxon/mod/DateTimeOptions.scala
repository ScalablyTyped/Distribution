package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeOptions extends LocaleOptions {
  
  var setZone: js.UndefOr[Boolean] = js.native
  
  var zone: js.UndefOr[String | Zone] = js.native
}
object DateTimeOptions {
  
  @scala.inline
  def apply(): DateTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeOptions]
  }
  
  @scala.inline
  implicit class DateTimeOptionsOps[Self <: DateTimeOptions] (val x: Self) extends AnyVal {
    
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
    def setSetZone(value: Boolean): Self = this.set("setZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetZone: Self = this.set("setZone", js.undefined)
    
    @scala.inline
    def setZone(value: String | Zone): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
