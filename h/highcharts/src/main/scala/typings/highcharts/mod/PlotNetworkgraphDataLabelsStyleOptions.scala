package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotNetworkgraphDataLabelsStyleOptions extends StObject {
  
  var transition: js.UndefOr[String] = js.native
}
object PlotNetworkgraphDataLabelsStyleOptions {
  
  @scala.inline
  def apply(): PlotNetworkgraphDataLabelsStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotNetworkgraphDataLabelsStyleOptions]
  }
  
  @scala.inline
  implicit class PlotNetworkgraphDataLabelsStyleOptionsMutableBuilder[Self <: PlotNetworkgraphDataLabelsStyleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
