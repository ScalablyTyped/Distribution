package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsplumb", "jsPlumbInstance")
@js.native
class jsPlumbInstance () extends js.Object {
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

