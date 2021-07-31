package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTimelineAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotTimelineAnimationOptions {
  
  @scala.inline
  def apply(): PlotTimelineAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTimelineAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotTimelineAnimationOptionsMutableBuilder[Self <: PlotTimelineAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
