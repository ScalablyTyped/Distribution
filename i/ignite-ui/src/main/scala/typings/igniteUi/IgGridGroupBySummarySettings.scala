package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridGroupBySummarySettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
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
  def apply(): IgGridGroupBySummarySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupBySummarySettings]
  }
  
  @scala.inline
  implicit class IgGridGroupBySummarySettingsMutableBuilder[Self <: IgGridGroupBySummarySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiSummaryDelimiter(value: String): Self = StObject.set(x, "multiSummaryDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSummaryDelimiterUndefined: Self = StObject.set(x, "multiSummaryDelimiter", js.undefined)
    
    @scala.inline
    def setSummaryFormat(value: String): Self = StObject.set(x, "summaryFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryFormatUndefined: Self = StObject.set(x, "summaryFormat", js.undefined)
  }
}
