package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilitySeriesOptions extends js.Object {
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
  implicit class AccessibilitySeriesOptionsOps[Self <: AccessibilitySeriesOptions] (val x: Self) extends AnyVal {
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
    def setDescribeSingleSeries(value: Boolean): Self = this.set("describeSingleSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescribeSingleSeries: Self = this.set("describeSingleSeries", js.undefined)
    @scala.inline
    def setDescriptionFormatter(value: Series => String): Self = this.set("descriptionFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDescriptionFormatter: Self = this.set("descriptionFormatter", js.undefined)
    @scala.inline
    def setPointDescriptionEnabledThreshold(value: Boolean | Double): Self = this.set("pointDescriptionEnabledThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointDescriptionEnabledThreshold: Self = this.set("pointDescriptionEnabledThreshold", js.undefined)
  }
  
}

