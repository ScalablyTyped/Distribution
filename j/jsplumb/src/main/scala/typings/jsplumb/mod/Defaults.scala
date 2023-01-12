package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Defaults extends StObject {
  
  var Anchor: js.UndefOr[AnchorSpec] = js.undefined
  
  var Anchors: js.UndefOr[js.Tuple2[AnchorSpec, AnchorSpec]] = js.undefined
  
  var ConnectionOverlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
  
  var ConnectionsDetachable: js.UndefOr[Boolean] = js.undefined
  
  var Connector: js.UndefOr[ConnectorSpec] = js.undefined
  
  var Container: js.UndefOr[Any] = js.undefined
  
  // string(selector or id) or element
  var DragOptions: js.UndefOr[typings.jsplumb.mod.DragOptions] = js.undefined
  
  var Endpoint: js.UndefOr[EndpointSpec] = js.undefined
  
  var EndpointHoverStyle: js.UndefOr[PaintStyle] = js.undefined
  
  var EndpointStyle: js.UndefOr[PaintStyle] = js.undefined
  
  var Endpoints: js.UndefOr[js.Tuple2[EndpointSpec, EndpointSpec]] = js.undefined
  
  var HoverPaintStyle: js.UndefOr[PaintStyle] = js.undefined
  
  var PaintStyle: js.UndefOr[typings.jsplumb.mod.PaintStyle] = js.undefined
  
  var ReattachConnections: js.UndefOr[Boolean] = js.undefined
}
object Defaults {
  
  inline def apply(): Defaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Defaults] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: AnchorSpec): Self = StObject.set(x, "Anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "Anchor", js.undefined)
    
    inline def setAnchorVarargs(value: (AnchorStaticSpec | AnchorDynamicId | AnchorPerimeterSpec | AnchorContinuousSpec)*): Self = StObject.set(x, "Anchor", js.Array(value*))
    
    inline def setAnchors(value: js.Tuple2[AnchorSpec, AnchorSpec]): Self = StObject.set(x, "Anchors", value.asInstanceOf[js.Any])
    
    inline def setAnchorsUndefined: Self = StObject.set(x, "Anchors", js.undefined)
    
    inline def setConnectionOverlays(value: js.Array[OverlaySpec]): Self = StObject.set(x, "ConnectionOverlays", value.asInstanceOf[js.Any])
    
    inline def setConnectionOverlaysUndefined: Self = StObject.set(x, "ConnectionOverlays", js.undefined)
    
    inline def setConnectionOverlaysVarargs(value: OverlaySpec*): Self = StObject.set(x, "ConnectionOverlays", js.Array(value*))
    
    inline def setConnectionsDetachable(value: Boolean): Self = StObject.set(x, "ConnectionsDetachable", value.asInstanceOf[js.Any])
    
    inline def setConnectionsDetachableUndefined: Self = StObject.set(x, "ConnectionsDetachable", js.undefined)
    
    inline def setConnector(value: ConnectorSpec): Self = StObject.set(x, "Connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "Connector", js.undefined)
    
    inline def setContainer(value: Any): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
    
    inline def setDragOptions(value: DragOptions): Self = StObject.set(x, "DragOptions", value.asInstanceOf[js.Any])
    
    inline def setDragOptionsUndefined: Self = StObject.set(x, "DragOptions", js.undefined)
    
    inline def setEndpoint(value: EndpointSpec): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointHoverStyle(value: PaintStyle): Self = StObject.set(x, "EndpointHoverStyle", value.asInstanceOf[js.Any])
    
    inline def setEndpointHoverStyleUndefined: Self = StObject.set(x, "EndpointHoverStyle", js.undefined)
    
    inline def setEndpointStyle(value: PaintStyle): Self = StObject.set(x, "EndpointStyle", value.asInstanceOf[js.Any])
    
    inline def setEndpointStyleUndefined: Self = StObject.set(x, "EndpointStyle", js.undefined)
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setEndpoints(value: js.Tuple2[EndpointSpec, EndpointSpec]): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setHoverPaintStyle(value: PaintStyle): Self = StObject.set(x, "HoverPaintStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverPaintStyleUndefined: Self = StObject.set(x, "HoverPaintStyle", js.undefined)
    
    inline def setPaintStyle(value: PaintStyle): Self = StObject.set(x, "PaintStyle", value.asInstanceOf[js.Any])
    
    inline def setPaintStyleUndefined: Self = StObject.set(x, "PaintStyle", js.undefined)
    
    inline def setReattachConnections(value: Boolean): Self = StObject.set(x, "ReattachConnections", value.asInstanceOf[js.Any])
    
    inline def setReattachConnectionsUndefined: Self = StObject.set(x, "ReattachConnections", js.undefined)
  }
}
