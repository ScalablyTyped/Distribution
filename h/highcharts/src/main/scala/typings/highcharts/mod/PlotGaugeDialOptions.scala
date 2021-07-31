package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotGaugeDialOptions extends StObject {
  
  /**
    * (Highcharts) The background or fill color of the gauge's dial.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts) The length of the dial's base part, relative to the total
    * radius or length of the dial.
    */
  var baseLength: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The pixel width of the base of the gauge dial. The base is
    * the part closest to the pivot, defined by baseLength.
    */
  var baseWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The border color or stroke of the gauge's dial. By default,
    * the borderWidth is 0, so this must be set in addition to a custom border
    * color.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts) The width of the gauge dial border in pixels.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The radius or length of the dial, in percentages relative to
    * the radius of the gauge itself.
    */
  var radius: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The length of the dial's rear end, the part that extends out
    * on the other side of the pivot. Relative to the dial's length.
    */
  var rearLength: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The width of the top of the dial, closest to the perimeter.
    * The pivot narrows in from the base to the top.
    */
  var topWidth: js.UndefOr[Double] = js.undefined
}
object PlotGaugeDialOptions {
  
  @scala.inline
  def apply(): PlotGaugeDialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGaugeDialOptions]
  }
  
  @scala.inline
  implicit class PlotGaugeDialOptionsMutableBuilder[Self <: PlotGaugeDialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBaseLength(value: String): Self = StObject.set(x, "baseLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseLengthUndefined: Self = StObject.set(x, "baseLength", js.undefined)
    
    @scala.inline
    def setBaseWidth(value: Double): Self = StObject.set(x, "baseWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseWidthUndefined: Self = StObject.set(x, "baseWidth", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRearLength(value: String): Self = StObject.set(x, "rearLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRearLengthUndefined: Self = StObject.set(x, "rearLength", js.undefined)
    
    @scala.inline
    def setTopWidth(value: Double): Self = StObject.set(x, "topWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopWidthUndefined: Self = StObject.set(x, "topWidth", js.undefined)
  }
}
