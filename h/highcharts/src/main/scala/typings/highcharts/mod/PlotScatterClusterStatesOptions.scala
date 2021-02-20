package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotScatterClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotScatterClusterStatesHoverOptions] = js.native
}
object PlotScatterClusterStatesOptions {
  
  @scala.inline
  def apply(): PlotScatterClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotScatterClusterStatesOptions]
  }
  
  @scala.inline
  implicit class PlotScatterClusterStatesOptionsMutableBuilder[Self <: PlotScatterClusterStatesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHover(value: PlotScatterClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
