package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPpoAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotPpoAnimationOptions {
  
  @scala.inline
  def apply(): PlotPpoAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPpoAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotPpoAnimationOptionsMutableBuilder[Self <: PlotPpoAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
