package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotAroonAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotAroonAnimationOptions {
  
  @scala.inline
  def apply(): PlotAroonAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAroonAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotAroonAnimationOptionsMutableBuilder[Self <: PlotAroonAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
