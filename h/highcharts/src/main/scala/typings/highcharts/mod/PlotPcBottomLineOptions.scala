package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPcBottomLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotPcBottomLineStylesOptions] = js.undefined
}
object PlotPcBottomLineOptions {
  
  @scala.inline
  def apply(): PlotPcBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPcBottomLineOptions]
  }
  
  @scala.inline
  implicit class PlotPcBottomLineOptionsMutableBuilder[Self <: PlotPcBottomLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotPcBottomLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
