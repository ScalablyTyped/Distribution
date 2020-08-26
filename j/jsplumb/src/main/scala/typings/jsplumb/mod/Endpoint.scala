package typings.jsplumb.mod

import typings.std.Element
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends UIComponent {
  var anchor: Anchor = js.native
  var connections: js.UndefOr[js.Array[Connection]] = js.native
  //= 1?
  var id: String = js.native
  var maxConnections: Double = js.native
  var scope: String = js.native
  var `type`: EndpointId = js.native
  def connectorSelector(): Connection = js.native
  def getElement(): Element = js.native
  def isEnabled(): Boolean = js.native
  def setElement(el: Element): Unit = js.native
  def setEnabled(enabled: Boolean): Unit = js.native
  def setEndpoint(spec: EndpointSpec): Unit = js.native
  def setHover(hover: Boolean): Unit = js.native
}

object Endpoint {
  @scala.inline
  def apply(
    anchor: Anchor,
    connectorSelector: () => Connection,
    getElement: () => Element,
    getParameter: String => js.Any,
    getParameters: () => Record[String, _],
    id: String,
    isEnabled: () => Boolean,
    maxConnections: Double,
    scope: String,
    setElement: Element => Unit,
    setEnabled: Boolean => Unit,
    setEndpoint: EndpointSpec => Unit,
    setHover: Boolean => Unit,
    setParameter: (String, js.Any) => Unit,
    setParameters: Record[String, _] => Unit,
    `type`: EndpointId
  ): Endpoint = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], connectorSelector = js.Any.fromFunction0(connectorSelector), getElement = js.Any.fromFunction0(getElement), getParameter = js.Any.fromFunction1(getParameter), getParameters = js.Any.fromFunction0(getParameters), id = id.asInstanceOf[js.Any], isEnabled = js.Any.fromFunction0(isEnabled), maxConnections = maxConnections.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], setElement = js.Any.fromFunction1(setElement), setEnabled = js.Any.fromFunction1(setEnabled), setEndpoint = js.Any.fromFunction1(setEndpoint), setHover = js.Any.fromFunction1(setHover), setParameter = js.Any.fromFunction2(setParameter), setParameters = js.Any.fromFunction1(setParameters))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
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
    def setAnchor(value: Anchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectorSelector(value: () => Connection): Self = this.set("connectorSelector", js.Any.fromFunction0(value))
    @scala.inline
    def setGetElement(value: () => Element): Self = this.set("getElement", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = this.set("isEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetElement(value: Element => Unit): Self = this.set("setElement", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = this.set("setEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEndpoint(value: EndpointSpec => Unit): Self = this.set("setEndpoint", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHover(value: Boolean => Unit): Self = this.set("setHover", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: EndpointId): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = this.set("connections", js.Array(value :_*))
    @scala.inline
    def setConnections(value: js.Array[Connection]): Self = this.set("connections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
  }
  
}

