package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartXAxisItemNotesDataItem extends StObject {
  
  var icon: js.UndefOr[ChartXAxisItemNotesDataItemIcon] = js.undefined
  
  var label: js.UndefOr[ChartXAxisItemNotesDataItemLabel] = js.undefined
  
  var line: js.UndefOr[ChartXAxisItemNotesDataItemLine] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object ChartXAxisItemNotesDataItem {
  
  @scala.inline
  def apply(): ChartXAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartXAxisItemNotesDataItem]
  }
  
  @scala.inline
  implicit class ChartXAxisItemNotesDataItemMutableBuilder[Self <: ChartXAxisItemNotesDataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: ChartXAxisItemNotesDataItemIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: ChartXAxisItemNotesDataItemLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: ChartXAxisItemNotesDataItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
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
