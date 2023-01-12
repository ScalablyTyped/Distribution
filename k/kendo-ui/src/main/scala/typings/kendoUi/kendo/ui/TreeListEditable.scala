package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListEditable extends StObject {
  
  var mode: js.UndefOr[String] = js.undefined
  
  var move: js.UndefOr[Boolean | TreeListEditableMove] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var window: js.UndefOr[Any] = js.undefined
}
object TreeListEditable {
  
  inline def apply(): TreeListEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListEditable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeListEditable] (val x: Self) extends AnyVal {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMove(value: Boolean | TreeListEditableMove): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setWindow(value: Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
