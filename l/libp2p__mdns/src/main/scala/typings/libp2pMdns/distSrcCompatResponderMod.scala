package typings.libp2pMdns

import typings.libp2pMdns.mod.MulticastDNSComponents
import typings.multicastDns.mod.QueryPacket
import typings.node.dgramMod.RemoteInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCompatResponderMod {
  
  @JSImport("@libp2p/mdns/dist/src/compat/responder", "Responder")
  @js.native
  open class Responder protected () extends StObject {
    def this(components: MulticastDNSComponents) = this()
    
    /* private */ var _mdns: Any = js.native
    
    def _onQuery(event: QueryPacket, info: RemoteInfo): Unit = js.native
    
    /* private */ val components: Any = js.native
    
    def start(): Unit = js.native
    
    def stop(): js.UndefOr[js.Promise[Unit]] = js.native
  }
}
