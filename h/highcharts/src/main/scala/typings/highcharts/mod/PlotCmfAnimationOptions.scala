package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotCmfAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotCmfAnimationOptions {
  
  @scala.inline
  def apply(): PlotCmfAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotCmfAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotCmfAnimationOptionsMutableBuilder[Self <: PlotCmfAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
