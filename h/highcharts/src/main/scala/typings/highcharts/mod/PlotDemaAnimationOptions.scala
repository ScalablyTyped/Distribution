package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotDemaAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotDemaAnimationOptions {
  
  @scala.inline
  def apply(): PlotDemaAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotDemaAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotDemaAnimationOptionsMutableBuilder[Self <: PlotDemaAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
