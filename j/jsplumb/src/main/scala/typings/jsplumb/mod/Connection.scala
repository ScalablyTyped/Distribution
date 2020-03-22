package typings.jsplumb.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var endpoints: js.Tuple2[Endpoint, Endpoint]
  var id: ConnectionId
  var source: Element
  var sourceId: String
  var target: Element
  var targetId: String
  def getElement(): Connection
  def getLabelOverlay(): Overlay
  def getOverlay(s: String): Overlay
  def getOverlays(): js.Object
  def hideOverlay(s: String): Unit
  def repaint(): Unit
  def setDetachable(detachable: Boolean): Unit
  def setLabel(s: String): Unit
  def setParameter(name: String, value: js.Any): Unit
  def showOverlay(s: String): Unit
}

object Connection {
  @scala.inline
  def apply(
    endpoints: js.Tuple2[Endpoint, Endpoint],
    getElement: () => Connection,
    getLabelOverlay: () => Overlay,
    getOverlay: String => Overlay,
    getOverlays: () => js.Object,
    hideOverlay: String => Unit,
    id: ConnectionId,
    repaint: () => Unit,
    setDetachable: Boolean => Unit,
    setLabel: String => Unit,
    setParameter: (String, js.Any) => Unit,
    showOverlay: String => Unit,
    source: Element,
    sourceId: String,
    target: Element,
    targetId: String
  ): Connection = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getLabelOverlay = js.Any.fromFunction0(getLabelOverlay), getOverlay = js.Any.fromFunction1(getOverlay), getOverlays = js.Any.fromFunction0(getOverlays), hideOverlay = js.Any.fromFunction1(hideOverlay), id = id.asInstanceOf[js.Any], repaint = js.Any.fromFunction0(repaint), setDetachable = js.Any.fromFunction1(setDetachable), setLabel = js.Any.fromFunction1(setLabel), setParameter = js.Any.fromFunction2(setParameter), showOverlay = js.Any.fromFunction1(showOverlay), source = source.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Connection]
  }
}

