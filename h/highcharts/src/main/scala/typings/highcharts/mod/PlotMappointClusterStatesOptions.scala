package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMappointClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotMappointClusterStatesHoverOptions] = js.undefined
}
object PlotMappointClusterStatesOptions {
  
  @scala.inline
  def apply(): PlotMappointClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMappointClusterStatesOptions]
  }
  
  @scala.inline
  implicit class PlotMappointClusterStatesOptionsMutableBuilder[Self <: PlotMappointClusterStatesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHover(value: PlotMappointClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
