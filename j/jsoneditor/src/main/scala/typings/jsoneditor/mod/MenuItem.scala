package typings.jsoneditor.mod

import typings.jsoneditor.jsoneditorStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem extends js.Object {
  
  var className: String = js.native
  
  var click: js.UndefOr[js.Function0[Unit]] = js.native
  
  var submenu: js.UndefOr[js.Array[MenuItem]] = js.native
  
  var submenuTitle: js.UndefOr[String] = js.native
  
  var text: String = js.native
  
  var title: String = js.native
  
  var `type`: js.UndefOr[separator] = js.native
}
object MenuItem {
  
  @scala.inline
  def apply(className: String, text: String, title: String): MenuItem = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  
  @scala.inline
  implicit class MenuItemOps[Self <: MenuItem] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: () => Unit): Self = this.set("click", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setSubmenuVarargs(value: MenuItem*): Self = this.set("submenu", js.Array(value :_*))
    
    @scala.inline
    def setSubmenu(value: js.Array[MenuItem]): Self = this.set("submenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmenu: Self = this.set("submenu", js.undefined)
    
    @scala.inline
    def setSubmenuTitle(value: String): Self = this.set("submenuTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmenuTitle: Self = this.set("submenuTitle", js.undefined)
    
    @scala.inline
    def setType(value: separator): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
