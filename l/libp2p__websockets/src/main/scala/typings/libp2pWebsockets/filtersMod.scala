package typings.libp2pWebsockets

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object filtersMod {
  
  @JSImport("@libp2p/websockets/filters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(multiaddrs: js.Array[Multiaddr_]): js.Array[Multiaddr_] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(multiaddrs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Multiaddr_]]
  
  inline def dnsWsOrWss(multiaddrs: js.Array[Multiaddr_]): js.Array[Multiaddr_] = ^.asInstanceOf[js.Dynamic].applyDynamic("dnsWsOrWss")(multiaddrs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Multiaddr_]]
  
  inline def dnsWss(multiaddrs: js.Array[Multiaddr_]): js.Array[Multiaddr_] = ^.asInstanceOf[js.Dynamic].applyDynamic("dnsWss")(multiaddrs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Multiaddr_]]
  
  inline def wss(multiaddrs: js.Array[Multiaddr_]): js.Array[Multiaddr_] = ^.asInstanceOf[js.Dynamic].applyDynamic("wss")(multiaddrs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Multiaddr_]]
}
