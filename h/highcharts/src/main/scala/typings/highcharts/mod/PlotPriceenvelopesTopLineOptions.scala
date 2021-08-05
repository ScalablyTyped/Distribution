package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPriceenvelopesTopLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotPriceenvelopesTopLineStylesOptions] = js.undefined
}
object PlotPriceenvelopesTopLineOptions {
  
  inline def apply(): PlotPriceenvelopesTopLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPriceenvelopesTopLineOptions]
  }
  
  extension [Self <: PlotPriceenvelopesTopLineOptions](x: Self) {
    
    inline def setStyles(value: PlotPriceenvelopesTopLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
