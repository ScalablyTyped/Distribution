package typings.jsplumb.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsplumb", "Endpoint")
@js.native
class Endpoint () extends js.Object {
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

