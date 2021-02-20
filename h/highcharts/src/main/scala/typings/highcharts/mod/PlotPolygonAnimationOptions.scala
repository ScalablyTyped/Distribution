package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPolygonAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotPolygonAnimationOptions {
  
  @scala.inline
  def apply(): PlotPolygonAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPolygonAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotPolygonAnimationOptionsMutableBuilder[Self <: PlotPolygonAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
