package typings.jsplumb.mod

import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection
  extends StObject
     with UIComponent {
  
  var endpoints: js.Tuple2[Endpoint, Endpoint]
  
  def getElement(): Connection
  
  def getLabelOverlay(): Overlay
  
  def getOverlay(s: String): Overlay
  
  def getOverlays(): js.Object
  
  def hideOverlay(s: String): Unit
  
  var id: ConnectionId
  
  def repaint(): Unit
  
  def setDetachable(detachable: Boolean): Unit
  
  def setLabel(s: String): Unit
  
  def showOverlay(s: String): Unit
  
  var source: Element
  
  var sourceId: String
  
  var target: Element
  
  var targetId: String
}
object Connection {
  
  inline def apply(
    endpoints: js.Tuple2[Endpoint, Endpoint],
    getElement: () => Connection,
    getLabelOverlay: () => Overlay,
    getOverlay: String => Overlay,
    getOverlays: () => js.Object,
    getParameter: String => js.Any,
    getParameters: () => Record[String, js.Any],
    hideOverlay: String => Unit,
    id: ConnectionId,
    repaint: () => Unit,
    setDetachable: Boolean => Unit,
    setLabel: String => Unit,
    setParameter: (String, js.Any) => Unit,
    setParameters: Record[String, js.Any] => Unit,
    showOverlay: String => Unit,
    source: Element,
    sourceId: String,
    target: Element,
    targetId: String
  ): Connection = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getLabelOverlay = js.Any.fromFunction0(getLabelOverlay), getOverlay = js.Any.fromFunction1(getOverlay), getOverlays = js.Any.fromFunction0(getOverlays), getParameter = js.Any.fromFunction1(getParameter), getParameters = js.Any.fromFunction0(getParameters), hideOverlay = js.Any.fromFunction1(hideOverlay), id = id.asInstanceOf[js.Any], repaint = js.Any.fromFunction0(repaint), setDetachable = js.Any.fromFunction1(setDetachable), setLabel = js.Any.fromFunction1(setLabel), setParameter = js.Any.fromFunction2(setParameter), setParameters = js.Any.fromFunction1(setParameters), showOverlay = js.Any.fromFunction1(showOverlay), source = source.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setEndpoints(value: js.Tuple2[Endpoint, Endpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setGetElement(value: () => Connection): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    inline def setGetLabelOverlay(value: () => Overlay): Self = StObject.set(x, "getLabelOverlay", js.Any.fromFunction0(value))
    
    inline def setGetOverlay(value: String => Overlay): Self = StObject.set(x, "getOverlay", js.Any.fromFunction1(value))
    
    inline def setGetOverlays(value: () => js.Object): Self = StObject.set(x, "getOverlays", js.Any.fromFunction0(value))
    
    inline def setHideOverlay(value: String => Unit): Self = StObject.set(x, "hideOverlay", js.Any.fromFunction1(value))
    
    inline def setId(value: ConnectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRepaint(value: () => Unit): Self = StObject.set(x, "repaint", js.Any.fromFunction0(value))
    
    inline def setSetDetachable(value: Boolean => Unit): Self = StObject.set(x, "setDetachable", js.Any.fromFunction1(value))
    
    inline def setSetLabel(value: String => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
    
    inline def setShowOverlay(value: String => Unit): Self = StObject.set(x, "showOverlay", js.Any.fromFunction1(value))
    
    inline def setSource(value: Element): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
