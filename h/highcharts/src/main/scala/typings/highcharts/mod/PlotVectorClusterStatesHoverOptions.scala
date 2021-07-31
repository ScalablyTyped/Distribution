package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotVectorClusterStatesHoverOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) The fill color of the cluster marker in hover
    * state. When `undefined`, the series' or point's fillColor for normal
    * state is used.
    */
  var fillColor: js.UndefOr[ColorType] = js.undefined
}
object PlotVectorClusterStatesHoverOptions {
  
  @scala.inline
  def apply(): PlotVectorClusterStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVectorClusterStatesHoverOptions]
  }
  
  @scala.inline
  implicit class PlotVectorClusterStatesHoverOptionsMutableBuilder[Self <: PlotVectorClusterStatesHoverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillColor(value: ColorType): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
  }
}
