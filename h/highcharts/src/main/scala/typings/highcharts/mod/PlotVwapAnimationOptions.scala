package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotVwapAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotVwapAnimationOptions {
  
  @scala.inline
  def apply(): PlotVwapAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVwapAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotVwapAnimationOptionsMutableBuilder[Self <: PlotVwapAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
