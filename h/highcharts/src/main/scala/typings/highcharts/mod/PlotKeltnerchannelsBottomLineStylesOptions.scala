package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotKeltnerchannelsBottomLineStylesOptions extends StObject {
  
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
object PlotKeltnerchannelsBottomLineStylesOptions {
  
  inline def apply(): PlotKeltnerchannelsBottomLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotKeltnerchannelsBottomLineStylesOptions]
  }
  
  extension [Self <: PlotKeltnerchannelsBottomLineStylesOptions](x: Self) {
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
