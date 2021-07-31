package typings.highcharts.mod

import typings.highcharts.highchartsStrings.brightness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreemapLevelsColorVariationOptions extends StObject {
  
  /**
    * (Highcharts) The key of a color variation. Currently supports
    * `brightness` only.
    */
  var key: js.UndefOr[brightness] = js.undefined
  
  /**
    * (Highcharts) The ending value of a color variation. The last sibling will
    * receive this value.
    */
  var to: js.UndefOr[Double] = js.undefined
}
object PlotTreemapLevelsColorVariationOptions {
  
  @scala.inline
  def apply(): PlotTreemapLevelsColorVariationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapLevelsColorVariationOptions]
  }
  
  @scala.inline
  implicit class PlotTreemapLevelsColorVariationOptionsMutableBuilder[Self <: PlotTreemapLevelsColorVariationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: brightness): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
