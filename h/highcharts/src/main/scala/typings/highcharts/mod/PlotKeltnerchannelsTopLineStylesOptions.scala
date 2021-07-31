package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotKeltnerchannelsTopLineStylesOptions extends StObject {
  
  /**
    * (Highstock) Color of the line. If not set, it's inherited from
    * `plotOptions.keltnerchannels.color`
    */
  var lineColor: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}
object PlotKeltnerchannelsTopLineStylesOptions {
  
  @scala.inline
  def apply(): PlotKeltnerchannelsTopLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotKeltnerchannelsTopLineStylesOptions]
  }
  
  @scala.inline
  implicit class PlotKeltnerchannelsTopLineStylesOptionsMutableBuilder[Self <: PlotKeltnerchannelsTopLineStylesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
