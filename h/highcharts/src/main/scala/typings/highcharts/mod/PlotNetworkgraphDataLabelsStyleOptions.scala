package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotNetworkgraphDataLabelsStyleOptions extends StObject {
  
  var transition: js.UndefOr[String] = js.undefined
}
object PlotNetworkgraphDataLabelsStyleOptions {
  
  inline def apply(): PlotNetworkgraphDataLabelsStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotNetworkgraphDataLabelsStyleOptions]
  }
  
  extension [Self <: PlotNetworkgraphDataLabelsStyleOptions](x: Self) {
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
