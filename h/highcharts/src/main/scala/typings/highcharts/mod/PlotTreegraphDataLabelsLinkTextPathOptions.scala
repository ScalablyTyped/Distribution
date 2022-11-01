package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreegraphDataLabelsLinkTextPathOptions extends StObject {
  
  var attributes: js.UndefOr[PlotTreegraphDataLabelsLinkTextPathAttributesOptions] = js.undefined
}
object PlotTreegraphDataLabelsLinkTextPathOptions {
  
  inline def apply(): PlotTreegraphDataLabelsLinkTextPathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreegraphDataLabelsLinkTextPathOptions]
  }
  
  extension [Self <: PlotTreegraphDataLabelsLinkTextPathOptions](x: Self) {
    
    inline def setAttributes(value: PlotTreegraphDataLabelsLinkTextPathAttributesOptions): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
  }
}
