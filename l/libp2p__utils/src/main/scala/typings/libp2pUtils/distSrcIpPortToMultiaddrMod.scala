package typings.libp2pUtils

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIpPortToMultiaddrMod {
  
  @JSImport("@libp2p/utils/dist/src/ip-port-to-multiaddr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Errors {
    
    @JSImport("@libp2p/utils/dist/src/ip-port-to-multiaddr", "Errors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@libp2p/utils/dist/src/ip-port-to-multiaddr", "Errors.ERR_INVALID_IP")
    @js.native
    def ERR_INVALID_IP: String = js.native
    inline def ERR_INVALID_IP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_INVALID_IP")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/utils/dist/src/ip-port-to-multiaddr", "Errors.ERR_INVALID_IP_PARAMETER")
    @js.native
    def ERR_INVALID_IP_PARAMETER: String = js.native
    inline def ERR_INVALID_IP_PARAMETER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_INVALID_IP_PARAMETER")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/utils/dist/src/ip-port-to-multiaddr", "Errors.ERR_INVALID_PORT_PARAMETER")
    @js.native
    def ERR_INVALID_PORT_PARAMETER: String = js.native
    inline def ERR_INVALID_PORT_PARAMETER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_INVALID_PORT_PARAMETER")(x.asInstanceOf[js.Any])
  }
  
  inline def ipPortToMultiaddr(ip: String, port: String): Multiaddr_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ipPortToMultiaddr")(ip.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Multiaddr_]
  inline def ipPortToMultiaddr(ip: String, port: Double): Multiaddr_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ipPortToMultiaddr")(ip.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Multiaddr_]
}
