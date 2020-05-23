package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridPagingLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Leading label text for the drop down from where the page index can be switched.
    *
    */
  var currentPageDropDownLeadingLabel: js.UndefOr[String] = js.undefined
  /**
    * Tooltip text for the page index drop down.
    *
    */
  var currentPageDropDownTooltip: js.UndefOr[String] = js.undefined
  /**
    * Trailing label text for the drop down from where the page index can be switched.
    *
    */
  var currentPageDropDownTrailingLabel: js.UndefOr[String] = js.undefined
  /**
    * Text for the first page label.
    *
    */
  var firstPageLabelText: js.UndefOr[String] = js.undefined
  /**
    * Tooltip text for the first page button.
    *
    */
  var firstPageTooltip: js.UndefOr[String] = js.undefined
  /**
    * Text for the last page label.
    *
    */
  var lastPageLabelText: js.UndefOr[String] = js.undefined
  /**
    * Tooltip text for the last page button.
    *
    */
  var lastPageTooltip: js.UndefOr[String] = js.undefined
  /**
    * Text for the next page label.
    *
    */
  var nextPageLabelText: js.UndefOr[String] = js.undefined
  /**
    * Tooltip text for the next page button.
    *
    */
  var nextPageTooltip: js.UndefOr[String] = js.undefined
  /**
    * Text rendered in front of the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
    *
    */
  var pageSizeDropDownLabel: js.UndefOr[String] = js.undefined
  /**
    * Tooltip text for the page size drop down.
    *
    */
  var pageSizeDropDownTooltip: js.UndefOr[String] = js.undefined
  /**
    * Trailing text for the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
    *
    */
  var pageSizeDropDownTrailingLabel: js.UndefOr[String] = js.undefined
  /**
    * Tooltip text templates of buttons that navigate to a particular page. The format string follows the [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
    * See also the [pageCountLimit](ui.iggridpaging#options:pageCountLimit) option.
    *
    */
  var pageTooltipFormat: js.UndefOr[String] = js.undefined
  /**
    * Custom pager records label template - in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
    *
    */
  var pagerRecordsLabelTemplate: js.UndefOr[String] = js.undefined
  /**
    * Tooltip text for the pager records label.
    *
    */
  var pagerRecordsLabelTooltip: js.UndefOr[String] = js.undefined
  /**
    * Text for the previous page label.
    *
    */
  var prevPageLabelText: js.UndefOr[String] = js.undefined
  /**
    * Tooltip text for the previous page button.
    *
    */
  var prevPageTooltip: js.UndefOr[String] = js.undefined
}

object IgGridPagingLocale {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    currentPageDropDownLeadingLabel: String = null,
    currentPageDropDownTooltip: String = null,
    currentPageDropDownTrailingLabel: String = null,
    firstPageLabelText: String = null,
    firstPageTooltip: String = null,
    lastPageLabelText: String = null,
    lastPageTooltip: String = null,
    nextPageLabelText: String = null,
    nextPageTooltip: String = null,
    pageSizeDropDownLabel: String = null,
    pageSizeDropDownTooltip: String = null,
    pageSizeDropDownTrailingLabel: String = null,
    pageTooltipFormat: String = null,
    pagerRecordsLabelTemplate: String = null,
    pagerRecordsLabelTooltip: String = null,
    prevPageLabelText: String = null,
    prevPageTooltip: String = null
  ): IgGridPagingLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (currentPageDropDownLeadingLabel != null) __obj.updateDynamic("currentPageDropDownLeadingLabel")(currentPageDropDownLeadingLabel.asInstanceOf[js.Any])
    if (currentPageDropDownTooltip != null) __obj.updateDynamic("currentPageDropDownTooltip")(currentPageDropDownTooltip.asInstanceOf[js.Any])
    if (currentPageDropDownTrailingLabel != null) __obj.updateDynamic("currentPageDropDownTrailingLabel")(currentPageDropDownTrailingLabel.asInstanceOf[js.Any])
    if (firstPageLabelText != null) __obj.updateDynamic("firstPageLabelText")(firstPageLabelText.asInstanceOf[js.Any])
    if (firstPageTooltip != null) __obj.updateDynamic("firstPageTooltip")(firstPageTooltip.asInstanceOf[js.Any])
    if (lastPageLabelText != null) __obj.updateDynamic("lastPageLabelText")(lastPageLabelText.asInstanceOf[js.Any])
    if (lastPageTooltip != null) __obj.updateDynamic("lastPageTooltip")(lastPageTooltip.asInstanceOf[js.Any])
    if (nextPageLabelText != null) __obj.updateDynamic("nextPageLabelText")(nextPageLabelText.asInstanceOf[js.Any])
    if (nextPageTooltip != null) __obj.updateDynamic("nextPageTooltip")(nextPageTooltip.asInstanceOf[js.Any])
    if (pageSizeDropDownLabel != null) __obj.updateDynamic("pageSizeDropDownLabel")(pageSizeDropDownLabel.asInstanceOf[js.Any])
    if (pageSizeDropDownTooltip != null) __obj.updateDynamic("pageSizeDropDownTooltip")(pageSizeDropDownTooltip.asInstanceOf[js.Any])
    if (pageSizeDropDownTrailingLabel != null) __obj.updateDynamic("pageSizeDropDownTrailingLabel")(pageSizeDropDownTrailingLabel.asInstanceOf[js.Any])
    if (pageTooltipFormat != null) __obj.updateDynamic("pageTooltipFormat")(pageTooltipFormat.asInstanceOf[js.Any])
    if (pagerRecordsLabelTemplate != null) __obj.updateDynamic("pagerRecordsLabelTemplate")(pagerRecordsLabelTemplate.asInstanceOf[js.Any])
    if (pagerRecordsLabelTooltip != null) __obj.updateDynamic("pagerRecordsLabelTooltip")(pagerRecordsLabelTooltip.asInstanceOf[js.Any])
    if (prevPageLabelText != null) __obj.updateDynamic("prevPageLabelText")(prevPageLabelText.asInstanceOf[js.Any])
    if (prevPageTooltip != null) __obj.updateDynamic("prevPageTooltip")(prevPageTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridPagingLocale]
  }
}

