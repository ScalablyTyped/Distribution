package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YAxisEventsOptions extends js.Object {
  
  /**
    * (Highcharts, Gantt) An event fired after the breaks have rendered.
    */
  var afterBreaks: js.UndefOr[AxisEventCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) As opposed to the `setExtremes`
    * event, this event fires after the final min and max values are computed
    * and corrected for `minRange`.
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
    * (Highcharts, Gantt) An event fired when a break from this axis occurs on
    * a point.
    */
  var pointBreak: js.UndefOr[AxisPointBreakEventCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) An event fired when a point falls inside a
    * break from this axis.
    */
  var pointInBreak: js.UndefOr[AxisPointBreakEventCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when the minimum and
    * maximum is set for the axis, either by calling the `.setExtremes()`
    * method or by selecting an area in the chart. One parameter, `event`, is
    * passed to the function, containing common event information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in data
    * values. When an axis is zoomed all the way out from the "Reset zoom"
    * button, `event.min` and `event.max` are null, and the new extremes are
    * set based on `this.dataMin` and `this.dataMax`.
    */
  var setExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.native
}
object YAxisEventsOptions {
  
  @scala.inline
  def apply(): YAxisEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisEventsOptions]
  }
  
  @scala.inline
  implicit class YAxisEventsOptionsOps[Self <: YAxisEventsOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterBreaks(value: AxisEventCallbackFunction): Self = this.set("afterBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterBreaks: Self = this.set("afterBreaks", js.undefined)
    
    @scala.inline
    def setAfterSetExtremes(value: AxisSetExtremesEventCallbackFunction): Self = this.set("afterSetExtremes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterSetExtremes: Self = this.set("afterSetExtremes", js.undefined)
    
    @scala.inline
    def setPointBreak(value: AxisPointBreakEventCallbackFunction): Self = this.set("pointBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointBreak: Self = this.set("pointBreak", js.undefined)
    
    @scala.inline
    def setPointInBreak(value: AxisPointBreakEventCallbackFunction): Self = this.set("pointInBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointInBreak: Self = this.set("pointInBreak", js.undefined)
    
    @scala.inline
    def setSetExtremes(value: AxisSetExtremesEventCallbackFunction): Self = this.set("setExtremes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetExtremes: Self = this.set("setExtremes", js.undefined)
  }
}
