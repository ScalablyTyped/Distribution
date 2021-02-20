package typings.jsoneditor.mod

import typings.jsoneditor.jsoneditorStrings.separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem extends StObject {
  
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
  implicit class MenuItemMutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setSubmenu(value: js.Array[MenuItem]): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmenuTitle(value: String): Self = StObject.set(x, "submenuTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmenuTitleUndefined: Self = StObject.set(x, "submenuTitle", js.undefined)
    
    @scala.inline
    def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    
    @scala.inline
    def setSubmenuVarargs(value: MenuItem*): Self = StObject.set(x, "submenu", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
