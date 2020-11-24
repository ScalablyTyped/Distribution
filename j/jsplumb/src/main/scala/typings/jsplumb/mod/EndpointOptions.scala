package typings.jsplumb.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointOptions extends js.Object {
  
  var anchor: js.UndefOr[AnchorSpec] = js.native
  
  var connectionType: js.UndefOr[String] = js.native
  
  var connectionsDetachable: js.UndefOr[Boolean] = js.native
  
  var connector: js.UndefOr[ConnectorSpec] = js.native
  
  var `connector-pointer-events`: js.UndefOr[String] = js.native
  
  var connectorClass: js.UndefOr[String] = js.native
  
  var connectorHoverClass: js.UndefOr[String] = js.native
  
  var connectorHoverStyle: js.UndefOr[PaintStyle] = js.native
  
  var connectorOverlays: js.UndefOr[js.Array[OverlaySpec]] = js.native
  
  var connectorStyle: js.UndefOr[PaintStyle] = js.native
  
  var cssClass: js.UndefOr[String] = js.native
  
  //= 1?
  var dragOptions: js.UndefOr[DragOptions] = js.native
  
  var dragProxy: js.UndefOr[String | js.Array[String]] = js.native
  
  var dropOptions: js.UndefOr[DropOptions] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var endpoint: js.UndefOr[EndpointSpec] = js.native
  
  var hoverClass: js.UndefOr[String] = js.native
  
  var hoverPaintStyle: js.UndefOr[PaintStyle] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  //= true
  var isSource: js.UndefOr[Boolean] = js.native
  
  //= false
  var isTarget: js.UndefOr[Boolean] = js.native
  
  var maxConnections: Double = js.native
  
   // "Dot", etc.
  var overlays: js.UndefOr[js.Array[OverlaySpec]] = js.native
  
  //= true
  var paintStyle: js.UndefOr[PaintStyle] = js.native
  
  //= false
  var parameters: js.UndefOr[Record[String, _]] = js.native
  
  //= false
  var reattach: js.UndefOr[Boolean] = js.native
  
  var reattachConnections: js.UndefOr[Boolean] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var uuid: js.UndefOr[String] = js.native
}
object EndpointOptions {
  
  @scala.inline
  def apply(maxConnections: Double): EndpointOptions = {
    val __obj = js.Dynamic.literal(maxConnections = maxConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointOptions]
  }
  
  @scala.inline
  implicit class EndpointOptionsOps[Self <: EndpointOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorVarargs(value: (AnchorStaticSpec | AnchorDynamicId | AnchorPerimeterSpec | AnchorContinuousSpec)*): Self = this.set("anchor", js.Array(value :_*))
    
    @scala.inline
    def setAnchor(value: AnchorSpec): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setConnectionType(value: String): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionType: Self = this.set("connectionType", js.undefined)
    
    @scala.inline
    def setConnectionsDetachable(value: Boolean): Self = this.set("connectionsDetachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionsDetachable: Self = this.set("connectionsDetachable", js.undefined)
    
    @scala.inline
    def setConnector(value: ConnectorSpec): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
    
    @scala.inline
    def `setConnector-pointer-events`(value: String): Self = this.set("connector-pointer-events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteConnector-pointer-events`: Self = this.set("connector-pointer-events", js.undefined)
    
    @scala.inline
    def setConnectorClass(value: String): Self = this.set("connectorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorClass: Self = this.set("connectorClass", js.undefined)
    
    @scala.inline
    def setConnectorHoverClass(value: String): Self = this.set("connectorHoverClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorHoverClass: Self = this.set("connectorHoverClass", js.undefined)
    
    @scala.inline
    def setConnectorHoverStyle(value: PaintStyle): Self = this.set("connectorHoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorHoverStyle: Self = this.set("connectorHoverStyle", js.undefined)
    
    @scala.inline
    def setConnectorOverlaysVarargs(value: OverlaySpec*): Self = this.set("connectorOverlays", js.Array(value :_*))
    
    @scala.inline
    def setConnectorOverlays(value: js.Array[OverlaySpec]): Self = this.set("connectorOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorOverlays: Self = this.set("connectorOverlays", js.undefined)
    
    @scala.inline
    def setConnectorStyle(value: PaintStyle): Self = this.set("connectorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorStyle: Self = this.set("connectorStyle", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDragOptions(value: DragOptions): Self = this.set("dragOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragOptions: Self = this.set("dragOptions", js.undefined)
    
    @scala.inline
    def setDragProxyVarargs(value: String*): Self = this.set("dragProxy", js.Array(value :_*))
    
    @scala.inline
    def setDragProxy(value: String | js.Array[String]): Self = this.set("dragProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragProxy: Self = this.set("dragProxy", js.undefined)
    
    @scala.inline
    def setDropOptions(value: DropOptions): Self = this.set("dropOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropOptions: Self = this.set("dropOptions", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEndpoint(value: EndpointSpec): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setHoverClass(value: String): Self = this.set("hoverClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverClass: Self = this.set("hoverClass", js.undefined)
    
    @scala.inline
    def setHoverPaintStyle(value: PaintStyle): Self = this.set("hoverPaintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverPaintStyle: Self = this.set("hoverPaintStyle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsSource(value: Boolean): Self = this.set("isSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSource: Self = this.set("isSource", js.undefined)
    
    @scala.inline
    def setIsTarget(value: Boolean): Self = this.set("isTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTarget: Self = this.set("isTarget", js.undefined)
    
    @scala.inline
    def setOverlaysVarargs(value: OverlaySpec*): Self = this.set("overlays", js.Array(value :_*))
    
    @scala.inline
    def setOverlays(value: js.Array[OverlaySpec]): Self = this.set("overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlays: Self = this.set("overlays", js.undefined)
    
    @scala.inline
    def setPaintStyle(value: PaintStyle): Self = this.set("paintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaintStyle: Self = this.set("paintStyle", js.undefined)
    
    @scala.inline
    def setParameters(value: Record[String, _]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setReattach(value: Boolean): Self = this.set("reattach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReattach: Self = this.set("reattach", js.undefined)
    
    @scala.inline
    def setReattachConnections(value: Boolean): Self = this.set("reattachConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReattachConnections: Self = this.set("reattachConnections", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
