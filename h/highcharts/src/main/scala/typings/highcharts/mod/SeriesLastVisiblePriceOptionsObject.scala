package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesLastVisiblePriceOptionsObject extends StObject {
  
  /**
    * (Highstock) Enable or disable the indicator.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[SeriesLastVisiblePriceLabelOptionsObject] = js.undefined
}
object SeriesLastVisiblePriceOptionsObject {
  
  inline def apply(): SeriesLastVisiblePriceOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLastVisiblePriceOptionsObject]
  }
  
  extension [Self <: SeriesLastVisiblePriceOptionsObject](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLabel(value: SeriesLastVisiblePriceLabelOptionsObject): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
