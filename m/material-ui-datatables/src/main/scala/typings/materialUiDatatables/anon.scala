package typings.materialUiDatatables

import typings.materialUiDatatables.materialUiDatatablesStrings.default
import typings.materialUiDatatables.materialUiDatatablesStrings.filter
import typings.materialUiDatatables.mod.Column
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<material-ui-datatables.material-ui-datatables.DataTableProps> */
  trait PartialDataTableProps extends StObject {
    
    var columns: js.UndefOr[js.Array[Column]] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var deselectOnClickaway: js.UndefOr[Boolean] = js.undefined
    
    var enableSelectAll: js.UndefOr[Boolean] = js.undefined
    
    var filterHintText: js.UndefOr[String] = js.undefined
    
    var filterValue: js.UndefOr[String] = js.undefined
    
    var fixedFooter: js.UndefOr[Boolean] = js.undefined
    
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    var footerToolbarStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var headerToolbarMode: js.UndefOr[default | filter | String] = js.undefined
    
    var height: js.UndefOr[js.Any] = js.undefined
    
    var multiSelectable: js.UndefOr[Boolean] = js.undefined
    
    var onCellClick: js.UndefOr[
        js.Function5[
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          /* row */ js.Any, 
          /* columnValue */ js.Any, 
          /* event */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var onCellDoubleClick: js.UndefOr[
        js.Function5[
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          /* row */ js.Any, 
          /* columnValue */ js.Any, 
          /* event */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var onFilterValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onNextPageClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
    
    var onPreviousPageClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
    
    var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Any, Unit]] = js.undefined
    
    var onRowSizeChange: js.UndefOr[js.Function2[/* index */ Double, /* value */ js.Any, Unit]] = js.undefined
    
    var onSortOrderChange: js.UndefOr[js.Function2[/* key */ String, /* order */ String, Unit]] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var rowSize: js.UndefOr[Double] = js.undefined
    
    var rowSizeLabel: js.UndefOr[String] = js.undefined
    
    var rowSizeList: js.UndefOr[js.Array[Double]] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var showCheckboxes: js.UndefOr[Boolean] = js.undefined
    
    var showFooterToolbar: js.UndefOr[Boolean] = js.undefined
    
    var showHeaderToolbar: js.UndefOr[Boolean] = js.undefined
    
    var showHeaderToolbarFilterIcon: js.UndefOr[Boolean] = js.undefined
    
    var showRowHover: js.UndefOr[Boolean] = js.undefined
    
    var showRowSizeControls: js.UndefOr[Boolean] = js.undefined
    
    var stripedRows: js.UndefOr[Boolean] = js.undefined
    
    var summaryLabelTemplate: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* count */ Double, js.Any]] = js.undefined
    
    var tableBodyStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var tableHeaderColumnStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var tableHeaderStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var tableRowColumnStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var tableRowStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var tableStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var tableWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var toolbarIconRight: js.UndefOr[js.Any] = js.undefined
  }
  object PartialDataTableProps {
    
    @scala.inline
    def apply(): PartialDataTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDataTableProps]
    }
    
    @scala.inline
    implicit class PartialDataTablePropsMutableBuilder[Self <: PartialDataTableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDeselectOnClickaway(value: Boolean): Self = StObject.set(x, "deselectOnClickaway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeselectOnClickawayUndefined: Self = StObject.set(x, "deselectOnClickaway", js.undefined)
      
      @scala.inline
      def setEnableSelectAll(value: Boolean): Self = StObject.set(x, "enableSelectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSelectAllUndefined: Self = StObject.set(x, "enableSelectAll", js.undefined)
      
      @scala.inline
      def setFilterHintText(value: String): Self = StObject.set(x, "filterHintText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterHintTextUndefined: Self = StObject.set(x, "filterHintText", js.undefined)
      
      @scala.inline
      def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
      
      @scala.inline
      def setFixedFooter(value: Boolean): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setFooterToolbarStyle(value: CSSProperties): Self = StObject.set(x, "footerToolbarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterToolbarStyleUndefined: Self = StObject.set(x, "footerToolbarStyle", js.undefined)
      
      @scala.inline
      def setHeaderToolbarMode(value: default | filter | String): Self = StObject.set(x, "headerToolbarMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderToolbarModeUndefined: Self = StObject.set(x, "headerToolbarMode", js.undefined)
      
      @scala.inline
      def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMultiSelectable(value: Boolean): Self = StObject.set(x, "multiSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectableUndefined: Self = StObject.set(x, "multiSelectable", js.undefined)
      
      @scala.inline
      def setOnCellClick(
        value: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Unit
      ): Self = StObject.set(x, "onCellClick", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      @scala.inline
      def setOnCellDoubleClick(
        value: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Unit
      ): Self = StObject.set(x, "onCellDoubleClick", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnCellDoubleClickUndefined: Self = StObject.set(x, "onCellDoubleClick", js.undefined)
      
      @scala.inline
      def setOnFilterValueChange(value: /* value */ String => Unit): Self = StObject.set(x, "onFilterValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterValueChangeUndefined: Self = StObject.set(x, "onFilterValueChange", js.undefined)
      
      @scala.inline
      def setOnNextPageClick(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onNextPageClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNextPageClickUndefined: Self = StObject.set(x, "onNextPageClick", js.undefined)
      
      @scala.inline
      def setOnPreviousPageClick(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onPreviousPageClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPreviousPageClickUndefined: Self = StObject.set(x, "onPreviousPageClick", js.undefined)
      
      @scala.inline
      def setOnRowSelection(value: /* selectedRows */ js.Any => Unit): Self = StObject.set(x, "onRowSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowSelectionUndefined: Self = StObject.set(x, "onRowSelection", js.undefined)
      
      @scala.inline
      def setOnRowSizeChange(value: (/* index */ Double, /* value */ js.Any) => Unit): Self = StObject.set(x, "onRowSizeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowSizeChangeUndefined: Self = StObject.set(x, "onRowSizeChange", js.undefined)
      
      @scala.inline
      def setOnSortOrderChange(value: (/* key */ String, /* order */ String) => Unit): Self = StObject.set(x, "onSortOrderChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSortOrderChangeUndefined: Self = StObject.set(x, "onSortOrderChange", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setRowSize(value: Double): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSizeLabel(value: String): Self = StObject.set(x, "rowSizeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSizeLabelUndefined: Self = StObject.set(x, "rowSizeLabel", js.undefined)
      
      @scala.inline
      def setRowSizeList(value: js.Array[Double]): Self = StObject.set(x, "rowSizeList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSizeListUndefined: Self = StObject.set(x, "rowSizeList", js.undefined)
      
      @scala.inline
      def setRowSizeListVarargs(value: Double*): Self = StObject.set(x, "rowSizeList", js.Array(value :_*))
      
      @scala.inline
      def setRowSizeUndefined: Self = StObject.set(x, "rowSize", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setShowCheckboxes(value: Boolean): Self = StObject.set(x, "showCheckboxes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCheckboxesUndefined: Self = StObject.set(x, "showCheckboxes", js.undefined)
      
      @scala.inline
      def setShowFooterToolbar(value: Boolean): Self = StObject.set(x, "showFooterToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFooterToolbarUndefined: Self = StObject.set(x, "showFooterToolbar", js.undefined)
      
      @scala.inline
      def setShowHeaderToolbar(value: Boolean): Self = StObject.set(x, "showHeaderToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderToolbarFilterIcon(value: Boolean): Self = StObject.set(x, "showHeaderToolbarFilterIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderToolbarFilterIconUndefined: Self = StObject.set(x, "showHeaderToolbarFilterIcon", js.undefined)
      
      @scala.inline
      def setShowHeaderToolbarUndefined: Self = StObject.set(x, "showHeaderToolbar", js.undefined)
      
      @scala.inline
      def setShowRowHover(value: Boolean): Self = StObject.set(x, "showRowHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRowHoverUndefined: Self = StObject.set(x, "showRowHover", js.undefined)
      
      @scala.inline
      def setShowRowSizeControls(value: Boolean): Self = StObject.set(x, "showRowSizeControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRowSizeControlsUndefined: Self = StObject.set(x, "showRowSizeControls", js.undefined)
      
      @scala.inline
      def setStripedRows(value: Boolean): Self = StObject.set(x, "stripedRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripedRowsUndefined: Self = StObject.set(x, "stripedRows", js.undefined)
      
      @scala.inline
      def setSummaryLabelTemplate(value: (/* start */ Double, /* end */ Double, /* count */ Double) => js.Any): Self = StObject.set(x, "summaryLabelTemplate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSummaryLabelTemplateUndefined: Self = StObject.set(x, "summaryLabelTemplate", js.undefined)
      
      @scala.inline
      def setTableBodyStyle(value: CSSProperties): Self = StObject.set(x, "tableBodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBodyStyleUndefined: Self = StObject.set(x, "tableBodyStyle", js.undefined)
      
      @scala.inline
      def setTableHeaderColumnStyle(value: CSSProperties): Self = StObject.set(x, "tableHeaderColumnStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderColumnStyleUndefined: Self = StObject.set(x, "tableHeaderColumnStyle", js.undefined)
      
      @scala.inline
      def setTableHeaderStyle(value: CSSProperties): Self = StObject.set(x, "tableHeaderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderStyleUndefined: Self = StObject.set(x, "tableHeaderStyle", js.undefined)
      
      @scala.inline
      def setTableRowColumnStyle(value: CSSProperties): Self = StObject.set(x, "tableRowColumnStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableRowColumnStyleUndefined: Self = StObject.set(x, "tableRowColumnStyle", js.undefined)
      
      @scala.inline
      def setTableRowStyle(value: CSSProperties): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableRowStyleUndefined: Self = StObject.set(x, "tableRowStyle", js.undefined)
      
      @scala.inline
      def setTableStyle(value: CSSProperties): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
      
      @scala.inline
      def setTableWrapperStyle(value: CSSProperties): Self = StObject.set(x, "tableWrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableWrapperStyleUndefined: Self = StObject.set(x, "tableWrapperStyle", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToolbarIconRight(value: js.Any): Self = StObject.set(x, "toolbarIconRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarIconRightUndefined: Self = StObject.set(x, "toolbarIconRight", js.undefined)
    }
  }
}
