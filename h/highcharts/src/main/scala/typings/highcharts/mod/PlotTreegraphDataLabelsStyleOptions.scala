package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreegraphDataLabelsStyleOptions extends StObject {
  
  var textOverflow: js.UndefOr[String] = js.undefined
}
object PlotTreegraphDataLabelsStyleOptions {
  
  inline def apply(): PlotTreegraphDataLabelsStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreegraphDataLabelsStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTreegraphDataLabelsStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setTextOverflow(value: String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
  }
}
