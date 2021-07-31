package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesLastPriceOptionsObject extends StObject {
  
  /**
    * (Highstock) The color of the line of last price.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Enable or disable the indicator.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SeriesLastPriceOptionsObject {
  
  @scala.inline
  def apply(): SeriesLastPriceOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLastPriceOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesLastPriceOptionsObjectMutableBuilder[Self <: SeriesLastPriceOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
