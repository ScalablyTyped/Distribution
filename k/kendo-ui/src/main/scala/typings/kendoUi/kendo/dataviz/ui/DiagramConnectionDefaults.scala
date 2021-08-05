package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaults extends StObject {
  
  var content: js.UndefOr[DiagramConnectionDefaultsContent] = js.undefined
  
  var editable: js.UndefOr[Boolean | DiagramConnectionDefaultsEditable] = js.undefined
  
  var endCap: js.UndefOr[String | DiagramConnectionDefaultsEndCap] = js.undefined
  
  var fromConnector: js.UndefOr[String] = js.undefined
  
  var hover: js.UndefOr[DiagramConnectionDefaultsHover] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var selection: js.UndefOr[DiagramConnectionDefaultsSelection] = js.undefined
  
  var startCap: js.UndefOr[String | DiagramConnectionDefaultsStartCap] = js.undefined
  
  var stroke: js.UndefOr[DiagramConnectionDefaultsStroke] = js.undefined
  
  var toConnector: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DiagramConnectionDefaults {
  
  inline def apply(): DiagramConnectionDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaults]
  }
  
  extension [Self <: DiagramConnectionDefaults](x: Self) {
    
    inline def setContent(value: DiagramConnectionDefaultsContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEditable(value: Boolean | DiagramConnectionDefaultsEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEndCap(value: String | DiagramConnectionDefaultsEndCap): Self = StObject.set(x, "endCap", value.asInstanceOf[js.Any])
    
    inline def setEndCapUndefined: Self = StObject.set(x, "endCap", js.undefined)
    
    inline def setFromConnector(value: String): Self = StObject.set(x, "fromConnector", value.asInstanceOf[js.Any])
    
    inline def setFromConnectorUndefined: Self = StObject.set(x, "fromConnector", js.undefined)
    
    inline def setHover(value: DiagramConnectionDefaultsHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelection(value: DiagramConnectionDefaultsSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setStartCap(value: String | DiagramConnectionDefaultsStartCap): Self = StObject.set(x, "startCap", value.asInstanceOf[js.Any])
    
    inline def setStartCapUndefined: Self = StObject.set(x, "startCap", js.undefined)
    
    inline def setStroke(value: DiagramConnectionDefaultsStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setToConnector(value: String): Self = StObject.set(x, "toConnector", value.asInstanceOf[js.Any])
    
    inline def setToConnectorUndefined: Self = StObject.set(x, "toConnector", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
