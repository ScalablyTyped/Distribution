package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxMessages extends StObject {
  
  var tools: js.UndefOr[ListBoxMessagesTools] = js.undefined
}
object ListBoxMessages {
  
  inline def apply(): ListBoxMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBoxMessages] (val x: Self) extends AnyVal {
    
    inline def setTools(value: ListBoxMessagesTools): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
  }
}
