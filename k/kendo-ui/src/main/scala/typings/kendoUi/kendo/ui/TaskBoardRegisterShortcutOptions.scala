package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskBoardRegisterShortcutOptions extends StObject {
  
  var command: js.UndefOr[String] = js.undefined
  
  var handler: js.UndefOr[js.Function] = js.undefined
  
  var options: js.UndefOr[String] = js.undefined
}
object TaskBoardRegisterShortcutOptions {
  
  inline def apply(): TaskBoardRegisterShortcutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskBoardRegisterShortcutOptions]
  }
  
  extension [Self <: TaskBoardRegisterShortcutOptions](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setHandler(value: js.Function): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
