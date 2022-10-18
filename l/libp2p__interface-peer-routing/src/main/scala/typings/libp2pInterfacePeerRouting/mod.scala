package typings.libp2pInterfacePeerRouting

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfaces.mod.AbortOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait PeerRouting extends StObject {
    
    def findPeer(peerId: PeerId): js.Promise[PeerInfo] = js.native
    def findPeer(peerId: PeerId, options: AbortOptions): js.Promise[PeerInfo] = js.native
    
    def getClosestPeers(key: js.typedarray.Uint8Array): AsyncIterable[PeerInfo] = js.native
    def getClosestPeers(key: js.typedarray.Uint8Array, options: AbortOptions): AsyncIterable[PeerInfo] = js.native
  }
}
