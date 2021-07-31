package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotFunnel3dAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotFunnel3dAnimationOptions {
  
  @scala.inline
  def apply(): PlotFunnel3dAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotFunnel3dAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotFunnel3dAnimationOptionsMutableBuilder[Self <: PlotFunnel3dAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
