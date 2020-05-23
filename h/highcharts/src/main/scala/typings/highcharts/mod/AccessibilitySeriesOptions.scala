package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilitySeriesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to add series
    * descriptions to charts with a single series.
    */
  var describeSingleSeries: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
    * instead of the default for series descriptions. Receives one argument,
    * `series`, referring to the series to describe. Should return a string
    * with the description of the series for a screen reader user. If `false`
    * is returned, the default formatter will be used for that series.
    */
  var descriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Series]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
    * points than this, we no longer expose information about individual points
    * to screen readers.
    *
    * Set to `false` to disable.
    */
  var pointDescriptionEnabledThreshold: js.UndefOr[Boolean | Double] = js.undefined
}

object AccessibilitySeriesOptions {
  @scala.inline
  def apply(
    describeSingleSeries: js.UndefOr[Boolean] = js.undefined,
    descriptionFormatter: Series => String = null,
    pointDescriptionEnabledThreshold: Boolean | Double = null
  ): AccessibilitySeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(describeSingleSeries)) __obj.updateDynamic("describeSingleSeries")(describeSingleSeries.get.asInstanceOf[js.Any])
    if (descriptionFormatter != null) __obj.updateDynamic("descriptionFormatter")(js.Any.fromFunction1(descriptionFormatter))
    if (pointDescriptionEnabledThreshold != null) __obj.updateDynamic("pointDescriptionEnabledThreshold")(pointDescriptionEnabledThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilitySeriesOptions]
  }
}

