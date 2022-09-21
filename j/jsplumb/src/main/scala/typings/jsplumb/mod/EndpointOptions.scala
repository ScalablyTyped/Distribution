package typings.jsplumb.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointOptions extends StObject {
  
  var anchor: js.UndefOr[AnchorSpec] = js.undefined
  
  var connectionType: js.UndefOr[String] = js.undefined
  
  var connectionsDetachable: js.UndefOr[Boolean] = js.undefined
  
  var connector: js.UndefOr[ConnectorSpec] = js.undefined
  
  var `connector-pointer-events`: js.UndefOr[String] = js.undefined
  
  var connectorClass: js.UndefOr[String] = js.undefined
  
  var connectorHoverClass: js.UndefOr[String] = js.undefined
  
  var connectorHoverStyle: js.UndefOr[PaintStyle] = js.undefined
  
  var connectorOverlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
  
  var connectorStyle: js.UndefOr[PaintStyle] = js.undefined
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  //= 1?
  var dragOptions: js.UndefOr[DragOptions] = js.undefined
  
  var dragProxy: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var dropOptions: js.UndefOr[DropOptions] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endpoint: js.UndefOr[EndpointSpec] = js.undefined
  
  var hoverClass: js.UndefOr[String] = js.undefined
  
  var hoverPaintStyle: js.UndefOr[PaintStyle] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  //= true
  var isSource: js.UndefOr[Boolean] = js.undefined
  
  //= false
  var isTarget: js.UndefOr[Boolean] = js.undefined
  
  var maxConnections: Double
  
  // "Dot", etc.
  var overlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
  
  //= true
  var paintStyle: js.UndefOr[PaintStyle] = js.undefined
  
  //= false
  var parameters: js.UndefOr[Record[String, Any]] = js.undefined
  
  //= false
  var reattach: js.UndefOr[Boolean] = js.undefined
  
  var reattachConnections: js.UndefOr[Boolean] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var uuid: js.UndefOr[String] = js.undefined
}
object EndpointOptions {
  
  inline def apply(maxConnections: Double): EndpointOptions = {
    val __obj = js.Dynamic.literal(maxConnections = maxConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointOptions]
  }
  
  extension [Self <: EndpointOptions](x: Self) {
    
    inline def setAnchor(value: AnchorSpec): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAnchorVarargs(value: (AnchorStaticSpec | AnchorDynamicId | AnchorPerimeterSpec | AnchorContinuousSpec)*): Self = StObject.set(x, "anchor", js.Array(value*))
    
    inline def setConnectionType(value: String): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    inline def setConnectionsDetachable(value: Boolean): Self = StObject.set(x, "connectionsDetachable", value.asInstanceOf[js.Any])
    
    inline def setConnectionsDetachableUndefined: Self = StObject.set(x, "connectionsDetachable", js.undefined)
    
    inline def setConnector(value: ConnectorSpec): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def `setConnector-pointer-events`(value: String): Self = StObject.set(x, "connector-pointer-events", value.asInstanceOf[js.Any])
    
    inline def `setConnector-pointer-eventsUndefined`: Self = StObject.set(x, "connector-pointer-events", js.undefined)
    
    inline def setConnectorClass(value: String): Self = StObject.set(x, "connectorClass", value.asInstanceOf[js.Any])
    
    inline def setConnectorClassUndefined: Self = StObject.set(x, "connectorClass", js.undefined)
    
    inline def setConnectorHoverClass(value: String): Self = StObject.set(x, "connectorHoverClass", value.asInstanceOf[js.Any])
    
    inline def setConnectorHoverClassUndefined: Self = StObject.set(x, "connectorHoverClass", js.undefined)
    
    inline def setConnectorHoverStyle(value: PaintStyle): Self = StObject.set(x, "connectorHoverStyle", value.asInstanceOf[js.Any])
    
    inline def setConnectorHoverStyleUndefined: Self = StObject.set(x, "connectorHoverStyle", js.undefined)
    
    inline def setConnectorOverlays(value: js.Array[OverlaySpec]): Self = StObject.set(x, "connectorOverlays", value.asInstanceOf[js.Any])
    
    inline def setConnectorOverlaysUndefined: Self = StObject.set(x, "connectorOverlays", js.undefined)
    
    inline def setConnectorOverlaysVarargs(value: OverlaySpec*): Self = StObject.set(x, "connectorOverlays", js.Array(value*))
    
    inline def setConnectorStyle(value: PaintStyle): Self = StObject.set(x, "connectorStyle", value.asInstanceOf[js.Any])
    
    inline def setConnectorStyleUndefined: Self = StObject.set(x, "connectorStyle", js.undefined)
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setDragOptions(value: DragOptions): Self = StObject.set(x, "dragOptions", value.asInstanceOf[js.Any])
    
    inline def setDragOptionsUndefined: Self = StObject.set(x, "dragOptions", js.undefined)
    
    inline def setDragProxy(value: String | js.Array[String]): Self = StObject.set(x, "dragProxy", value.asInstanceOf[js.Any])
    
    inline def setDragProxyUndefined: Self = StObject.set(x, "dragProxy", js.undefined)
    
    inline def setDragProxyVarargs(value: String*): Self = StObject.set(x, "dragProxy", js.Array(value*))
    
    inline def setDropOptions(value: DropOptions): Self = StObject.set(x, "dropOptions", value.asInstanceOf[js.Any])
    
    inline def setDropOptionsUndefined: Self = StObject.set(x, "dropOptions", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndpoint(value: EndpointSpec): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
    
    inline def setHoverClassUndefined: Self = StObject.set(x, "hoverClass", js.undefined)
    
    inline def setHoverPaintStyle(value: PaintStyle): Self = StObject.set(x, "hoverPaintStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverPaintStyleUndefined: Self = StObject.set(x, "hoverPaintStyle", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsSource(value: Boolean): Self = StObject.set(x, "isSource", value.asInstanceOf[js.Any])
    
    inline def setIsSourceUndefined: Self = StObject.set(x, "isSource", js.undefined)
    
    inline def setIsTarget(value: Boolean): Self = StObject.set(x, "isTarget", value.asInstanceOf[js.Any])
    
    inline def setIsTargetUndefined: Self = StObject.set(x, "isTarget", js.undefined)
    
    inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    inline def setOverlays(value: js.Array[OverlaySpec]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
    
    inline def setOverlaysVarargs(value: OverlaySpec*): Self = StObject.set(x, "overlays", js.Array(value*))
    
    inline def setPaintStyle(value: PaintStyle): Self = StObject.set(x, "paintStyle", value.asInstanceOf[js.Any])
    
    inline def setPaintStyleUndefined: Self = StObject.set(x, "paintStyle", js.undefined)
    
    inline def setParameters(value: Record[String, Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setReattach(value: Boolean): Self = StObject.set(x, "reattach", value.asInstanceOf[js.Any])
    
    inline def setReattachConnections(value: Boolean): Self = StObject.set(x, "reattachConnections", value.asInstanceOf[js.Any])
    
    inline def setReattachConnectionsUndefined: Self = StObject.set(x, "reattachConnections", js.undefined)
    
    inline def setReattachUndefined: Self = StObject.set(x, "reattach", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
