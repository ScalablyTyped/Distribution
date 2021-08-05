package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartPaneRenderEvent
  extends StObject
     with ChartEvent {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pane: js.UndefOr[typings.kendoUi.kendo.dataviz.ChartPane] = js.undefined
}
object ChartPaneRenderEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Chart): ChartPaneRenderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPaneRenderEvent]
  }
  
  extension [Self <: ChartPaneRenderEvent](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPane(value: typings.kendoUi.kendo.dataviz.ChartPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
  }
}
