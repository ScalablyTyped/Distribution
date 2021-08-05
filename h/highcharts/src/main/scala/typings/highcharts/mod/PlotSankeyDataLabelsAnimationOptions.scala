package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSankeyDataLabelsAnimationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The animation delay time in
    * milliseconds. Set to `0` renders dataLabel immediately. As `undefined`
    * inherits defer time from the series.animation.defer.
    */
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotSankeyDataLabelsAnimationOptions {
  
  inline def apply(): PlotSankeyDataLabelsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSankeyDataLabelsAnimationOptions]
  }
  
  extension [Self <: PlotSankeyDataLabelsAnimationOptions](x: Self) {
    
    inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
