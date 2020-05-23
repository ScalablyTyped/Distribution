package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
    * the fade out effect.
    */
  var hideDuration: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading label
    * `span`.
    */
  var labelStyle: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
    * the fade in effect.
    */
  var showDuration: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading
    * screen that covers the plot area.
    *
    * In styled mode, the loading label is styled with the
    * `.highcharts-loading` class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}

object LoadingOptions {
  @scala.inline
  def apply(
    hideDuration: js.UndefOr[Double] = js.undefined,
    labelStyle: CSSObject = null,
    showDuration: js.UndefOr[Double] = js.undefined,
    style: CSSObject = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideDuration)) __obj.updateDynamic("hideDuration")(hideDuration.get.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showDuration)) __obj.updateDynamic("showDuration")(showDuration.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingOptions]
  }
}

