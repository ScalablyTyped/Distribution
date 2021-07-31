package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotItemAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotItemAnimationOptions {
  
  @scala.inline
  def apply(): PlotItemAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotItemAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotItemAnimationOptionsMutableBuilder[Self <: PlotItemAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
