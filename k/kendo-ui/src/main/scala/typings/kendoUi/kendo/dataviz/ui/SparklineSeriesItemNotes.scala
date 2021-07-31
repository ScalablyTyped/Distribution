package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesItemNotes extends StObject {
  
  var icon: js.UndefOr[SparklineSeriesItemNotesIcon] = js.undefined
  
  var label: js.UndefOr[SparklineSeriesItemNotesLabel] = js.undefined
  
  var line: js.UndefOr[SparklineSeriesItemNotesLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object SparklineSeriesItemNotes {
  
  @scala.inline
  def apply(): SparklineSeriesItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemNotes]
  }
  
  @scala.inline
  implicit class SparklineSeriesItemNotesMutableBuilder[Self <: SparklineSeriesItemNotes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: SparklineSeriesItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: SparklineSeriesItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: SparklineSeriesItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
