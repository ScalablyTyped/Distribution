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
  
  inline def apply(): IgPivotViewPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewPivotGridOptions]
  }
  
  extension [Self <: IgPivotViewPivotGridOptions](x: Self) {
    
    inline def setAllowHeaderColumnsSorting(value: Boolean): Self = StObject.set(x, "allowHeaderColumnsSorting", value.asInstanceOf[js.Any])
    
    inline def setAllowHeaderColumnsSortingUndefined: Self = StObject.set(x, "allowHeaderColumnsSorting", js.undefined)
    
    inline def setAllowHeaderRowsSorting(value: Boolean): Self = StObject.set(x, "allowHeaderRowsSorting", value.asInstanceOf[js.Any])
    
    inline def setAllowHeaderRowsSortingUndefined: Self = StObject.set(x, "allowHeaderRowsSorting", js.undefined)
    
    inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
    
    inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
    
    inline def setCompactColumnHeaderIndentation(value: Double): Self = StObject.set(x, "compactColumnHeaderIndentation", value.asInstanceOf[js.Any])
    
    inline def setCompactColumnHeaderIndentationUndefined: Self = StObject.set(x, "compactColumnHeaderIndentation", js.undefined)
    
    inline def setCompactColumnHeaders(value: Boolean): Self = StObject.set(x, "compactColumnHeaders", value.asInstanceOf[js.Any])
    
    inline def setCompactColumnHeadersUndefined: Self = StObject.set(x, "compactColumnHeaders", js.undefined)
    
    inline def setCompactRowHeaderIndentation(value: Double): Self = StObject.set(x, "compactRowHeaderIndentation", value.asInstanceOf[js.Any])
    
    inline def setCompactRowHeaderIndentationUndefined: Self = StObject.set(x, "compactRowHeaderIndentation", js.undefined)
    
    inline def setCustomMoveValidation(value: js.Function): Self = StObject.set(x, "customMoveValidation", value.asInstanceOf[js.Any])
    
    inline def setCustomMoveValidationUndefined: Self = StObject.set(x, "customMoveValidation", js.undefined)
    
    inline def setDefaultRowHeaderWidth(value: Double): Self = StObject.set(x, "defaultRowHeaderWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultRowHeaderWidthUndefined: Self = StObject.set(x, "defaultRowHeaderWidth", js.undefined)
    
    inline def setDisableColumnsDropArea(value: Boolean): Self = StObject.set(x, "disableColumnsDropArea", value.asInstanceOf[js.Any])
    
    inline def setDisableColumnsDropAreaUndefined: Self = StObject.set(x, "disableColumnsDropArea", js.undefined)
    
    inline def setDisableFiltersDropArea(value: Boolean): Self = StObject.set(x, "disableFiltersDropArea", value.asInstanceOf[js.Any])
    
    inline def setDisableFiltersDropAreaUndefined: Self = StObject.set(x, "disableFiltersDropArea", js.undefined)
    
    inline def setDisableMeasuresDropArea(value: Boolean): Self = StObject.set(x, "disableMeasuresDropArea", value.asInstanceOf[js.Any])
    
    inline def setDisableMeasuresDropAreaUndefined: Self = StObject.set(x, "disableMeasuresDropArea", js.undefined)
    
    inline def setDisableRowsDropArea(value: Boolean): Self = StObject.set(x, "disableRowsDropArea", value.asInstanceOf[js.Any])
    
    inline def setDisableRowsDropAreaUndefined: Self = StObject.set(x, "disableRowsDropArea", js.undefined)
    
    inline def setDragAndDropSettings(value: IgPivotViewPivotGridOptionsDragAndDropSettings): Self = StObject.set(x, "dragAndDropSettings", value.asInstanceOf[js.Any])
    
    inline def setDragAndDropSettingsUndefined: Self = StObject.set(x, "dragAndDropSettings", js.undefined)
    
    inline def setDropDownParent(value: js.Any): Self = StObject.set(x, "dropDownParent", value.asInstanceOf[js.Any])
    
    inline def setDropDownParentUndefined: Self = StObject.set(x, "dropDownParent", js.undefined)
    
    inline def setFirstLevelSortDirection(value: js.Any): Self = StObject.set(x, "firstLevelSortDirection", value.asInstanceOf[js.Any])
    
    inline def setFirstLevelSortDirectionUndefined: Self = StObject.set(x, "firstLevelSortDirection", js.undefined)
    
    inline def setFirstSortDirection(value: js.Any): Self = StObject.set(x, "firstSortDirection", value.asInstanceOf[js.Any])
    
    inline def setFirstSortDirectionUndefined: Self = StObject.set(x, "firstSortDirection", js.undefined)
    
    inline def setGridOptions(value: IgPivotViewPivotGridOptionsGridOptions): Self = StObject.set(x, "gridOptions", value.asInstanceOf[js.Any])
    
    inline def setGridOptionsUndefined: Self = StObject.set(x, "gridOptions", js.undefined)
    
    inline def setHideColumnsDropArea(value: Boolean): Self = StObject.set(x, "hideColumnsDropArea", value.asInstanceOf[js.Any])
    
    inline def setHideColumnsDropAreaUndefined: Self = StObject.set(x, "hideColumnsDropArea", js.undefined)
    
    inline def setHideFiltersDropArea(value: Boolean): Self = StObject.set(x, "hideFiltersDropArea", value.asInstanceOf[js.Any])
    
    inline def setHideFiltersDropAreaUndefined: Self = StObject.set(x, "hideFiltersDropArea", js.undefined)
    
    inline def setHideMeasuresDropArea(value: Boolean): Self = StObject.set(x, "hideMeasuresDropArea", value.asInstanceOf[js.Any])
    
    inline def setHideMeasuresDropAreaUndefined: Self = StObject.set(x, "hideMeasuresDropArea", js.undefined)
    
    inline def setHideRowsDropArea(value: Boolean): Self = StObject.set(x, "hideRowsDropArea", value.asInstanceOf[js.Any])
    
    inline def setHideRowsDropAreaUndefined: Self = StObject.set(x, "hideRowsDropArea", js.undefined)
    
    inline def setIsParentInFrontForColumns(value: Boolean): Self = StObject.set(x, "isParentInFrontForColumns", value.asInstanceOf[js.Any])
    
    inline def setIsParentInFrontForColumnsUndefined: Self = StObject.set(x, "isParentInFrontForColumns", js.undefined)
    
    inline def setIsParentInFrontForRows(value: Boolean): Self = StObject.set(x, "isParentInFrontForRows", value.asInstanceOf[js.Any])
    
    inline def setIsParentInFrontForRowsUndefined: Self = StObject.set(x, "isParentInFrontForRows", js.undefined)
    
    inline def setLevelSortDirections(value: js.Array[IgPivotViewPivotGridOptionsLevelSortDirection]): Self = StObject.set(x, "levelSortDirections", value.asInstanceOf[js.Any])
    
    inline def setLevelSortDirectionsUndefined: Self = StObject.set(x, "levelSortDirections", js.undefined)
    
    inline def setLevelSortDirectionsVarargs(value: IgPivotViewPivotGridOptionsLevelSortDirection*): Self = StObject.set(x, "levelSortDirections", js.Array(value :_*))
    
    inline def setRowHeadersLayout(value: js.Any): Self = StObject.set(x, "rowHeadersLayout", value.asInstanceOf[js.Any])
    
    inline def setRowHeadersLayoutUndefined: Self = StObject.set(x, "rowHeadersLayout", js.undefined)
  }
}
