package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotIkhSenkouSpanAOptions extends StObject {
  
  var styles: js.UndefOr[PlotIkhSenkouSpanAStylesOptions] = js.undefined
}
object PlotIkhSenkouSpanAOptions {
  
  @scala.inline
  def apply(): PlotIkhSenkouSpanAOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhSenkouSpanAOptions]
  }
  
  @scala.inline
  implicit class PlotIkhSenkouSpanAOptionsMutableBuilder[Self <: PlotIkhSenkouSpanAOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotIkhSenkouSpanAStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
