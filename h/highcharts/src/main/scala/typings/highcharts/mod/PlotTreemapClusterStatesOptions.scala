package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotTreemapClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotTreemapClusterStatesHoverOptions] = js.native
}
object PlotTreemapClusterStatesOptions {
  
  @scala.inline
  def apply(): PlotTreemapClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapClusterStatesOptions]
  }
  
  @scala.inline
  implicit class PlotTreemapClusterStatesOptionsMutableBuilder[Self <: PlotTreemapClusterStatesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHover(value: PlotTreemapClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
