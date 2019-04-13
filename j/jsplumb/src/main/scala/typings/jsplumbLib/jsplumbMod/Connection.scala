package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object Connection {
  @scala.inline
  def apply(
    endpoints: js.Tuple2[Endpoint, Endpoint],
    getElement: () => Connection,
    getOverlay: java.lang.String => Overlay,
    hideOverlay: java.lang.String => scala.Unit,
    id: ConnectionId,
    repaint: () => scala.Unit,
    setDetachable: scala.Boolean => scala.Unit,
    setLabel: java.lang.String => scala.Unit,
    setParameter: (java.lang.String, js.Any) => scala.Unit,
    showOverlay: java.lang.String => scala.Unit
  ): Connection = {
    val __obj = js.Dynamic.literal(endpoints = endpoints, getElement = js.Any.fromFunction0(getElement), getOverlay = js.Any.fromFunction1(getOverlay), hideOverlay = js.Any.fromFunction1(hideOverlay), id = id, repaint = js.Any.fromFunction0(repaint), setDetachable = js.Any.fromFunction1(setDetachable), setLabel = js.Any.fromFunction1(setLabel), setParameter = js.Any.fromFunction2(setParameter), showOverlay = js.Any.fromFunction1(showOverlay))
  
    __obj.asInstanceOf[Connection]
  }
}

