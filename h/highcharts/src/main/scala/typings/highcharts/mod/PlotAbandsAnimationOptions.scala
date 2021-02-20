package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotAbandsAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotAbandsAnimationOptions {
  
  @scala.inline
  def apply(): PlotAbandsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAbandsAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotAbandsAnimationOptionsMutableBuilder[Self <: PlotAbandsAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
