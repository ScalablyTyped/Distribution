package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotWordcloudAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotWordcloudAnimationOptions {
  
  @scala.inline
  def apply(): PlotWordcloudAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWordcloudAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotWordcloudAnimationOptionsMutableBuilder[Self <: PlotWordcloudAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
