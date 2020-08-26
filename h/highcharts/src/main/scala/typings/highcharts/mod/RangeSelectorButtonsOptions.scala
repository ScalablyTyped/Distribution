package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeSelectorButtonsOptions extends js.Object {
  /**
    * (Highstock, Gantt) How many units of the defined type the button should
    * span. If `type` is "month" and `count` is 3, the button spans three
    * months.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * (Highstock) A custom data grouping object for each button.
    */
  var dataGrouping: js.UndefOr[DataGroupingOptionsObject] = js.native
  var events: js.UndefOr[RangeSelectorButtonsEventsOptions] = js.native
  /**
    * (Highstock, Gantt) Additional range (in milliseconds) added to the end of
    * the calculated time span.
    */
  var offsetMax: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) Additional range (in milliseconds) added to the start
    * of the calculated time span.
    */
  var offsetMin: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) When buttons apply dataGrouping on a series, by
    * default zooming in/out will deselect buttons and unset dataGrouping.
    * Enable this option to keep buttons selected when extremes change.
    */
  var preserveDataGrouping: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) The text for the button itself.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * (Highstock, Gantt) Defined the time span for the button. Can be one of
    * `millisecond`, `second`, `minute`, `hour`, `day`, `week`, `month`,
    * `year`, `ytd`, and `all`.
    */
  var `type`: js.UndefOr[RangeSelectorButtonTypeValue] = js.native
}

object RangeSelectorButtonsOptions {
  @scala.inline
  def apply(): RangeSelectorButtonsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorButtonsOptions]
  }
  @scala.inline
  implicit class RangeSelectorButtonsOptionsOps[Self <: RangeSelectorButtonsOptions] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDataGrouping(value: DataGroupingOptionsObject): Self = this.set("dataGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataGrouping: Self = this.set("dataGrouping", js.undefined)
    @scala.inline
    def setEvents(value: RangeSelectorButtonsEventsOptions): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setOffsetMax(value: Double): Self = this.set("offsetMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetMax: Self = this.set("offsetMax", js.undefined)
    @scala.inline
    def setOffsetMin(value: Double): Self = this.set("offsetMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetMin: Self = this.set("offsetMin", js.undefined)
    @scala.inline
    def setPreserveDataGrouping(value: Boolean): Self = this.set("preserveDataGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveDataGrouping: Self = this.set("preserveDataGrouping", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: RangeSelectorButtonTypeValue): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

