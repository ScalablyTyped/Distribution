package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Defaults extends StObject {
  
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
  implicit class DefaultsMutableBuilder[Self <: Defaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: AnchorSpec): Self = StObject.set(x, "Anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "Anchor", js.undefined)
    
    @scala.inline
    def setAnchorVarargs(value: (AnchorStaticSpec | AnchorDynamicId | AnchorPerimeterSpec | AnchorContinuousSpec)*): Self = StObject.set(x, "Anchor", js.Array(value :_*))
    
    @scala.inline
    def setAnchors(value: js.Tuple2[AnchorSpec, AnchorSpec]): Self = StObject.set(x, "Anchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorsUndefined: Self = StObject.set(x, "Anchors", js.undefined)
    
    @scala.inline
    def setConnectionOverlays(value: js.Array[OverlaySpec]): Self = StObject.set(x, "ConnectionOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionOverlaysUndefined: Self = StObject.set(x, "ConnectionOverlays", js.undefined)
    
    @scala.inline
    def setConnectionOverlaysVarargs(value: OverlaySpec*): Self = StObject.set(x, "ConnectionOverlays", js.Array(value :_*))
    
    @scala.inline
    def setConnectionsDetachable(value: Boolean): Self = StObject.set(x, "ConnectionsDetachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsDetachableUndefined: Self = StObject.set(x, "ConnectionsDetachable", js.undefined)
    
    @scala.inline
    def setConnector(value: ConnectorSpec): Self = StObject.set(x, "Connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorUndefined: Self = StObject.set(x, "Connector", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
    
    @scala.inline
    def setDragOptions(value: DragOptions): Self = StObject.set(x, "DragOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOptionsUndefined: Self = StObject.set(x, "DragOptions", js.undefined)
    
    @scala.inline
    def setEndpoint(value: EndpointSpec): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointHoverStyle(value: PaintStyle): Self = StObject.set(x, "EndpointHoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointHoverStyleUndefined: Self = StObject.set(x, "EndpointHoverStyle", js.undefined)
    
    @scala.inline
    def setEndpointStyle(value: PaintStyle): Self = StObject.set(x, "EndpointStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointStyleUndefined: Self = StObject.set(x, "EndpointStyle", js.undefined)
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setEndpoints(value: js.Tuple2[EndpointSpec, EndpointSpec]): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    @scala.inline
    def setHoverPaintStyle(value: PaintStyle): Self = StObject.set(x, "HoverPaintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverPaintStyleUndefined: Self = StObject.set(x, "HoverPaintStyle", js.undefined)
    
    @scala.inline
    def setPaintStyle(value: PaintStyle): Self = StObject.set(x, "PaintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintStyleUndefined: Self = StObject.set(x, "PaintStyle", js.undefined)
    
    @scala.inline
    def setReattachConnections(value: Boolean): Self = StObject.set(x, "ReattachConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReattachConnectionsUndefined: Self = StObject.set(x, "ReattachConnections", js.undefined)
  }
}
