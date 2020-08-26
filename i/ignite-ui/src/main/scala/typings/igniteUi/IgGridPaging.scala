package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridPaging
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Leading label text for the drop down from where the page index can be switched. Use option [locale.currentPageDropDownLeadingLabel](ui.iggridpaging#options:locale.currentPageDropDownLeadingLabel).
    */
  var currentPageDropDownLeadingLabel: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Tooltip text for the page index drop down. Use option [locale.currentPageDropDownTooltip](ui.iggridpaging#options:locale.currentPageDropDownTooltip).
    */
  var currentPageDropDownTooltip: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Trailing label text for the drop down from where the page index can be switched. Use option [locale.currentPageDropDownTrailingLabel](ui.iggridpaging#options:locale.currentPageDropDownTrailingLabel).
    */
  var currentPageDropDownTrailingLabel: js.UndefOr[String] = js.native
  /**
    * Current page index that's bound in the data source and rendered in the UI.
    *
    */
  var currentPageIndex: js.UndefOr[Double] = js.native
  /**
    * Drop down width for the page size and page index drop downs.
    *
    */
  var defaultDropDownWidth: js.UndefOr[Double] = js.native
  /**
    * Time in milliseconds for which page drop down will wait for keystrokes before changing the page.
    *
    */
  var delayOnPageChanged: js.UndefOr[Double] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Text for the first page label. Use option [locale.firstPageLabelText](ui.iggridpaging#options:locale.firstPageLabelText).
    */
  var firstPageLabelText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Tooltip text for the first page button. Use option [locale.firstPageTooltip](ui.iggridpaging#options:locale.firstPageTooltip).
    */
  var firstPageTooltip: js.UndefOr[String] = js.native
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    *
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Text for the last page label. Use option [locale.lastPageLabelText](ui.iggridpaging#options:locale.lastPageLabelText).
    */
  var lastPageLabelText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Tooltip text for the last page button. Use option [locale.lastPageTooltip](ui.iggridpaging#options:locale.lastPageTooltip).
    */
  var lastPageTooltip: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgGridPagingLocale] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Text for the next page label. Use option [locale.nextPageLabelText](ui.iggridpaging#options:locale.nextPageLabelText).
    */
  var nextPageLabelText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Tooltip text for the next page button. Use option [locale.nextPageTooltip](ui.iggridpaging#options:locale.nextPageTooltip).
    */
  var nextPageTooltip: js.UndefOr[String] = js.native
  /**
    * Sets/Gets the number of pages which if exceeded a drop down list of page indices is displayed. If the number of pages is less than or equal to this option then buttons for each page are displayed.
    *
    */
  var pageCountLimit: js.UndefOr[Double] = js.native
  /**
    * Event fired after the page index is changed , but before grid data rebinds
    */
  var pageIndexChanged: js.UndefOr[PageIndexChangedEvent] = js.native
  /**
    * Event fired before the page index is changed.
    * Return false in order to cancel page index changing.
    */
  var pageIndexChanging: js.UndefOr[PageIndexChangingEvent] = js.native
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested page index.
    *
    */
  var pageIndexUrlKey: js.UndefOr[String] = js.native
  /**
    * Number of records loaded and displayed per page.
    *
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Event fired after the page size is changed from the page size dropdown.
    */
  var pageSizeChanged: js.UndefOr[PageSizeChangedEvent] = js.native
  /**
    * Event fired when the page size is about to be changed from the page size dropdown.
    * Return false in order to cancel page size changing.
    */
  var pageSizeChanging: js.UndefOr[PageSizeChangingEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Text rendered in front of the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
    * Use option [locale.pageSizeDropDownLabel](ui.iggridpaging#options:locale.pageSizeDropDownLabel).
    */
  var pageSizeDropDownLabel: js.UndefOr[String] = js.native
  /**
    * Page size dropdown location, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true. Can be rendered above the grid header or inside the pager, next to the page links.
    *
    *
    * Valid values:
    * "above" The page size drop down will be rendered above the grid header.
    * "inpager" The page size drop down will be rendered next to page links.
    */
  var pageSizeDropDownLocation: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Tooltip text for the page size drop down. Use option [locale.pageSizeDropDownTooltip](ui.iggridpaging#options:locale.pageSizeDropDownTooltip).
    */
  var pageSizeDropDownTooltip: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Trailing text for the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
    * Use option [locale.pageSizeDropDownTrailingLabel](ui.iggridpaging#options:locale.pageSizeDropDownTrailingLabel).
    */
  var pageSizeDropDownTrailingLabel: js.UndefOr[String] = js.native
  /**
    * Predefined page sizes that are available to the end user to switch their grid paging to, through a drop down in the grid header.
    *
    */
  var pageSizeList: js.UndefOr[js.Any] = js.native
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested page size.
    *
    */
  var pageSizeUrlKey: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Tooltip text templates of buttons that navigate to a particular page. The format string follows the [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax. See also the [pageCountLimit](ui.iggridpaging#options:pageCountLimit) option.
    * Use option [locale.pageTooltipFormat](ui.iggridpaging#options:locale.pageTooltipFormat).
    */
  var pageTooltipFormat: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Custom pager records label template - in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
    * Use option [locale.pagerRecordsLabelTemplate](ui.iggridpaging#options:locale.pagerRecordsLabelTemplate).
    */
  var pagerRecordsLabelTemplate: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Tooltip text for the pager records label. Use option [locale.pagerRecordsLabelTooltip](ui.iggridpaging#options:locale.pagerRecordsLabelTooltip).
    */
  var pagerRecordsLabelTooltip: js.UndefOr[String] = js.native
  /**
    * Event fired after the pager footer is rendered
    */
  var pagerRendered: js.UndefOr[PagerRenderedEvent] = js.native
  /**
    * Event fired before the pager footer is rendered (the whole area below the grid records).
    *  Event fired after the page size is changed from the page size dropdown.
    */
  var pagerRendering: js.UndefOr[PagerRenderingEvent] = js.native
  /**
    * Enables/disables paging persistence between states.
    *
    */
  var persist: js.UndefOr[Boolean] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Text for the previous page label. Use option [locale.prevPageLabelText](ui.iggridpaging#options:locale.prevPageLabelText).
    */
  var prevPageLabelText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Tooltip text for the previous page button. Use option [locale.prevPageTooltip](ui.iggridpaging#options:locale.prevPageTooltip).
    */
  var prevPageTooltip: js.UndefOr[String] = js.native
  /**
    * The property in the response data, when using remote data source, that will hold the total number of records in the data source.
    *
    */
  var recordCountKey: js.UndefOr[String] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Option specifying whether to render the first and last page navigation buttons.
    *
    */
  var showFirstLastPages: js.UndefOr[Boolean] = js.native
  /**
    * If false, a dropdown allowing to change the page size will not be rendered in the UI.
    *
    */
  var showPageSizeDropDown: js.UndefOr[Boolean] = js.native
  /**
    * Option specifying whether to show summary label for the currently rendered records or not.
    *
    */
  var showPagerRecordsLabel: js.UndefOr[Boolean] = js.native
  /**
    * Option specifying whether to render the previous and next page navigation buttons.
    *
    */
  var showPrevNextPages: js.UndefOr[Boolean] = js.native
  /**
    * Type of paging. Delegates all paging functionality to the [$.ig.DataSource](ig.datasource).
    *
    *
    * Valid values:
    * "remote" Paging is performed by a remote end-point.
    * "local" Paging is performed locally by the [$.ig.DataSource](ig.datasource).
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Number of page buttons, adjacent to and including the [active page](ui.iggridpaging#options:currentPageIndex), that are constantly visible. For the invisible pages, previous and next buttons are used.
    *
    */
  var visiblePageCount: js.UndefOr[Double] = js.native
}

object IgGridPaging {
  @scala.inline
  def apply(): IgGridPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridPaging]
  }
  @scala.inline
  implicit class IgGridPagingOps[Self <: IgGridPaging] (val x: Self) extends AnyVal {
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
    def setCurrentPageIndex(value: Double): Self = this.set("currentPageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPageIndex: Self = this.set("currentPageIndex", js.undefined)
    @scala.inline
    def setDefaultDropDownWidth(value: Double): Self = this.set("defaultDropDownWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDropDownWidth: Self = this.set("defaultDropDownWidth", js.undefined)
    @scala.inline
    def setDelayOnPageChanged(value: Double): Self = this.set("delayOnPageChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayOnPageChanged: Self = this.set("delayOnPageChanged", js.undefined)
    @scala.inline
    def setFirstPageLabelText(value: String): Self = this.set("firstPageLabelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageLabelText: Self = this.set("firstPageLabelText", js.undefined)
    @scala.inline
    def setFirstPageTooltip(value: String): Self = this.set("firstPageTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageTooltip: Self = this.set("firstPageTooltip", js.undefined)
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLastPageLabelText(value: String): Self = this.set("lastPageLabelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPageLabelText: Self = this.set("lastPageLabelText", js.undefined)
    @scala.inline
    def setLastPageTooltip(value: String): Self = this.set("lastPageTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPageTooltip: Self = this.set("lastPageTooltip", js.undefined)
    @scala.inline
    def setLocale(value: IgGridPagingLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setNextPageLabelText(value: String): Self = this.set("nextPageLabelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageLabelText: Self = this.set("nextPageLabelText", js.undefined)
    @scala.inline
    def setNextPageTooltip(value: String): Self = this.set("nextPageTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageTooltip: Self = this.set("nextPageTooltip", js.undefined)
    @scala.inline
    def setPageCountLimit(value: Double): Self = this.set("pageCountLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageCountLimit: Self = this.set("pageCountLimit", js.undefined)
    @scala.inline
    def setPageIndexChanged(value: (/* event */ Event, /* ui */ PageIndexChangedEventUIParam) => Unit): Self = this.set("pageIndexChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deletePageIndexChanged: Self = this.set("pageIndexChanged", js.undefined)
    @scala.inline
    def setPageIndexChanging(value: (/* event */ Event, /* ui */ PageIndexChangingEventUIParam) => Unit): Self = this.set("pageIndexChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deletePageIndexChanging: Self = this.set("pageIndexChanging", js.undefined)
    @scala.inline
    def setPageIndexUrlKey(value: String): Self = this.set("pageIndexUrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageIndexUrlKey: Self = this.set("pageIndexUrlKey", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageSizeChanged(value: (/* event */ Event, /* ui */ PageSizeChangedEventUIParam) => Unit): Self = this.set("pageSizeChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deletePageSizeChanged: Self = this.set("pageSizeChanged", js.undefined)
    @scala.inline
    def setPageSizeChanging(value: (/* event */ Event, /* ui */ PageSizeChangingEventUIParam) => Unit): Self = this.set("pageSizeChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deletePageSizeChanging: Self = this.set("pageSizeChanging", js.undefined)
    @scala.inline
    def setPageSizeDropDownLabel(value: String): Self = this.set("pageSizeDropDownLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeDropDownLabel: Self = this.set("pageSizeDropDownLabel", js.undefined)
    @scala.inline
    def setPageSizeDropDownLocation(value: String): Self = this.set("pageSizeDropDownLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeDropDownLocation: Self = this.set("pageSizeDropDownLocation", js.undefined)
    @scala.inline
    def setPageSizeDropDownTooltip(value: String): Self = this.set("pageSizeDropDownTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeDropDownTooltip: Self = this.set("pageSizeDropDownTooltip", js.undefined)
    @scala.inline
    def setPageSizeDropDownTrailingLabel(value: String): Self = this.set("pageSizeDropDownTrailingLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeDropDownTrailingLabel: Self = this.set("pageSizeDropDownTrailingLabel", js.undefined)
    @scala.inline
    def setPageSizeList(value: js.Any): Self = this.set("pageSizeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeList: Self = this.set("pageSizeList", js.undefined)
    @scala.inline
    def setPageSizeUrlKey(value: String): Self = this.set("pageSizeUrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeUrlKey: Self = this.set("pageSizeUrlKey", js.undefined)
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
    def setPagerRendered(value: (/* event */ Event, /* ui */ PagerRenderedEventUIParam) => Unit): Self = this.set("pagerRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deletePagerRendered: Self = this.set("pagerRendered", js.undefined)
    @scala.inline
    def setPagerRendering(value: (/* event */ Event, /* ui */ PagerRenderingEventUIParam) => Unit): Self = this.set("pagerRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deletePagerRendering: Self = this.set("pagerRendering", js.undefined)
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    @scala.inline
    def setPrevPageLabelText(value: String): Self = this.set("prevPageLabelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevPageLabelText: Self = this.set("prevPageLabelText", js.undefined)
    @scala.inline
    def setPrevPageTooltip(value: String): Self = this.set("prevPageTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevPageTooltip: Self = this.set("prevPageTooltip", js.undefined)
    @scala.inline
    def setRecordCountKey(value: String): Self = this.set("recordCountKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordCountKey: Self = this.set("recordCountKey", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setShowFirstLastPages(value: Boolean): Self = this.set("showFirstLastPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFirstLastPages: Self = this.set("showFirstLastPages", js.undefined)
    @scala.inline
    def setShowPageSizeDropDown(value: Boolean): Self = this.set("showPageSizeDropDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPageSizeDropDown: Self = this.set("showPageSizeDropDown", js.undefined)
    @scala.inline
    def setShowPagerRecordsLabel(value: Boolean): Self = this.set("showPagerRecordsLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPagerRecordsLabel: Self = this.set("showPagerRecordsLabel", js.undefined)
    @scala.inline
    def setShowPrevNextPages(value: Boolean): Self = this.set("showPrevNextPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPrevNextPages: Self = this.set("showPrevNextPages", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisiblePageCount(value: Double): Self = this.set("visiblePageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisiblePageCount: Self = this.set("visiblePageCount", js.undefined)
  }
  
}

