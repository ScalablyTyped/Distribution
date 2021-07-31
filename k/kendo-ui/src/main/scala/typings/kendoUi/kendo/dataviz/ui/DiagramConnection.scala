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
  
  @scala.inline
  def apply(): DiagramConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnection]
  }
  
  @scala.inline
  implicit class DiagramConnectionMutableBuilder[Self <: DiagramConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: DiagramConnectionContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | DiagramConnectionEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEndCap(value: String | DiagramConnectionEndCap): Self = StObject.set(x, "endCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCapUndefined: Self = StObject.set(x, "endCap", js.undefined)
    
    @scala.inline
    def setFrom(value: String | DiagramConnectionFrom): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromConnector(value: String): Self = StObject.set(x, "fromConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromConnectorUndefined: Self = StObject.set(x, "fromConnector", js.undefined)
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setHover(value: DiagramConnectionHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[DiagramConnectionPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: DiagramConnectionPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setSelection(value: DiagramConnectionSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setStartCap(value: String | DiagramConnectionStartCap): Self = StObject.set(x, "startCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCapUndefined: Self = StObject.set(x, "startCap", js.undefined)
    
    @scala.inline
    def setStroke(value: DiagramConnectionStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setTo(value: String | DiagramConnectionTo): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToConnector(value: String): Self = StObject.set(x, "toConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToConnectorUndefined: Self = StObject.set(x, "toConnector", js.undefined)
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
