package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridGroupBySummarySettings
  extends /**
	 * Option for IgGridGroupBySummarySettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the delimiter for multiple summaries.
  	 *
  	 */
  var multiSummaryDelimiter: js.UndefOr[String] = js.undefined
  /**
  	 * Format of the summary value. By default, two digits are shown after the decimal place. Checkout [Formatting Dates, Numbers and Strings](http://www.igniteui.com/help/formatting-dates-numbers-and-strings) for details on the valid formatting specifiers.
  	 *
  	 */
  var summaryFormat: js.UndefOr[String] = js.undefined
}

object IgGridGroupBySummarySettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridGroupBySummarySettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    multiSummaryDelimiter: String = null,
    summaryFormat: String = null
  ): IgGridGroupBySummarySettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (multiSummaryDelimiter != null) __obj.updateDynamic("multiSummaryDelimiter")(multiSummaryDelimiter)
    if (summaryFormat != null) __obj.updateDynamic("summaryFormat")(summaryFormat)
    __obj.asInstanceOf[IgGridGroupBySummarySettings]
  }
}

