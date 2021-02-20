package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPriceenvelopesBottomLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotPriceenvelopesBottomLineStylesOptions] = js.native
}
object PlotPriceenvelopesBottomLineOptions {
  
  @scala.inline
  def apply(): PlotPriceenvelopesBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPriceenvelopesBottomLineOptions]
  }
  
  @scala.inline
  implicit class PlotPriceenvelopesBottomLineOptionsMutableBuilder[Self <: PlotPriceenvelopesBottomLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotPriceenvelopesBottomLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
