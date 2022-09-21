package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnection extends StObject {
  
  var content: js.UndefOr[DiagramConnectionContent] = js.undefined
  
  var editable: js.UndefOr[Boolean | DiagramConnectionEditable] = js.undefined
  
  var endCap: js.UndefOr[String | DiagramConnectionEndCap] = js.undefined
  
  var from: js.UndefOr[String | DiagramConnectionFrom] = js.undefined
  
  var fromConnector: js.UndefOr[String] = js.undefined
  
  var hover: js.UndefOr[DiagramConnectionHover] = js.undefined
  
  var points: js.UndefOr[js.Array[DiagramConnectionPoint]] = js.undefined
  
  var selection: js.UndefOr[DiagramConnectionSelection] = js.undefined
  
  var startCap: js.UndefOr[String | DiagramConnectionStartCap] = js.undefined
  
  var stroke: js.UndefOr[DiagramConnectionStroke] = js.undefined
  
  var to: js.UndefOr[String | DiagramConnectionTo] = js.undefined
  
  var toConnector: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DiagramConnection {
  
  inline def apply(): DiagramConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnection]
  }
  
  extension [Self <: DiagramConnection](x: Self) {
    
    inline def setContent(value: DiagramConnectionContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEditable(value: Boolean | DiagramConnectionEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEndCap(value: String | DiagramConnectionEndCap): Self = StObject.set(x, "endCap", value.asInstanceOf[js.Any])
    
    inline def setEndCapUndefined: Self = StObject.set(x, "endCap", js.undefined)
    
    inline def setFrom(value: String | DiagramConnectionFrom): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromConnector(value: String): Self = StObject.set(x, "fromConnector", value.asInstanceOf[js.Any])
    
    inline def setFromConnectorUndefined: Self = StObject.set(x, "fromConnector", js.undefined)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHover(value: DiagramConnectionHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setPoints(value: js.Array[DiagramConnectionPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: DiagramConnectionPoint*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setSelection(value: DiagramConnectionSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setStartCap(value: String | DiagramConnectionStartCap): Self = StObject.set(x, "startCap", value.asInstanceOf[js.Any])
    
    inline def setStartCapUndefined: Self = StObject.set(x, "startCap", js.undefined)
    
    inline def setStroke(value: DiagramConnectionStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setTo(value: String | DiagramConnectionTo): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToConnector(value: String): Self = StObject.set(x, "toConnector", value.asInstanceOf[js.Any])
    
    inline def setToConnectorUndefined: Self = StObject.set(x, "toConnector", js.undefined)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
