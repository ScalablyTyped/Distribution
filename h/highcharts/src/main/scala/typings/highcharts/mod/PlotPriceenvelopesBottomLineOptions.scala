package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPriceenvelopesBottomLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotPriceenvelopesBottomLineStylesOptions] = js.undefined
}
object PlotPriceenvelopesBottomLineOptions {
  
  inline def apply(): PlotPriceenvelopesBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPriceenvelopesBottomLineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotPriceenvelopesBottomLineOptions] (val x: Self) extends AnyVal {
    
    inline def setStyles(value: PlotPriceenvelopesBottomLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
