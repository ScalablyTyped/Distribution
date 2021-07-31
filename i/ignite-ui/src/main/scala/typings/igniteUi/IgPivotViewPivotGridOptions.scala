package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotViewPivotGridOptions
  extends StObject
     with /**
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
  def apply(): IgPivotViewPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewPivotGridOptions]
  }
  
  @scala.inline
  implicit class IgPivotViewPivotGridOptionsMutableBuilder[Self <: IgPivotViewPivotGridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHeaderColumnsSorting(value: Boolean): Self = StObject.set(x, "allowHeaderColumnsSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHeaderColumnsSortingUndefined: Self = StObject.set(x, "allowHeaderColumnsSorting", js.undefined)
    
    @scala.inline
    def setAllowHeaderRowsSorting(value: Boolean): Self = StObject.set(x, "allowHeaderRowsSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHeaderRowsSortingUndefined: Self = StObject.set(x, "allowHeaderRowsSorting", js.undefined)
    
    @scala.inline
    def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
    
    @scala.inline
    def setCompactColumnHeaderIndentation(value: Double): Self = StObject.set(x, "compactColumnHeaderIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactColumnHeaderIndentationUndefined: Self = StObject.set(x, "compactColumnHeaderIndentation", js.undefined)
    
    @scala.inline
    def setCompactColumnHeaders(value: Boolean): Self = StObject.set(x, "compactColumnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactColumnHeadersUndefined: Self = StObject.set(x, "compactColumnHeaders", js.undefined)
    
    @scala.inline
    def setCompactRowHeaderIndentation(value: Double): Self = StObject.set(x, "compactRowHeaderIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactRowHeaderIndentationUndefined: Self = StObject.set(x, "compactRowHeaderIndentation", js.undefined)
    
    @scala.inline
    def setCustomMoveValidation(value: js.Function): Self = StObject.set(x, "customMoveValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMoveValidationUndefined: Self = StObject.set(x, "customMoveValidation", js.undefined)
    
    @scala.inline
    def setDefaultRowHeaderWidth(value: Double): Self = StObject.set(x, "defaultRowHeaderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRowHeaderWidthUndefined: Self = StObject.set(x, "defaultRowHeaderWidth", js.undefined)
    
    @scala.inline
    def setDisableColumnsDropArea(value: Boolean): Self = StObject.set(x, "disableColumnsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableColumnsDropAreaUndefined: Self = StObject.set(x, "disableColumnsDropArea", js.undefined)
    
    @scala.inline
    def setDisableFiltersDropArea(value: Boolean): Self = StObject.set(x, "disableFiltersDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFiltersDropAreaUndefined: Self = StObject.set(x, "disableFiltersDropArea", js.undefined)
    
    @scala.inline
    def setDisableMeasuresDropArea(value: Boolean): Self = StObject.set(x, "disableMeasuresDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMeasuresDropAreaUndefined: Self = StObject.set(x, "disableMeasuresDropArea", js.undefined)
    
    @scala.inline
    def setDisableRowsDropArea(value: Boolean): Self = StObject.set(x, "disableRowsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRowsDropAreaUndefined: Self = StObject.set(x, "disableRowsDropArea", js.undefined)
    
    @scala.inline
    def setDragAndDropSettings(value: IgPivotViewPivotGridOptionsDragAndDropSettings): Self = StObject.set(x, "dragAndDropSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragAndDropSettingsUndefined: Self = StObject.set(x, "dragAndDropSettings", js.undefined)
    
    @scala.inline
    def setDropDownParent(value: js.Any): Self = StObject.set(x, "dropDownParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownParentUndefined: Self = StObject.set(x, "dropDownParent", js.undefined)
    
    @scala.inline
    def setFirstLevelSortDirection(value: js.Any): Self = StObject.set(x, "firstLevelSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLevelSortDirectionUndefined: Self = StObject.set(x, "firstLevelSortDirection", js.undefined)
    
    @scala.inline
    def setFirstSortDirection(value: js.Any): Self = StObject.set(x, "firstSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSortDirectionUndefined: Self = StObject.set(x, "firstSortDirection", js.undefined)
    
    @scala.inline
    def setGridOptions(value: IgPivotViewPivotGridOptionsGridOptions): Self = StObject.set(x, "gridOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridOptionsUndefined: Self = StObject.set(x, "gridOptions", js.undefined)
    
    @scala.inline
    def setHideColumnsDropArea(value: Boolean): Self = StObject.set(x, "hideColumnsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideColumnsDropAreaUndefined: Self = StObject.set(x, "hideColumnsDropArea", js.undefined)
    
    @scala.inline
    def setHideFiltersDropArea(value: Boolean): Self = StObject.set(x, "hideFiltersDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFiltersDropAreaUndefined: Self = StObject.set(x, "hideFiltersDropArea", js.undefined)
    
    @scala.inline
    def setHideMeasuresDropArea(value: Boolean): Self = StObject.set(x, "hideMeasuresDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideMeasuresDropAreaUndefined: Self = StObject.set(x, "hideMeasuresDropArea", js.undefined)
    
    @scala.inline
    def setHideRowsDropArea(value: Boolean): Self = StObject.set(x, "hideRowsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideRowsDropAreaUndefined: Self = StObject.set(x, "hideRowsDropArea", js.undefined)
    
    @scala.inline
    def setIsParentInFrontForColumns(value: Boolean): Self = StObject.set(x, "isParentInFrontForColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsParentInFrontForColumnsUndefined: Self = StObject.set(x, "isParentInFrontForColumns", js.undefined)
    
    @scala.inline
    def setIsParentInFrontForRows(value: Boolean): Self = StObject.set(x, "isParentInFrontForRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsParentInFrontForRowsUndefined: Self = StObject.set(x, "isParentInFrontForRows", js.undefined)
    
    @scala.inline
    def setLevelSortDirections(value: js.Array[IgPivotViewPivotGridOptionsLevelSortDirection]): Self = StObject.set(x, "levelSortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelSortDirectionsUndefined: Self = StObject.set(x, "levelSortDirections", js.undefined)
    
    @scala.inline
    def setLevelSortDirectionsVarargs(value: IgPivotViewPivotGridOptionsLevelSortDirection*): Self = StObject.set(x, "levelSortDirections", js.Array(value :_*))
    
    @scala.inline
    def setRowHeadersLayout(value: js.Any): Self = StObject.set(x, "rowHeadersLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeadersLayoutUndefined: Self = StObject.set(x, "rowHeadersLayout", js.undefined)
  }
}
