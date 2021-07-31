package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeSelectorButtonsOptions extends StObject {
  
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
  def apply(): RangeSelectorButtonsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorButtonsOptions]
  }
  
  @scala.inline
  implicit class RangeSelectorButtonsOptionsMutableBuilder[Self <: RangeSelectorButtonsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setDataGrouping(value: DataGroupingOptionsObject): Self = StObject.set(x, "dataGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataGroupingUndefined: Self = StObject.set(x, "dataGrouping", js.undefined)
    
    @scala.inline
    def setEvents(value: RangeSelectorButtonsEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setOffsetMax(value: Double): Self = StObject.set(x, "offsetMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetMaxUndefined: Self = StObject.set(x, "offsetMax", js.undefined)
    
    @scala.inline
    def setOffsetMin(value: Double): Self = StObject.set(x, "offsetMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetMinUndefined: Self = StObject.set(x, "offsetMin", js.undefined)
    
    @scala.inline
    def setPreserveDataGrouping(value: Boolean): Self = StObject.set(x, "preserveDataGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveDataGroupingUndefined: Self = StObject.set(x, "preserveDataGrouping", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: RangeSelectorButtonTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
