package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotOrganizationDataLabelsLinkTextPathAttributesOptions extends StObject {
  
  var startOffset: js.UndefOr[Double] = js.undefined
  
  var textAnchor: js.UndefOr[String] = js.undefined
}
object PlotOrganizationDataLabelsLinkTextPathAttributesOptions {
  
  inline def apply(): PlotOrganizationDataLabelsLinkTextPathAttributesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotOrganizationDataLabelsLinkTextPathAttributesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotOrganizationDataLabelsLinkTextPathAttributesOptions] (val x: Self) extends AnyVal {
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
  }
}
