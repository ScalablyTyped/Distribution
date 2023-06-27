package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorTool extends StObject {
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var exec: js.UndefOr[js.Function] = js.undefined
  
  var items: js.UndefOr[js.Array[EditorToolItem]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var palette: js.UndefOr[String | Any] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var tooltip: js.UndefOr[String] = js.undefined
  
  var ui: js.UndefOr[ToolBarItem] = js.undefined
}
object EditorTool {
  
  inline def apply(): EditorTool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorTool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorTool] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setExec(value: js.Function): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    inline def setItems(value: js.Array[EditorToolItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: EditorToolItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPalette(value: String | Any): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setUi(value: ToolBarItem): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
