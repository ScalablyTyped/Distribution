package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorAxisDataClassesOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps) The color of each data class. If not
    * set, the color is pulled from the global or chart-specific colors array.
    * In styled mode, this option is ignored. Instead, use colors defined in
    * CSS.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) The start of the value range that the
    * data class represents, relating to the point value.
    *
    * The range of each `dataClass` is closed in both ends, but can be
    * overridden by the next `dataClass`.
    */
  var from: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) The name of the data class as it
    * appears in the legend. If no name is given, it is automatically created
    * based on the `from` and `to` values. For full programmatic control,
    * legend.labelFormatter can be used. In the formatter, `this.from` and
    * `this.to` can be accessed.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) The end of the value range that the
    * data class represents, relating to the point value.
    *
    * The range of each `dataClass` is closed in both ends, but can be
    * overridden by the next `dataClass`.
    */
  var to: js.UndefOr[Double] = js.undefined
}
object ColorAxisDataClassesOptions {
  
  inline def apply(): ColorAxisDataClassesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisDataClassesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorAxisDataClassesOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
