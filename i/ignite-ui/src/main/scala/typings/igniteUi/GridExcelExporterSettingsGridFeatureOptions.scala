package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridExcelExporterSettingsGridFeatureOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Indicates whether fixed columns will be applied in the exported table. This is set to none by default, but will change to applied if column fixing feature is defined in the igGrid.
    *
    *
    * Valid values:
    * "none" No column fixing will be applied in the excel document.
    * "applied" Column fixing will be applied in the excel document.
    */
  var columnfixing: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether filtering will be applied in the exported table. this is set to none by default, but will change to applied if filtering feature is defined in the igGrid.
    *
    *
    * Valid values:
    * "none" No filtering will be applied in the excel document.
    * "applied" Filtering will be applied in the excel document.
    * "filteredRowsOnly" Filtering will be exported in the excel document.
    */
  var filtering: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether hidden columns will be removed from the exported table. This is set to none by default, but will change to applied if hiding feature is defined in the igGrid.
    *
    *
    * Valid values:
    * "none" All hidden columns will be exported to the excel document.
    * "applied" Hidden columns will be exported as hidden in the excel document.
    * "visibleColumnsOnly" Only visible columns will be exported.
    */
  var hiding: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the rows on the current page or entire data will exported.
    *
    *
    * Valid values:
    * "currentPage" Only current page will be exported to the excel document.
    * "allRows" All pages will be exported to the excel document.
    */
  var paging: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether sorting will be applied in the exported table. This is set_ to none by default, but will change to applied if sorting feature is defined in the igGrid.
    *
    *
    * Valid values:
    * "none" No sorting will be applied in the excel document.
    * "applied" Sorting will be applied in the excel document.
    */
  var sorting: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether summaries will be added in the exported table. This is set to none by default, but will change to applied if summaries feature is defined in the igGrid.
    *
    *
    * Valid values:
    * "none" No summaries will be exported to the excel document.
    * "applied" Summaries will be exported to the excel document.
    */
  var summaries: js.UndefOr[String] = js.undefined
}
object GridExcelExporterSettingsGridFeatureOptions {
  
  inline def apply(): GridExcelExporterSettingsGridFeatureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridExcelExporterSettingsGridFeatureOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridExcelExporterSettingsGridFeatureOptions] (val x: Self) extends AnyVal {
    
    inline def setColumnfixing(value: String): Self = StObject.set(x, "columnfixing", value.asInstanceOf[js.Any])
    
    inline def setColumnfixingUndefined: Self = StObject.set(x, "columnfixing", js.undefined)
    
    inline def setFiltering(value: String): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
    
    inline def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    inline def setHiding(value: String): Self = StObject.set(x, "hiding", value.asInstanceOf[js.Any])
    
    inline def setHidingUndefined: Self = StObject.set(x, "hiding", js.undefined)
    
    inline def setPaging(value: String): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setSorting(value: String): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    inline def setSummaries(value: String): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
  }
}
