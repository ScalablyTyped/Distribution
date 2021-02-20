package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class IgGridPagingLocaleMutableBuilder[Self <: IgGridPagingLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPageDropDownLeadingLabel(value: String): Self = StObject.set(x, "currentPageDropDownLeadingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageDropDownLeadingLabelUndefined: Self = StObject.set(x, "currentPageDropDownLeadingLabel", js.undefined)
    
    @scala.inline
    def setCurrentPageDropDownTooltip(value: String): Self = StObject.set(x, "currentPageDropDownTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageDropDownTooltipUndefined: Self = StObject.set(x, "currentPageDropDownTooltip", js.undefined)
    
    @scala.inline
    def setCurrentPageDropDownTrailingLabel(value: String): Self = StObject.set(x, "currentPageDropDownTrailingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageDropDownTrailingLabelUndefined: Self = StObject.set(x, "currentPageDropDownTrailingLabel", js.undefined)
    
    @scala.inline
    def setFirstPageLabelText(value: String): Self = StObject.set(x, "firstPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageLabelTextUndefined: Self = StObject.set(x, "firstPageLabelText", js.undefined)
    
    @scala.inline
    def setFirstPageTooltip(value: String): Self = StObject.set(x, "firstPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageTooltipUndefined: Self = StObject.set(x, "firstPageTooltip", js.undefined)
    
    @scala.inline
    def setLastPageLabelText(value: String): Self = StObject.set(x, "lastPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPageLabelTextUndefined: Self = StObject.set(x, "lastPageLabelText", js.undefined)
    
    @scala.inline
    def setLastPageTooltip(value: String): Self = StObject.set(x, "lastPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPageTooltipUndefined: Self = StObject.set(x, "lastPageTooltip", js.undefined)
    
    @scala.inline
    def setNextPageLabelText(value: String): Self = StObject.set(x, "nextPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageLabelTextUndefined: Self = StObject.set(x, "nextPageLabelText", js.undefined)
    
    @scala.inline
    def setNextPageTooltip(value: String): Self = StObject.set(x, "nextPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTooltipUndefined: Self = StObject.set(x, "nextPageTooltip", js.undefined)
    
    @scala.inline
    def setPageSizeDropDownLabel(value: String): Self = StObject.set(x, "pageSizeDropDownLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeDropDownLabelUndefined: Self = StObject.set(x, "pageSizeDropDownLabel", js.undefined)
    
    @scala.inline
    def setPageSizeDropDownTooltip(value: String): Self = StObject.set(x, "pageSizeDropDownTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeDropDownTooltipUndefined: Self = StObject.set(x, "pageSizeDropDownTooltip", js.undefined)
    
    @scala.inline
    def setPageSizeDropDownTrailingLabel(value: String): Self = StObject.set(x, "pageSizeDropDownTrailingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeDropDownTrailingLabelUndefined: Self = StObject.set(x, "pageSizeDropDownTrailingLabel", js.undefined)
    
    @scala.inline
    def setPageTooltipFormat(value: String): Self = StObject.set(x, "pageTooltipFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTooltipFormatUndefined: Self = StObject.set(x, "pageTooltipFormat", js.undefined)
    
    @scala.inline
    def setPagerRecordsLabelTemplate(value: String): Self = StObject.set(x, "pagerRecordsLabelTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerRecordsLabelTemplateUndefined: Self = StObject.set(x, "pagerRecordsLabelTemplate", js.undefined)
    
    @scala.inline
    def setPagerRecordsLabelTooltip(value: String): Self = StObject.set(x, "pagerRecordsLabelTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerRecordsLabelTooltipUndefined: Self = StObject.set(x, "pagerRecordsLabelTooltip", js.undefined)
    
    @scala.inline
    def setPrevPageLabelText(value: String): Self = StObject.set(x, "prevPageLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPageLabelTextUndefined: Self = StObject.set(x, "prevPageLabelText", js.undefined)
    
    @scala.inline
    def setPrevPageTooltip(value: String): Self = StObject.set(x, "prevPageTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPageTooltipUndefined: Self = StObject.set(x, "prevPageTooltip", js.undefined)
  }
}
