package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSupertrendChangeTrendLineStylesOptions extends StObject {
  
  /**
    * (Highstock) The dash or dot style of the grid lines. For possible values,
    * see this demonstration.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  
  /**
    * (Highstock) Color of the line.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}
object PlotSupertrendChangeTrendLineStylesOptions {
  
  @scala.inline
  def apply(): PlotSupertrendChangeTrendLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSupertrendChangeTrendLineStylesOptions]
  }
  
  @scala.inline
  implicit class PlotSupertrendChangeTrendLineStylesOptionsMutableBuilder[Self <: PlotSupertrendChangeTrendLineStylesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashStyle(value: DashStyleValue): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
