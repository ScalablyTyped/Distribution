package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotGaugePivotOptions extends StObject {
  
  /**
    * (Highcharts) The background color or fill of the pivot.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts) The border or stroke color of the pivot. In able to change
    * this, the borderWidth must also be set to something other than the
    * default 0.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts) The border or stroke width of the pivot.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The pixel radius of the pivot.
    */
  var radius: js.UndefOr[Double] = js.native
}
object PlotGaugePivotOptions {
  
  @scala.inline
  def apply(): PlotGaugePivotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGaugePivotOptions]
  }
  
  @scala.inline
  implicit class PlotGaugePivotOptionsMutableBuilder[Self <: PlotGaugePivotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
