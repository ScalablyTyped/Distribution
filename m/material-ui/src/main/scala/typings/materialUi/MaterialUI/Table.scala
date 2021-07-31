package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.all
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  type Table = Component[TableProps, js.Object, js.Any]
  
  type TableBody = Component[TableBodyProps, js.Object, js.Any]
  
  trait TableBodyProps extends StObject {
    
    /** @deprecated Instead, use property on Table */
    var allRowsSelected: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var deselectOnClickaway: js.UndefOr[Boolean] = js.undefined
    
    var displayRowCheckbox: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Instead, use property on Table */
    var multiSelectable: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellClick: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellHover: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellHoverExit: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowHover: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowHoverExit: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Array[Double] | String, Unit]] = js.undefined
    
    var preScanRows: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Instead, use property on Table */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var showRowHover: js.UndefOr[Boolean] = js.undefined
    
    var stripedRows: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableBodyProps {
    
    @scala.inline
    def apply(): TableBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableBodyProps]
    }
    
    @scala.inline
    implicit class TableBodyPropsMutableBuilder[Self <: TableBodyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllRowsSelected(value: Boolean): Self = StObject.set(x, "allRowsSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllRowsSelectedUndefined: Self = StObject.set(x, "allRowsSelected", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDeselectOnClickaway(value: Boolean): Self = StObject.set(x, "deselectOnClickaway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeselectOnClickawayUndefined: Self = StObject.set(x, "deselectOnClickaway", js.undefined)
      
      @scala.inline
      def setDisplayRowCheckbox(value: Boolean): Self = StObject.set(x, "displayRowCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayRowCheckboxUndefined: Self = StObject.set(x, "displayRowCheckbox", js.undefined)
      
      @scala.inline
      def setMultiSelectable(value: Boolean): Self = StObject.set(x, "multiSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectableUndefined: Self = StObject.set(x, "multiSelectable", js.undefined)
      
      @scala.inline
      def setOnCellClick(value: (/* row */ Double, /* column */ Double) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      @scala.inline
      def setOnCellHover(value: (/* row */ Double, /* column */ Double) => Unit): Self = StObject.set(x, "onCellHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellHoverExit(value: (/* row */ Double, /* column */ Double) => Unit): Self = StObject.set(x, "onCellHoverExit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellHoverExitUndefined: Self = StObject.set(x, "onCellHoverExit", js.undefined)
      
      @scala.inline
      def setOnCellHoverUndefined: Self = StObject.set(x, "onCellHover", js.undefined)
      
      @scala.inline
      def setOnRowHover(value: /* row */ Double => Unit): Self = StObject.set(x, "onRowHover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowHoverExit(value: /* row */ Double => Unit): Self = StObject.set(x, "onRowHoverExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowHoverExitUndefined: Self = StObject.set(x, "onRowHoverExit", js.undefined)
      
      @scala.inline
      def setOnRowHoverUndefined: Self = StObject.set(x, "onRowHover", js.undefined)
      
      @scala.inline
      def setOnRowSelection(value: /* selectedRows */ js.Array[Double] | String => Unit): Self = StObject.set(x, "onRowSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowSelectionUndefined: Self = StObject.set(x, "onRowSelection", js.undefined)
      
      @scala.inline
      def setPreScanRows(value: Boolean): Self = StObject.set(x, "preScanRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreScanRowsUndefined: Self = StObject.set(x, "preScanRows", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setShowRowHover(value: Boolean): Self = StObject.set(x, "showRowHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRowHoverUndefined: Self = StObject.set(x, "showRowHover", js.undefined)
      
      @scala.inline
      def setStripedRows(value: Boolean): Self = StObject.set(x, "stripedRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripedRowsUndefined: Self = StObject.set(x, "stripedRows", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type TableFooter = Component[TableFooterProps, js.Object, js.Any]
  
  trait TableFooterProps extends StObject {
    
    // <tfoot/> is element that get the 'other' properties
    var adjustForCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableFooterProps {
    
    @scala.inline
    def apply(): TableFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableFooterProps]
    }
    
    @scala.inline
    implicit class TableFooterPropsMutableBuilder[Self <: TableFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustForCheckbox(value: Boolean): Self = StObject.set(x, "adjustForCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustForCheckboxUndefined: Self = StObject.set(x, "adjustForCheckbox", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type TableHeader = Component[TableHeaderProps, js.Object, js.Any]
  
  type TableHeaderColumn = Component[TableHeaderColumnProps, js.Object, js.Any]
  
  trait TableHeaderColumnProps extends StObject {
    
    // <th/> is element that get the 'other' properties
    var className: js.UndefOr[String] = js.undefined
    
    // useful attributes passed to <th/>
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double, Unit]
      ] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var tooltipStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableHeaderColumnProps {
    
    @scala.inline
    def apply(): TableHeaderColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderColumnProps]
    }
    
    @scala.inline
    implicit class TableHeaderColumnPropsMutableBuilder[Self <: TableHeaderColumnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipStyle(value: CSSProperties): Self = StObject.set(x, "tooltipStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipStyleUndefined: Self = StObject.set(x, "tooltipStyle", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait TableHeaderProps extends StObject {
    
    var adjustForCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var displaySelectAll: js.UndefOr[Boolean] = js.undefined
    
    var enableSelectAll: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onSelectAll: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var selectAllSelected: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableHeaderProps {
    
    @scala.inline
    def apply(): TableHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderProps]
    }
    
    @scala.inline
    implicit class TableHeaderPropsMutableBuilder[Self <: TableHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustForCheckbox(value: Boolean): Self = StObject.set(x, "adjustForCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustForCheckboxUndefined: Self = StObject.set(x, "adjustForCheckbox", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisplaySelectAll(value: Boolean): Self = StObject.set(x, "displaySelectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplaySelectAllUndefined: Self = StObject.set(x, "displaySelectAll", js.undefined)
      
      @scala.inline
      def setEnableSelectAll(value: Boolean): Self = StObject.set(x, "enableSelectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSelectAllUndefined: Self = StObject.set(x, "enableSelectAll", js.undefined)
      
      @scala.inline
      def setOnSelectAll(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
      
      @scala.inline
      def setSelectAllSelected(value: Boolean): Self = StObject.set(x, "selectAllSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllSelectedUndefined: Self = StObject.set(x, "selectAllSelected", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TableProps extends StObject {
    
    var allRowsSelected: js.UndefOr[Boolean] = js.undefined
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var fixedFooter: js.UndefOr[Boolean] = js.undefined
    
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    var footerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var headerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var multiSelectable: js.UndefOr[Boolean] = js.undefined
    
    var onCellClick: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    var onCellHover: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    var onCellHoverExit: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    var onRowHover: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    var onRowHoverExit: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Array[Double] | all, Unit]] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableProps {
    
    @scala.inline
    def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllRowsSelected(value: Boolean): Self = StObject.set(x, "allRowsSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllRowsSelectedUndefined: Self = StObject.set(x, "allRowsSelected", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFixedFooter(value: Boolean): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setFooterStyle(value: CSSProperties): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
      
      @scala.inline
      def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMultiSelectable(value: Boolean): Self = StObject.set(x, "multiSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectableUndefined: Self = StObject.set(x, "multiSelectable", js.undefined)
      
      @scala.inline
      def setOnCellClick(value: (/* row */ Double, /* column */ Double) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      @scala.inline
      def setOnCellHover(value: (/* row */ Double, /* column */ Double) => Unit): Self = StObject.set(x, "onCellHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellHoverExit(value: (/* row */ Double, /* column */ Double) => Unit): Self = StObject.set(x, "onCellHoverExit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellHoverExitUndefined: Self = StObject.set(x, "onCellHoverExit", js.undefined)
      
      @scala.inline
      def setOnCellHoverUndefined: Self = StObject.set(x, "onCellHover", js.undefined)
      
      @scala.inline
      def setOnRowHover(value: /* row */ Double => Unit): Self = StObject.set(x, "onRowHover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowHoverExit(value: /* row */ Double => Unit): Self = StObject.set(x, "onRowHoverExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowHoverExitUndefined: Self = StObject.set(x, "onRowHoverExit", js.undefined)
      
      @scala.inline
      def setOnRowHoverUndefined: Self = StObject.set(x, "onRowHover", js.undefined)
      
      @scala.inline
      def setOnRowSelection(value: /* selectedRows */ js.Array[Double] | all => Unit): Self = StObject.set(x, "onRowSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowSelectionUndefined: Self = StObject.set(x, "onRowSelection", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWrapperStyle(value: CSSProperties): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  type TableRow = Component[TableRowProps, js.Object, js.Any]
  
  type TableRowColumn = Component[TableRowColumnProps, js.Object, js.Any]
  
  trait TableRowColumnProps extends StObject {
    
    // <td/> is element that get the 'other' properties
    var className: js.UndefOr[String] = js.undefined
    
    // useful attributes passed to <td/>
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onClick: js.UndefOr[
        js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double, Unit]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onHover: js.UndefOr[
        js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double, Unit]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onHoverExit: js.UndefOr[
        js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double, Unit]
      ] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableRowColumnProps {
    
    @scala.inline
    def apply(): TableRowColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowColumnProps]
    }
    
    @scala.inline
    implicit class TableRowColumnPropsMutableBuilder[Self <: TableRowColumnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      @scala.inline
      def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnHover(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHoverExit(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit): Self = StObject.set(x, "onHoverExit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHoverExitUndefined: Self = StObject.set(x, "onHoverExit", js.undefined)
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TableRowProps extends StObject {
    
    // <tr/> is element that get the 'other' properties
    var className: js.UndefOr[String] = js.undefined
    
    var displayBorder: js.UndefOr[Boolean] = js.undefined
    
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    var hovered: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellClick: js.UndefOr[
        js.Function3[
          /* e */ MouseEvent[js.Object, NativeMouseEvent], 
          /* row */ Double, 
          /* column */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellHover: js.UndefOr[
        js.Function3[
          /* e */ MouseEvent[js.Object, NativeMouseEvent], 
          /* row */ Double, 
          /* column */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onCellHoverExit: js.UndefOr[
        js.Function3[
          /* e */ MouseEvent[js.Object, NativeMouseEvent], 
          /* row */ Double, 
          /* column */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowClick: js.UndefOr[
        js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, Unit]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowHover: js.UndefOr[
        js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, Unit]
      ] = js.undefined
    
    /** @deprecated Instead, use event handler on Table */
    var onRowHoverExit: js.UndefOr[
        js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, Unit]
      ] = js.undefined
    
    var rowNumber: js.UndefOr[Double] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var striped: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableRowProps {
    
    @scala.inline
    def apply(): TableRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowProps]
    }
    
    @scala.inline
    implicit class TableRowPropsMutableBuilder[Self <: TableRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisplayBorder(value: Boolean): Self = StObject.set(x, "displayBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayBorderUndefined: Self = StObject.set(x, "displayBorder", js.undefined)
      
      @scala.inline
      def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      @scala.inline
      def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoveredUndefined: Self = StObject.set(x, "hovered", js.undefined)
      
      @scala.inline
      def setOnCellClick(
        value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, /* column */ Double) => Unit
      ): Self = StObject.set(x, "onCellClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      @scala.inline
      def setOnCellHover(
        value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, /* column */ Double) => Unit
      ): Self = StObject.set(x, "onCellHover", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCellHoverExit(
        value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, /* column */ Double) => Unit
      ): Self = StObject.set(x, "onCellHoverExit", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCellHoverExitUndefined: Self = StObject.set(x, "onCellHoverExit", js.undefined)
      
      @scala.inline
      def setOnCellHoverUndefined: Self = StObject.set(x, "onCellHover", js.undefined)
      
      @scala.inline
      def setOnRowClick(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      @scala.inline
      def setOnRowHover(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double) => Unit): Self = StObject.set(x, "onRowHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowHoverExit(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double) => Unit): Self = StObject.set(x, "onRowHoverExit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowHoverExitUndefined: Self = StObject.set(x, "onRowHoverExit", js.undefined)
      
      @scala.inline
      def setOnRowHoverUndefined: Self = StObject.set(x, "onRowHover", js.undefined)
      
      @scala.inline
      def setRowNumber(value: Double): Self = StObject.set(x, "rowNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowNumberUndefined: Self = StObject.set(x, "rowNumber", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
