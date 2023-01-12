package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotBbTopLineOptions extends StObject {
  
  /**
    * (Highstock) Styles for the top line.
    */
  var styles: js.UndefOr[PlotBbTopLineStylesOptions] = js.undefined
}
object PlotBbTopLineOptions {
  
  inline def apply(): PlotBbTopLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotBbTopLineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotBbTopLineOptions] (val x: Self) extends AnyVal {
    
    inline def setStyles(value: PlotBbTopLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
