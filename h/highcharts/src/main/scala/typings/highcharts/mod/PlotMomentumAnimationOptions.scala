package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMomentumAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotMomentumAnimationOptions {
  
  @scala.inline
  def apply(): PlotMomentumAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMomentumAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotMomentumAnimationOptionsMutableBuilder[Self <: PlotMomentumAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
