package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAbandsBottomLineStylesOptions extends StObject {
  
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}
object PlotAbandsBottomLineStylesOptions {
  
  @scala.inline
  def apply(): PlotAbandsBottomLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAbandsBottomLineStylesOptions]
  }
  
  @scala.inline
  implicit class PlotAbandsBottomLineStylesOptionsMutableBuilder[Self <: PlotAbandsBottomLineStylesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
