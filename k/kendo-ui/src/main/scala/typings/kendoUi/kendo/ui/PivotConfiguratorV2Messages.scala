package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotConfiguratorV2Messages extends StObject {
  
  var applyButtonText: js.UndefOr[String] = js.undefined
  
  var cancelButtonText: js.UndefOr[String] = js.undefined
  
  var columns: js.UndefOr[String] = js.undefined
  
  var fieldMenu: js.UndefOr[PivotConfiguratorV2MessagesFieldMenu] = js.undefined
  
  var measures: js.UndefOr[String] = js.undefined
  
  var rows: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PivotConfiguratorV2Messages {
  
  inline def apply(): PivotConfiguratorV2Messages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorV2Messages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotConfiguratorV2Messages] (val x: Self) extends AnyVal {
    
    inline def setApplyButtonText(value: String): Self = StObject.set(x, "applyButtonText", value.asInstanceOf[js.Any])
    
    inline def setApplyButtonTextUndefined: Self = StObject.set(x, "applyButtonText", js.undefined)
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setFieldMenu(value: PivotConfiguratorV2MessagesFieldMenu): Self = StObject.set(x, "fieldMenu", value.asInstanceOf[js.Any])
    
    inline def setFieldMenuUndefined: Self = StObject.set(x, "fieldMenu", js.undefined)
    
    inline def setMeasures(value: String): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    inline def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
