package typings.jsprintmanager.mod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "JSPM.NetworkPrinter")
@js.native
class NetworkPrinter protected () extends IClientPrinter {
  def this(port: Double) = this()
  def this(port: Double, ipAddress: String) = this()
  def this(port: Double, ipAddress: String, dnsName: String) = this()
  /* CompleteClass */
  override var Id: js.Any = js.native
  @JSName("Id")
  var Id_NetworkPrinter: Double = js.native
  var _dnsName: js.Any = js.native
  var _networkIPAddress: js.Any = js.native
  var _networkPort: js.Any = js.native
  var dnsName: String = js.native
  var ipAddress: String = js.native
  var port: Double = js.native
  /* CompleteClass */
  override def serialize(): js.Any = js.native
}

