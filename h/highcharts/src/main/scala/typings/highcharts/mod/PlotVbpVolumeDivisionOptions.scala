package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotVbpVolumeDivisionOptions extends StObject {
  
  /**
    * (Highstock) Option to control if volume is divided.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var styles: js.UndefOr[PlotVbpVolumeDivisionStylesOptions] = js.undefined
}
object PlotVbpVolumeDivisionOptions {
  
  inline def apply(): PlotVbpVolumeDivisionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpVolumeDivisionOptions]
  }
  
  extension [Self <: PlotVbpVolumeDivisionOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setStyles(value: PlotVbpVolumeDivisionStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
