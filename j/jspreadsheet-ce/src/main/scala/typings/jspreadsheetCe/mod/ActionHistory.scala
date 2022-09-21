package typings.jspreadsheetCe.mod

import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableRowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionHistory extends StObject {
  
  var action: String
  
  var insertBefore: Boolean
  
  var numOfRows: Double
  
  var rowData: js.Array[CellValue]
  
  var rowNode: js.Array[HTMLTableRowElement]
  
  var rowNumber: Double
  
  var rowRecords: js.Array[HTMLTableDataCellElement]
}
object ActionHistory {
  
  inline def apply(
    action: String,
    insertBefore: Boolean,
    numOfRows: Double,
    rowData: js.Array[CellValue],
    rowNode: js.Array[HTMLTableRowElement],
    rowNumber: Double,
    rowRecords: js.Array[HTMLTableDataCellElement]
  ): ActionHistory = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], numOfRows = numOfRows.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any], rowNumber = rowNumber.asInstanceOf[js.Any], rowRecords = rowRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionHistory]
  }
  
  extension [Self <: ActionHistory](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setInsertBefore(value: Boolean): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
    
    inline def setNumOfRows(value: Double): Self = StObject.set(x, "numOfRows", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: js.Array[CellValue]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowDataVarargs(value: CellValue*): Self = StObject.set(x, "rowData", js.Array(value*))
    
    inline def setRowNode(value: js.Array[HTMLTableRowElement]): Self = StObject.set(x, "rowNode", value.asInstanceOf[js.Any])
    
    inline def setRowNodeVarargs(value: HTMLTableRowElement*): Self = StObject.set(x, "rowNode", js.Array(value*))
    
    inline def setRowNumber(value: Double): Self = StObject.set(x, "rowNumber", value.asInstanceOf[js.Any])
    
    inline def setRowRecords(value: js.Array[HTMLTableDataCellElement]): Self = StObject.set(x, "rowRecords", value.asInstanceOf[js.Any])
    
    inline def setRowRecordsVarargs(value: HTMLTableDataCellElement*): Self = StObject.set(x, "rowRecords", js.Array(value*))
  }
}
