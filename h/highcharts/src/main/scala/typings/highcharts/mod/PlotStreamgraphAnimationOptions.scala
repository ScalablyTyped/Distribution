package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotStreamgraphAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotStreamgraphAnimationOptions {
  
  @scala.inline
  def apply(): PlotStreamgraphAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotStreamgraphAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotStreamgraphAnimationOptionsMutableBuilder[Self <: PlotStreamgraphAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
