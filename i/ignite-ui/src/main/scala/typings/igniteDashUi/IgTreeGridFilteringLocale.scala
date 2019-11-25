package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridFilteringLocale
  extends /**
	 * Option for IgTreeGridFilteringLocale
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
  var filterSummaryInPagerTemplate: js.UndefOr[String] = js.undefined
}

object IgTreeGridFilteringLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTreeGridFilteringLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    filterSummaryInPagerTemplate: String = null
  ): IgTreeGridFilteringLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (filterSummaryInPagerTemplate != null) __obj.updateDynamic("filterSummaryInPagerTemplate")(filterSummaryInPagerTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeGridFilteringLocale]
  }
}

