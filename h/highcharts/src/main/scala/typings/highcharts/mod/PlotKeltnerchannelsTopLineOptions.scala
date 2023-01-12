package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotKeltnerchannelsTopLineOptions extends StObject {
  
  /**
    * (Highstock) Styles for a bottom line.
    */
  var styles: js.UndefOr[PlotKeltnerchannelsTopLineStylesOptions] = js.undefined
}
object PlotKeltnerchannelsTopLineOptions {
  
  inline def apply(): PlotKeltnerchannelsTopLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotKeltnerchannelsTopLineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotKeltnerchannelsTopLineOptions] (val x: Self) extends AnyVal {
    
    inline def setStyles(value: PlotKeltnerchannelsTopLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
