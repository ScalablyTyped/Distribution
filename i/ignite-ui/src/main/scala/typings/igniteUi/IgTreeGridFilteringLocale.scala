package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridFilteringLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
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
  var filterSummaryInPagerTemplate: js.UndefOr[String] = js.native
}
object IgTreeGridFilteringLocale {
  
  @scala.inline
  def apply(): IgTreeGridFilteringLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridFilteringLocale]
  }
  
  @scala.inline
  implicit class IgTreeGridFilteringLocaleOps[Self <: IgTreeGridFilteringLocale] (val x: Self) extends AnyVal {
    
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
    def setFilterSummaryInPagerTemplate(value: String): Self = this.set("filterSummaryInPagerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterSummaryInPagerTemplate: Self = this.set("filterSummaryInPagerTemplate", js.undefined)
  }
}
