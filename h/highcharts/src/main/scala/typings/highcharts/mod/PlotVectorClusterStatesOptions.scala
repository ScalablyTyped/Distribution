package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotVectorClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotVectorClusterStatesHoverOptions] = js.native
}
object PlotVectorClusterStatesOptions {
  
  @scala.inline
  def apply(): PlotVectorClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVectorClusterStatesOptions]
  }
  
  @scala.inline
  implicit class PlotVectorClusterStatesOptionsMutableBuilder[Self <: PlotVectorClusterStatesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHover(value: PlotVectorClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
