package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewPivotGridOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables sorting of the header cells in columns.
    */
  var allowHeaderColumnsSorting: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables sorting of the header cells in rows.
    */
  var allowHeaderRowsSorting: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables sorting of the value cells in columns.
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /**
    * The indentation for every level column when the compactColumnHeaders is set to true.
    */
  var compactColumnHeaderIndentation: js.UndefOr[Double] = js.undefined
  /**
    * A boolean value indicating wheter the column headers should be arranged for compact header layout – each hieararchy is in a single row.
    */
  var compactColumnHeaders: js.UndefOr[Boolean] = js.undefined
  /**
    * The indentation for every level row when the rowHeadersLayout is set to 'compact'.
    */
  var compactRowHeaderIndentation: js.UndefOr[Double] = js.undefined
  /**
    * A function that will be called to determine if an item can be moved in or dropped on an area of the pivot grid.
    * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
    * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
    * paramType="string" The unique name of the item.
    * returnType="bool"  The function must return true if the item should be accepted.
    */
  var customMoveValidation: js.UndefOr[js.Function] = js.undefined
  /**
    * Typle="number" Specifies the width of the row headers.
    */
  var defaultRowHeaderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Disable the drag and drop for the columns drop area and the ability to use filtering and remove items from it.
    */
  var disableColumnsDropArea: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable the drag and drop for the filters drop area and the ability to use filtering and remove items from it.
    */
  var disableFiltersDropArea: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable the drag and drop for the measures drop area and the ability to use filtering and remove items from it.
    */
  var disableMeasuresDropArea: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable the drag and drop for the rows drop area and the ability to use filtering and remove items from it.
    */
  var disableRowsDropArea: js.UndefOr[Boolean] = js.undefined
  /**
    * Settings for the drag and drop functionality of the igPivotDataSelector.
    */
  var dragAndDropSettings: js.UndefOr[IgPivotViewPivotGridOptionsDragAndDropSettings] = js.undefined
  /**
    * Specifies the parent for the drop downs.
    */
  var dropDownParent: js.UndefOr[js.Any] = js.undefined
  /**
    * Spefies the default sort direction for the levels if no sort direction is specified in an item from the levelSortDirections option.
    */
  var firstLevelSortDirection: js.UndefOr[js.Any] = js.undefined
  /**
    * Spefies the default sort direction for the rows.
    */
  var firstSortDirection: js.UndefOr[js.Any] = js.undefined
  /**
    * Options specific to the igGrid that will render the pivot grid view.
    */
  var gridOptions: js.UndefOr[IgPivotViewPivotGridOptionsGridOptions] = js.undefined
  /**
    * Hide the columns drop area.
    */
  var hideColumnsDropArea: js.UndefOr[Boolean] = js.undefined
  /**
    * Hide the filters drop area.
    */
  var hideFiltersDropArea: js.UndefOr[Boolean] = js.undefined
  /**
    * Hide the measures drop area.
    */
  var hideMeasuresDropArea: js.UndefOr[Boolean] = js.undefined
  /**
    * Hide the rows drop area.
    */
  var hideRowsDropArea: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean value indicating whether a parent in the columns is in front of its children.
    * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
    * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
    */
  var isParentInFrontForColumns: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean value indicating whether a parent in the rows is in front of its children.
    * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
    * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
    */
  var isParentInFrontForRows: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of level sort direction items, which predefine the sorted header cells.
    */
  var levelSortDirections: js.UndefOr[js.Array[IgPivotViewPivotGridOptionsLevelSortDirection]] = js.undefined
  /**
    * A value indicating wheter the layout that row headers should be arranged. For compact header layout – each hieararchy is in a single column.
    */
  var rowHeadersLayout: js.UndefOr[js.Any] = js.undefined
}

object IgPivotViewPivotGridOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    allowHeaderColumnsSorting: js.UndefOr[Boolean] = js.undefined,
    allowHeaderRowsSorting: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    compactColumnHeaderIndentation: js.UndefOr[Double] = js.undefined,
    compactColumnHeaders: js.UndefOr[Boolean] = js.undefined,
    compactRowHeaderIndentation: js.UndefOr[Double] = js.undefined,
    customMoveValidation: js.Function = null,
    defaultRowHeaderWidth: js.UndefOr[Double] = js.undefined,
    disableColumnsDropArea: js.UndefOr[Boolean] = js.undefined,
    disableFiltersDropArea: js.UndefOr[Boolean] = js.undefined,
    disableMeasuresDropArea: js.UndefOr[Boolean] = js.undefined,
    disableRowsDropArea: js.UndefOr[Boolean] = js.undefined,
    dragAndDropSettings: IgPivotViewPivotGridOptionsDragAndDropSettings = null,
    dropDownParent: js.Any = null,
    firstLevelSortDirection: js.Any = null,
    firstSortDirection: js.Any = null,
    gridOptions: IgPivotViewPivotGridOptionsGridOptions = null,
    hideColumnsDropArea: js.UndefOr[Boolean] = js.undefined,
    hideFiltersDropArea: js.UndefOr[Boolean] = js.undefined,
    hideMeasuresDropArea: js.UndefOr[Boolean] = js.undefined,
    hideRowsDropArea: js.UndefOr[Boolean] = js.undefined,
    isParentInFrontForColumns: js.UndefOr[Boolean] = js.undefined,
    isParentInFrontForRows: js.UndefOr[Boolean] = js.undefined,
    levelSortDirections: js.Array[IgPivotViewPivotGridOptionsLevelSortDirection] = null,
    rowHeadersLayout: js.Any = null
  ): IgPivotViewPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowHeaderColumnsSorting)) __obj.updateDynamic("allowHeaderColumnsSorting")(allowHeaderColumnsSorting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHeaderRowsSorting)) __obj.updateDynamic("allowHeaderRowsSorting")(allowHeaderRowsSorting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compactColumnHeaderIndentation)) __obj.updateDynamic("compactColumnHeaderIndentation")(compactColumnHeaderIndentation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compactColumnHeaders)) __obj.updateDynamic("compactColumnHeaders")(compactColumnHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compactRowHeaderIndentation)) __obj.updateDynamic("compactRowHeaderIndentation")(compactRowHeaderIndentation.get.asInstanceOf[js.Any])
    if (customMoveValidation != null) __obj.updateDynamic("customMoveValidation")(customMoveValidation.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultRowHeaderWidth)) __obj.updateDynamic("defaultRowHeaderWidth")(defaultRowHeaderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableColumnsDropArea)) __obj.updateDynamic("disableColumnsDropArea")(disableColumnsDropArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFiltersDropArea)) __obj.updateDynamic("disableFiltersDropArea")(disableFiltersDropArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMeasuresDropArea)) __obj.updateDynamic("disableMeasuresDropArea")(disableMeasuresDropArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRowsDropArea)) __obj.updateDynamic("disableRowsDropArea")(disableRowsDropArea.get.asInstanceOf[js.Any])
    if (dragAndDropSettings != null) __obj.updateDynamic("dragAndDropSettings")(dragAndDropSettings.asInstanceOf[js.Any])
    if (dropDownParent != null) __obj.updateDynamic("dropDownParent")(dropDownParent.asInstanceOf[js.Any])
    if (firstLevelSortDirection != null) __obj.updateDynamic("firstLevelSortDirection")(firstLevelSortDirection.asInstanceOf[js.Any])
    if (firstSortDirection != null) __obj.updateDynamic("firstSortDirection")(firstSortDirection.asInstanceOf[js.Any])
    if (gridOptions != null) __obj.updateDynamic("gridOptions")(gridOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(hideColumnsDropArea)) __obj.updateDynamic("hideColumnsDropArea")(hideColumnsDropArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFiltersDropArea)) __obj.updateDynamic("hideFiltersDropArea")(hideFiltersDropArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMeasuresDropArea)) __obj.updateDynamic("hideMeasuresDropArea")(hideMeasuresDropArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideRowsDropArea)) __obj.updateDynamic("hideRowsDropArea")(hideRowsDropArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isParentInFrontForColumns)) __obj.updateDynamic("isParentInFrontForColumns")(isParentInFrontForColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isParentInFrontForRows)) __obj.updateDynamic("isParentInFrontForRows")(isParentInFrontForRows.get.asInstanceOf[js.Any])
    if (levelSortDirections != null) __obj.updateDynamic("levelSortDirections")(levelSortDirections.asInstanceOf[js.Any])
    if (rowHeadersLayout != null) __obj.updateDynamic("rowHeadersLayout")(rowHeadersLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotViewPivotGridOptions]
  }
}

