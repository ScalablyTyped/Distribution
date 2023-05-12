package typings.libp2pInterfacePeerRouting

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfaces.mod.AbortOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/interface-peer-routing", "peerRouting")
  @js.native
  val peerRouting: js.Symbol = js.native
  
  @js.native
  trait PeerRouting_ extends StObject {
    
    /**
      * Searches the network for peer info corresponding to the passed peer id.
      *
      * @example
      *
      * ```js
      * // ...
      * const peer = await peerRouting.findPeer(peerId, options)
      * ```
      */
    def findPeer(peerId: PeerId): js.Promise[PeerInfo] = js.native
    def findPeer(peerId: PeerId, options: AbortOptions): js.Promise[PeerInfo] = js.native
    
    /**
      * Search the network for peers that are closer to the passed key. Peer
      * info should be yielded in ever-increasing closeness to the key.
      *
      * @example
      *
      * ```js
      * // Iterate over the closest peers found for the given key
      * for await (const peer of peerRouting.getClosestPeers(key)) {
      *   console.log(peer.id, peer.multiaddrs)
      * }
      * ```
      */
    def getClosestPeers(key: js.typedarray.Uint8Array): AsyncIterable[PeerInfo] = js.native
    def getClosestPeers(key: js.typedarray.Uint8Array, options: AbortOptions): AsyncIterable[PeerInfo] = js.native
  }
}
