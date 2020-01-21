package typings.knockoutKogrid.kg

import typings.jquery.JQueryGenericPromise
import typings.knockout.KnockoutObservable
import typings.knockout.KnockoutObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions[EntityType] extends js.Object {
  /** Callback for when you want to validate something after selection. */
  var afterSelectionChange: js.UndefOr[js.Function1[/* row */ Row[EntityType], Unit]] = js.undefined
  /** Callback if you want to inspect something before selection,
    return false if you want to cancel the selection. return true otherwise.
    If you need to wait for an async call to proceed with selection you can
    use rowItem.changeSelection(event) method after returning false initially.
    Note: when shift+ Selecting multiple items in the grid this will only get called
    once and the rowItem will be an array of items that are queued to be selected. */
  var beforeSelectionChange: js.UndefOr[js.Function1[/* row */ Row[EntityType], Boolean]] = js.undefined
  /** To be able to have selectable rows in grid. */
  var canSelectRows: js.UndefOr[Boolean] = js.undefined
  /** definitions of columns as an array [], if not defined columns are auto-generated. See github wiki for more details. */
  var columnDefs: js.UndefOr[js.Array[ColumnDef] | KnockoutObservable[js.Array[ColumnDef]]] = js.undefined
  /** Column width of columns in grid. */
  var columnWidth: js.UndefOr[Double] = js.undefined
  /** Data being displayed in the grid. Each item in the array is mapped to a row being displayed. */
  var data: js.UndefOr[KnockoutObservableArray[EntityType]] = js.undefined
  /** Row selection check boxes appear as the first column. */
  var displaySelectionCheckbox: Boolean
  /** Enable or disable resizing of columns */
  var enableColumnResize: js.UndefOr[Boolean] = js.undefined
  /** Enables the server-side paging feature */
  var enablePaging: js.UndefOr[Boolean] = js.undefined
  /** Enable drag and drop row reordering. Only works in HTML5 compliant browsers. */
  var enableRowReordering: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables sorting in grid. */
  var enableSorting: js.UndefOr[Boolean] = js.undefined
  /** filterOptions -
    filterText: The text bound to the built-in search box.
    useExternalFilter: Bypass internal filtering if you want to roll your own filtering mechanism but want to use builtin search box.
    */
  var filterOptions: js.UndefOr[FilterOptions] = js.undefined
  /** Defining the height of the footer in pixels. */
  var footerRowHeight: js.UndefOr[Double] = js.undefined
  /** Show or hide the footer alltogether the footer is enabled by default */
  var footerVisible: js.UndefOr[Boolean] = js.undefined
  /** Initial fields to group data by. Array of field names, not displayName. */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  /** The height of the header row in pixels. */
  var headerRowHeight: js.UndefOr[Double] = js.undefined
  /** Define a header row template for further customization. See github wiki for more details. */
  var headerRowTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.undefined
  /** Enables the use of jquery UI reaggable/droppable plugin. requires jqueryUI to work if enabled.
    Useful if you want drag + drop but your users insist on crappy browsers. */
  var jqueryUIDraggable: js.UndefOr[Boolean] = js.undefined
  /** Enable the use jqueryUIThemes */
  var jqueryUITheme: js.UndefOr[Boolean] = js.undefined
  /** Prevent unselections when in single selection mode. */
  var keepLastSelected: js.UndefOr[Boolean] = js.undefined
  /** Maintains the column widths while resizing.
    Defaults to true when using *'s or undefined widths. Can be ovverriden by setting to false. */
  var maintainColumnRatios: js.UndefOr[js.Any] = js.undefined
  /** Set this to false if you only want one item selected at a time */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  /**  pagingOptions - */
  var pagingOptions: js.UndefOr[PagingOptions] = js.undefined
  /** Array of plugin functions to register in ng-grid */
  var plugins: js.UndefOr[js.Array[Plugin[EntityType]]] = js.undefined
  /** Row height of rows in grid. */
  var rowHeight: js.UndefOr[Double] = js.undefined
  /** Define a row template to customize output. See github wiki for more details. */
  var rowTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.undefined
  /** Defines the binding to select all at once */
  var selectAllState: js.UndefOr[KnockoutObservable[Boolean]] = js.undefined
  /** Disable row selections by clicking on the row and only when the checkbox is clicked. */
  var selectWithCheckboxOnly: js.UndefOr[Boolean] = js.undefined
  /** all of the items selected in the grid. In single select mode there will only be one item in the array. */
  var selectedItems: js.UndefOr[KnockoutObservableArray[_]] = js.undefined
  /** Enables menu to choose which columns to display and group by.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showColumnMenu: js.UndefOr[Boolean] = js.undefined
  /** Enables display of the filterbox in the column menu.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showFilter: js.UndefOr[Boolean] = js.undefined
  /** Show the dropzone for drag and drop grouping */
  var showGroupPanel: js.UndefOr[Boolean] = js.undefined
  /** Define a sortInfo object to specify a default sorting state.
    You can also observe this variable to utilize server-side sorting (see useExternalSorting).
    Syntax is sortinfo: { fields: ['fieldName1',' fieldName2'], direction: 'ASC'/'asc' || 'desc'/'DESC'}*/
  var sortInfo: js.UndefOr[SortInfo | KnockoutObservable[SortInfo]] = js.undefined
  /** Set the tab index of the Vieport. */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /** Prevents the internal sorting from executing.
    The sortInfo object will be updated with the sorting information so you can handle sorting (see sortInfo)*/
  var useExternalSorting: js.UndefOr[Boolean] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply[EntityType](
    displaySelectionCheckbox: Boolean,
    afterSelectionChange: /* row */ Row[EntityType] => Unit = null,
    beforeSelectionChange: /* row */ Row[EntityType] => Boolean = null,
    canSelectRows: js.UndefOr[Boolean] = js.undefined,
    columnDefs: js.Array[ColumnDef] | KnockoutObservable[js.Array[ColumnDef]] = null,
    columnWidth: Int | Double = null,
    data: KnockoutObservableArray[EntityType] = null,
    enableColumnResize: js.UndefOr[Boolean] = js.undefined,
    enablePaging: js.UndefOr[Boolean] = js.undefined,
    enableRowReordering: js.UndefOr[Boolean] = js.undefined,
    enableSorting: js.UndefOr[Boolean] = js.undefined,
    filterOptions: FilterOptions = null,
    footerRowHeight: Int | Double = null,
    footerVisible: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null,
    headerRowHeight: Int | Double = null,
    headerRowTemplate: String | JQueryGenericPromise[String] = null,
    jqueryUIDraggable: js.UndefOr[Boolean] = js.undefined,
    jqueryUITheme: js.UndefOr[Boolean] = js.undefined,
    keepLastSelected: js.UndefOr[Boolean] = js.undefined,
    maintainColumnRatios: js.Any = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    pagingOptions: PagingOptions = null,
    plugins: js.Array[Plugin[EntityType]] = null,
    rowHeight: Int | Double = null,
    rowTemplate: String | JQueryGenericPromise[String] = null,
    selectAllState: KnockoutObservable[Boolean] = null,
    selectWithCheckboxOnly: js.UndefOr[Boolean] = js.undefined,
    selectedItems: KnockoutObservableArray[_] = null,
    showColumnMenu: js.UndefOr[Boolean] = js.undefined,
    showFilter: js.UndefOr[Boolean] = js.undefined,
    showGroupPanel: js.UndefOr[Boolean] = js.undefined,
    sortInfo: SortInfo | KnockoutObservable[SortInfo] = null,
    tabIndex: Int | Double = null,
    useExternalSorting: js.UndefOr[Boolean] = js.undefined
  ): GridOptions[EntityType] = {
    val __obj = js.Dynamic.literal(displaySelectionCheckbox = displaySelectionCheckbox.asInstanceOf[js.Any])
    if (afterSelectionChange != null) __obj.updateDynamic("afterSelectionChange")(js.Any.fromFunction1(afterSelectionChange))
    if (beforeSelectionChange != null) __obj.updateDynamic("beforeSelectionChange")(js.Any.fromFunction1(beforeSelectionChange))
    if (!js.isUndefined(canSelectRows)) __obj.updateDynamic("canSelectRows")(canSelectRows.asInstanceOf[js.Any])
    if (columnDefs != null) __obj.updateDynamic("columnDefs")(columnDefs.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnResize)) __obj.updateDynamic("enableColumnResize")(enableColumnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePaging)) __obj.updateDynamic("enablePaging")(enablePaging.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowReordering)) __obj.updateDynamic("enableRowReordering")(enableRowReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSorting)) __obj.updateDynamic("enableSorting")(enableSorting.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (footerRowHeight != null) __obj.updateDynamic("footerRowHeight")(footerRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(footerVisible)) __obj.updateDynamic("footerVisible")(footerVisible.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (headerRowHeight != null) __obj.updateDynamic("headerRowHeight")(headerRowHeight.asInstanceOf[js.Any])
    if (headerRowTemplate != null) __obj.updateDynamic("headerRowTemplate")(headerRowTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(jqueryUIDraggable)) __obj.updateDynamic("jqueryUIDraggable")(jqueryUIDraggable.asInstanceOf[js.Any])
    if (!js.isUndefined(jqueryUITheme)) __obj.updateDynamic("jqueryUITheme")(jqueryUITheme.asInstanceOf[js.Any])
    if (!js.isUndefined(keepLastSelected)) __obj.updateDynamic("keepLastSelected")(keepLastSelected.asInstanceOf[js.Any])
    if (maintainColumnRatios != null) __obj.updateDynamic("maintainColumnRatios")(maintainColumnRatios.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (pagingOptions != null) __obj.updateDynamic("pagingOptions")(pagingOptions.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowTemplate != null) __obj.updateDynamic("rowTemplate")(rowTemplate.asInstanceOf[js.Any])
    if (selectAllState != null) __obj.updateDynamic("selectAllState")(selectAllState.asInstanceOf[js.Any])
    if (!js.isUndefined(selectWithCheckboxOnly)) __obj.updateDynamic("selectWithCheckboxOnly")(selectWithCheckboxOnly.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnMenu)) __obj.updateDynamic("showColumnMenu")(showColumnMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(showFilter)) __obj.updateDynamic("showFilter")(showFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(showGroupPanel)) __obj.updateDynamic("showGroupPanel")(showGroupPanel.asInstanceOf[js.Any])
    if (sortInfo != null) __obj.updateDynamic("sortInfo")(sortInfo.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(useExternalSorting)) __obj.updateDynamic("useExternalSorting")(useExternalSorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptions[EntityType]]
  }
}

