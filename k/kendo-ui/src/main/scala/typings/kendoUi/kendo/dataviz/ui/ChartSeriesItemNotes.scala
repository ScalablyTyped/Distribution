package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesItemNotes extends StObject {
  
  var icon: js.UndefOr[ChartSeriesItemNotesIcon] = js.undefined
  
  var label: js.UndefOr[ChartSeriesItemNotesLabel] = js.undefined
  
  var line: js.UndefOr[ChartSeriesItemNotesLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var visual: js.UndefOr[js.Function] = js.undefined
}
object ChartSeriesItemNotes {
  
  @scala.inline
  def apply(): ChartSeriesItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemNotes]
  }
  
  @scala.inline
  implicit class ChartSeriesItemNotesMutableBuilder[Self <: ChartSeriesItemNotes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: ChartSeriesItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: ChartSeriesItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: ChartSeriesItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
