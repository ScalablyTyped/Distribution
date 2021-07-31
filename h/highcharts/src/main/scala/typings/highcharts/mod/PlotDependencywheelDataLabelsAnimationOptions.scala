package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotDependencywheelDataLabelsAnimationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The animation delay time in
    * milliseconds. Set to `0` renders dataLabel immediately. As `undefined`
    * inherits defer time from the series.animation.defer.
    */
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotDependencywheelDataLabelsAnimationOptions {
  
  @scala.inline
  def apply(): PlotDependencywheelDataLabelsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotDependencywheelDataLabelsAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotDependencywheelDataLabelsAnimationOptionsMutableBuilder[Self <: PlotDependencywheelDataLabelsAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
