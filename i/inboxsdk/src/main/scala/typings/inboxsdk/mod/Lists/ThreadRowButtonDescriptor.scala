package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadRowButtonDescriptor extends StObject {
  
  var hasDropdown: js.UndefOr[Boolean] = js.undefined
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  var iconUrl: String
  
  def onClick(event: ThreadRowButtonClickEvent): Unit
  
  var title: String
}
object ThreadRowButtonDescriptor {
  
  inline def apply(iconUrl: String, onClick: ThreadRowButtonClickEvent => Unit, title: String): ThreadRowButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowButtonDescriptor]
  }
  
  extension [Self <: ThreadRowButtonDescriptor](x: Self) {
    
    inline def setHasDropdown(value: Boolean): Self = StObject.set(x, "hasDropdown", value.asInstanceOf[js.Any])
    
    inline def setHasDropdownUndefined: Self = StObject.set(x, "hasDropdown", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: ThreadRowButtonClickEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
