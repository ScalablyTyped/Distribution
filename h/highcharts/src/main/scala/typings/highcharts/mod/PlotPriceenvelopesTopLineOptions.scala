package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPriceenvelopesTopLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotPriceenvelopesTopLineStylesOptions] = js.undefined
}
object PlotPriceenvelopesTopLineOptions {
  
  @scala.inline
  def apply(): PlotPriceenvelopesTopLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPriceenvelopesTopLineOptions]
  }
  
  @scala.inline
  implicit class PlotPriceenvelopesTopLineOptionsMutableBuilder[Self <: PlotPriceenvelopesTopLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotPriceenvelopesTopLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
