package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotVariablepieAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotVariablepieAnimationOptions {
  
  inline def apply(): PlotVariablepieAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVariablepieAnimationOptions]
  }
  
  extension [Self <: PlotVariablepieAnimationOptions](x: Self) {
    
    inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
