package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotBarAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotBarAnimationOptions {
  
  @scala.inline
  def apply(): PlotBarAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotBarAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotBarAnimationOptionsMutableBuilder[Self <: PlotBarAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
