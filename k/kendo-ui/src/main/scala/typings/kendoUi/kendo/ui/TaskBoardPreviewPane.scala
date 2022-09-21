package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskBoardPreviewPane extends StObject {
  
  var buttons: js.UndefOr[js.Array[TaskBoardPreviewPaneButton]] = js.undefined
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
}
object TaskBoardPreviewPane {
  
  inline def apply(): TaskBoardPreviewPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskBoardPreviewPane]
  }
  
  extension [Self <: TaskBoardPreviewPane](x: Self) {
    
    inline def setButtons(value: js.Array[TaskBoardPreviewPaneButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: TaskBoardPreviewPaneButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
