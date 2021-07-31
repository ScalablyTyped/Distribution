package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineValueAxisItemNotes extends StObject {
  
  var data: js.UndefOr[js.Array[SparklineValueAxisItemNotesDataItem]] = js.undefined
  
  var icon: js.UndefOr[SparklineValueAxisItemNotesIcon] = js.undefined
  
  var label: js.UndefOr[SparklineValueAxisItemNotesLabel] = js.undefined
  
  var line: js.UndefOr[SparklineValueAxisItemNotesLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object SparklineValueAxisItemNotes {
  
  @scala.inline
  def apply(): SparklineValueAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineValueAxisItemNotes]
  }
  
  @scala.inline
  implicit class SparklineValueAxisItemNotesMutableBuilder[Self <: SparklineValueAxisItemNotes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[SparklineValueAxisItemNotesDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: SparklineValueAxisItemNotesDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: SparklineValueAxisItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: SparklineValueAxisItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: SparklineValueAxisItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
