package typings.highcharts.mod

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
  var dataGrouping: js.UndefOr[DataGroupingOptionsObject] = js.undefined
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
    count: js.UndefOr[Double] = js.undefined,
    dataGrouping: DataGroupingOptionsObject = null,
    events: RangeSelectorButtonsEventsOptions = null,
    offsetMax: js.UndefOr[Double] = js.undefined,
    offsetMin: js.UndefOr[Double] = js.undefined,
    preserveDataGrouping: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    `type`: RangeSelectorButtonTypeValue = null
  ): RangeSelectorButtonsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetMax)) __obj.updateDynamic("offsetMax")(offsetMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetMin)) __obj.updateDynamic("offsetMin")(offsetMin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDataGrouping)) __obj.updateDynamic("preserveDataGrouping")(preserveDataGrouping.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectorButtonsOptions]
  }
}

