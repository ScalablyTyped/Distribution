package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorAxisEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) As opposed to the `setExtremes` event,
    * this event fires after the final min and max values are computed and
    * corrected for `minRange`.
    *
    * Fires when the minimum and maximum is set for the axis, either by calling
    * the `.setExtremes()` method or by selecting an area in the chart. One
    * parameter, `event`, is passed to the function, containing common event
    * information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in axis
    * values. The actual data extremes are found in `event.dataMin` and
    * `event.dataMax`.
    */
  var afterSetExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Fires when the legend item belonging to
    * the colorAxis is clicked. One parameter, `event`, is passed to the
    * function.
    */
  var legendItemClick: js.UndefOr[js.Function] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Fires when the minimum and maximum is
    * set for the axis, either by calling the `.setExtremes()` method or by
    * selecting an area in the chart. One parameter, `event`, is passed to the
    * function, containing common event information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in data
    * values. When an axis is zoomed all the way out from the "Reset zoom"
    * button, `event.min` and `event.max` are null, and the new extremes are
    * set based on `this.dataMin` and `this.dataMax`.
    */
  var setExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.native
}

object ColorAxisEventsOptions {
  @scala.inline
  def apply(): ColorAxisEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisEventsOptions]
  }
  @scala.inline
  implicit class ColorAxisEventsOptionsOps[Self <: ColorAxisEventsOptions] (val x: Self) extends AnyVal {
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
    def setAfterSetExtremes(value: AxisSetExtremesEventCallbackFunction): Self = this.set("afterSetExtremes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSetExtremes: Self = this.set("afterSetExtremes", js.undefined)
    @scala.inline
    def setLegendItemClick(value: js.Function): Self = this.set("legendItemClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendItemClick: Self = this.set("legendItemClick", js.undefined)
    @scala.inline
    def setSetExtremes(value: AxisSetExtremesEventCallbackFunction): Self = this.set("setExtremes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetExtremes: Self = this.set("setExtremes", js.undefined)
  }
  
}

