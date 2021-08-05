package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridGroupByColumnSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Enables/disables grouping a column from the UI. By default all columns can be grouped.
    *
    */
  var allowGrouping: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Reference/name of a function (string or function) used for custom comparison.
    * The function accepts the following arguments:
    * val1 - the first value to compare
    * val2 - the second value to compare
    * recordsData - an object having three properties: fieldName - the name of the sorted field; record1 - first record to compare; record2 - second record to compare
    * The function returns the following numeric value:
    * 0 - indicating that values are equal
    * 1 - indicating that val1 > val2
    * -1 - indicating that val1 < val2
    *
    *
    * Valid values:
    * "string" the name of the function as a string located in the global window object.
    * "function" function which will be used for custom comparison.
    */
  var compareFunc: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the sort order - ascending or descending when the column is initially grouped ([isGroupBy](ui.iggridgroupby#options:columnSettings.isGroupBy) = true).
    *
    */
  var dir: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Specifies a custom group by function, which accepts the column setting, the first and the second value to compare and returns bool. This option is deprecated - please use option [compareFunc](ui.iggridgroupby#options:columnSettings.compareFunc) instead.
    */
  var groupComparerFunction: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Reference/name of a function (string or function) which will be used for formatting the cell values. The function should accept a value from the grouped column and return the new formatted value in the label of the row.
    *
    *
    * Valid values:
    * "string" the name of the function as a string located in the global window object.
    * "function" which will be used for formatting the cell values.
    */
  var groupLabelFormatter: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Enables/disables default summaries per group data island or specifies summaries that are applied to specific column no matter the group.
    *
    */
  var groupSummaries: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Specifies the initial column grouped state.
    *
    */
  var isGroupBy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of aggregation functions to calculate on the column values for each group. When not specified the default aggregate function is "count".
    *
    */
  var summaries: js.UndefOr[IgGridGroupByColumnSettingsSummaries] = js.undefined
}
object IgGridGroupByColumnSettings {
  
  inline def apply(): IgGridGroupByColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupByColumnSettings]
  }
  
  extension [Self <: IgGridGroupByColumnSettings](x: Self) {
    
    inline def setAllowGrouping(value: Boolean): Self = StObject.set(x, "allowGrouping", value.asInstanceOf[js.Any])
    
    inline def setAllowGroupingUndefined: Self = StObject.set(x, "allowGrouping", js.undefined)
    
    inline def setCompareFunc(value: String | js.Function): Self = StObject.set(x, "compareFunc", value.asInstanceOf[js.Any])
    
    inline def setCompareFuncUndefined: Self = StObject.set(x, "compareFunc", js.undefined)
    
    inline def setDir(value: js.Any): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setGroupComparerFunction(value: js.Function): Self = StObject.set(x, "groupComparerFunction", value.asInstanceOf[js.Any])
    
    inline def setGroupComparerFunctionUndefined: Self = StObject.set(x, "groupComparerFunction", js.undefined)
    
    inline def setGroupLabelFormatter(value: String | js.Function): Self = StObject.set(x, "groupLabelFormatter", value.asInstanceOf[js.Any])
    
    inline def setGroupLabelFormatterUndefined: Self = StObject.set(x, "groupLabelFormatter", js.undefined)
    
    inline def setGroupSummaries(value: js.Any): Self = StObject.set(x, "groupSummaries", value.asInstanceOf[js.Any])
    
    inline def setGroupSummariesUndefined: Self = StObject.set(x, "groupSummaries", js.undefined)
    
    inline def setIsGroupBy(value: Boolean): Self = StObject.set(x, "isGroupBy", value.asInstanceOf[js.Any])
    
    inline def setIsGroupByUndefined: Self = StObject.set(x, "isGroupBy", js.undefined)
    
    inline def setSummaries(value: IgGridGroupByColumnSettingsSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
  }
}
