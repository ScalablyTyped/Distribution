package typings.inboxsdk.mod.NavMenu

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavItemIconHtmlDescriptor
  extends NavItemDescriptorBase
     with NavItemDescriptor {
  
  var iconElement: js.UndefOr[HTMLElement] = js.native
}
object NavItemIconHtmlDescriptor {
  
  @scala.inline
  def apply(name: String): NavItemIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemIconHtmlDescriptor]
  }
  
  @scala.inline
  implicit class NavItemIconHtmlDescriptorOps[Self <: NavItemIconHtmlDescriptor] (val x: Self) extends AnyVal {
    
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
    def setIconElement(value: HTMLElement): Self = this.set("iconElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconElement: Self = this.set("iconElement", js.undefined)
  }
}
