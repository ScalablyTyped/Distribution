package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDataSourceV2Options extends StObject {
  
  var columns: js.UndefOr[js.Array[PivotDataSourceV2Column]] = js.undefined
  
  var measures: js.UndefOr[js.Array[PivotDataSourceV2Measure]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var rows: js.UndefOr[js.Array[PivotDataSourceV2Row]] = js.undefined
  
  var transport: js.UndefOr[PivotDataSourceV2Transport] = js.undefined
}
object PivotDataSourceV2Options {
  
  inline def apply(): PivotDataSourceV2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotDataSourceV2Options]
  }
  
  extension [Self <: PivotDataSourceV2Options](x: Self) {
    
    inline def setColumns(value: js.Array[PivotDataSourceV2Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: PivotDataSourceV2Column*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setMeasures(value: js.Array[PivotDataSourceV2Measure]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    inline def setMeasuresVarargs(value: PivotDataSourceV2Measure*): Self = StObject.set(x, "measures", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRows(value: js.Array[PivotDataSourceV2Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: PivotDataSourceV2Row*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setTransport(value: PivotDataSourceV2Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}
