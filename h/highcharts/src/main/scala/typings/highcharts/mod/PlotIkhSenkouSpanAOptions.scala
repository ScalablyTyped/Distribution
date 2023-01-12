package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotIkhSenkouSpanAOptions extends StObject {
  
  var styles: js.UndefOr[PlotIkhSenkouSpanAStylesOptions] = js.undefined
}
object PlotIkhSenkouSpanAOptions {
  
  inline def apply(): PlotIkhSenkouSpanAOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhSenkouSpanAOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotIkhSenkouSpanAOptions] (val x: Self) extends AnyVal {
    
    inline def setStyles(value: PlotIkhSenkouSpanAStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
