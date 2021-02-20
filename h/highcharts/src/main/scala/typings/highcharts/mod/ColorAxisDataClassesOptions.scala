package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorAxisDataClassesOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps) The color of each data class. If not
    * set, the color is pulled from the global or chart-specific colors array.
    * In styled mode, this option is ignored. Instead, use colors defined in
    * CSS.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The start of the value range that the
    * data class represents, relating to the point value.
    *
    * The range of each `dataClass` is closed in both ends, but can be
    * overridden by the next `dataClass`.
    */
  var from: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The name of the data class as it
    * appears in the legend. If no name is given, it is automatically created
    * based on the `from` and `to` values. For full programmatic control,
    * legend.labelFormatter can be used. In the formatter, `this.from` and
    * `this.to` can be accessed.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The end of the value range that the
    * data class represents, relating to the point value.
    *
    * The range of each `dataClass` is closed in both ends, but can be
    * overridden by the next `dataClass`.
    */
  var to: js.UndefOr[Double] = js.native
}
object ColorAxisDataClassesOptions {
  
  @scala.inline
  def apply(): ColorAxisDataClassesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisDataClassesOptions]
  }
  
  @scala.inline
  implicit class ColorAxisDataClassesOptionsMutableBuilder[Self <: ColorAxisDataClassesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
