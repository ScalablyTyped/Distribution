package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridPagingLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Leading label text for the drop down from where the page index can be switched.
    *
    */
  var currentPageDropDownLeadingLabel: js.UndefOr[String] = js.native
  
  /**
    * Tooltip text for the page index drop down.
    *
    */
  var currentPageDropDownTooltip: js.UndefOr[String] = js.native
  
  /**
    * Trailing label text for the drop down from where the page index can be switched.
    *
    */
  var currentPageDropDownTrailingLabel: js.UndefOr[String] = js.native
  
  /**
    * Text for the first page label.
    *
    */
  var firstPageLabelText: js.UndefOr[String] = js.native
  
  /**
    * Tooltip text for the first page button.
    *
    */
  var firstPageTooltip: js.UndefOr[String] = js.native
  
  /**
    * Text for the last page label.
    *
    */
  var lastPageLabelText: js.UndefOr[String] = js.native
  
  /**
    * Tooltip text for the last page button.
    *
    */
  var lastPageTooltip: js.UndefOr[String] = js.native
  
  /**
    * Text for the next page label.
    *
    */
  var nextPageLabelText: js.UndefOr[String] = js.native
  
  /**
    * Tooltip text for the next page button.
    *
    */
  var nextPageTooltip: js.UndefOr[String] = js.native
  
  /**
    * Text rendered in front of the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
    *
    */
  var pageSizeDropDownLabel: js.UndefOr[String] = js.native
  
  /**
    * Tooltip text for the page size drop down.
    *
    */
  var pageSizeDropDownTooltip: js.UndefOr[String] = js.native
  
  /**
    * Trailing text for the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
    *
    */
  var pageSizeDropDownTrailingLabel: js.UndefOr[String] = js.native
  
  /**
    * Tooltip text templates of buttons that navigate to a particular page. The format string follows the [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
    * See also the [pageCountLimit](ui.iggridpaging#options:pageCountLimit) option.
    *
    */
  var pageTooltipFormat: js.UndefOr[String] = js.native
  
  /**
    * Custom pager records label template - in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
    *
    */
  var pagerRecordsLabelTemplate: js.UndefOr[String] = js.native
  
  /**
    * Tooltip text for the pager records label.
    *
    */
  var pagerRecordsLabelTooltip: js.UndefOr[String] = js.native
  
  /**
    * Text for the previous page label.
    *
    */
  var prevPageLabelText: js.UndefOr[String] = js.native
  
  /**
    * Tooltip text for the previous page button.
    *
    */
  var prevPageTooltip: js.UndefOr[String] = js.native
}
object IgGridPagingLocale {
  
  @scala.inline
  def apply(): IgGridPagingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridPagingLocale]
  }
  
  @scala.inline
  implicit class IgGridPagingLocaleOps[Self <: IgGridPagingLocale] (val x: Self) extends AnyVal {
    
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
    def setCurrentPageDropDownLeadingLabel(value: String): Self = this.set("currentPageDropDownLeadingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPageDropDownLeadingLabel: Self = this.set("currentPageDropDownLeadingLabel", js.undefined)
    
    @scala.inline
    def setCurrentPageDropDownTooltip(value: String): Self = this.set("currentPageDropDownTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPageDropDownTooltip: Self = this.set("currentPageDropDownTooltip", js.undefined)
    
    @scala.inline
    def setCurrentPageDropDownTrailingLabel(value: String): Self = this.set("currentPageDropDownTrailingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPageDropDownTrailingLabel: Self = this.set("currentPageDropDownTrailingLabel", js.undefined)
    
    @scala.inline
    def setFirstPageLabelText(value: String): Self = this.set("firstPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPageLabelText: Self = this.set("firstPageLabelText", js.undefined)
    
    @scala.inline
    def setFirstPageTooltip(value: String): Self = this.set("firstPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPageTooltip: Self = this.set("firstPageTooltip", js.undefined)
    
    @scala.inline
    def setLastPageLabelText(value: String): Self = this.set("lastPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPageLabelText: Self = this.set("lastPageLabelText", js.undefined)
    
    @scala.inline
    def setLastPageTooltip(value: String): Self = this.set("lastPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPageTooltip: Self = this.set("lastPageTooltip", js.undefined)
    
    @scala.inline
    def setNextPageLabelText(value: String): Self = this.set("nextPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageLabelText: Self = this.set("nextPageLabelText", js.undefined)
    
    @scala.inline
    def setNextPageTooltip(value: String): Self = this.set("nextPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageTooltip: Self = this.set("nextPageTooltip", js.undefined)
    
    @scala.inline
    def setPageSizeDropDownLabel(value: String): Self = this.set("pageSizeDropDownLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSizeDropDownLabel: Self = this.set("pageSizeDropDownLabel", js.undefined)
    
    @scala.inline
    def setPageSizeDropDownTooltip(value: String): Self = this.set("pageSizeDropDownTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSizeDropDownTooltip: Self = this.set("pageSizeDropDownTooltip", js.undefined)
    
    @scala.inline
    def setPageSizeDropDownTrailingLabel(value: String): Self = this.set("pageSizeDropDownTrailingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSizeDropDownTrailingLabel: Self = this.set("pageSizeDropDownTrailingLabel", js.undefined)
    
    @scala.inline
    def setPageTooltipFormat(value: String): Self = this.set("pageTooltipFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageTooltipFormat: Self = this.set("pageTooltipFormat", js.undefined)
    
    @scala.inline
    def setPagerRecordsLabelTemplate(value: String): Self = this.set("pagerRecordsLabelTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagerRecordsLabelTemplate: Self = this.set("pagerRecordsLabelTemplate", js.undefined)
    
    @scala.inline
    def setPagerRecordsLabelTooltip(value: String): Self = this.set("pagerRecordsLabelTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagerRecordsLabelTooltip: Self = this.set("pagerRecordsLabelTooltip", js.undefined)
    
    @scala.inline
    def setPrevPageLabelText(value: String): Self = this.set("prevPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevPageLabelText: Self = this.set("prevPageLabelText", js.undefined)
    
    @scala.inline
    def setPrevPageTooltip(value: String): Self = this.set("prevPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevPageTooltip: Self = this.set("prevPageTooltip", js.undefined)
  }
}
