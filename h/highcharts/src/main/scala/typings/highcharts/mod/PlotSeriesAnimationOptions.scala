package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSeriesAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotSeriesAnimationOptions {
  
  @scala.inline
  def apply(): PlotSeriesAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSeriesAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotSeriesAnimationOptionsMutableBuilder[Self <: PlotSeriesAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
