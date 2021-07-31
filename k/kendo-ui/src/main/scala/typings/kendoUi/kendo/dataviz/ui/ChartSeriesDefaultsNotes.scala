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
  
  @scala.inline
  def apply(): ChartSeriesDefaultsNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesDefaultsNotes]
  }
  
  @scala.inline
  implicit class ChartSeriesDefaultsNotesMutableBuilder[Self <: ChartSeriesDefaultsNotes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: ChartSeriesDefaultsNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: ChartSeriesDefaultsNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: ChartSeriesDefaultsNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
