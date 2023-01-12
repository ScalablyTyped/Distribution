package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPcTopLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotPcTopLineStylesOptions] = js.undefined
}
object PlotPcTopLineOptions {
  
  inline def apply(): PlotPcTopLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPcTopLineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotPcTopLineOptions] (val x: Self) extends AnyVal {
    
    inline def setStyles(value: PlotPcTopLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
