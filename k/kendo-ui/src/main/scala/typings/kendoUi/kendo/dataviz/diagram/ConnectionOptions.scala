package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionOptions extends StObject {
  
  var content: js.UndefOr[ConnectionContent] = js.undefined
  
  var endCap: js.UndefOr[String | ConnectionEndCap] = js.undefined
  
  var fromConnector: js.UndefOr[String] = js.undefined
  
  var fromX: js.UndefOr[Double] = js.undefined
  
  var fromY: js.UndefOr[Double] = js.undefined
  
  var hover: js.UndefOr[ConnectionHover] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var points: js.UndefOr[js.Array[ConnectionPoint]] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var startCap: js.UndefOr[String | ConnectionStartCap] = js.undefined
  
  var stroke: js.UndefOr[ConnectionStroke] = js.undefined
  
  var toConnector: js.UndefOr[String] = js.undefined
  
  var toX: js.UndefOr[Double] = js.undefined
  
  var toY: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ConnectionOptions {
  
  inline def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  extension [Self <: ConnectionOptions](x: Self) {
    
    inline def setContent(value: ConnectionContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEndCap(value: String | ConnectionEndCap): Self = StObject.set(x, "endCap", value.asInstanceOf[js.Any])
    
    inline def setEndCapUndefined: Self = StObject.set(x, "endCap", js.undefined)
    
    inline def setFromConnector(value: String): Self = StObject.set(x, "fromConnector", value.asInstanceOf[js.Any])
    
    inline def setFromConnectorUndefined: Self = StObject.set(x, "fromConnector", js.undefined)
    
    inline def setFromX(value: Double): Self = StObject.set(x, "fromX", value.asInstanceOf[js.Any])
    
    inline def setFromXUndefined: Self = StObject.set(x, "fromX", js.undefined)
    
    inline def setFromY(value: Double): Self = StObject.set(x, "fromY", value.asInstanceOf[js.Any])
    
    inline def setFromYUndefined: Self = StObject.set(x, "fromY", js.undefined)
    
    inline def setHover(value: ConnectionHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPoints(value: js.Array[ConnectionPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: ConnectionPoint*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setStartCap(value: String | ConnectionStartCap): Self = StObject.set(x, "startCap", value.asInstanceOf[js.Any])
    
    inline def setStartCapUndefined: Self = StObject.set(x, "startCap", js.undefined)
    
    inline def setStroke(value: ConnectionStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setToConnector(value: String): Self = StObject.set(x, "toConnector", value.asInstanceOf[js.Any])
    
    inline def setToConnectorUndefined: Self = StObject.set(x, "toConnector", js.undefined)
    
    inline def setToX(value: Double): Self = StObject.set(x, "toX", value.asInstanceOf[js.Any])
    
    inline def setToXUndefined: Self = StObject.set(x, "toX", js.undefined)
    
    inline def setToY(value: Double): Self = StObject.set(x, "toY", value.asInstanceOf[js.Any])
    
    inline def setToYUndefined: Self = StObject.set(x, "toY", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
