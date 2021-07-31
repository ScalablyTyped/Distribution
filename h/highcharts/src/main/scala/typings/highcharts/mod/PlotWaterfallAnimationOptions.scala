package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotWaterfallAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotWaterfallAnimationOptions {
  
  @scala.inline
  def apply(): PlotWaterfallAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWaterfallAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotWaterfallAnimationOptionsMutableBuilder[Self <: PlotWaterfallAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
