package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionDefaults extends StObject {
  
  var content: js.UndefOr[DiagramConnectionDefaultsContent] = js.native
  
  var editable: js.UndefOr[Boolean | DiagramConnectionDefaultsEditable] = js.native
  
  var endCap: js.UndefOr[String | DiagramConnectionDefaultsEndCap] = js.native
  
  var fromConnector: js.UndefOr[String] = js.native
  
  var hover: js.UndefOr[DiagramConnectionDefaultsHover] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var selection: js.UndefOr[DiagramConnectionDefaultsSelection] = js.native
  
  var startCap: js.UndefOr[String | DiagramConnectionDefaultsStartCap] = js.native
  
  var stroke: js.UndefOr[DiagramConnectionDefaultsStroke] = js.native
  
  var toConnector: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object DiagramConnectionDefaults {
  
  @scala.inline
  def apply(): DiagramConnectionDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaults]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsMutableBuilder[Self <: DiagramConnectionDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: DiagramConnectionDefaultsContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | DiagramConnectionDefaultsEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEndCap(value: String | DiagramConnectionDefaultsEndCap): Self = StObject.set(x, "endCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCapUndefined: Self = StObject.set(x, "endCap", js.undefined)
    
    @scala.inline
    def setFromConnector(value: String): Self = StObject.set(x, "fromConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromConnectorUndefined: Self = StObject.set(x, "fromConnector", js.undefined)
    
    @scala.inline
    def setHover(value: DiagramConnectionDefaultsHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSelection(value: DiagramConnectionDefaultsSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setStartCap(value: String | DiagramConnectionDefaultsStartCap): Self = StObject.set(x, "startCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCapUndefined: Self = StObject.set(x, "startCap", js.undefined)
    
    @scala.inline
    def setStroke(value: DiagramConnectionDefaultsStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setToConnector(value: String): Self = StObject.set(x, "toConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToConnectorUndefined: Self = StObject.set(x, "toConnector", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
