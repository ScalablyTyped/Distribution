package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotSunburstTraverseUpButtonOptions extends StObject {
  
  /**
    * (Highcharts) The position of the button.
    */
  var position: js.UndefOr[PlotSunburstTraverseUpButtonPositionOptions] = js.native
}
object PlotSunburstTraverseUpButtonOptions {
  
  @scala.inline
  def apply(): PlotSunburstTraverseUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstTraverseUpButtonOptions]
  }
  
  @scala.inline
  implicit class PlotSunburstTraverseUpButtonOptionsMutableBuilder[Self <: PlotSunburstTraverseUpButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: PlotSunburstTraverseUpButtonPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
