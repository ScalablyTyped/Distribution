package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsplumb", "jsPlumb")
@js.native
object jsPlumbNs extends js.Object {
  trait Anchor extends js.Object {
    var cssClass: java.lang.String
    var elementId: java.lang.String
    var id: java.lang.String
    var locked: scala.Boolean
    var offsets: js.Tuple2[scala.Double, scala.Double]
    var orientation: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint]
    var `type`: AnchorId
    var x: scala.Double
    var y: scala.Double
  }
  
  /* -------------------------------------------- ANCHORS -------------------------------------------------------- */
  trait AnchorOptions extends js.Object
  
  trait ArrowOverlayOptions extends OverlayOptions {
     // 0.5
    var direction: js.UndefOr[scala.Double] = js.undefined
     // 1
    var foldback: js.UndefOr[scala.Double] = js.undefined
     // 20
    var length: js.UndefOr[scala.Double] = js.undefined
     // 20
    var location: js.UndefOr[scala.Double] = js.undefined
     // 0.623
    var paintStyle: js.UndefOr[PaintStyle] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait ConnectParams extends js.Object {
    var anchor: js.UndefOr[AnchorSpec] = js.undefined
    var anchors: js.UndefOr[js.Tuple2[AnchorSpec, AnchorSpec]] = js.undefined
    var connector: js.UndefOr[ConnectorSpec] = js.undefined
    var deleteEndpointsOnDetach: js.UndefOr[scala.Boolean] = js.undefined
    var detachable: js.UndefOr[scala.Boolean] = js.undefined
    var endpoint: js.UndefOr[EndpointSpec] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var overlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
    var source: js.UndefOr[ElementRef | Endpoint] = js.undefined
    var target: js.UndefOr[ElementRef | Endpoint] = js.undefined
    var uuids: js.UndefOr[js.Tuple2[UUID, UUID]] = js.undefined
  }
  
  trait Connection extends js.Object {
    var endpoints: js.Tuple2[Endpoint, Endpoint]
    var id: ConnectionId
    def getElement(): Connection
    def getOverlay(s: java.lang.String): Overlay
    def hideOverlay(s: java.lang.String): scala.Unit
    def repaint(): scala.Unit
    def setDetachable(detachable: scala.Boolean): scala.Unit
    def setLabel(s: java.lang.String): scala.Unit
    def setParameter(name: java.lang.String, value: js.Any): scala.Unit
    def showOverlay(s: java.lang.String): scala.Unit
  }
  
  trait ConnectionMadeEventInfo extends js.Object {
    var connection: Connection
    var source: stdLib.HTMLDivElement
    var sourceEndpoint: Endpoint
    var sourceId: java.lang.String
    var target: stdLib.HTMLDivElement
    var targetEndpoint: Endpoint
    var targetId: java.lang.String
  }
  
  trait Connections extends js.Object {
    var length: scala.Double
    def detach(): scala.Unit
    def each(e: js.Function1[/* c */ Connection, scala.Unit]): scala.Unit
  }
  
  /* -------------------------------------------- CONNECTORS ---------------------------------------------------- */
  trait ConnectorOptions extends js.Object
  
  trait Defaults extends js.Object {
    var Anchor: js.UndefOr[AnchorSpec] = js.undefined
    var Anchors: js.UndefOr[js.Tuple2[AnchorSpec, AnchorSpec]] = js.undefined
    var ConnectionOverlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
    var ConnectionsDetachable: js.UndefOr[scala.Boolean] = js.undefined
    var Connector: js.UndefOr[ConnectorSpec] = js.undefined
    var Container: js.UndefOr[js.Any] = js.undefined
     // string(selector or id) or element
    var DragOptions: js.UndefOr[DragOptions] = js.undefined
    var Endpoint: js.UndefOr[EndpointSpec] = js.undefined
    var EndpointHoverStyle: js.UndefOr[PaintStyle] = js.undefined
    var EndpointStyle: js.UndefOr[PaintStyle] = js.undefined
    var Endpoints: js.UndefOr[js.Tuple2[EndpointSpec, EndpointSpec]] = js.undefined
    var HoverPaintStyle: js.UndefOr[PaintStyle] = js.undefined
    var PaintStyle: js.UndefOr[PaintStyle] = js.undefined
    var ReattachConnections: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait DragEventCallbackOptions extends js.Object {
    var drag: js.Object
     // The associated Drag instance
    var e: stdLib.MouseEvent
    var el: stdLib.HTMLElement
     // element being dragged
    var pos: js.Tuple2[scala.Double, scala.Double]
  }
  
  trait DragOptions extends js.Object {
    var containment: js.UndefOr[java.lang.String] = js.undefined
    var cursor: js.UndefOr[java.lang.String] = js.undefined
    var drag: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, scala.Unit]] = js.undefined
    var start: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, scala.Unit]] = js.undefined
    var stop: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, scala.Unit]] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait DropOptions extends js.Object {
    var hoverClass: java.lang.String
  }
  
  trait Endpoint extends js.Object {
    var anchor: Anchor
    var connections: js.UndefOr[js.Array[Connection]] = js.undefined
    //= 1?
    var id: java.lang.String
    var maxConnections: scala.Double
    var scope: java.lang.String
    var `type`: EndpointId
    def connectorSelector(): Connection
    def getElement(): stdLib.Element
    def isEnabled(): scala.Boolean
    def setElement(el: stdLib.Element): scala.Unit
    def setEnabled(enabled: scala.Boolean): scala.Unit
    def setEndpoint(spec: EndpointSpec): scala.Unit
    def setHover(hover: scala.Boolean): scala.Unit
  }
  
  trait EndpointOptions extends js.Object {
    var anchor: js.UndefOr[AnchorSpec] = js.undefined
    var connectionType: js.UndefOr[java.lang.String] = js.undefined
    var connectionsDetachable: js.UndefOr[scala.Boolean] = js.undefined
    var connector: js.UndefOr[ConnectorSpec] = js.undefined
    var `connector-pointer-events`: js.UndefOr[java.lang.String] = js.undefined
    var connectorClass: js.UndefOr[java.lang.String] = js.undefined
    var connectorHoverClass: js.UndefOr[java.lang.String] = js.undefined
    var connectorHoverStyle: js.UndefOr[PaintStyle] = js.undefined
    var connectorOverlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
    var connectorStyle: js.UndefOr[PaintStyle] = js.undefined
    var cssClass: js.UndefOr[java.lang.String] = js.undefined
    //= 1?
    var dragOptions: js.UndefOr[DragOptions] = js.undefined
    var dragProxy: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
    var dropOptions: js.UndefOr[DropOptions] = js.undefined
    var enabled: js.UndefOr[scala.Boolean] = js.undefined
    var endpoint: js.UndefOr[Endpoint] = js.undefined
    var hoverClass: js.UndefOr[java.lang.String] = js.undefined
    var hoverPaintStyle: js.UndefOr[PaintStyle] = js.undefined
    var id: java.lang.String
    //= true
    var isSource: js.UndefOr[scala.Boolean] = js.undefined
    //= false
    var isTarget: js.UndefOr[scala.Boolean] = js.undefined
    var maxConnections: scala.Double
    //= true
    var paintStyle: js.UndefOr[PaintStyle] = js.undefined
    //= false
    var parameters: js.Object
    //= false
    var reattach: js.UndefOr[scala.Boolean] = js.undefined
    var reattachConnections: scala.Boolean
    var scope: java.lang.String
    var `type`: java.lang.String
  }
  
  /**
    * The actual component that does the rendering.
    */
  trait EndpointRenderer extends js.Object
  
  trait LabelOverlayOptions extends OverlayOptions {
    var cssClass: js.UndefOr[java.lang.String] = js.undefined
    var label: java.lang.String
     // 0.5
    var labelStyle: js.UndefOr[jsplumbLib.Anon_BorderStyle] = js.undefined
    var location: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait OnConnectionBindInfo extends js.Object {
    var connection: Connection
    //- the source Endpoint in the Connection
    var newSourceEndpoint: Endpoint
    var newSourceId: java.lang.String
    //- the targetEndpoint in the Connection
    var newTargetEndpoint: Endpoint
    var newTargetId: java.lang.String
    // - id of the source element in the Connection
    var originalSourceId: java.lang.String
    // - id of the target element in the Connection
    var originalTargetId: java.lang.String
    var source: stdLib.Element
    //- the target element in the Connection
    var sourceEndpoint: Endpoint
    // the new Connection.you can register listeners on this etc.
    var sourceId: java.lang.String
    // - the source element in the Connection
    var target: stdLib.Element
    var targetEndpoint: Endpoint
    var targetId: java.lang.String
  }
  
  trait Overlay extends js.Object
  
  /* --------------------------------------- OVERLAYS ------------------------------------------------------------- */
  trait OverlayOptions extends js.Object
  
  trait PaintStyle extends js.Object {
    var fill: js.UndefOr[java.lang.String] = js.undefined
    var stroke: js.UndefOr[java.lang.String] = js.undefined
    var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  trait jsPlumbInstance extends js.Object {
    def addEndpoint(el: ElementGroupRef): Endpoint | js.Array[Endpoint] = js.native
    def addEndpoint(el: ElementGroupRef, params: EndpointOptions): Endpoint | js.Array[Endpoint] = js.native
    def addEndpoint(el: ElementGroupRef, params: EndpointOptions, referenceParams: EndpointOptions): Endpoint | js.Array[Endpoint] = js.native
    def addEndpoints(target: ElementGroupRef, endpoints: js.Array[EndpointOptions]): js.Array[Endpoint] = js.native
    def addEndpoints(target: ElementGroupRef, endpoints: js.Array[EndpointOptions], referenceParams: EndpointOptions): js.Array[Endpoint] = js.native
    def animate(el: ElementRef): scala.Unit = js.native
    def animate(el: ElementRef, properties: js.Object): scala.Unit = js.native
    def animate(el: ElementRef, properties: js.Object, options: js.Object): scala.Unit = js.native
    def batch(fn: js.Function): scala.Unit = js.native
    def batch(fn: js.Function, doNotRepaintAfterwards: scala.Boolean): scala.Unit = js.native
    def bind(
      event: java.lang.String,
      callback: js.Function2[/* info */ OnConnectionBindInfo, /* originalEvent */ stdLib.Event, scala.Unit]
    ): scala.Unit = js.native
    def bind(
      event: java.lang.String,
      callback: js.Function2[/* info */ OnConnectionBindInfo, /* originalEvent */ stdLib.Event, scala.Unit],
      insertAtStart: scala.Boolean
    ): scala.Unit = js.native
    @JSName("bind")
    def bind_click(
      event: jsplumbLib.jsplumbLibStrings.click,
      callback: js.Function2[/* info */ Connection, /* originalEvent */ stdLib.Event, scala.Unit]
    ): scala.Unit = js.native
    @JSName("bind")
    def bind_click(
      event: jsplumbLib.jsplumbLibStrings.click,
      callback: js.Function2[/* info */ Connection, /* originalEvent */ stdLib.Event, scala.Unit],
      insertAtStart: scala.Boolean
    ): scala.Unit = js.native
    @JSName("bind")
    def bind_connection(
      event: jsplumbLib.jsplumbLibStrings.connection,
      callback: js.Function2[/* info */ ConnectionMadeEventInfo, /* originalEvent */ stdLib.Event, scala.Unit]
    ): scala.Unit = js.native
    @JSName("bind")
    def bind_connection(
      event: jsplumbLib.jsplumbLibStrings.connection,
      callback: js.Function2[/* info */ ConnectionMadeEventInfo, /* originalEvent */ stdLib.Event, scala.Unit],
      insertAtStart: scala.Boolean
    ): scala.Unit = js.native
    def cleanupListeners(): scala.Unit = js.native
    def connect(params: ConnectParams): Connection = js.native
    def connect(params: ConnectParams, referenceParams: js.Object): Connection = js.native
    def deleteConnection(conn: Connection): scala.Unit = js.native
    def deleteEndpoint(`object`: Endpoint): jsPlumbInstance = js.native
    def deleteEndpoint(`object`: Endpoint, doNotRepaintAfterwards: scala.Boolean): jsPlumbInstance = js.native
    def deleteEndpoint(`object`: UUID): jsPlumbInstance = js.native
    def deleteEndpoint(`object`: UUID, doNotRepaintAfterwards: scala.Boolean): jsPlumbInstance = js.native
    def deleteEveryConnection(): scala.Unit = js.native
    def deleteEveryEndpoint(): jsPlumbInstance = js.native
    def doWhileSuspended(): jsPlumbInstance = js.native
    def draggable(el: js.Object): jsPlumbInstance = js.native
    def draggable(el: js.Object, options: DragOptions): jsPlumbInstance = js.native
    def empty(el: Selector | java.lang.String): scala.Unit = js.native
    def empty(el: stdLib.Element): scala.Unit = js.native
    def fire(event: java.lang.String, value: js.Object, originalEvent: stdLib.Event): scala.Unit = js.native
    def getAllConnections(): js.Object = js.native
    def getConnections(scope: java.lang.String, options: js.Object): js.Array[_] | (stdLib.Map[_, _]) = js.native
    def getConnections(scope: java.lang.String, options: js.Object, scope2: java.lang.String): js.Array[_] | (stdLib.Map[_, _]) = js.native
    def getConnections(
      scope: java.lang.String,
      options: js.Object,
      scope2: java.lang.String,
      source: Selector | java.lang.String
    ): js.Array[_] | (stdLib.Map[_, _]) = js.native
    def getConnections(
      scope: java.lang.String,
      options: js.Object,
      scope2: java.lang.String,
      source: Selector | java.lang.String,
      target: Selector | java.lang.String
    ): js.Array[_] | (stdLib.Map[_, _]) = js.native
    def getConnections(
      scope: java.lang.String,
      options: js.Object,
      scope2: java.lang.String,
      source: Selector | java.lang.String,
      target: Selector | java.lang.String,
      flat: scala.Boolean
    ): js.Array[_] | (stdLib.Map[_, _]) = js.native
    def getContainer(): stdLib.Element = js.native
    def getDefaultScope(): java.lang.String = js.native
    def getEndpoint(uuid: java.lang.String): Endpoint = js.native
    def getEndpoints(element: java.lang.String): js.Array[Endpoint] = js.native
    def getEndpoints(element: stdLib.Element): js.Array[Endpoint] = js.native
    def getHoverPaintStyle(): stdLib.Selection = js.native
    def getHoverPaintStyle(params: js.Object): stdLib.Selection = js.native
    def getHoverPaintStyle(params: js.Object, scope: java.lang.String): stdLib.Selection = js.native
    def getHoverPaintStyle(
      params: js.Object,
      scope: java.lang.String,
      source: java.lang.String | stdLib.Element | Selector | js.Array[_]
    ): stdLib.Selection = js.native
    def getHoverPaintStyle(
      params: js.Object,
      scope: java.lang.String,
      source: java.lang.String | stdLib.Element | Selector | js.Array[_],
      target: java.lang.String | stdLib.Element | Selector | js.Array[_]
    ): stdLib.Selection = js.native
    def getHoverPaintStyle(
      params: js.Object,
      scope: java.lang.String,
      source: java.lang.String | stdLib.Element | Selector | js.Array[_],
      target: java.lang.String | stdLib.Element | Selector | js.Array[_],
      element: java.lang.String | stdLib.Element | Selector | js.Array[_]
    ): stdLib.Selection = js.native
    def getScope(Element: java.lang.String): java.lang.String = js.native
    def getScope(Element: stdLib.Element): java.lang.String = js.native
    def getSelector(): scala.Unit = js.native
    def getSelector(context: Selector): scala.Unit = js.native
    def getSelector(context: Selector, spec: java.lang.String): scala.Unit = js.native
    def getSelector(context: stdLib.Element): scala.Unit = js.native
    def getSelector(context: stdLib.Element, spec: java.lang.String): scala.Unit = js.native
    def getSourceScope(element: java.lang.String): java.lang.String = js.native
    def getSourceScope(element: stdLib.Element): java.lang.String = js.native
    def getTargetScope(element: java.lang.String): java.lang.String = js.native
    def getTargetScope(element: stdLib.Element): java.lang.String = js.native
    def getType(id: java.lang.String, typeDescriptor: java.lang.String): js.Object = js.native
    def hide(el: Selector | java.lang.String): jsPlumbInstance = js.native
    def hide(el: Selector | java.lang.String, changeEndpoints: scala.Boolean): jsPlumbInstance = js.native
    def hide(el: stdLib.Element): jsPlumbInstance = js.native
    def hide(el: stdLib.Element, changeEndpoints: scala.Boolean): jsPlumbInstance = js.native
    def importDefaults(defaults: js.Object): jsPlumbInstance = js.native
    def isHoverSuspended(): scala.Boolean = js.native
    def isSource(el: Selector | java.lang.String): scala.Boolean = js.native
    def isSource(el: stdLib.Element): scala.Boolean = js.native
    def isSourceEnabled(el: Selector | java.lang.String): scala.Boolean = js.native
    def isSourceEnabled(el: Selector | java.lang.String, connectionType: java.lang.String): scala.Boolean = js.native
    def isSourceEnabled(el: stdLib.Element): scala.Boolean = js.native
    def isSourceEnabled(el: stdLib.Element, connectionType: java.lang.String): scala.Boolean = js.native
    def isSuspendDrawing(): scala.Boolean = js.native
    def isSuspendEvents(): scala.Boolean = js.native
    def isTarget(el: Selector | java.lang.String): scala.Boolean = js.native
    def isTarget(el: stdLib.Element): scala.Boolean = js.native
    def isTargetEnabled(el: Selector | java.lang.String): scala.Boolean = js.native
    def isTargetEnabled(el: stdLib.Element): scala.Boolean = js.native
    def makeSource(
      el: Selector | java.lang.String,
      params: js.Object,
      endpoint: js.UndefOr[js.Array[_] | java.lang.String],
      parent: js.UndefOr[stdLib.Element | java.lang.String],
      scope: js.UndefOr[java.lang.String],
      dragOptions: js.UndefOr[js.Object],
      deleteEndpointsOnEmpty: js.UndefOr[scala.Boolean],
      filter: js.UndefOr[js.Function]
    ): scala.Unit = js.native
    def makeSource(
      el: stdLib.Element,
      params: js.Object,
      endpoint: js.UndefOr[js.Array[_] | java.lang.String],
      parent: js.UndefOr[stdLib.Element | java.lang.String],
      scope: js.UndefOr[java.lang.String],
      dragOptions: js.UndefOr[js.Object],
      deleteEndpointsOnEmpty: js.UndefOr[scala.Boolean],
      filter: js.UndefOr[js.Function]
    ): scala.Unit = js.native
    def makeTarget(
      el: Selector | java.lang.String,
      params: js.Object,
      endpoint: js.UndefOr[js.Array[_] | java.lang.String],
      scope: js.UndefOr[java.lang.String],
      dropOptions: js.UndefOr[js.Object],
      deleteEndpointsOnEmpty: js.UndefOr[scala.Boolean],
      maxConnections: js.UndefOr[scala.Double],
      onMaxConnections: js.UndefOr[js.Function]
    ): scala.Unit = js.native
    def makeTarget(
      el: stdLib.Element,
      params: js.Object,
      endpoint: js.UndefOr[js.Array[_] | java.lang.String],
      scope: js.UndefOr[java.lang.String],
      dropOptions: js.UndefOr[js.Object],
      deleteEndpointsOnEmpty: js.UndefOr[scala.Boolean],
      maxConnections: js.UndefOr[scala.Double],
      onMaxConnections: js.UndefOr[js.Function]
    ): scala.Unit = js.native
    def off(el: java.lang.String, event: java.lang.String, fn: js.Function): jsPlumbInstance = js.native
    def off(el: stdLib.Element, event: java.lang.String, fn: js.Function): jsPlumbInstance = js.native
    def on(el: java.lang.String): jsPlumbInstance = js.native
    def on(el: java.lang.String, children: java.lang.String): jsPlumbInstance = js.native
    def on(el: java.lang.String, children: java.lang.String, event: java.lang.String): jsPlumbInstance = js.native
    def on(el: java.lang.String, children: java.lang.String, event: java.lang.String, fn: js.Function): jsPlumbInstance = js.native
    def on(el: stdLib.Element): jsPlumbInstance = js.native
    def on(el: stdLib.Element, children: java.lang.String): jsPlumbInstance = js.native
    def on(el: stdLib.Element, children: java.lang.String, event: java.lang.String): jsPlumbInstance = js.native
    def on(el: stdLib.Element, children: java.lang.String, event: java.lang.String, fn: js.Function): jsPlumbInstance = js.native
    def ready(fn: js.Function): scala.Unit = js.native
    def recalculateOffsets(el: Selector | java.lang.String): scala.Unit = js.native
    def recalculateOffsets(el: stdLib.Element): scala.Unit = js.native
    def registerConnectionType(typeId: java.lang.String, `type`: js.Object): scala.Unit = js.native
    def registerConnectionTypes(types: js.Object): scala.Unit = js.native
    def registerEndpointType(typeId: java.lang.String, `type`: js.Object): scala.Unit = js.native
    def registerEndpointTypes(types: js.Object): scala.Unit = js.native
    def remove(el: Selector | java.lang.String): scala.Unit = js.native
    def remove(el: stdLib.Element): scala.Unit = js.native
    def removeAllEndpoints(el: Selector | java.lang.String): jsPlumbInstance = js.native
    def removeAllEndpoints(el: Selector | java.lang.String, recurse: scala.Boolean): jsPlumbInstance = js.native
    def removeAllEndpoints(el: stdLib.Element): jsPlumbInstance = js.native
    def removeAllEndpoints(el: stdLib.Element, recurse: scala.Boolean): jsPlumbInstance = js.native
    def repaint(el: Selector | java.lang.String): jsPlumbInstance = js.native
    def repaint(el: stdLib.Element): jsPlumbInstance = js.native
    def repaintEverything(): jsPlumbInstance = js.native
    def repaintEverything(clearEdits: scala.Boolean): jsPlumbInstance = js.native
    def reset(): scala.Unit = js.native
    def reset(doNotUnbindInstanceEventListeners: scala.Boolean): scala.Unit = js.native
    def restoreDefaults(): jsPlumbInstance = js.native
    def revalidate(el: Selector | java.lang.String): scala.Unit = js.native
    def revalidate(el: stdLib.Element): scala.Unit = js.native
    def select(): jsplumbLib.Anon_Conn = js.native
    def select(params: js.Object): jsplumbLib.Anon_Conn = js.native
    def select(params: js.Object, scope: java.lang.String): jsplumbLib.Anon_Conn = js.native
    def select(params: js.Object, scope: java.lang.String, source: java.lang.String): jsplumbLib.Anon_Conn = js.native
    def select(params: js.Object, scope: java.lang.String, source: java.lang.String, target: java.lang.String): jsplumbLib.Anon_Conn = js.native
    def select(
      params: js.Object,
      scope: java.lang.String,
      source: java.lang.String,
      target: java.lang.String,
      connections: js.Array[Connection]
    ): jsplumbLib.Anon_Conn = js.native
    def setContainer(el: Selector | java.lang.String): scala.Unit = js.native
    def setContainer(el: stdLib.Element): scala.Unit = js.native
    def setDefaultScope(scope: java.lang.String): jsPlumbInstance = js.native
    def setDraggable(el: java.lang.String, draggable: scala.Boolean): scala.Unit = js.native
    def setDraggable(el: js.Array[_], draggable: scala.Boolean): scala.Unit = js.native
    def setDraggable(el: js.Object, draggable: scala.Boolean): scala.Unit = js.native
    def setHover(container: Selector | java.lang.String): scala.Unit = js.native
    def setHover(container: stdLib.Element): scala.Unit = js.native
    def setHoverSuspended(hover: scala.Boolean): scala.Unit = js.native
    def setIdChanged(oldId: java.lang.String, newId: java.lang.String): scala.Unit = js.native
    def setParent(el: Selector, newParent: Selector | java.lang.String): scala.Unit = js.native
    def setParent(el: Selector, newParent: stdLib.Element): scala.Unit = js.native
    def setParent(el: stdLib.Element, newParent: Selector | java.lang.String): scala.Unit = js.native
    def setParent(el: stdLib.Element, newParent: stdLib.Element): scala.Unit = js.native
    def setScope(el: java.lang.String, scope: java.lang.String): scala.Unit = js.native
    def setScope(el: stdLib.Element, scope: java.lang.String): scala.Unit = js.native
    def setSource(connection: Connection, source: java.lang.String): jsPlumbInstance = js.native
    def setSource(connection: Connection, source: java.lang.String, doNotRepaint: scala.Boolean): jsPlumbInstance = js.native
    def setSource(connection: Connection, source: Endpoint): jsPlumbInstance = js.native
    def setSource(connection: Connection, source: Endpoint, doNotRepaint: scala.Boolean): jsPlumbInstance = js.native
    def setSource(connection: Connection, source: stdLib.Element): jsPlumbInstance = js.native
    def setSource(connection: Connection, source: stdLib.Element, doNotRepaint: scala.Boolean): jsPlumbInstance = js.native
    def setSourceEnabled(el: Selector | java.lang.String, state: scala.Boolean): jsPlumbInstance = js.native
    def setSourceEnabled(el: stdLib.Element, state: scala.Boolean): jsPlumbInstance = js.native
    def setSourceScope(el: java.lang.String, scope: java.lang.String): scala.Unit = js.native
    def setSourceScope(el: java.lang.String, scope: java.lang.String, connectionType: java.lang.String): scala.Unit = js.native
    def setSourceScope(el: stdLib.Element, scope: java.lang.String): scala.Unit = js.native
    def setSourceScope(el: stdLib.Element, scope: java.lang.String, connectionType: java.lang.String): scala.Unit = js.native
    def setSuspendDrawing(`val`: scala.Boolean): scala.Boolean = js.native
    def setSuspendDrawing(`val`: scala.Boolean, repaintAfterwards: scala.Boolean): scala.Boolean = js.native
    def setSuspendEvents(`val`: scala.Boolean): scala.Unit = js.native
    def setTarget(connection: Connection, target: java.lang.String): jsPlumbInstance = js.native
    def setTarget(connection: Connection, target: java.lang.String, doNotRepaint: scala.Boolean): jsPlumbInstance = js.native
    def setTarget(connection: Connection, target: Endpoint): jsPlumbInstance = js.native
    def setTarget(connection: Connection, target: Endpoint, doNotRepaint: scala.Boolean): jsPlumbInstance = js.native
    def setTarget(connection: Connection, target: stdLib.Element): jsPlumbInstance = js.native
    def setTarget(connection: Connection, target: stdLib.Element, doNotRepaint: scala.Boolean): jsPlumbInstance = js.native
    def setTargetEnabled(el: Selector | java.lang.String, state: scala.Boolean): jsPlumbInstance = js.native
    def setTargetEnabled(el: stdLib.Element, state: scala.Boolean): jsPlumbInstance = js.native
    def setTargetScope(el: java.lang.String, scope: java.lang.String): scala.Unit = js.native
    def setTargetScope(el: java.lang.String, scope: java.lang.String, connectionType: java.lang.String): scala.Unit = js.native
    def setTargetScope(el: stdLib.Element, scope: java.lang.String): scala.Unit = js.native
    def setTargetScope(el: stdLib.Element, scope: java.lang.String, connectionType: java.lang.String): scala.Unit = js.native
    def show(el: Selector | java.lang.String): jsPlumbInstance = js.native
    def show(el: Selector | java.lang.String, changeEndpoints: scala.Boolean): jsPlumbInstance = js.native
    def show(el: stdLib.Element): jsPlumbInstance = js.native
    def show(el: stdLib.Element, changeEndpoints: scala.Boolean): jsPlumbInstance = js.native
    def toggleDraggable(el: Selector | java.lang.String): scala.Boolean = js.native
    def toggleDraggable(el: stdLib.Element): scala.Boolean = js.native
    def toggleSourceEnabled(el: Selector | java.lang.String): scala.Boolean = js.native
    def toggleSourceEnabled(el: stdLib.Element): scala.Boolean = js.native
    def toggleTargetEnabled(el: Selector | java.lang.String): scala.Boolean = js.native
    def toggleTargetEnabled(el: stdLib.Element): scala.Boolean = js.native
    def toggleVisible(el: Selector | java.lang.String): scala.Unit = js.native
    def toggleVisible(el: Selector | java.lang.String, changeEndpoints: scala.Boolean): scala.Unit = js.native
    def toggleVisible(el: stdLib.Element): scala.Unit = js.native
    def toggleVisible(el: stdLib.Element, changeEndpoints: scala.Boolean): scala.Unit = js.native
    def unbind(): scala.Unit = js.native
    def unbind(eventOrListener: java.lang.String): scala.Unit = js.native
    def unbind(eventOrListener: java.lang.String, listener: js.Function): scala.Unit = js.native
    def unbind(eventOrListener: js.Function): scala.Unit = js.native
    def unbind(eventOrListener: js.Function, listener: js.Function): scala.Unit = js.native
    def unmakeEverySource(): jsPlumbInstance = js.native
    def unmakeEveryTarget(): jsPlumbInstance = js.native
    def unmakeSource(el: Selector | java.lang.String): jsPlumbInstance = js.native
    def unmakeSource(el: stdLib.Element): jsPlumbInstance = js.native
    def unmakeTarget(el: Selector | java.lang.String): jsPlumbInstance = js.native
    def unmakeTarget(el: stdLib.Element): jsPlumbInstance = js.native
  }
  
  def addClass(el: stdLib.NodeListOf[stdLib.Element], clazz: java.lang.String): scala.Unit = js.native
  def extend(target: js.Object, source: js.Object): js.Any = js.native
  def getInstance(): jsPlumbInstance = js.native
  def getInstance(_defaults: Defaults): jsPlumbInstance = js.native
  def off(el: js.Any, event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(el: js.Any, event: java.lang.String, delegateSelector: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(el: js.Any, event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def removeClass(el: stdLib.NodeListOf[stdLib.Element], clazz: java.lang.String): scala.Unit = js.native
  def revalidate(el: stdLib.Element): scala.Unit = js.native
  type AnchorId = jsplumbLib.jsplumbLibStrings.Assign | jsplumbLib.jsplumbLibStrings.AutoDefault | jsplumbLib.jsplumbLibStrings.Bottom | jsplumbLib.jsplumbLibStrings.BottomCenter | jsplumbLib.jsplumbLibStrings.BottomLeft | jsplumbLib.jsplumbLibStrings.BottomRight | jsplumbLib.jsplumbLibStrings.Center | jsplumbLib.jsplumbLibStrings.Continuous | jsplumbLib.jsplumbLibStrings.ContinuousBottom | jsplumbLib.jsplumbLibStrings.ContinuousLeft | jsplumbLib.jsplumbLibStrings.ContinuousRight | jsplumbLib.jsplumbLibStrings.ContinuousTop | jsplumbLib.jsplumbLibStrings.Left | jsplumbLib.jsplumbLibStrings.LeftMiddle | jsplumbLib.jsplumbLibStrings.Perimeter | jsplumbLib.jsplumbLibStrings.Right | jsplumbLib.jsplumbLibStrings.RightMiddle | jsplumbLib.jsplumbLibStrings.Top | jsplumbLib.jsplumbLibStrings.TopCenter | jsplumbLib.jsplumbLibStrings.TopLeft | jsplumbLib.jsplumbLibStrings.TopRight
  type AnchorOrientationHint = jsplumbLib.jsplumbLibNumbers.`-1` | jsplumbLib.jsplumbLibNumbers.`0` | jsplumbLib.jsplumbLibNumbers.`1`
  type AnchorSpec = AnchorId | (js.Tuple2[AnchorId, AnchorOptions])
  type ConnectionId = java.lang.String
  type ConnectorId = jsplumbLib.jsplumbLibStrings.Bezier | jsplumbLib.jsplumbLibStrings.StateMachine | jsplumbLib.jsplumbLibStrings.Flowchart | jsplumbLib.jsplumbLibStrings.Straight | UserDefinedConnectorId
  type ConnectorSpec = ConnectorId | (js.Tuple2[ConnectorId, ConnectorOptions])
  type ElementGroupRef = ElementId | stdLib.Element | js.Array[ElementId] | js.Array[stdLib.Element]
  type ElementId = java.lang.String
  type ElementRef = ElementId | stdLib.Element
  /* -------------------------------------------- ENDPOINTS ------------------------------------------------------ */
  type EndpointId = jsplumbLib.jsplumbLibStrings.Rectangle | jsplumbLib.jsplumbLibStrings.Dot | jsplumbLib.jsplumbLibStrings.Blank | UserDefinedEndpointId
  type EndpointSpec = EndpointId | (js.Tuple2[EndpointId, EndpointOptions])
  type OverlayId = jsplumbLib.jsplumbLibStrings.Label | jsplumbLib.jsplumbLibStrings.Arrow | jsplumbLib.jsplumbLibStrings.PlainArrow | jsplumbLib.jsplumbLibStrings.Custom
  type OverlaySpec = OverlayId | (js.Tuple2[OverlayId, OverlayOptions])
  type Selector = java.lang.String
  type UUID = java.lang.String
  type UserDefinedConnectorId = java.lang.String
  type UserDefinedEndpointId = java.lang.String
}

