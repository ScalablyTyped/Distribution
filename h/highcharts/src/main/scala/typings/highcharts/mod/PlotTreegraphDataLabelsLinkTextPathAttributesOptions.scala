package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreegraphDataLabelsLinkTextPathAttributesOptions extends StObject {
  
  var startOffset: js.UndefOr[Double] = js.undefined
}
object PlotTreegraphDataLabelsLinkTextPathAttributesOptions {
  
  inline def apply(): PlotTreegraphDataLabelsLinkTextPathAttributesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreegraphDataLabelsLinkTextPathAttributesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTreegraphDataLabelsLinkTextPathAttributesOptions] (val x: Self) extends AnyVal {
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
  }
}
