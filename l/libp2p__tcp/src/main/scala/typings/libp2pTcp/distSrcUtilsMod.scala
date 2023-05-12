package typings.libp2pTcp

import typings.libp2pTcp.libp2pTcpStrings.ip4
import typings.libp2pTcp.libp2pTcpStrings.ip6
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.node.netMod.IpcSocketConnectOpts
import typings.node.netMod.ListenOptions
import typings.node.netMod.TcpSocketConnectOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("@libp2p/tcp/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMultiaddrs(proto: ip4 | ip6, ip: String, port: Double): js.Array[Multiaddr_] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiaddrs")(proto.asInstanceOf[js.Any], ip.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Array[Multiaddr_]]
  
  inline def isAnyAddr(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyAddr")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def multiaddrToNetConfig(addr: Multiaddr_): NetConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("multiaddrToNetConfig")(addr.asInstanceOf[js.Any]).asInstanceOf[NetConfig]
  inline def multiaddrToNetConfig(addr: Multiaddr_, config: NetConfig): NetConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("multiaddrToNetConfig")(addr.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[NetConfig]
  
  type NetConfig = ListenOptions | (IpcSocketConnectOpts & TcpSocketConnectOpts)
}
