package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotColumnrangeDragDropGuideBoxOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.undefined
}
object PlotColumnrangeDragDropGuideBoxOptions {
  
  @scala.inline
  def apply(): PlotColumnrangeDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotColumnrangeDragDropGuideBoxOptions]
  }
  
  @scala.inline
  implicit class PlotColumnrangeDragDropGuideBoxOptionsMutableBuilder[Self <: PlotColumnrangeDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: DragDropGuideBoxOptionsObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
