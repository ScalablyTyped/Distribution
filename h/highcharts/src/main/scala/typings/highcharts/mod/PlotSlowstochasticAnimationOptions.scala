package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSlowstochasticAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotSlowstochasticAnimationOptions {
  
  @scala.inline
  def apply(): PlotSlowstochasticAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSlowstochasticAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotSlowstochasticAnimationOptionsMutableBuilder[Self <: PlotSlowstochasticAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
