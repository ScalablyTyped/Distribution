package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSunburstLevelsColorVariationOptions extends StObject {
  
  /**
    * (Highcharts) The key of a color variation. Currently supports
    * `brightness` only.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The ending value of a color variation. The last sibling will
    * receive this value.
    */
  var to: js.UndefOr[Double] = js.undefined
}
object PlotSunburstLevelsColorVariationOptions {
  
  @scala.inline
  def apply(): PlotSunburstLevelsColorVariationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstLevelsColorVariationOptions]
  }
  
  @scala.inline
  implicit class PlotSunburstLevelsColorVariationOptionsMutableBuilder[Self <: PlotSunburstLevelsColorVariationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
