package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotColumnAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotColumnAnimationOptions {
  
  @scala.inline
  def apply(): PlotColumnAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotColumnAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotColumnAnimationOptionsMutableBuilder[Self <: PlotColumnAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
