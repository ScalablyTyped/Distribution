package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotMacdAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotMacdAnimationOptions {
  
  @scala.inline
  def apply(): PlotMacdAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMacdAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotMacdAnimationOptionsMutableBuilder[Self <: PlotMacdAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
