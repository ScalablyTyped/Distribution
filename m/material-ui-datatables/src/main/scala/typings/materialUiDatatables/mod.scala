package typings.materialUiDatatables

import typings.materialUiDatatables.anon.PartialDataTableProps
import typings.materialUiDatatables.materialUiDatatablesStrings.filter
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("material-ui-datatables", JSImport.Default)
  @js.native
  class default ()
    extends Component[PartialDataTableProps, js.Object, js.Any]
  
  @js.native
  trait Column extends StObject {
    
    /** Align right */
    var alignRight: js.UndefOr[Boolean] = js.native
    
    /** Class name to use */
    var className: js.UndefOr[String] = js.native
    
    /** The element key */
    var key: js.UndefOr[String] = js.native
    
    /** Label */
    var label: js.UndefOr[String] = js.native
    
    /**
      * Render function. Given the value extracted
      * from the row; and the row also. Can return JSX content.
      * @param value - the extracted value from data
      * @param row - the data object representing this row
      * @returns Any react node (JSX compatible return)
      */
    var render: js.UndefOr[js.Function2[/* value */ js.Any, /* row */ js.Any, _]] = js.native
    
    /** If the column is sortable */
    var sortable: js.UndefOr[Boolean] = js.native
    
    /** Style for column */
    var style: js.UndefOr[CSSProperties] = js.native
    
    /** Cell tooltip */
    var tooltip: js.UndefOr[String] = js.native
  }
  object Column {
    
    @scala.inline
    def apply(): Column = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignRight(value: Boolean): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignRightUndefined: Self = StObject.set(x, "alignRight", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRender(value: (/* value */ js.Any, /* row */ js.Any) => _): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type DataTable = Component[PartialDataTableProps, js.Object, js.Any]
  
  @js.native
  trait DataTableProps extends StObject {
    
    /**
      * The column structure.
      * ```let columns: Column[] = [{
      *      key: 'bookName',
      *      label: 'Book Name & Author',
      *      render: (__value: any, book: any) => book.name + ' by ' book.author
      *  },```
      */
    var columns: js.Array[Column] = js.native
    
    var count: Double = js.native
    
    /** The array of objects used as data for the table */
    var data: js.Array[_] = js.native
    
    /** If clicking away de-selects all */
    var deselectOnClickaway: Boolean = js.native
    
    /** Adds a select all button */
    var enableSelectAll: Boolean = js.native
    
    /** Filter hint text */
    var filterHintText: String = js.native
    
    // BUG https://github.com/Microsoft/TypeScript/issues/11465
    /** The current filter value */
    var filterValue: String = js.native
    
    /** If the footer should be fixed */
    var fixedFooter: Boolean = js.native
    
    /** If the header should be fixed */
    var fixedHeader: Boolean = js.native
    
    /** React Style object applied to footer toolbar */
    var footerToolbarStyle: CSSProperties = js.native
    
    /** 'default' or 'filter', filter mode shows a search box to reduce visible rows */
    var headerToolbarMode: typings.materialUiDatatables.materialUiDatatablesStrings.default | filter | String = js.native
    
    /** The hight of the table */
    var height: js.Any = js.native
    
    /** If multiple table rows are select-able */
    var multiSelectable: Boolean = js.native
    
    /** Callback when the cell is clicked. This callback is only active when selectable is false. */
    def onCellClick(rowIndex: Double, columnIndex: Double, row: js.Any, columnValue: js.Any, event: js.Any): Unit = js.native
    
    /** Similar to onCellClick, activated when the cell is double clicked. Fires even if rows are selectable. */
    def onCellDoubleClick(rowIndex: Double, columnIndex: Double, row: js.Any, columnValue: js.Any, event: js.Any): Unit = js.native
    
    /** Notification if the filter value changes */
    def onFilterValueChange(value: String): Unit = js.native
    
    def onNextPageClick(event: js.Any): Unit = js.native
    
    def onPreviousPageClick(event: js.Any): Unit = js.native
    
    def onRowSelection(selectedRows: js.Any): Unit = js.native
    
    def onRowSizeChange(index: Double, value: js.Any): Unit = js.native
    
    def onSortOrderChange(key: String, order: String): Unit = js.native
    
    var page: Double = js.native
    
    var rowSize: Double = js.native
    
    var rowSizeLabel: String = js.native
    
    var rowSizeList: js.Array[Double] = js.native
    
    /** If the table rows are select-able */
    var selectable: Boolean = js.native
    
    /** Show check-boxes for selected rows */
    var showCheckboxes: Boolean = js.native
    
    /** Shows a footer toolbar */
    var showFooterToolbar: Boolean = js.native
    
    /** Shows a header toolbar */
    var showHeaderToolbar: Boolean = js.native
    
    /** Show the icon to turn on the filtering feature */
    var showHeaderToolbarFilterIcon: Boolean = js.native
    
    /** Display a hover in the row under the mouse */
    var showRowHover: Boolean = js.native
    
    var showRowSizeControls: Boolean = js.native
    
    /** To display striped rows in the table */
    var stripedRows: Boolean = js.native
    
    /** Override the pagination display, ie. "1 - 5 of 11" Return any React node or string */
    def summaryLabelTemplate(start: Double, end: Double, count: Double): js.Any = js.native
    
    /** React style object for the tbody tag */
    var tableBodyStyle: CSSProperties = js.native
    
    /** React style object for the th/td tag */
    var tableHeaderColumnStyle: CSSProperties = js.native
    
    /** React style object for the th tag */
    var tableHeaderStyle: CSSProperties = js.native
    
    /** React style object for the tr/td tag */
    var tableRowColumnStyle: CSSProperties = js.native
    
    /** React style object for the tr tag */
    var tableRowStyle: CSSProperties = js.native
    
    /** React style object for the table tag */
    var tableStyle: CSSProperties = js.native
    
    var tableWrapperStyle: CSSProperties = js.native
    
    /** Table title */
    var title: String = js.native
    
    /** React Style object for the title */
    var titleStyle: CSSProperties = js.native
    
    var toolbarIconRight: js.Any = js.native
  }
  object DataTableProps {
    
    @scala.inline
    def apply(
      columns: js.Array[Column],
      count: Double,
      data: js.Array[_],
      deselectOnClickaway: Boolean,
      enableSelectAll: Boolean,
      filterHintText: String,
      filterValue: String,
      fixedFooter: Boolean,
      fixedHeader: Boolean,
      footerToolbarStyle: CSSProperties,
      headerToolbarMode: typings.materialUiDatatables.materialUiDatatablesStrings.default | filter | String,
      height: js.Any,
      multiSelectable: Boolean,
      onCellClick: (Double, Double, js.Any, js.Any, js.Any) => Unit,
      onCellDoubleClick: (Double, Double, js.Any, js.Any, js.Any) => Unit,
      onFilterValueChange: String => Unit,
      onNextPageClick: js.Any => Unit,
      onPreviousPageClick: js.Any => Unit,
      onRowSelection: js.Any => Unit,
      onRowSizeChange: (Double, js.Any) => Unit,
      onSortOrderChange: (String, String) => Unit,
      page: Double,
      rowSize: Double,
      rowSizeLabel: String,
      rowSizeList: js.Array[Double],
      selectable: Boolean,
      showCheckboxes: Boolean,
      showFooterToolbar: Boolean,
      showHeaderToolbar: Boolean,
      showHeaderToolbarFilterIcon: Boolean,
      showRowHover: Boolean,
      showRowSizeControls: Boolean,
      stripedRows: Boolean,
      summaryLabelTemplate: (Double, Double, Double) => js.Any,
      tableBodyStyle: CSSProperties,
      tableHeaderColumnStyle: CSSProperties,
      tableHeaderStyle: CSSProperties,
      tableRowColumnStyle: CSSProperties,
      tableRowStyle: CSSProperties,
      tableStyle: CSSProperties,
      tableWrapperStyle: CSSProperties,
      title: String,
      titleStyle: CSSProperties,
      toolbarIconRight: js.Any
    ): DataTableProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deselectOnClickaway = deselectOnClickaway.asInstanceOf[js.Any], enableSelectAll = enableSelectAll.asInstanceOf[js.Any], filterHintText = filterHintText.asInstanceOf[js.Any], filterValue = filterValue.asInstanceOf[js.Any], fixedFooter = fixedFooter.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any], footerToolbarStyle = footerToolbarStyle.asInstanceOf[js.Any], headerToolbarMode = headerToolbarMode.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], multiSelectable = multiSelectable.asInstanceOf[js.Any], onCellClick = js.Any.fromFunction5(onCellClick), onCellDoubleClick = js.Any.fromFunction5(onCellDoubleClick), onFilterValueChange = js.Any.fromFunction1(onFilterValueChange), onNextPageClick = js.Any.fromFunction1(onNextPageClick), onPreviousPageClick = js.Any.fromFunction1(onPreviousPageClick), onRowSelection = js.Any.fromFunction1(onRowSelection), onRowSizeChange = js.Any.fromFunction2(onRowSizeChange), onSortOrderChange = js.Any.fromFunction2(onSortOrderChange), page = page.asInstanceOf[js.Any], rowSize = rowSize.asInstanceOf[js.Any], rowSizeLabel = rowSizeLabel.asInstanceOf[js.Any], rowSizeList = rowSizeList.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], showCheckboxes = showCheckboxes.asInstanceOf[js.Any], showFooterToolbar = showFooterToolbar.asInstanceOf[js.Any], showHeaderToolbar = showHeaderToolbar.asInstanceOf[js.Any], showHeaderToolbarFilterIcon = showHeaderToolbarFilterIcon.asInstanceOf[js.Any], showRowHover = showRowHover.asInstanceOf[js.Any], showRowSizeControls = showRowSizeControls.asInstanceOf[js.Any], stripedRows = stripedRows.asInstanceOf[js.Any], summaryLabelTemplate = js.Any.fromFunction3(summaryLabelTemplate), tableBodyStyle = tableBodyStyle.asInstanceOf[js.Any], tableHeaderColumnStyle = tableHeaderColumnStyle.asInstanceOf[js.Any], tableHeaderStyle = tableHeaderStyle.asInstanceOf[js.Any], tableRowColumnStyle = tableRowColumnStyle.asInstanceOf[js.Any], tableRowStyle = tableRowStyle.asInstanceOf[js.Any], tableStyle = tableStyle.asInstanceOf[js.Any], tableWrapperStyle = tableWrapperStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any], toolbarIconRight = toolbarIconRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTableProps]
    }
    
    @scala.inline
    implicit class DataTablePropsMutableBuilder[Self <: DataTableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDeselectOnClickaway(value: Boolean): Self = StObject.set(x, "deselectOnClickaway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSelectAll(value: Boolean): Self = StObject.set(x, "enableSelectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterHintText(value: String): Self = StObject.set(x, "filterHintText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedFooter(value: Boolean): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterToolbarStyle(value: CSSProperties): Self = StObject.set(x, "footerToolbarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderToolbarMode(value: typings.materialUiDatatables.materialUiDatatablesStrings.default | filter | String): Self = StObject.set(x, "headerToolbarMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectable(value: Boolean): Self = StObject.set(x, "multiSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCellClick(value: (Double, Double, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnCellDoubleClick(value: (Double, Double, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "onCellDoubleClick", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnFilterValueChange(value: String => Unit): Self = StObject.set(x, "onFilterValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNextPageClick(value: js.Any => Unit): Self = StObject.set(x, "onNextPageClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPreviousPageClick(value: js.Any => Unit): Self = StObject.set(x, "onPreviousPageClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowSelection(value: js.Any => Unit): Self = StObject.set(x, "onRowSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowSizeChange(value: (Double, js.Any) => Unit): Self = StObject.set(x, "onRowSizeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSortOrderChange(value: (String, String) => Unit): Self = StObject.set(x, "onSortOrderChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSize(value: Double): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSizeLabel(value: String): Self = StObject.set(x, "rowSizeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSizeList(value: js.Array[Double]): Self = StObject.set(x, "rowSizeList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSizeListVarargs(value: Double*): Self = StObject.set(x, "rowSizeList", js.Array(value :_*))
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCheckboxes(value: Boolean): Self = StObject.set(x, "showCheckboxes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFooterToolbar(value: Boolean): Self = StObject.set(x, "showFooterToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderToolbar(value: Boolean): Self = StObject.set(x, "showHeaderToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderToolbarFilterIcon(value: Boolean): Self = StObject.set(x, "showHeaderToolbarFilterIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRowHover(value: Boolean): Self = StObject.set(x, "showRowHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRowSizeControls(value: Boolean): Self = StObject.set(x, "showRowSizeControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripedRows(value: Boolean): Self = StObject.set(x, "stripedRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryLabelTemplate(value: (Double, Double, Double) => js.Any): Self = StObject.set(x, "summaryLabelTemplate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTableBodyStyle(value: CSSProperties): Self = StObject.set(x, "tableBodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderColumnStyle(value: CSSProperties): Self = StObject.set(x, "tableHeaderColumnStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderStyle(value: CSSProperties): Self = StObject.set(x, "tableHeaderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableRowColumnStyle(value: CSSProperties): Self = StObject.set(x, "tableRowColumnStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableRowStyle(value: CSSProperties): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableStyle(value: CSSProperties): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableWrapperStyle(value: CSSProperties): Self = StObject.set(x, "tableWrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarIconRight(value: js.Any): Self = StObject.set(x, "toolbarIconRight", value.asInstanceOf[js.Any])
    }
  }
}
