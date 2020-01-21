package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var endpoints: js.Tuple2[Endpoint, Endpoint]
  var id: ConnectionId
  def getElement(): Connection
  def getOverlay(s: String): Overlay
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
    getOverlay: String => Overlay,
    hideOverlay: String => Unit,
    id: ConnectionId,
    repaint: () => Unit,
    setDetachable: Boolean => Unit,
    setLabel: String => Unit,
    setParameter: (String, js.Any) => Unit,
    showOverlay: String => Unit
  ): Connection = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getOverlay = js.Any.fromFunction1(getOverlay), hideOverlay = js.Any.fromFunction1(hideOverlay), id = id.asInstanceOf[js.Any], repaint = js.Any.fromFunction0(repaint), setDetachable = js.Any.fromFunction1(setDetachable), setLabel = js.Any.fromFunction1(setLabel), setParameter = js.Any.fromFunction2(setParameter), showOverlay = js.Any.fromFunction1(showOverlay))
  
    __obj.asInstanceOf[Connection]
  }
}

