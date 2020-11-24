package typings.inboxsdk.mod.Widgets

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoleOptions extends js.Object {
  
  var chrome: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var el: HTMLElement = js.native
  
  var minimizedTitleEl: js.UndefOr[HTMLElement] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleButtons: js.UndefOr[js.Array[MoleButtonDescriptor]] = js.native
  
  var titleEl: js.UndefOr[HTMLElement] = js.native
}
object MoleOptions {
  
  @scala.inline
  def apply(el: HTMLElement): MoleOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoleOptions]
  }
  
  @scala.inline
  implicit class MoleOptionsOps[Self <: MoleOptions] (val x: Self) extends AnyVal {
    
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
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome(value: Boolean): Self = this.set("chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setMinimizedTitleEl(value: HTMLElement): Self = this.set("minimizedTitleEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimizedTitleEl: Self = this.set("minimizedTitleEl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleButtonsVarargs(value: MoleButtonDescriptor*): Self = this.set("titleButtons", js.Array(value :_*))
    
    @scala.inline
    def setTitleButtons(value: js.Array[MoleButtonDescriptor]): Self = this.set("titleButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleButtons: Self = this.set("titleButtons", js.undefined)
    
    @scala.inline
    def setTitleEl(value: HTMLElement): Self = this.set("titleEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleEl: Self = this.set("titleEl", js.undefined)
  }
}
