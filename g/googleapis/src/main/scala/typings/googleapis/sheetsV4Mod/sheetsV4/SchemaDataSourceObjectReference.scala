package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceObjectReference extends StObject {
  
  /**
    * References to a data source chart.
    */
  var chartId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * References to a cell containing DataSourceFormula.
    */
  var dataSourceFormulaCell: js.UndefOr[SchemaGridCoordinate] = js.undefined
  
  /**
    * References to a data source PivotTable anchored at the cell.
    */
  var dataSourcePivotTableAnchorCell: js.UndefOr[SchemaGridCoordinate] = js.undefined
  
  /**
    * References to a DataSourceTable anchored at the cell.
    */
  var dataSourceTableAnchorCell: js.UndefOr[SchemaGridCoordinate] = js.undefined
  
  /**
    * References to a DATA_SOURCE sheet.
    */
  var sheetId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataSourceObjectReference {
  
  inline def apply(): SchemaDataSourceObjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceObjectReference]
  }
  
  extension [Self <: SchemaDataSourceObjectReference](x: Self) {
    
    inline def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    inline def setChartIdNull: Self = StObject.set(x, "chartId", null)
    
    inline def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    inline def setDataSourceFormulaCell(value: SchemaGridCoordinate): Self = StObject.set(x, "dataSourceFormulaCell", value.asInstanceOf[js.Any])
    
    inline def setDataSourceFormulaCellUndefined: Self = StObject.set(x, "dataSourceFormulaCell", js.undefined)
    
    inline def setDataSourcePivotTableAnchorCell(value: SchemaGridCoordinate): Self = StObject.set(x, "dataSourcePivotTableAnchorCell", value.asInstanceOf[js.Any])
    
    inline def setDataSourcePivotTableAnchorCellUndefined: Self = StObject.set(x, "dataSourcePivotTableAnchorCell", js.undefined)
    
    inline def setDataSourceTableAnchorCell(value: SchemaGridCoordinate): Self = StObject.set(x, "dataSourceTableAnchorCell", value.asInstanceOf[js.Any])
    
    inline def setDataSourceTableAnchorCellUndefined: Self = StObject.set(x, "dataSourceTableAnchorCell", js.undefined)
    
    inline def setSheetId(value: String): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
