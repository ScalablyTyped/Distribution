package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPieAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotPieAnimationOptions {
  
  @scala.inline
  def apply(): PlotPieAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPieAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotPieAnimationOptionsMutableBuilder[Self <: PlotPieAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
