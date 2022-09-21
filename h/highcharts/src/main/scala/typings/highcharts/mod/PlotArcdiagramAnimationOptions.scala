package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotArcdiagramAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotArcdiagramAnimationOptions {
  
  inline def apply(): PlotArcdiagramAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotArcdiagramAnimationOptions]
  }
  
  extension [Self <: PlotArcdiagramAnimationOptions](x: Self) {
    
    inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
