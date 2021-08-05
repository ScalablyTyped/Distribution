package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotRsiAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotRsiAnimationOptions {
  
  inline def apply(): PlotRsiAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotRsiAnimationOptions]
  }
  
  extension [Self <: PlotRsiAnimationOptions](x: Self) {
    
    inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
