package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotVennClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotVennClusterStatesHoverOptions] = js.native
}
object PlotVennClusterStatesOptions {
  
  @scala.inline
  def apply(): PlotVennClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVennClusterStatesOptions]
  }
  
  @scala.inline
  implicit class PlotVennClusterStatesOptionsMutableBuilder[Self <: PlotVennClusterStatesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHover(value: PlotVennClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
