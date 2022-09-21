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
    * (Highstock, Gantt) Explanation for the button, shown as a tooltip on
    * hover, and used by assistive technology.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock, Gantt) Defined the time span for the button. Can be one of
    * `millisecond`, `second`, `minute`, `hour`, `day`, `week`, `month`,
    * `year`, `ytd`, and `all`.
    */
  var `type`: js.UndefOr[RangeSelectorButtonTypeValue] = js.undefined
}
object RangeSelectorButtonsOptions {
  
  inline def apply(): RangeSelectorButtonsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorButtonsOptions]
  }
  
  extension [Self <: RangeSelectorButtonsOptions](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDataGrouping(value: DataGroupingOptionsObject): Self = StObject.set(x, "dataGrouping", value.asInstanceOf[js.Any])
    
    inline def setDataGroupingUndefined: Self = StObject.set(x, "dataGrouping", js.undefined)
    
    inline def setEvents(value: RangeSelectorButtonsEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setOffsetMax(value: Double): Self = StObject.set(x, "offsetMax", value.asInstanceOf[js.Any])
    
    inline def setOffsetMaxUndefined: Self = StObject.set(x, "offsetMax", js.undefined)
    
    inline def setOffsetMin(value: Double): Self = StObject.set(x, "offsetMin", value.asInstanceOf[js.Any])
    
    inline def setOffsetMinUndefined: Self = StObject.set(x, "offsetMin", js.undefined)
    
    inline def setPreserveDataGrouping(value: Boolean): Self = StObject.set(x, "preserveDataGrouping", value.asInstanceOf[js.Any])
    
    inline def setPreserveDataGroupingUndefined: Self = StObject.set(x, "preserveDataGrouping", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: RangeSelectorButtonTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
