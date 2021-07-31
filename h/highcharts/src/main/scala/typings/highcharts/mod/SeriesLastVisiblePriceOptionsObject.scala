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
  
  @scala.inline
  def apply(): SeriesLastVisiblePriceOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLastVisiblePriceOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesLastVisiblePriceOptionsObjectMutableBuilder[Self <: SeriesLastVisiblePriceOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setLabel(value: SeriesLastVisiblePriceLabelOptionsObject): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
