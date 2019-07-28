package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButtonsOptions extends js.Object {
  /**
    * (Highstock, Gantt) How many units of the defined type the button should
    * span. If `type` is "month" and `count` is 3, the button spans three
    * months.
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) A custom data grouping object for each button.
    */
  var dataGrouping: js.UndefOr[RangeSelectorButtonsDataGroupingOptions] = js.undefined
  var events: js.UndefOr[RangeSelectorButtonsEventsOptions] = js.undefined
  /**
    * (Highstock, Gantt) Additional range (in milliseconds) added to the end of
    * the calculated time span.
    */
  var offsetMax: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) Additional range (in milliseconds) added to the start
    * of the calculated time span.
    */
  var offsetMin: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) When buttons apply dataGrouping on a series, by
    * default zooming in/out will deselect buttons and unset dataGrouping.
    * Enable this option to keep buttons selected when extremes change.
    */
  var preserveDataGrouping: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) The text for the button itself.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * (Highstock, Gantt) Defined the time span for the button. Can be one of
    * `millisecond`, `second`, `minute`, `hour`, `day`, `week`, `month`,
    * `year`, `ytd`, and `all`.
    */
  var `type`: js.UndefOr[RangeSelectorButtonTypeValue] = js.undefined
}

object RangeSelectorButtonsOptions {
  @scala.inline
  def apply(
    count: Int | Double = null,
    dataGrouping: RangeSelectorButtonsDataGroupingOptions = null,
    events: RangeSelectorButtonsEventsOptions = null,
    offsetMax: Int | Double = null,
    offsetMin: Int | Double = null,
    preserveDataGrouping: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    `type`: RangeSelectorButtonTypeValue = null
  ): RangeSelectorButtonsOptions = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping)
    if (events != null) __obj.updateDynamic("events")(events)
    if (offsetMax != null) __obj.updateDynamic("offsetMax")(offsetMax.asInstanceOf[js.Any])
    if (offsetMin != null) __obj.updateDynamic("offsetMin")(offsetMin.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDataGrouping)) __obj.updateDynamic("preserveDataGrouping")(preserveDataGrouping)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RangeSelectorButtonsOptions]
  }
}

