package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotViewPivotGridOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables sorting of the header cells in columns.
    */
  var allowHeaderColumnsSorting: js.UndefOr[Boolean] = js.native
  /**
    * Enables sorting of the header cells in rows.
    */
  var allowHeaderRowsSorting: js.UndefOr[Boolean] = js.native
  /**
    * Enables sorting of the value cells in columns.
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /**
    * The indentation for every level column when the compactColumnHeaders is set to true.
    */
  var compactColumnHeaderIndentation: js.UndefOr[Double] = js.native
  /**
    * A boolean value indicating wheter the column headers should be arranged for compact header layout – each hieararchy is in a single row.
    */
  var compactColumnHeaders: js.UndefOr[Boolean] = js.native
  /**
    * The indentation for every level row when the rowHeadersLayout is set to 'compact'.
    */
  var compactRowHeaderIndentation: js.UndefOr[Double] = js.native
  /**
    * A function that will be called to determine if an item can be moved in or dropped on an area of the pivot grid.
    * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
    * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
    * paramType="string" The unique name of the item.
    * returnType="bool"  The function must return true if the item should be accepted.
    */
  var customMoveValidation: js.UndefOr[js.Function] = js.native
  /**
    * Typle="number" Specifies the width of the row headers.
    */
  var defaultRowHeaderWidth: js.UndefOr[Double] = js.native
  /**
    * Disable the drag and drop for the columns drop area and the ability to use filtering and remove items from it.
    */
  var disableColumnsDropArea: js.UndefOr[Boolean] = js.native
  /**
    * Disable the drag and drop for the filters drop area and the ability to use filtering and remove items from it.
    */
  var disableFiltersDropArea: js.UndefOr[Boolean] = js.native
  /**
    * Disable the drag and drop for the measures drop area and the ability to use filtering and remove items from it.
    */
  var disableMeasuresDropArea: js.UndefOr[Boolean] = js.native
  /**
    * Disable the drag and drop for the rows drop area and the ability to use filtering and remove items from it.
    */
  var disableRowsDropArea: js.UndefOr[Boolean] = js.native
  /**
    * Settings for the drag and drop functionality of the igPivotDataSelector.
    */
  var dragAndDropSettings: js.UndefOr[IgPivotViewPivotGridOptionsDragAndDropSettings] = js.native
  /**
    * Specifies the parent for the drop downs.
    */
  var dropDownParent: js.UndefOr[js.Any] = js.native
  /**
    * Spefies the default sort direction for the levels if no sort direction is specified in an item from the levelSortDirections option.
    */
  var firstLevelSortDirection: js.UndefOr[js.Any] = js.native
  /**
    * Spefies the default sort direction for the rows.
    */
  var firstSortDirection: js.UndefOr[js.Any] = js.native
  /**
    * Options specific to the igGrid that will render the pivot grid view.
    */
  var gridOptions: js.UndefOr[IgPivotViewPivotGridOptionsGridOptions] = js.native
  /**
    * Hide the columns drop area.
    */
  var hideColumnsDropArea: js.UndefOr[Boolean] = js.native
  /**
    * Hide the filters drop area.
    */
  var hideFiltersDropArea: js.UndefOr[Boolean] = js.native
  /**
    * Hide the measures drop area.
    */
  var hideMeasuresDropArea: js.UndefOr[Boolean] = js.native
  /**
    * Hide the rows drop area.
    */
  var hideRowsDropArea: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether a parent in the columns is in front of its children.
    * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
    * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
    */
  var isParentInFrontForColumns: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether a parent in the rows is in front of its children.
    * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
    * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
    */
  var isParentInFrontForRows: js.UndefOr[Boolean] = js.native
  /**
    * An array of level sort direction items, which predefine the sorted header cells.
    */
  var levelSortDirections: js.UndefOr[js.Array[IgPivotViewPivotGridOptionsLevelSortDirection]] = js.native
  /**
    * A value indicating wheter the layout that row headers should be arranged. For compact header layout – each hieararchy is in a single column.
    */
  var rowHeadersLayout: js.UndefOr[js.Any] = js.native
}

object IgPivotViewPivotGridOptions {
  @scala.inline
  def apply(): IgPivotViewPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewPivotGridOptions]
  }
  @scala.inline
  implicit class IgPivotViewPivotGridOptionsOps[Self <: IgPivotViewPivotGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowHeaderColumnsSorting(value: Boolean): Self = this.set("allowHeaderColumnsSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHeaderColumnsSorting: Self = this.set("allowHeaderColumnsSorting", js.undefined)
    @scala.inline
    def setAllowHeaderRowsSorting(value: Boolean): Self = this.set("allowHeaderRowsSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHeaderRowsSorting: Self = this.set("allowHeaderRowsSorting", js.undefined)
    @scala.inline
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    @scala.inline
    def setCompactColumnHeaderIndentation(value: Double): Self = this.set("compactColumnHeaderIndentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactColumnHeaderIndentation: Self = this.set("compactColumnHeaderIndentation", js.undefined)
    @scala.inline
    def setCompactColumnHeaders(value: Boolean): Self = this.set("compactColumnHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactColumnHeaders: Self = this.set("compactColumnHeaders", js.undefined)
    @scala.inline
    def setCompactRowHeaderIndentation(value: Double): Self = this.set("compactRowHeaderIndentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactRowHeaderIndentation: Self = this.set("compactRowHeaderIndentation", js.undefined)
    @scala.inline
    def setCustomMoveValidation(value: js.Function): Self = this.set("customMoveValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMoveValidation: Self = this.set("customMoveValidation", js.undefined)
    @scala.inline
    def setDefaultRowHeaderWidth(value: Double): Self = this.set("defaultRowHeaderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRowHeaderWidth: Self = this.set("defaultRowHeaderWidth", js.undefined)
    @scala.inline
    def setDisableColumnsDropArea(value: Boolean): Self = this.set("disableColumnsDropArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableColumnsDropArea: Self = this.set("disableColumnsDropArea", js.undefined)
    @scala.inline
    def setDisableFiltersDropArea(value: Boolean): Self = this.set("disableFiltersDropArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFiltersDropArea: Self = this.set("disableFiltersDropArea", js.undefined)
    @scala.inline
    def setDisableMeasuresDropArea(value: Boolean): Self = this.set("disableMeasuresDropArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableMeasuresDropArea: Self = this.set("disableMeasuresDropArea", js.undefined)
    @scala.inline
    def setDisableRowsDropArea(value: Boolean): Self = this.set("disableRowsDropArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableRowsDropArea: Self = this.set("disableRowsDropArea", js.undefined)
    @scala.inline
    def setDragAndDropSettings(value: IgPivotViewPivotGridOptionsDragAndDropSettings): Self = this.set("dragAndDropSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragAndDropSettings: Self = this.set("dragAndDropSettings", js.undefined)
    @scala.inline
    def setDropDownParent(value: js.Any): Self = this.set("dropDownParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownParent: Self = this.set("dropDownParent", js.undefined)
    @scala.inline
    def setFirstLevelSortDirection(value: js.Any): Self = this.set("firstLevelSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstLevelSortDirection: Self = this.set("firstLevelSortDirection", js.undefined)
    @scala.inline
    def setFirstSortDirection(value: js.Any): Self = this.set("firstSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstSortDirection: Self = this.set("firstSortDirection", js.undefined)
    @scala.inline
    def setGridOptions(value: IgPivotViewPivotGridOptionsGridOptions): Self = this.set("gridOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridOptions: Self = this.set("gridOptions", js.undefined)
    @scala.inline
    def setHideColumnsDropArea(value: Boolean): Self = this.set("hideColumnsDropArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideColumnsDropArea: Self = this.set("hideColumnsDropArea", js.undefined)
    @scala.inline
    def setHideFiltersDropArea(value: Boolean): Self = this.set("hideFiltersDropArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideFiltersDropArea: Self = this.set("hideFiltersDropArea", js.undefined)
    @scala.inline
    def setHideMeasuresDropArea(value: Boolean): Self = this.set("hideMeasuresDropArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideMeasuresDropArea: Self = this.set("hideMeasuresDropArea", js.undefined)
    @scala.inline
    def setHideRowsDropArea(value: Boolean): Self = this.set("hideRowsDropArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideRowsDropArea: Self = this.set("hideRowsDropArea", js.undefined)
    @scala.inline
    def setIsParentInFrontForColumns(value: Boolean): Self = this.set("isParentInFrontForColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsParentInFrontForColumns: Self = this.set("isParentInFrontForColumns", js.undefined)
    @scala.inline
    def setIsParentInFrontForRows(value: Boolean): Self = this.set("isParentInFrontForRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsParentInFrontForRows: Self = this.set("isParentInFrontForRows", js.undefined)
    @scala.inline
    def setLevelSortDirectionsVarargs(value: IgPivotViewPivotGridOptionsLevelSortDirection*): Self = this.set("levelSortDirections", js.Array(value :_*))
    @scala.inline
    def setLevelSortDirections(value: js.Array[IgPivotViewPivotGridOptionsLevelSortDirection]): Self = this.set("levelSortDirections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelSortDirections: Self = this.set("levelSortDirections", js.undefined)
    @scala.inline
    def setRowHeadersLayout(value: js.Any): Self = this.set("rowHeadersLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeadersLayout: Self = this.set("rowHeadersLayout", js.undefined)
  }
  
}

