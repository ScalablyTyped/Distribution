package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendBubbleLegendRangesOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps) The color of the border for individual
    * range.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) The color of the bubble for individual
    * range.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) The color of the connector for
    * individual range.
    */
  var connectorColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) Range size value, similar to bubble Z
    * data.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object LegendBubbleLegendRangesOptions {
  
  inline def apply(): LegendBubbleLegendRangesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendBubbleLegendRangesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendBubbleLegendRangesOptions] (val x: Self) extends AnyVal {
    
    inline def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setConnectorColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "connectorColor", value.asInstanceOf[js.Any])
    
    inline def setConnectorColorUndefined: Self = StObject.set(x, "connectorColor", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
