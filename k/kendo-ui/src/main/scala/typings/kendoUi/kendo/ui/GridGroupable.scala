package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridGroupable extends StObject {
  
  var compare: js.UndefOr[js.Function] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[GridGroupableMessages] = js.undefined
  
  var showFooter: js.UndefOr[Boolean] = js.undefined
}
object GridGroupable {
  
  inline def apply(): GridGroupable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGroupable]
  }
  
  extension [Self <: GridGroupable](x: Self) {
    
    inline def setCompare(value: js.Function): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMessages(value: GridGroupableMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
    
    inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
  }
}
