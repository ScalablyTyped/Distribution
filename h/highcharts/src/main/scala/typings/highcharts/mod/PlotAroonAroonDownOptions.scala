package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAroonAroonDownOptions extends StObject {
  
  /**
    * (Highstock) Styles for an aroonDown line.
    */
  var styles: js.UndefOr[PlotAroonAroonDownStylesOptions] = js.undefined
}
object PlotAroonAroonDownOptions {
  
  @scala.inline
  def apply(): PlotAroonAroonDownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAroonAroonDownOptions]
  }
  
  @scala.inline
  implicit class PlotAroonAroonDownOptionsMutableBuilder[Self <: PlotAroonAroonDownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotAroonAroonDownStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
