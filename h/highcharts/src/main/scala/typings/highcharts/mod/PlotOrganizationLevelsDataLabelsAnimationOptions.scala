package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotOrganizationLevelsDataLabelsAnimationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The animation delay time in
    * milliseconds. Set to `0` renders dataLabel immediately. As `undefined`
    * inherits defer time from the series.animation.defer.
    */
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotOrganizationLevelsDataLabelsAnimationOptions {
  
  inline def apply(): PlotOrganizationLevelsDataLabelsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotOrganizationLevelsDataLabelsAnimationOptions]
  }
  
  extension [Self <: PlotOrganizationLevelsDataLabelsAnimationOptions](x: Self) {
    
    inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
