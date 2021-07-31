package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotIkhChikouLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotIkhChikouLineStylesOptions] = js.undefined
}
object PlotIkhChikouLineOptions {
  
  @scala.inline
  def apply(): PlotIkhChikouLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhChikouLineOptions]
  }
  
  @scala.inline
  implicit class PlotIkhChikouLineOptionsMutableBuilder[Self <: PlotIkhChikouLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotIkhChikouLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
