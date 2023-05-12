package typings.highcharts.mod

import typings.highcharts.highchartsStrings.brightness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreegraphLevelsColorVariationOptions extends StObject {
  
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
object PlotTreegraphLevelsColorVariationOptions {
  
  inline def apply(): PlotTreegraphLevelsColorVariationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreegraphLevelsColorVariationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTreegraphLevelsColorVariationOptions] (val x: Self) extends AnyVal {
    
    inline def setKey(value: brightness): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
