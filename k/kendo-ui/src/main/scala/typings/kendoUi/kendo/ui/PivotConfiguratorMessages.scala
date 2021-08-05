package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotConfiguratorMessages extends StObject {
  
  var columns: js.UndefOr[String] = js.undefined
  
  var columnsLabel: js.UndefOr[String] = js.undefined
  
  var fieldMenu: js.UndefOr[PivotConfiguratorMessagesFieldMenu] = js.undefined
  
  var fieldsLabel: js.UndefOr[String] = js.undefined
  
  var measures: js.UndefOr[String] = js.undefined
  
  var measuresLabel: js.UndefOr[String] = js.undefined
  
  var rows: js.UndefOr[String] = js.undefined
  
  var rowsLabel: js.UndefOr[String] = js.undefined
}
object PivotConfiguratorMessages {
  
  inline def apply(): PivotConfiguratorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorMessages]
  }
  
  extension [Self <: PivotConfiguratorMessages](x: Self) {
    
    inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsLabel(value: String): Self = StObject.set(x, "columnsLabel", value.asInstanceOf[js.Any])
    
    inline def setColumnsLabelUndefined: Self = StObject.set(x, "columnsLabel", js.undefined)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setFieldMenu(value: PivotConfiguratorMessagesFieldMenu): Self = StObject.set(x, "fieldMenu", value.asInstanceOf[js.Any])
    
    inline def setFieldMenuUndefined: Self = StObject.set(x, "fieldMenu", js.undefined)
    
    inline def setFieldsLabel(value: String): Self = StObject.set(x, "fieldsLabel", value.asInstanceOf[js.Any])
    
    inline def setFieldsLabelUndefined: Self = StObject.set(x, "fieldsLabel", js.undefined)
    
    inline def setMeasures(value: String): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresLabel(value: String): Self = StObject.set(x, "measuresLabel", value.asInstanceOf[js.Any])
    
    inline def setMeasuresLabelUndefined: Self = StObject.set(x, "measuresLabel", js.undefined)
    
    inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    inline def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsLabel(value: String): Self = StObject.set(x, "rowsLabel", value.asInstanceOf[js.Any])
    
    inline def setRowsLabelUndefined: Self = StObject.set(x, "rowsLabel", js.undefined)
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
