package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridExcelExporterSettingsGridFeatureOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Indicates whether fixed columns will be applied in the exported table. This is set to none by default, but will change to applied if column fixing feature is defined in the igGrid.
    *
    *
    * Valid values:
    * "none" No column fixing will be applied in the excel document.
    * "applied" Column fixing will be applied in the excel document.
    */
  var columnfixing: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether filtering will be applied in the exported table. this is set to none by default, but will change to applied if filtering feature is defined in the igGrid.
    *
    *
    * Valid values:
    * "none" No filtering will be applied in the excel document.
    * "applied" Filtering will be applied in the excel document.
    * "filteredRowsOnly" Filtering will be exported in the excel document.
    */
  var filtering: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether hidden columns will be removed from the exported table. This is set to none by default, but will change to applied if hiding feature is defined in the igGrid.
    *
    *
    * Valid values:
    * "none" All hidden columns will be exported to the excel document.
    * "applied" Hidden columns will be exported as hidden in the excel document.
    * "visibleColumnsOnly" Only visible columns will be exported.
    */
  var hiding: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the rows on the current page or entire data will exported.
    *
    *
    * Valid values:
    * "currentPage" Only current page will be exported to the excel document.
    * "allRows" All pages will be exported to the excel document.
    */
  var paging: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether sorting will be applied in the exported table. This is set_ to none by default, but will change to applied if sorting feature is defined in the igGrid.
    *
    *
    * Valid values:
    * "none" No sorting will be applied in the excel document.
    * "applied" Sorting will be applied in the excel document.
    */
  var sorting: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether summaries will be added in the exported table. This is set to none by default, but will change to applied if summaries feature is defined in the igGrid.
    *
    *
    * Valid values:
    * "none" No summaries will be exported to the excel document.
    * "applied" Summaries will be exported to the excel document.
    */
  var summaries: js.UndefOr[String] = js.native
}
object GridExcelExporterSettingsGridFeatureOptions {
  
  @scala.inline
  def apply(): GridExcelExporterSettingsGridFeatureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridExcelExporterSettingsGridFeatureOptions]
  }
  
  @scala.inline
  implicit class GridExcelExporterSettingsGridFeatureOptionsOps[Self <: GridExcelExporterSettingsGridFeatureOptions] (val x: Self) extends AnyVal {
    
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
    def setColumnfixing(value: String): Self = this.set("columnfixing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnfixing: Self = this.set("columnfixing", js.undefined)
    
    @scala.inline
    def setFiltering(value: String): Self = this.set("filtering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    
    @scala.inline
    def setHiding(value: String): Self = this.set("hiding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiding: Self = this.set("hiding", js.undefined)
    
    @scala.inline
    def setPaging(value: String): Self = this.set("paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    
    @scala.inline
    def setSorting(value: String): Self = this.set("sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    
    @scala.inline
    def setSummaries(value: String): Self = this.set("summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaries: Self = this.set("summaries", js.undefined)
  }
}
