package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotOrganizationAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotOrganizationAnimationOptions {
  
  @scala.inline
  def apply(): PlotOrganizationAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotOrganizationAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotOrganizationAnimationOptionsMutableBuilder[Self <: PlotOrganizationAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
