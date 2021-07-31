package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPsarAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotPsarAnimationOptions {
  
  @scala.inline
  def apply(): PlotPsarAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPsarAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotPsarAnimationOptionsMutableBuilder[Self <: PlotPsarAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
