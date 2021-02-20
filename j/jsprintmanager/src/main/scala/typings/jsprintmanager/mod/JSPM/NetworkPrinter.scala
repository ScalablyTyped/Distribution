package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.NetworkPrinter")
@js.native
class NetworkPrinter protected () extends IClientPrinter {
  def this(port: Double) = this()
  def this(port: Double, ipAddress: String) = this()
  def this(port: Double, ipAddress: js.UndefOr[scala.Nothing], dnsName: String) = this()
  def this(port: Double, ipAddress: String, dnsName: String) = this()
  
  @JSName("Id")
  var Id_NetworkPrinter: Double = js.native
  
  var _dnsName: js.Any = js.native
  
  var _networkIPAddress: js.Any = js.native
  
  var _networkPort: js.Any = js.native
  
  var dnsName: String = js.native
  
  var ipAddress: String = js.native
  
  var port: Double = js.native
}
