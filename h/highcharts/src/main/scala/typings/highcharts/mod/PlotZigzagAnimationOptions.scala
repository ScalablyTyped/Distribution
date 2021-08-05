package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotZigzagAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotZigzagAnimationOptions {
  
  inline def apply(): PlotZigzagAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotZigzagAnimationOptions]
  }
  
  extension [Self <: PlotZigzagAnimationOptions](x: Self) {
    
    inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
