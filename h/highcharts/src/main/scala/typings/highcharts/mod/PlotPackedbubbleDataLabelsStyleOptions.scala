package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPackedbubbleDataLabelsStyleOptions extends StObject {
  
  var transition: js.UndefOr[String] = js.undefined
}
object PlotPackedbubbleDataLabelsStyleOptions {
  
  inline def apply(): PlotPackedbubbleDataLabelsStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPackedbubbleDataLabelsStyleOptions]
  }
  
  extension [Self <: PlotPackedbubbleDataLabelsStyleOptions](x: Self) {
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
