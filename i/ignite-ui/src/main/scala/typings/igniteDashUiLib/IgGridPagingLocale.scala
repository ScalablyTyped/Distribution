package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridPagingLocale
  extends /**
	 * Option for IgGridPagingLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Leading label text for the drop down from where the page index can be switched.
  	 *
  	 */
  var currentPageDropDownLeadingLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Tooltip text for the page index drop down.
  	 *
  	 */
  var currentPageDropDownTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Trailing label text for the drop down from where the page index can be switched.
  	 *
  	 */
  var currentPageDropDownTrailingLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text for the first page label.
  	 *
  	 */
  var firstPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Tooltip text for the first page button.
  	 *
  	 */
  var firstPageTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text for the last page label.
  	 *
  	 */
  var lastPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Tooltip text for the last page button.
  	 *
  	 */
  var lastPageTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text for the next page label.
  	 *
  	 */
  var nextPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Tooltip text for the next page button.
  	 *
  	 */
  var nextPageTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text rendered in front of the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
  	 *
  	 */
  var pageSizeDropDownLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Tooltip text for the page size drop down.
  	 *
  	 */
  var pageSizeDropDownTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Trailing text for the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
  	 *
  	 */
  var pageSizeDropDownTrailingLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Tooltip text templates of buttons that navigate to a particular page. The format string follows the [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
  	 * See also the [pageCountLimit](ui.iggridpaging#options:pageCountLimit) option.
  	 *
  	 */
  var pageTooltipFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Custom pager records label template - in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
  	 *
  	 */
  var pagerRecordsLabelTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Tooltip text for the pager records label.
  	 *
  	 */
  var pagerRecordsLabelTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text for the previous page label.
  	 *
  	 */
  var prevPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Tooltip text for the previous page button.
  	 *
  	 */
  var prevPageTooltip: js.UndefOr[java.lang.String] = js.undefined
}

object IgGridPagingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridPagingLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    currentPageDropDownLeadingLabel: java.lang.String = null,
    currentPageDropDownTooltip: java.lang.String = null,
    currentPageDropDownTrailingLabel: java.lang.String = null,
    firstPageLabelText: java.lang.String = null,
    firstPageTooltip: java.lang.String = null,
    lastPageLabelText: java.lang.String = null,
    lastPageTooltip: java.lang.String = null,
    nextPageLabelText: java.lang.String = null,
    nextPageTooltip: java.lang.String = null,
    pageSizeDropDownLabel: java.lang.String = null,
    pageSizeDropDownTooltip: java.lang.String = null,
    pageSizeDropDownTrailingLabel: java.lang.String = null,
    pageTooltipFormat: java.lang.String = null,
    pagerRecordsLabelTemplate: java.lang.String = null,
    pagerRecordsLabelTooltip: java.lang.String = null,
    prevPageLabelText: java.lang.String = null,
    prevPageTooltip: java.lang.String = null
  ): IgGridPagingLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (currentPageDropDownLeadingLabel != null) __obj.updateDynamic("currentPageDropDownLeadingLabel")(currentPageDropDownLeadingLabel)
    if (currentPageDropDownTooltip != null) __obj.updateDynamic("currentPageDropDownTooltip")(currentPageDropDownTooltip)
    if (currentPageDropDownTrailingLabel != null) __obj.updateDynamic("currentPageDropDownTrailingLabel")(currentPageDropDownTrailingLabel)
    if (firstPageLabelText != null) __obj.updateDynamic("firstPageLabelText")(firstPageLabelText)
    if (firstPageTooltip != null) __obj.updateDynamic("firstPageTooltip")(firstPageTooltip)
    if (lastPageLabelText != null) __obj.updateDynamic("lastPageLabelText")(lastPageLabelText)
    if (lastPageTooltip != null) __obj.updateDynamic("lastPageTooltip")(lastPageTooltip)
    if (nextPageLabelText != null) __obj.updateDynamic("nextPageLabelText")(nextPageLabelText)
    if (nextPageTooltip != null) __obj.updateDynamic("nextPageTooltip")(nextPageTooltip)
    if (pageSizeDropDownLabel != null) __obj.updateDynamic("pageSizeDropDownLabel")(pageSizeDropDownLabel)
    if (pageSizeDropDownTooltip != null) __obj.updateDynamic("pageSizeDropDownTooltip")(pageSizeDropDownTooltip)
    if (pageSizeDropDownTrailingLabel != null) __obj.updateDynamic("pageSizeDropDownTrailingLabel")(pageSizeDropDownTrailingLabel)
    if (pageTooltipFormat != null) __obj.updateDynamic("pageTooltipFormat")(pageTooltipFormat)
    if (pagerRecordsLabelTemplate != null) __obj.updateDynamic("pagerRecordsLabelTemplate")(pagerRecordsLabelTemplate)
    if (pagerRecordsLabelTooltip != null) __obj.updateDynamic("pagerRecordsLabelTooltip")(pagerRecordsLabelTooltip)
    if (prevPageLabelText != null) __obj.updateDynamic("prevPageLabelText")(prevPageLabelText)
    if (prevPageTooltip != null) __obj.updateDynamic("prevPageTooltip")(prevPageTooltip)
    __obj.asInstanceOf[IgGridPagingLocale]
  }
}

