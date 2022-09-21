package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeGridFilteringLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Template that is used when filtering is applied and paging is enabled and user goes to another page. It takes precedence over the pagerRecordsLabelTemplate(option from igTreeGridPaging). If it is set to null then it is taken option from igTreeGridPaging.
    * Supported options:
    * ${currentPageMatches} (filtering)
    * ${totalMatches} (filtering)
    * ${startRecord} (paging)
    * ${endRecord} (paging)
    * ${recordCount} (paging)
    *
    */
  var filterSummaryInPagerTemplate: js.UndefOr[String] = js.undefined
}
object IgTreeGridFilteringLocale {
  
  inline def apply(): IgTreeGridFilteringLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridFilteringLocale]
  }
  
  extension [Self <: IgTreeGridFilteringLocale](x: Self) {
    
    inline def setFilterSummaryInPagerTemplate(value: String): Self = StObject.set(x, "filterSummaryInPagerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFilterSummaryInPagerTemplateUndefined: Self = StObject.set(x, "filterSummaryInPagerTemplate", js.undefined)
  }
}
