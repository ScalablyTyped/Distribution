package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveRulesConditionOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to gain
    * complete control on when the responsive rule applies. Return `true` if it
    * applies. This opens for checking against other metrics than the chart
    * size, for example the document size or other elements.
    */
  var callback: js.UndefOr[ResponsiveCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart height is less than this.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart width is less than this.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart height is greater than this.
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart width is greater than this.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
}

object ResponsiveRulesConditionOptions {
  @scala.inline
  def apply(
    callback: ResponsiveCallbackFunction = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined
  ): ResponsiveRulesConditionOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveRulesConditionOptions]
  }
}

