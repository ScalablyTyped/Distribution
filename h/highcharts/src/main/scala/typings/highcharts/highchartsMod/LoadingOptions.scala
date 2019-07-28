package typings.highcharts.highchartsMod

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
    hideDuration: Int | Double = null,
    labelStyle: CSSObject = null,
    showDuration: Int | Double = null,
    style: CSSObject = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (hideDuration != null) __obj.updateDynamic("hideDuration")(hideDuration.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (showDuration != null) __obj.updateDynamic("showDuration")(showDuration.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LoadingOptions]
  }
}

