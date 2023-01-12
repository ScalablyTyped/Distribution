package typings.libp2pDelegatedPeerRouting

import typings.libp2pDelegatedPeerRouting.mod.QueryEvent
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FindPeer extends StObject {
    
    def findPeer(peerId: PeerId): AsyncIterable[QueryEvent] = js.native
    def findPeer(
      peerId: PeerId,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any
    ): AsyncIterable[QueryEvent] = js.native
    
    def query(peerId: PeerId): AsyncIterable[QueryEvent] = js.native
    def query(
      peerId: PeerId,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any
    ): AsyncIterable[QueryEvent] = js.native
    def query(peerId: CID[Any, Double, Double, Version]): AsyncIterable[QueryEvent] = js.native
    def query(
      peerId: CID[Any, Double, Double, Version],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any
    ): AsyncIterable[QueryEvent] = js.native
  }
  
  trait Host extends StObject {
    
    var host: String
    
    var port: String
    
    var protocol: String
  }
  object Host {
    
    inline def apply(host: String, port: String, protocol: String): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
}
