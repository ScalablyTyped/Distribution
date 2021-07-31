package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSeriesDragDropGuideBoxOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Style options for the guide box
    * default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.undefined
}
object PlotSeriesDragDropGuideBoxOptions {
  
  @scala.inline
  def apply(): PlotSeriesDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSeriesDragDropGuideBoxOptions]
  }
  
  @scala.inline
  implicit class PlotSeriesDragDropGuideBoxOptionsMutableBuilder[Self <: PlotSeriesDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: DragDropGuideBoxOptionsObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
