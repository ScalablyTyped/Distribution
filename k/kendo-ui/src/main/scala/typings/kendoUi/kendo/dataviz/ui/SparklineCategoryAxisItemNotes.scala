package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineCategoryAxisItemNotes extends StObject {
  
  var data: js.UndefOr[js.Array[SparklineCategoryAxisItemNotesDataItem]] = js.native
  
  var icon: js.UndefOr[SparklineCategoryAxisItemNotesIcon] = js.native
  
  var label: js.UndefOr[SparklineCategoryAxisItemNotesLabel] = js.native
  
  var line: js.UndefOr[SparklineCategoryAxisItemNotesLine] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object SparklineCategoryAxisItemNotes {
  
  @scala.inline
  def apply(): SparklineCategoryAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineCategoryAxisItemNotes]
  }
  
  @scala.inline
  implicit class SparklineCategoryAxisItemNotesMutableBuilder[Self <: SparklineCategoryAxisItemNotes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[SparklineCategoryAxisItemNotesDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: SparklineCategoryAxisItemNotesDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: SparklineCategoryAxisItemNotesIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: SparklineCategoryAxisItemNotesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: SparklineCategoryAxisItemNotesLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
