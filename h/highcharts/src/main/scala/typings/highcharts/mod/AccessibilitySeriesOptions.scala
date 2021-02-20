package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilitySeriesOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to add series
    * descriptions to charts with a single series.
    */
  var describeSingleSeries: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
    * instead of the default for series descriptions. Receives one argument,
    * `series`, referring to the series to describe. Should return a string
    * with the description of the series for a screen reader user. If `false`
    * is returned, the default formatter will be used for that series.
    */
  var descriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Series]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
    * points than this, we no longer expose information about individual points
    * to screen readers.
    *
    * Set to `false` to disable.
    */
  var pointDescriptionEnabledThreshold: js.UndefOr[Boolean | Double] = js.native
}
object AccessibilitySeriesOptions {
  
  @scala.inline
  def apply(): AccessibilitySeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilitySeriesOptions]
  }
  
  @scala.inline
  implicit class AccessibilitySeriesOptionsMutableBuilder[Self <: AccessibilitySeriesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescribeSingleSeries(value: Boolean): Self = StObject.set(x, "describeSingleSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribeSingleSeriesUndefined: Self = StObject.set(x, "describeSingleSeries", js.undefined)
    
    @scala.inline
    def setDescriptionFormatter(value: Series => String): Self = StObject.set(x, "descriptionFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescriptionFormatterUndefined: Self = StObject.set(x, "descriptionFormatter", js.undefined)
    
    @scala.inline
    def setPointDescriptionEnabledThreshold(value: Boolean | Double): Self = StObject.set(x, "pointDescriptionEnabledThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointDescriptionEnabledThresholdUndefined: Self = StObject.set(x, "pointDescriptionEnabledThreshold", js.undefined)
  }
}
