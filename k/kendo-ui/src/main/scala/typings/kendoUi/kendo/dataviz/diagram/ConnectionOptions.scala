package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions extends js.Object {
  
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
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: ConnectionContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setEndCap(value: String | ConnectionEndCap): Self = this.set("endCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndCap: Self = this.set("endCap", js.undefined)
    
    @scala.inline
    def setFromConnector(value: String): Self = this.set("fromConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromConnector: Self = this.set("fromConnector", js.undefined)
    
    @scala.inline
    def setFromX(value: Double): Self = this.set("fromX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromX: Self = this.set("fromX", js.undefined)
    
    @scala.inline
    def setFromY(value: Double): Self = this.set("fromY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromY: Self = this.set("fromY", js.undefined)
    
    @scala.inline
    def setHover(value: ConnectionHover): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: ConnectionPoint*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[ConnectionPoint]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setStartCap(value: String | ConnectionStartCap): Self = this.set("startCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartCap: Self = this.set("startCap", js.undefined)
    
    @scala.inline
    def setStroke(value: ConnectionStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setToConnector(value: String): Self = this.set("toConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToConnector: Self = this.set("toConnector", js.undefined)
    
    @scala.inline
    def setToX(value: Double): Self = this.set("toX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToX: Self = this.set("toX", js.undefined)
    
    @scala.inline
    def setToY(value: Double): Self = this.set("toY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToY: Self = this.set("toY", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
