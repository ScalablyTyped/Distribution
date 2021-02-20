package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotKeltnerchannelsBottomLineOptions extends StObject {
  
  /**
    * (Highstock) Styles for a bottom line.
    */
  var styles: js.UndefOr[PlotKeltnerchannelsBottomLineStylesOptions] = js.native
}
object PlotKeltnerchannelsBottomLineOptions {
  
  @scala.inline
  def apply(): PlotKeltnerchannelsBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotKeltnerchannelsBottomLineOptions]
  }
  
  @scala.inline
  implicit class PlotKeltnerchannelsBottomLineOptionsMutableBuilder[Self <: PlotKeltnerchannelsBottomLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotKeltnerchannelsBottomLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
