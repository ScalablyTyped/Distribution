package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportingButtonsContextButtonThemeOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The default fill exists only to
    * capture hover events.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Padding for the button.
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Default stroke for the buttons.
    */
  var stroke: js.UndefOr[ColorString] = js.undefined
}
object ExportingButtonsContextButtonThemeOptions {
  
  inline def apply(): ExportingButtonsContextButtonThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingButtonsContextButtonThemeOptions]
  }
  
  extension [Self <: ExportingButtonsContextButtonThemeOptions](x: Self) {
    
    inline def setFill(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setStroke(value: ColorString): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
