package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskBoardEditable extends StObject {
  
  var buttons: js.UndefOr[js.Array[TaskBoardEditableButton]] = js.undefined
  
  var form: js.UndefOr[Any] = js.undefined
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
}
object TaskBoardEditable {
  
  inline def apply(): TaskBoardEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskBoardEditable]
  }
  
  extension [Self <: TaskBoardEditable](x: Self) {
    
    inline def setButtons(value: js.Array[TaskBoardEditableButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: TaskBoardEditableButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setForm(value: Any): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
  }
}
