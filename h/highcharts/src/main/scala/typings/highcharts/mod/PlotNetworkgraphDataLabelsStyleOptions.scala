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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotNetworkgraphDataLabelsStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
