package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartYAxisItemNotes extends StObject {
  
  var data: js.UndefOr[js.Array[ChartYAxisItemNotesDataItem]] = js.undefined
  
  var icon: js.UndefOr[ChartYAxisItemNotesIcon] = js.undefined
  
  var label: js.UndefOr[ChartYAxisItemNotesLabel] = js.undefined
  
  var line: js.UndefOr[ChartYAxisItemNotesLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var visual: js.UndefOr[js.Function] = js.undefined
}
object ChartYAxisItemNotes {
  
  @scala.inline
  def apply(): ChartYAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartYAxisItemNotes]
  }
  
  @scala.inline
  implicit class ChartYAxisItemNotesMutableBuilder[Self <: ChartYAxisItemNotes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[ChartYAxisItemNotesDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: ChartYAxisItemNotesDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: ChartYAxisItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: ChartYAxisItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: ChartYAxisItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
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
