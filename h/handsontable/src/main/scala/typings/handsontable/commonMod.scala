package typings.handsontable

import org.scalablytyped.runtime.StringDictionary
import typings.handsontable.handsontableStrings.after
import typings.handsontable.handsontableStrings.before
import typings.numbro.mod.numbro.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  type CellChange = js.Tuple4[Double, String | Double, CellValue, CellValue]
  
  type CellValue = Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.auto
    - typings.handsontable.handsontableStrings.edit
    - typings.handsontable.handsontableStrings.loadData
    - typings.handsontable.handsontableStrings.populateFromArray
    - typings.handsontable.handsontableStrings.spliceCol
    - typings.handsontable.handsontableStrings.spliceRow
    - typings.handsontable.handsontableStrings.timeValidate
    - typings.handsontable.handsontableStrings.dateValidate
    - typings.handsontable.handsontableStrings.validateCells
    - typings.handsontable.handsontableStrings.AutofillDotfill
    - typings.handsontable.handsontableStrings.ContextMenuDotclearColumns
    - typings.handsontable.handsontableStrings.ContextMenuDotcolumnLeft
    - typings.handsontable.handsontableStrings.ContextMenuDotcolumnRight
    - typings.handsontable.handsontableStrings.ContextMenuDotremoveColumn
    - typings.handsontable.handsontableStrings.ContextMenuDotremoveRow
    - typings.handsontable.handsontableStrings.ContextMenuDotrowAbove
    - typings.handsontable.handsontableStrings.ContextMenuDotrowBelow
    - typings.handsontable.handsontableStrings.CopyPasteDotpaste
    - typings.handsontable.handsontableStrings.UndoRedoDotredo
    - typings.handsontable.handsontableStrings.UndoRedoDotundo
    - typings.handsontable.handsontableStrings.ColumnSummaryDotset
    - typings.handsontable.handsontableStrings.ColumnSummaryDotreset
  */
  trait ChangeSource extends StObject
  object ChangeSource {
    
    inline def AutofillDotfill: typings.handsontable.handsontableStrings.AutofillDotfill = "Autofill.fill".asInstanceOf[typings.handsontable.handsontableStrings.AutofillDotfill]
    
    inline def ColumnSummaryDotreset: typings.handsontable.handsontableStrings.ColumnSummaryDotreset = "ColumnSummary.reset".asInstanceOf[typings.handsontable.handsontableStrings.ColumnSummaryDotreset]
    
    inline def ColumnSummaryDotset: typings.handsontable.handsontableStrings.ColumnSummaryDotset = "ColumnSummary.set".asInstanceOf[typings.handsontable.handsontableStrings.ColumnSummaryDotset]
    
    inline def ContextMenuDotclearColumns: typings.handsontable.handsontableStrings.ContextMenuDotclearColumns = "ContextMenu.clearColumns".asInstanceOf[typings.handsontable.handsontableStrings.ContextMenuDotclearColumns]
    
    inline def ContextMenuDotcolumnLeft: typings.handsontable.handsontableStrings.ContextMenuDotcolumnLeft = "ContextMenu.columnLeft".asInstanceOf[typings.handsontable.handsontableStrings.ContextMenuDotcolumnLeft]
    
    inline def ContextMenuDotcolumnRight: typings.handsontable.handsontableStrings.ContextMenuDotcolumnRight = "ContextMenu.columnRight".asInstanceOf[typings.handsontable.handsontableStrings.ContextMenuDotcolumnRight]
    
    inline def ContextMenuDotremoveColumn: typings.handsontable.handsontableStrings.ContextMenuDotremoveColumn = "ContextMenu.removeColumn".asInstanceOf[typings.handsontable.handsontableStrings.ContextMenuDotremoveColumn]
    
    inline def ContextMenuDotremoveRow: typings.handsontable.handsontableStrings.ContextMenuDotremoveRow = "ContextMenu.removeRow".asInstanceOf[typings.handsontable.handsontableStrings.ContextMenuDotremoveRow]
    
    inline def ContextMenuDotrowAbove: typings.handsontable.handsontableStrings.ContextMenuDotrowAbove = "ContextMenu.rowAbove".asInstanceOf[typings.handsontable.handsontableStrings.ContextMenuDotrowAbove]
    
    inline def ContextMenuDotrowBelow: typings.handsontable.handsontableStrings.ContextMenuDotrowBelow = "ContextMenu.rowBelow".asInstanceOf[typings.handsontable.handsontableStrings.ContextMenuDotrowBelow]
    
    inline def CopyPasteDotpaste: typings.handsontable.handsontableStrings.CopyPasteDotpaste = "CopyPaste.paste".asInstanceOf[typings.handsontable.handsontableStrings.CopyPasteDotpaste]
    
    inline def UndoRedoDotredo: typings.handsontable.handsontableStrings.UndoRedoDotredo = "UndoRedo.redo".asInstanceOf[typings.handsontable.handsontableStrings.UndoRedoDotredo]
    
    inline def UndoRedoDotundo: typings.handsontable.handsontableStrings.UndoRedoDotundo = "UndoRedo.undo".asInstanceOf[typings.handsontable.handsontableStrings.UndoRedoDotundo]
    
    inline def auto: typings.handsontable.handsontableStrings.auto = "auto".asInstanceOf[typings.handsontable.handsontableStrings.auto]
    
    inline def dateValidate: typings.handsontable.handsontableStrings.dateValidate = "dateValidate".asInstanceOf[typings.handsontable.handsontableStrings.dateValidate]
    
    inline def edit: typings.handsontable.handsontableStrings.edit = "edit".asInstanceOf[typings.handsontable.handsontableStrings.edit]
    
    inline def loadData: typings.handsontable.handsontableStrings.loadData = "loadData".asInstanceOf[typings.handsontable.handsontableStrings.loadData]
    
    inline def populateFromArray: typings.handsontable.handsontableStrings.populateFromArray = "populateFromArray".asInstanceOf[typings.handsontable.handsontableStrings.populateFromArray]
    
    inline def spliceCol: typings.handsontable.handsontableStrings.spliceCol = "spliceCol".asInstanceOf[typings.handsontable.handsontableStrings.spliceCol]
    
    inline def spliceRow: typings.handsontable.handsontableStrings.spliceRow = "spliceRow".asInstanceOf[typings.handsontable.handsontableStrings.spliceRow]
    
    inline def timeValidate: typings.handsontable.handsontableStrings.timeValidate = "timeValidate".asInstanceOf[typings.handsontable.handsontableStrings.timeValidate]
    
    inline def validateCells: typings.handsontable.handsontableStrings.validateCells = "validateCells".asInstanceOf[typings.handsontable.handsontableStrings.validateCells]
  }
  
  @js.native
  trait ColumnDataGetterSetterFunction extends StObject {
    
    def apply(row: js.Array[CellValue]): CellValue = js.native
    def apply(row: js.Array[CellValue], value: CellValue): Unit = js.native
    def apply(row: RowObject): CellValue = js.native
    def apply(row: RowObject, value: CellValue): Unit = js.native
  }
  
  trait LabelOptions extends StObject {
    
    var position: js.UndefOr[before | after] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | js.Function0[String]] = js.undefined
  }
  object LabelOptions {
    
    inline def apply(): LabelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelOptions]
    }
    
    extension [Self <: LabelOptions](x: Self) {
      
      inline def setPosition(value: before | after): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setValue(value: String | js.Function0[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFunction0(value: () => String): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait NumericFormatOptions extends StObject {
    
    var culture: js.UndefOr[String] = js.undefined
    
    var pattern: String | Format
  }
  object NumericFormatOptions {
    
    inline def apply(pattern: String | Format): NumericFormatOptions = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumericFormatOptions]
    }
    
    extension [Self <: NumericFormatOptions](x: Self) {
      
      inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
      
      inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
      
      inline def setPattern(value: String | Format): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait RangeType extends StObject {
    
    var endCol: Double
    
    var endRow: Double
    
    var startCol: Double
    
    var startRow: Double
  }
  object RangeType {
    
    inline def apply(endCol: Double, endRow: Double, startCol: Double, startRow: Double): RangeType = {
      val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeType]
    }
    
    extension [Self <: RangeType](x: Self) {
      
      inline def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
      
      inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      inline def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    }
  }
  
  type RowObject = StringDictionary[Any]
  
  type SelectOptionsObject = StringDictionary[String]
  
  trait SimpleCellCoords extends StObject {
    
    var col: Double
    
    var row: Double
  }
  object SimpleCellCoords {
    
    inline def apply(col: Double, row: Double): SimpleCellCoords = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleCellCoords]
    }
    
    extension [Self <: SimpleCellCoords](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  type SourceRowData = RowObject | js.Array[CellValue]
}
