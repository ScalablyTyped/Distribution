package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotIkhSenkouSpanOptions extends StObject {
  
  /**
    * (Highstock) Color of the area between Senkou Span A and B, when Senkou
    * Span A is above Senkou Span B. Note that if a `style.fill` is defined,
    * the `color` takes precedence and the `style.fill` is ignored.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock) Color of the area between Senkou Span A and B, when Senkou
    * Span A is under Senkou Span B.
    */
  var negativeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
}
object PlotIkhSenkouSpanOptions {
  
  @scala.inline
  def apply(): PlotIkhSenkouSpanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhSenkouSpanOptions]
  }
  
  @scala.inline
  implicit class PlotIkhSenkouSpanOptionsMutableBuilder[Self <: PlotIkhSenkouSpanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setNegativeColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
  }
}
