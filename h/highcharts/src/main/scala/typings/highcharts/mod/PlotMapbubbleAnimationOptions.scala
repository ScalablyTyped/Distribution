package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotMapbubbleAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotMapbubbleAnimationOptions {
  
  @scala.inline
  def apply(): PlotMapbubbleAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMapbubbleAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotMapbubbleAnimationOptionsMutableBuilder[Self <: PlotMapbubbleAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
