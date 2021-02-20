package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotScatterClusterStatesHoverOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) The fill color of the cluster marker in hover
    * state. When `undefined`, the series' or point's fillColor for normal
    * state is used.
    */
  var fillColor: js.UndefOr[ColorType] = js.native
}
object PlotScatterClusterStatesHoverOptions {
  
  @scala.inline
  def apply(): PlotScatterClusterStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotScatterClusterStatesHoverOptions]
  }
  
  @scala.inline
  implicit class PlotScatterClusterStatesHoverOptionsMutableBuilder[Self <: PlotScatterClusterStatesHoverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillColor(value: ColorType): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
  }
}
