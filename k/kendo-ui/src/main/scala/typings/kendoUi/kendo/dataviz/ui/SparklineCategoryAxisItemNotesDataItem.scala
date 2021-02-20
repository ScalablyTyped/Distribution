package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineCategoryAxisItemNotesDataItem extends StObject {
  
  var icon: js.UndefOr[SparklineCategoryAxisItemNotesDataItemIcon] = js.native
  
  var label: js.UndefOr[SparklineCategoryAxisItemNotesDataItemLabel] = js.native
  
  var line: js.UndefOr[SparklineCategoryAxisItemNotesDataItemLine] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object SparklineCategoryAxisItemNotesDataItem {
  
  @scala.inline
  def apply(): SparklineCategoryAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineCategoryAxisItemNotesDataItem]
  }
  
  @scala.inline
  implicit class SparklineCategoryAxisItemNotesDataItemMutableBuilder[Self <: SparklineCategoryAxisItemNotesDataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: SparklineCategoryAxisItemNotesDataItemIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: SparklineCategoryAxisItemNotesDataItemLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: SparklineCategoryAxisItemNotesDataItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
