package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotLineAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotLineAnimationOptions {
  
  @scala.inline
  def apply(): PlotLineAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotLineAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotLineAnimationOptionsMutableBuilder[Self <: PlotLineAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
