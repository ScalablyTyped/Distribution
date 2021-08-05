package typings.jsoneditor.mod

import typings.jsoneditor.jsoneditorStrings.separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItem extends StObject {
  
  var className: String
  
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var submenu: js.UndefOr[js.Array[MenuItem]] = js.undefined
  
  var submenuTitle: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var title: String
  
  var `type`: js.UndefOr[separator] = js.undefined
}
object MenuItem {
  
  inline def apply(className: String, text: String, title: String): MenuItem = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  
  extension [Self <: MenuItem](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setSubmenu(value: js.Array[MenuItem]): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
    
    inline def setSubmenuTitle(value: String): Self = StObject.set(x, "submenuTitle", value.asInstanceOf[js.Any])
    
    inline def setSubmenuTitleUndefined: Self = StObject.set(x, "submenuTitle", js.undefined)
    
    inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    
    inline def setSubmenuVarargs(value: MenuItem*): Self = StObject.set(x, "submenu", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
