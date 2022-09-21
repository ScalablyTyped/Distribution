package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotDataSelectorDataSourceOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * A list of hierarchy names separated by comma (,). These will be the hierarchies in the columns of the data source.
    */
  var columns: js.UndefOr[String] = js.undefined
  
  /**
    * A list of hierarchy names separated by comma (,). These will be hierarchies in the filters of the data source.
    */
  var filters: js.UndefOr[String] = js.undefined
  
  /**
    * Settings for creating an instance of $.ig.OlapFlatDataSource.
    */
  var flatDataOptions: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptions] = js.undefined
  
  /**
    * A list of measure names separated by comma (,). These will be the measures of the data source.
    */
  var measures: js.UndefOr[String] = js.undefined
  
  /**
    * A list of hierarchy names separated by comma (,). These will be the hierarchies in the rows of the data source.
    */
  var rows: js.UndefOr[String] = js.undefined
  
  /**
    * Settings for creating an instance of $.ig.OlapXmlaDataSource.
    */
  var xmlaOptions: js.UndefOr[IgPivotDataSelectorDataSourceOptionsXmlaOptions] = js.undefined
}
object IgPivotDataSelectorDataSourceOptions {
  
  inline def apply(): IgPivotDataSelectorDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptions]
  }
  
  extension [Self <: IgPivotDataSelectorDataSourceOptions](x: Self) {
    
    inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFlatDataOptions(value: IgPivotDataSelectorDataSourceOptionsFlatDataOptions): Self = StObject.set(x, "flatDataOptions", value.asInstanceOf[js.Any])
    
    inline def setFlatDataOptionsUndefined: Self = StObject.set(x, "flatDataOptions", js.undefined)
    
    inline def setMeasures(value: String): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    inline def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setXmlaOptions(value: IgPivotDataSelectorDataSourceOptionsXmlaOptions): Self = StObject.set(x, "xmlaOptions", value.asInstanceOf[js.Any])
    
    inline def setXmlaOptionsUndefined: Self = StObject.set(x, "xmlaOptions", js.undefined)
  }
}
