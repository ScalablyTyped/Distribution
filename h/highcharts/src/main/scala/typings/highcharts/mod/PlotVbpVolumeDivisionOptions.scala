package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotVbpVolumeDivisionOptions extends StObject {
  
  /**
    * (Highstock) Option to control if volume is divided.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  var styles: js.UndefOr[PlotVbpVolumeDivisionStylesOptions] = js.native
}
object PlotVbpVolumeDivisionOptions {
  
  @scala.inline
  def apply(): PlotVbpVolumeDivisionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpVolumeDivisionOptions]
  }
  
  @scala.inline
  implicit class PlotVbpVolumeDivisionOptionsMutableBuilder[Self <: PlotVbpVolumeDivisionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setStyles(value: PlotVbpVolumeDivisionStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
