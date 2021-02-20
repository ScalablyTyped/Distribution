package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesGanttDataDragDropGuideBoxOptions extends StObject {
  
  /**
    * (Gantt) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.native
}
object SeriesGanttDataDragDropGuideBoxOptions {
  
  @scala.inline
  def apply(): SeriesGanttDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesGanttDataDragDropGuideBoxOptions]
  }
  
  @scala.inline
  implicit class SeriesGanttDataDragDropGuideBoxOptionsMutableBuilder[Self <: SeriesGanttDataDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: DragDropGuideBoxOptionsObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
