package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotAtrAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotAtrAnimationOptions {
  
  @scala.inline
  def apply(): PlotAtrAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAtrAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotAtrAnimationOptionsMutableBuilder[Self <: PlotAtrAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
