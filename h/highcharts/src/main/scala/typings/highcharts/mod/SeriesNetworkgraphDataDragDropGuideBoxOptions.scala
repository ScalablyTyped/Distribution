package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesNetworkgraphDataDragDropGuideBoxOptions extends StObject {
  
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.undefined
}
object SeriesNetworkgraphDataDragDropGuideBoxOptions {
  
  @scala.inline
  def apply(): SeriesNetworkgraphDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesNetworkgraphDataDragDropGuideBoxOptions]
  }
  
  @scala.inline
  implicit class SeriesNetworkgraphDataDragDropGuideBoxOptionsMutableBuilder[Self <: SeriesNetworkgraphDataDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: DragDropGuideBoxOptionsObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
