package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.NetworkPrinter")
@js.native
open class NetworkPrinter protected ()
  extends StObject
     with IClientPrinter {
  def this(port: Double) = this()
  def this(port: Double, ipAddress: String) = this()
  def this(port: Double, ipAddress: String, dnsName: String) = this()
  def this(port: Double, ipAddress: Unit, dnsName: String) = this()
  
  /* CompleteClass */
  var Id: Any = js.native
  @JSName("Id")
  var Id_NetworkPrinter: Double = js.native
  
  /* private */ var _dnsName: Any = js.native
  
  /* private */ var _networkIPAddress: Any = js.native
  
  /* private */ var _networkPort: Any = js.native
  
  var dnsName: String = js.native
  
  var ipAddress: String = js.native
  
  var port: Double = js.native
  
  /* CompleteClass */
  override def serialize(): Any = js.native
}
