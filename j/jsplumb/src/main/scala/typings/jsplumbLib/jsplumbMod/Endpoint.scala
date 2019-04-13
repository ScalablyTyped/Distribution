package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsplumb", "Endpoint")
@js.native
class Endpoint () extends js.Object {
  var anchor: Anchor = js.native
  var connections: js.UndefOr[js.Array[Connection]] = js.native
  //= 1?
  var id: java.lang.String = js.native
  var maxConnections: scala.Double = js.native
  var scope: java.lang.String = js.native
  var `type`: EndpointId = js.native
  def connectorSelector(): Connection = js.native
  def getElement(): stdLib.Element = js.native
  def isEnabled(): scala.Boolean = js.native
  def setElement(el: stdLib.Element): scala.Unit = js.native
  def setEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setEndpoint(spec: EndpointSpec): scala.Unit = js.native
  def setHover(hover: scala.Boolean): scala.Unit = js.native
}

