package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotIkhChikouLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotIkhChikouLineStylesOptions] = js.undefined
}
object PlotIkhChikouLineOptions {
  
  inline def apply(): PlotIkhChikouLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhChikouLineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotIkhChikouLineOptions] (val x: Self) extends AnyVal {
    
    inline def setStyles(value: PlotIkhChikouLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
