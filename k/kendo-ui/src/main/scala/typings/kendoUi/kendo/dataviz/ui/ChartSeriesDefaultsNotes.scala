package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesDefaultsNotes extends StObject {
  
  var icon: js.UndefOr[ChartSeriesDefaultsNotesIcon] = js.undefined
  
  var label: js.UndefOr[ChartSeriesDefaultsNotesLabel] = js.undefined
  
  var line: js.UndefOr[ChartSeriesDefaultsNotesLine] = js.undefined
  
  var visual: js.UndefOr[js.Function] = js.undefined
}
object ChartSeriesDefaultsNotes {
  
  inline def apply(): ChartSeriesDefaultsNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesDefaultsNotes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartSeriesDefaultsNotes] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: ChartSeriesDefaultsNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: ChartSeriesDefaultsNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: ChartSeriesDefaultsNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    inline def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
