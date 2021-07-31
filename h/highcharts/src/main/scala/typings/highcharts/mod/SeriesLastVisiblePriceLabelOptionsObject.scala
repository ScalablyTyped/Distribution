package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesLastVisiblePriceLabelOptionsObject extends StObject {
  
  /**
    * (Highstock) Enable or disable the label.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SeriesLastVisiblePriceLabelOptionsObject {
  
  @scala.inline
  def apply(): SeriesLastVisiblePriceLabelOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLastVisiblePriceLabelOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesLastVisiblePriceLabelOptionsObjectMutableBuilder[Self <: SeriesLastVisiblePriceLabelOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
