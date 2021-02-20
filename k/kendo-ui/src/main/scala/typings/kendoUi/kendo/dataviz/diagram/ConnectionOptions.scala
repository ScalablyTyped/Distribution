package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions extends StObject {
  
  var content: js.UndefOr[ConnectionContent] = js.native
  
  var endCap: js.UndefOr[String | ConnectionEndCap] = js.native
  
  var fromConnector: js.UndefOr[String] = js.native
  
  var fromX: js.UndefOr[Double] = js.native
  
  var fromY: js.UndefOr[Double] = js.native
  
  var hover: js.UndefOr[ConnectionHover] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var points: js.UndefOr[js.Array[ConnectionPoint]] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var startCap: js.UndefOr[String | ConnectionStartCap] = js.native
  
  var stroke: js.UndefOr[ConnectionStroke] = js.native
  
  var toConnector: js.UndefOr[String] = js.native
  
  var toX: js.UndefOr[Double] = js.native
  
  var toY: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ConnectionContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setEndCap(value: String | ConnectionEndCap): Self = StObject.set(x, "endCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCapUndefined: Self = StObject.set(x, "endCap", js.undefined)
    
    @scala.inline
    def setFromConnector(value: String): Self = StObject.set(x, "fromConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromConnectorUndefined: Self = StObject.set(x, "fromConnector", js.undefined)
    
    @scala.inline
    def setFromX(value: Double): Self = StObject.set(x, "fromX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromXUndefined: Self = StObject.set(x, "fromX", js.undefined)
    
    @scala.inline
    def setFromY(value: Double): Self = StObject.set(x, "fromY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromYUndefined: Self = StObject.set(x, "fromY", js.undefined)
    
    @scala.inline
    def setHover(value: ConnectionHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[ConnectionPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: ConnectionPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setStartCap(value: String | ConnectionStartCap): Self = StObject.set(x, "startCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCapUndefined: Self = StObject.set(x, "startCap", js.undefined)
    
    @scala.inline
    def setStroke(value: ConnectionStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setToConnector(value: String): Self = StObject.set(x, "toConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToConnectorUndefined: Self = StObject.set(x, "toConnector", js.undefined)
    
    @scala.inline
    def setToX(value: Double): Self = StObject.set(x, "toX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToXUndefined: Self = StObject.set(x, "toX", js.undefined)
    
    @scala.inline
    def setToY(value: Double): Self = StObject.set(x, "toY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToYUndefined: Self = StObject.set(x, "toY", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
