package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPcBottomLineStylesOptions extends StObject {
  
  /**
    * (Highstock) Color of the bottom line. If not set, it's inherited from
    * plotOptions.pc.color.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}
object PlotPcBottomLineStylesOptions {
  
  @scala.inline
  def apply(): PlotPcBottomLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPcBottomLineStylesOptions]
  }
  
  @scala.inline
  implicit class PlotPcBottomLineStylesOptionsMutableBuilder[Self <: PlotPcBottomLineStylesOptions] (val x: Self) extends AnyVal {
    
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
