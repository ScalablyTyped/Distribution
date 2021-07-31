package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotCciAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotCciAnimationOptions {
  
  @scala.inline
  def apply(): PlotCciAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotCciAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotCciAnimationOptionsMutableBuilder[Self <: PlotCciAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
