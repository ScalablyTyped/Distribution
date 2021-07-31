package typings.kendoUi.kendo

import typings.kendoUi.JQueryPromise
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ooxml {
  
  @js.native
  trait Workbook
    extends StObject
       with Observable {
    
    var options: WorkbookOptions = js.native
    
    var sheets: js.Array[WorkbookSheet] = js.native
    
    def toDataURL(): String = js.native
    
    def toDataURLAsync(): JQueryPromise[js.Any] = js.native
  }
  
  trait WorkbookEvent extends StObject {
    
    def isDefaultPrevented(): Boolean
    
    var preventDefault: js.Function
    
    var sender: Workbook
  }
  object WorkbookEvent {
    
    @scala.inline
    def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Workbook): WorkbookEvent = {
      val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkbookEvent]
    }
    
    @scala.inline
    implicit class WorkbookEventMutableBuilder[Self <: WorkbookEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSender(value: Workbook): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkbookOptions extends StObject {
    
    var creator: js.UndefOr[String] = js.undefined
    
    var date: js.UndefOr[Date] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var sheets: js.UndefOr[js.Array[WorkbookSheet]] = js.undefined
  }
  object WorkbookOptions {
    
    @scala.inline
    def apply(): WorkbookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkbookOptions]
    }
    
    @scala.inline
    implicit class WorkbookOptionsMutableBuilder[Self <: WorkbookOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSheets(value: js.Array[WorkbookSheet]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
      
      @scala.inline
      def setSheetsVarargs(value: WorkbookSheet*): Self = StObject.set(x, "sheets", js.Array(value :_*))
    }
  }
  
  trait WorkbookSheet extends StObject {
    
    var columns: js.UndefOr[js.Array[WorkbookSheetColumn]] = js.undefined
    
    var filter: js.UndefOr[WorkbookSheetFilter] = js.undefined
    
    var freezePane: js.UndefOr[WorkbookSheetFreezePane] = js.undefined
    
    var frozenColumns: js.UndefOr[Double] = js.undefined
    
    var frozenRows: js.UndefOr[Double] = js.undefined
    
    var mergedCells: js.UndefOr[js.Any] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[js.Array[WorkbookSheetRow]] = js.undefined
    
    var showGridLines: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object WorkbookSheet {
    
    @scala.inline
    def apply(): WorkbookSheet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkbookSheet]
    }
    
    @scala.inline
    implicit class WorkbookSheetMutableBuilder[Self <: WorkbookSheet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[WorkbookSheetColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: WorkbookSheetColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setFilter(value: WorkbookSheetFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFreezePane(value: WorkbookSheetFreezePane): Self = StObject.set(x, "freezePane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreezePaneUndefined: Self = StObject.set(x, "freezePane", js.undefined)
      
      @scala.inline
      def setFrozenColumns(value: Double): Self = StObject.set(x, "frozenColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenColumnsUndefined: Self = StObject.set(x, "frozenColumns", js.undefined)
      
      @scala.inline
      def setFrozenRows(value: Double): Self = StObject.set(x, "frozenRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenRowsUndefined: Self = StObject.set(x, "frozenRows", js.undefined)
      
      @scala.inline
      def setMergedCells(value: js.Any): Self = StObject.set(x, "mergedCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergedCellsUndefined: Self = StObject.set(x, "mergedCells", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRows(value: js.Array[WorkbookSheetRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRowsVarargs(value: WorkbookSheetRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      @scala.inline
      def setShowGridLines(value: Boolean): Self = StObject.set(x, "showGridLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGridLinesUndefined: Self = StObject.set(x, "showGridLines", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait WorkbookSheetColumn extends StObject {
    
    var autoWidth: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object WorkbookSheetColumn {
    
    @scala.inline
    def apply(): WorkbookSheetColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkbookSheetColumn]
    }
    
    @scala.inline
    implicit class WorkbookSheetColumnMutableBuilder[Self <: WorkbookSheetColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait WorkbookSheetFilter extends StObject {
    
    var from: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[Double] = js.undefined
  }
  object WorkbookSheetFilter {
    
    @scala.inline
    def apply(): WorkbookSheetFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkbookSheetFilter]
    }
    
    @scala.inline
    implicit class WorkbookSheetFilterMutableBuilder[Self <: WorkbookSheetFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait WorkbookSheetFreezePane extends StObject {
    
    var colSplit: js.UndefOr[Double] = js.undefined
    
    var rowSplit: js.UndefOr[Double] = js.undefined
  }
  object WorkbookSheetFreezePane {
    
    @scala.inline
    def apply(): WorkbookSheetFreezePane = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkbookSheetFreezePane]
    }
    
    @scala.inline
    implicit class WorkbookSheetFreezePaneMutableBuilder[Self <: WorkbookSheetFreezePane] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColSplit(value: Double): Self = StObject.set(x, "colSplit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSplitUndefined: Self = StObject.set(x, "colSplit", js.undefined)
      
      @scala.inline
      def setRowSplit(value: Double): Self = StObject.set(x, "rowSplit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSplitUndefined: Self = StObject.set(x, "rowSplit", js.undefined)
    }
  }
  
  trait WorkbookSheetRow extends StObject {
    
    var cells: js.UndefOr[js.Array[WorkbookSheetRowCell]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
  }
  object WorkbookSheetRow {
    
    @scala.inline
    def apply(): WorkbookSheetRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkbookSheetRow]
    }
    
    @scala.inline
    implicit class WorkbookSheetRowMutableBuilder[Self <: WorkbookSheetRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCells(value: js.Array[WorkbookSheetRowCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      @scala.inline
      def setCellsVarargs(value: WorkbookSheetRowCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  trait WorkbookSheetRowCell extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var borderBottom: js.UndefOr[WorkbookSheetRowCellBorderBottom] = js.undefined
    
    var borderLeft: js.UndefOr[WorkbookSheetRowCellBorderLeft] = js.undefined
    
    var borderRight: js.UndefOr[WorkbookSheetRowCellBorderRight] = js.undefined
    
    var borderTop: js.UndefOr[WorkbookSheetRowCellBorderTop] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontName: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var formula: js.UndefOr[String] = js.undefined
    
    var hAlign: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[js.Any] = js.undefined
    
    var italic: js.UndefOr[Boolean] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var textAlign: js.UndefOr[String] = js.undefined
    
    var underline: js.UndefOr[Boolean] = js.undefined
    
    var vAlign: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Date | Double | String | Boolean] = js.undefined
    
    var verticalAlign: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object WorkbookSheetRowCell {
    
    @scala.inline
    def apply(): WorkbookSheetRowCell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkbookSheetRowCell]
    }
    
    @scala.inline
    implicit class WorkbookSheetRowCellMutableBuilder[Self <: WorkbookSheetRowCell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setBorderBottom(value: WorkbookSheetRowCellBorderBottom): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      @scala.inline
      def setBorderLeft(value: WorkbookSheetRowCellBorderLeft): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      @scala.inline
      def setBorderRight(value: WorkbookSheetRowCellBorderRight): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      @scala.inline
      def setBorderTop(value: WorkbookSheetRowCellBorderTop): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
      
      @scala.inline
      def setHAlign(value: String): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      @scala.inline
      def setIndex(value: js.Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
      
      @scala.inline
      def setVAlign(value: String): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
      
      @scala.inline
      def setValue(value: Date | Double | String | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait WorkbookSheetRowCellBorderBottom extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object WorkbookSheetRowCellBorderBottom {
    
    @scala.inline
    def apply(): WorkbookSheetRowCellBorderBottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkbookSheetRowCellBorderBottom]
    }
    
    @scala.inline
    implicit class WorkbookSheetRowCellBorderBottomMutableBuilder[Self <: WorkbookSheetRowCellBorderBottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait WorkbookSheetRowCellBorderLeft extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object WorkbookSheetRowCellBorderLeft {
    
    @scala.inline
    def apply(): WorkbookSheetRowCellBorderLeft = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkbookSheetRowCellBorderLeft]
    }
    
    @scala.inline
    implicit class WorkbookSheetRowCellBorderLeftMutableBuilder[Self <: WorkbookSheetRowCellBorderLeft] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait WorkbookSheetRowCellBorderRight extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object WorkbookSheetRowCellBorderRight {
    
    @scala.inline
    def apply(): WorkbookSheetRowCellBorderRight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkbookSheetRowCellBorderRight]
    }
    
    @scala.inline
    implicit class WorkbookSheetRowCellBorderRightMutableBuilder[Self <: WorkbookSheetRowCellBorderRight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait WorkbookSheetRowCellBorderTop extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object WorkbookSheetRowCellBorderTop {
    
    @scala.inline
    def apply(): WorkbookSheetRowCellBorderTop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkbookSheetRowCellBorderTop]
    }
    
    @scala.inline
    implicit class WorkbookSheetRowCellBorderTopMutableBuilder[Self <: WorkbookSheetRowCellBorderTop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
