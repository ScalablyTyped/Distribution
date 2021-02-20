package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPcTopLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotPcTopLineStylesOptions] = js.native
}
object PlotPcTopLineOptions {
  
  @scala.inline
  def apply(): PlotPcTopLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPcTopLineOptions]
  }
  
  @scala.inline
  implicit class PlotPcTopLineOptionsMutableBuilder[Self <: PlotPcTopLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotPcTopLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
