package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotVennAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotVennAnimationOptions {
  
  @scala.inline
  def apply(): PlotVennAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVennAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotVennAnimationOptionsMutableBuilder[Self <: PlotVennAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
