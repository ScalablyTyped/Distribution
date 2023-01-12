package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFilterable extends StObject {
  
  var extra: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[GridFilterableMessages] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var operators: js.UndefOr[GridFilterableOperators] = js.undefined
}
object GridFilterable {
  
  inline def apply(): GridFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFilterable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridFilterable] (val x: Self) extends AnyVal {
    
    inline def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setMessages(value: GridFilterableMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOperators(value: GridFilterableOperators): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
  }
}
