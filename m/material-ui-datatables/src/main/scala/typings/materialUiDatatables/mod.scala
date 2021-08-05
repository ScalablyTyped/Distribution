package typings.materialUiDatatables

import typings.materialUiDatatables.anon.PartialDataTableProps
import typings.materialUiDatatables.materialUiDatatablesStrings.filter
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("material-ui-datatables", JSImport.Default)
  @js.native
  class default ()
    extends Component[PartialDataTableProps, js.Object, js.Any]
  
  trait Column extends StObject {
    
    /** Align right */
    var alignRight: js.UndefOr[Boolean] = js.undefined
    
    /** Class name to use */
    var className: js.UndefOr[String] = js.undefined
    
    /** The element key */
    var key: js.UndefOr[String] = js.undefined
    
    /** Label */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Render function. Given the value extracted
      * from the row; and the row also. Can return JSX content.
      * @param value - the extracted value from data
      * @param row - the data object representing this row
      * @returns Any react node (JSX compatible return)
      */
    var render: js.UndefOr[js.Function2[/* value */ js.Any, /* row */ js.Any, js.Any]] = js.undefined
    
    /** If the column is sortable */
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    /** Style for column */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /** Cell tooltip */
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object Column {
    
    inline def apply(): Column = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setAlignRight(value: Boolean): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
      
      inline def setAlignRightUndefined: Self = StObject.set(x, "alignRight", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRender(value: (/* value */ js.Any, /* row */ js.Any) => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type DataTable = Component[PartialDataTableProps, js.Object, js.Any]
  
  trait DataTableProps extends StObject {
    
    /**
      * The column structure.
      * ```let columns: Column[] = [{
      *      key: 'bookName',
      *      label: 'Book Name & Author',
      *      render: (__value: any, book: any) => book.name + ' by ' book.author
      *  },```
      */
    var columns: js.Array[Column]
    
    var count: Double
    
    /** The array of objects used as data for the table */
    var data: js.Array[js.Any]
    
    /** If clicking away de-selects all */
    var deselectOnClickaway: Boolean
    
    /** Adds a select all button */
    var enableSelectAll: Boolean
    
    /** Filter hint text */
    var filterHintText: String
    
    // BUG https://github.com/Microsoft/TypeScript/issues/11465
    /** The current filter value */
    var filterValue: String
    
    /** If the footer should be fixed */
    var fixedFooter: Boolean
    
    /** If the header should be fixed */
    var fixedHeader: Boolean
    
    /** React Style object applied to footer toolbar */
    var footerToolbarStyle: CSSProperties
    
    /** 'default' or 'filter', filter mode shows a search box to reduce visible rows */
    var headerToolbarMode: typings.materialUiDatatables.materialUiDatatablesStrings.default | filter | String
    
    /** The hight of the table */
    var height: js.Any
    
    /** If multiple table rows are select-able */
    var multiSelectable: Boolean
    
    /** Callback when the cell is clicked. This callback is only active when selectable is false. */
    def onCellClick(rowIndex: Double, columnIndex: Double, row: js.Any, columnValue: js.Any, event: js.Any): Unit
    
    /** Similar to onCellClick, activated when the cell is double clicked. Fires even if rows are selectable. */
    def onCellDoubleClick(rowIndex: Double, columnIndex: Double, row: js.Any, columnValue: js.Any, event: js.Any): Unit
    
    /** Notification if the filter value changes */
    def onFilterValueChange(value: String): Unit
    
    def onNextPageClick(event: js.Any): Unit
    
    def onPreviousPageClick(event: js.Any): Unit
    
    def onRowSelection(selectedRows: js.Any): Unit
    
    def onRowSizeChange(index: Double, value: js.Any): Unit
    
    def onSortOrderChange(key: String, order: String): Unit
    
    var page: Double
    
    var rowSize: Double
    
    var rowSizeLabel: String
    
    var rowSizeList: js.Array[Double]
    
    /** If the table rows are select-able */
    var selectable: Boolean
    
    /** Show check-boxes for selected rows */
    var showCheckboxes: Boolean
    
    /** Shows a footer toolbar */
    var showFooterToolbar: Boolean
    
    /** Shows a header toolbar */
    var showHeaderToolbar: Boolean
    
    /** Show the icon to turn on the filtering feature */
    var showHeaderToolbarFilterIcon: Boolean
    
    /** Display a hover in the row under the mouse */
    var showRowHover: Boolean
    
    var showRowSizeControls: Boolean
    
    /** To display striped rows in the table */
    var stripedRows: Boolean
    
    /** Override the pagination display, ie. "1 - 5 of 11" Return any React node or string */
    def summaryLabelTemplate(start: Double, end: Double, count: Double): js.Any
    
    /** React style object for the tbody tag */
    var tableBodyStyle: CSSProperties
    
    /** React style object for the th/td tag */
    var tableHeaderColumnStyle: CSSProperties
    
    /** React style object for the th tag */
    var tableHeaderStyle: CSSProperties
    
    /** React style object for the tr/td tag */
    var tableRowColumnStyle: CSSProperties
    
    /** React style object for the tr tag */
    var tableRowStyle: CSSProperties
    
    /** React style object for the table tag */
    var tableStyle: CSSProperties
    
    var tableWrapperStyle: CSSProperties
    
    /** Table title */
    var title: String
    
    /** React Style object for the title */
    var titleStyle: CSSProperties
    
    var toolbarIconRight: js.Any
  }
  object DataTableProps {
    
    inline def apply(
      columns: js.Array[Column],
      count: Double,
      data: js.Array[js.Any],
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
    
    extension [Self <: DataTableProps](x: Self) {
      
      inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setDeselectOnClickaway(value: Boolean): Self = StObject.set(x, "deselectOnClickaway", value.asInstanceOf[js.Any])
      
      inline def setEnableSelectAll(value: Boolean): Self = StObject.set(x, "enableSelectAll", value.asInstanceOf[js.Any])
      
      inline def setFilterHintText(value: String): Self = StObject.set(x, "filterHintText", value.asInstanceOf[js.Any])
      
      inline def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      inline def setFixedFooter(value: Boolean): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFooterToolbarStyle(value: CSSProperties): Self = StObject.set(x, "footerToolbarStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderToolbarMode(value: typings.materialUiDatatables.materialUiDatatablesStrings.default | filter | String): Self = StObject.set(x, "headerToolbarMode", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectable(value: Boolean): Self = StObject.set(x, "multiSelectable", value.asInstanceOf[js.Any])
      
      inline def setOnCellClick(value: (Double, Double, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction5(value))
      
      inline def setOnCellDoubleClick(value: (Double, Double, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "onCellDoubleClick", js.Any.fromFunction5(value))
      
      inline def setOnFilterValueChange(value: String => Unit): Self = StObject.set(x, "onFilterValueChange", js.Any.fromFunction1(value))
      
      inline def setOnNextPageClick(value: js.Any => Unit): Self = StObject.set(x, "onNextPageClick", js.Any.fromFunction1(value))
      
      inline def setOnPreviousPageClick(value: js.Any => Unit): Self = StObject.set(x, "onPreviousPageClick", js.Any.fromFunction1(value))
      
      inline def setOnRowSelection(value: js.Any => Unit): Self = StObject.set(x, "onRowSelection", js.Any.fromFunction1(value))
      
      inline def setOnRowSizeChange(value: (Double, js.Any) => Unit): Self = StObject.set(x, "onRowSizeChange", js.Any.fromFunction2(value))
      
      inline def setOnSortOrderChange(value: (String, String) => Unit): Self = StObject.set(x, "onSortOrderChange", js.Any.fromFunction2(value))
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRowSize(value: Double): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      inline def setRowSizeLabel(value: String): Self = StObject.set(x, "rowSizeLabel", value.asInstanceOf[js.Any])
      
      inline def setRowSizeList(value: js.Array[Double]): Self = StObject.set(x, "rowSizeList", value.asInstanceOf[js.Any])
      
      inline def setRowSizeListVarargs(value: Double*): Self = StObject.set(x, "rowSizeList", js.Array(value :_*))
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setShowCheckboxes(value: Boolean): Self = StObject.set(x, "showCheckboxes", value.asInstanceOf[js.Any])
      
      inline def setShowFooterToolbar(value: Boolean): Self = StObject.set(x, "showFooterToolbar", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderToolbar(value: Boolean): Self = StObject.set(x, "showHeaderToolbar", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderToolbarFilterIcon(value: Boolean): Self = StObject.set(x, "showHeaderToolbarFilterIcon", value.asInstanceOf[js.Any])
      
      inline def setShowRowHover(value: Boolean): Self = StObject.set(x, "showRowHover", value.asInstanceOf[js.Any])
      
      inline def setShowRowSizeControls(value: Boolean): Self = StObject.set(x, "showRowSizeControls", value.asInstanceOf[js.Any])
      
      inline def setStripedRows(value: Boolean): Self = StObject.set(x, "stripedRows", value.asInstanceOf[js.Any])
      
      inline def setSummaryLabelTemplate(value: (Double, Double, Double) => js.Any): Self = StObject.set(x, "summaryLabelTemplate", js.Any.fromFunction3(value))
      
      inline def setTableBodyStyle(value: CSSProperties): Self = StObject.set(x, "tableBodyStyle", value.asInstanceOf[js.Any])
      
      inline def setTableHeaderColumnStyle(value: CSSProperties): Self = StObject.set(x, "tableHeaderColumnStyle", value.asInstanceOf[js.Any])
      
      inline def setTableHeaderStyle(value: CSSProperties): Self = StObject.set(x, "tableHeaderStyle", value.asInstanceOf[js.Any])
      
      inline def setTableRowColumnStyle(value: CSSProperties): Self = StObject.set(x, "tableRowColumnStyle", value.asInstanceOf[js.Any])
      
      inline def setTableRowStyle(value: CSSProperties): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
      
      inline def setTableStyle(value: CSSProperties): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
      
      inline def setTableWrapperStyle(value: CSSProperties): Self = StObject.set(x, "tableWrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setToolbarIconRight(value: js.Any): Self = StObject.set(x, "toolbarIconRight", value.asInstanceOf[js.Any])
    }
  }
}
