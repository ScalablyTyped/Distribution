package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridSortingColumnSetting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Enables/disables sorting on the specified column. By default all columns are sortable.
    *
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies the grid column by index. Either key or index must be set in every column setting.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies the grid column by key. Either key or index must be set in every column setting.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to a function (string or function) used for custom comparison.
    * The function accepts the following arguments:
    * val1 - the first value to compare,
    * val2 - the second value to compare,
    * recordsData (optional) - an object having three properties: fieldName - the name of the sorted field; record1 - first record to compare; record2 - second record to compare.
    * The function returns the following numeric value:
    * 0 - indicating that values are equal,
    * 1 - indicating that val1 > val2,
    * -1 - indicating that val1 < val2.
    *
    *
    * Valid values:
    * "string" The name of the function as a string located in the global window object.
    * "function" Function which will be used for custom comparison.
    */
  var compareFunc: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * The current (or default) sort direction. If this setting is specified, the column will be rendered sorted according to this option.
    *
    *
    * Valid values:
    * "asc" The initial sort of the column data will be in ascending order.
    * "desc" The initial sort of the column data will be in descending order.
    */
  var currentSortDirection: js.UndefOr[String] = js.undefined
  
  /**
    * This will be the first sort direction when the column hasn't been sorted before.
    *
    *
    * Valid values:
    * "asc" The first sort of the column data will be in ascending order.
    * "desc" The first sort of the column data will be in descending order.
    */
  var firstSortDirection: js.UndefOr[String] = js.undefined
}
object IgGridSortingColumnSetting {
  
  @scala.inline
  def apply(): IgGridSortingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSortingColumnSetting]
  }
  
  @scala.inline
  implicit class IgGridSortingColumnSettingMutableBuilder[Self <: IgGridSortingColumnSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setCompareFunc(value: String | js.Function): Self = StObject.set(x, "compareFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareFuncUndefined: Self = StObject.set(x, "compareFunc", js.undefined)
    
    @scala.inline
    def setCurrentSortDirection(value: String): Self = StObject.set(x, "currentSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSortDirectionUndefined: Self = StObject.set(x, "currentSortDirection", js.undefined)
    
    @scala.inline
    def setFirstSortDirection(value: String): Self = StObject.set(x, "firstSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSortDirectionUndefined: Self = StObject.set(x, "firstSortDirection", js.undefined)
  }
}
