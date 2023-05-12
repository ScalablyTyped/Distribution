package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotOrganizationDataLabelsLinkTextPathOptions extends StObject {
  
  var attributes: js.UndefOr[PlotOrganizationDataLabelsLinkTextPathAttributesOptions] = js.undefined
}
object PlotOrganizationDataLabelsLinkTextPathOptions {
  
  inline def apply(): PlotOrganizationDataLabelsLinkTextPathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotOrganizationDataLabelsLinkTextPathOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotOrganizationDataLabelsLinkTextPathOptions] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: PlotOrganizationDataLabelsLinkTextPathAttributesOptions): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
  }
}
