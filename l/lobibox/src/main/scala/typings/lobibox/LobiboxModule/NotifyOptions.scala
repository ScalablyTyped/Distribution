package typings.lobibox.LobiboxModule

import typings.lobibox.anon.Icon
import typings.lobibox.anon.Width
import typings.lobibox.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyOptions
  extends NotifyDefault
     with NotifyMethods {
  
  var `class`: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[Icon] = js.native
  
  var info: js.UndefOr[Icon] = js.native
  
   //You can override options for large notifications from here
  var large: js.UndefOr[Width] = js.native
  
    //You can override options for small notifications from here
  var mini: js.UndefOr[`0`] = js.native
  
     //Default options of different style notifications
  var success: js.UndefOr[Icon] = js.native
  
  var warning: js.UndefOr[Icon] = js.native
}
object NotifyOptions {
  
  @scala.inline
  def apply(): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyOptions]
  }
  
  @scala.inline
  implicit class NotifyOptionsOps[Self <: NotifyOptions] (val x: Self) extends AnyVal {
    
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setError(value: Icon): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInfo(value: Icon): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setLarge(value: Width): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setMini(value: `0`): Self = this.set("mini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    
    @scala.inline
    def setSuccess(value: Icon): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setWarning(value: Icon): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
