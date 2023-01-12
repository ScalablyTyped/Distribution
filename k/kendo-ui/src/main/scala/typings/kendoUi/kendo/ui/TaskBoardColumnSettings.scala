package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskBoardColumnSettings extends StObject {
  
  var buttons: js.UndefOr[js.Array[TaskBoardColumnSettingsButton]] = js.undefined
  
  var dataOrderField: js.UndefOr[String] = js.undefined
  
  var dataStatusField: js.UndefOr[String] = js.undefined
  
  var dataTextField: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object TaskBoardColumnSettings {
  
  inline def apply(): TaskBoardColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskBoardColumnSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskBoardColumnSettings] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[TaskBoardColumnSettingsButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: TaskBoardColumnSettingsButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDataOrderField(value: String): Self = StObject.set(x, "dataOrderField", value.asInstanceOf[js.Any])
    
    inline def setDataOrderFieldUndefined: Self = StObject.set(x, "dataOrderField", js.undefined)
    
    inline def setDataStatusField(value: String): Self = StObject.set(x, "dataStatusField", value.asInstanceOf[js.Any])
    
    inline def setDataStatusFieldUndefined: Self = StObject.set(x, "dataStatusField", js.undefined)
    
    inline def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    inline def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
