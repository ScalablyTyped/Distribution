package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotScatter3dAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotScatter3dAnimationOptions {
  
  @scala.inline
  def apply(): PlotScatter3dAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotScatter3dAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotScatter3dAnimationOptionsMutableBuilder[Self <: PlotScatter3dAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
