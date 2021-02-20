package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotTreemapTraverseUpButtonOptions extends StObject {
  
  /**
    * (Highcharts) The position of the button.
    */
  var position: js.UndefOr[PlotTreemapTraverseUpButtonPositionOptions] = js.native
}
object PlotTreemapTraverseUpButtonOptions {
  
  @scala.inline
  def apply(): PlotTreemapTraverseUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapTraverseUpButtonOptions]
  }
  
  @scala.inline
  implicit class PlotTreemapTraverseUpButtonOptionsMutableBuilder[Self <: PlotTreemapTraverseUpButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: PlotTreemapTraverseUpButtonPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
