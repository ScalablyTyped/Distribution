package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxToolbar extends StObject {
  
  var position: js.UndefOr[String] = js.undefined
  
  var tools: js.UndefOr[Any] = js.undefined
}
object ListBoxToolbar {
  
  inline def apply(): ListBoxToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxToolbar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBoxToolbar] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTools(value: Any): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
  }
}
