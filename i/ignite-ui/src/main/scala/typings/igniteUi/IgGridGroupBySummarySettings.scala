package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridGroupBySummarySettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies the delimiter for multiple summaries.
    *
    */
  var multiSummaryDelimiter: js.UndefOr[String] = js.native
  /**
    * Format of the summary value. By default, two digits are shown after the decimal place. Checkout [Formatting Dates, Numbers and Strings](http://www.igniteui.com/help/formatting-dates-numbers-and-strings) for details on the valid formatting specifiers.
    *
    */
  var summaryFormat: js.UndefOr[String] = js.native
}

object IgGridGroupBySummarySettings {
  @scala.inline
  def apply(): IgGridGroupBySummarySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupBySummarySettings]
  }
  @scala.inline
  implicit class IgGridGroupBySummarySettingsOps[Self <: IgGridGroupBySummarySettings] (val x: Self) extends AnyVal {
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
    def setMultiSummaryDelimiter(value: String): Self = this.set("multiSummaryDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSummaryDelimiter: Self = this.set("multiSummaryDelimiter", js.undefined)
    @scala.inline
    def setSummaryFormat(value: String): Self = this.set("summaryFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryFormat: Self = this.set("summaryFormat", js.undefined)
  }
  
}

