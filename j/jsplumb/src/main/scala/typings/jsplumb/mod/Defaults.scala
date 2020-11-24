package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Defaults extends js.Object {
  
  var Anchor: js.UndefOr[AnchorSpec] = js.native
  
  var Anchors: js.UndefOr[js.Tuple2[AnchorSpec, AnchorSpec]] = js.native
  
  var ConnectionOverlays: js.UndefOr[js.Array[OverlaySpec]] = js.native
  
  var ConnectionsDetachable: js.UndefOr[Boolean] = js.native
  
  var Connector: js.UndefOr[ConnectorSpec] = js.native
  
  var Container: js.UndefOr[js.Any] = js.native
  
   // string(selector or id) or element
  var DragOptions: js.UndefOr[typings.jsplumb.mod.DragOptions] = js.native
  
  var Endpoint: js.UndefOr[EndpointSpec] = js.native
  
  var EndpointHoverStyle: js.UndefOr[PaintStyle] = js.native
  
  var EndpointStyle: js.UndefOr[PaintStyle] = js.native
  
  var Endpoints: js.UndefOr[js.Tuple2[EndpointSpec, EndpointSpec]] = js.native
  
  var HoverPaintStyle: js.UndefOr[PaintStyle] = js.native
  
  var PaintStyle: js.UndefOr[typings.jsplumb.mod.PaintStyle] = js.native
  
  var ReattachConnections: js.UndefOr[Boolean] = js.native
}
object Defaults {
  
  @scala.inline
  def apply(): Defaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaults]
  }
  
  @scala.inline
  implicit class DefaultsOps[Self <: Defaults] (val x: Self) extends AnyVal {
    
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
    def setAnchorVarargs(value: (AnchorStaticSpec | AnchorDynamicId | AnchorPerimeterSpec | AnchorContinuousSpec)*): Self = this.set("Anchor", js.Array(value :_*))
    
    @scala.inline
    def setAnchor(value: AnchorSpec): Self = this.set("Anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("Anchor", js.undefined)
    
    @scala.inline
    def setAnchors(value: js.Tuple2[AnchorSpec, AnchorSpec]): Self = this.set("Anchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchors: Self = this.set("Anchors", js.undefined)
    
    @scala.inline
    def setConnectionOverlaysVarargs(value: OverlaySpec*): Self = this.set("ConnectionOverlays", js.Array(value :_*))
    
    @scala.inline
    def setConnectionOverlays(value: js.Array[OverlaySpec]): Self = this.set("ConnectionOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionOverlays: Self = this.set("ConnectionOverlays", js.undefined)
    
    @scala.inline
    def setConnectionsDetachable(value: Boolean): Self = this.set("ConnectionsDetachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionsDetachable: Self = this.set("ConnectionsDetachable", js.undefined)
    
    @scala.inline
    def setConnector(value: ConnectorSpec): Self = this.set("Connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnector: Self = this.set("Connector", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Any): Self = this.set("Container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("Container", js.undefined)
    
    @scala.inline
    def setDragOptions(value: DragOptions): Self = this.set("DragOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragOptions: Self = this.set("DragOptions", js.undefined)
    
    @scala.inline
    def setEndpoint(value: EndpointSpec): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    
    @scala.inline
    def setEndpointHoverStyle(value: PaintStyle): Self = this.set("EndpointHoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointHoverStyle: Self = this.set("EndpointHoverStyle", js.undefined)
    
    @scala.inline
    def setEndpointStyle(value: PaintStyle): Self = this.set("EndpointStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointStyle: Self = this.set("EndpointStyle", js.undefined)
    
    @scala.inline
    def setEndpoints(value: js.Tuple2[EndpointSpec, EndpointSpec]): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    
    @scala.inline
    def setHoverPaintStyle(value: PaintStyle): Self = this.set("HoverPaintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverPaintStyle: Self = this.set("HoverPaintStyle", js.undefined)
    
    @scala.inline
    def setPaintStyle(value: PaintStyle): Self = this.set("PaintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaintStyle: Self = this.set("PaintStyle", js.undefined)
    
    @scala.inline
    def setReattachConnections(value: Boolean): Self = this.set("ReattachConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReattachConnections: Self = this.set("ReattachConnections", js.undefined)
  }
}
