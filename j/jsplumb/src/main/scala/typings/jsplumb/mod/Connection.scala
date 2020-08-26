package typings.jsplumb.mod

import typings.std.Element
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends UIComponent {
  var endpoints: js.Tuple2[Endpoint, Endpoint] = js.native
  var id: ConnectionId = js.native
  var source: Element = js.native
  var sourceId: String = js.native
  var target: Element = js.native
  var targetId: String = js.native
  def getElement(): Connection = js.native
  def getLabelOverlay(): Overlay = js.native
  def getOverlay(s: String): Overlay = js.native
  def getOverlays(): js.Object = js.native
  def hideOverlay(s: String): Unit = js.native
  def repaint(): Unit = js.native
  def setDetachable(detachable: Boolean): Unit = js.native
  def setLabel(s: String): Unit = js.native
  def showOverlay(s: String): Unit = js.native
}

object Connection {
  @scala.inline
  def apply(
    endpoints: js.Tuple2[Endpoint, Endpoint],
    getElement: () => Connection,
    getLabelOverlay: () => Overlay,
    getOverlay: String => Overlay,
    getOverlays: () => js.Object,
    getParameter: String => js.Any,
    getParameters: () => Record[String, _],
    hideOverlay: String => Unit,
    id: ConnectionId,
    repaint: () => Unit,
    setDetachable: Boolean => Unit,
    setLabel: String => Unit,
    setParameter: (String, js.Any) => Unit,
    setParameters: Record[String, _] => Unit,
    showOverlay: String => Unit,
    source: Element,
    sourceId: String,
    target: Element,
    targetId: String
  ): Connection = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getLabelOverlay = js.Any.fromFunction0(getLabelOverlay), getOverlay = js.Any.fromFunction1(getOverlay), getOverlays = js.Any.fromFunction0(getOverlays), getParameter = js.Any.fromFunction1(getParameter), getParameters = js.Any.fromFunction0(getParameters), hideOverlay = js.Any.fromFunction1(hideOverlay), id = id.asInstanceOf[js.Any], repaint = js.Any.fromFunction0(repaint), setDetachable = js.Any.fromFunction1(setDetachable), setLabel = js.Any.fromFunction1(setLabel), setParameter = js.Any.fromFunction2(setParameter), setParameters = js.Any.fromFunction1(setParameters), showOverlay = js.Any.fromFunction1(showOverlay), source = source.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
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
    def setEndpoints(value: js.Tuple2[Endpoint, Endpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetElement(value: () => Connection): Self = this.set("getElement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLabelOverlay(value: () => Overlay): Self = this.set("getLabelOverlay", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOverlay(value: String => Overlay): Self = this.set("getOverlay", js.Any.fromFunction1(value))
    @scala.inline
    def setGetOverlays(value: () => js.Object): Self = this.set("getOverlays", js.Any.fromFunction0(value))
    @scala.inline
    def setHideOverlay(value: String => Unit): Self = this.set("hideOverlay", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: ConnectionId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepaint(value: () => Unit): Self = this.set("repaint", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDetachable(value: Boolean => Unit): Self = this.set("setDetachable", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLabel(value: String => Unit): Self = this.set("setLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setShowOverlay(value: String => Unit): Self = this.set("showOverlay", js.Any.fromFunction1(value))
    @scala.inline
    def setSource(value: Element): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceId(value: String): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
  }
  
}

