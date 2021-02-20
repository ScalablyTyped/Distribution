package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotIkhKijunLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotIkhKijunLineStylesOptions] = js.native
}
object PlotIkhKijunLineOptions {
  
  @scala.inline
  def apply(): PlotIkhKijunLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhKijunLineOptions]
  }
  
  @scala.inline
  implicit class PlotIkhKijunLineOptionsMutableBuilder[Self <: PlotIkhKijunLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotIkhKijunLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
