package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotNatrAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotNatrAnimationOptions {
  
  @scala.inline
  def apply(): PlotNatrAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotNatrAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotNatrAnimationOptionsMutableBuilder[Self <: PlotNatrAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
