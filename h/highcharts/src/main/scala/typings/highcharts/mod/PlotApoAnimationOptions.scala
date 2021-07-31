package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotApoAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotApoAnimationOptions {
  
  @scala.inline
  def apply(): PlotApoAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotApoAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotApoAnimationOptionsMutableBuilder[Self <: PlotApoAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
