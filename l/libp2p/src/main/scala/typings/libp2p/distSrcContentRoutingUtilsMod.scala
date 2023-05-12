package typings.libp2p

import typings.itStreamTypes.mod.Source
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcContentRoutingUtilsMod {
  
  @JSImport("libp2p/dist/src/content-routing/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requirePeers(source: Source[PeerInfo]): AsyncIterable[PeerInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("requirePeers")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[PeerInfo]]
  inline def requirePeers(source: Source[PeerInfo], min: Double): AsyncIterable[PeerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("requirePeers")(source.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[PeerInfo]]
  
  inline def storeAddresses(source: Source[PeerInfo], peerStore: PeerStore): AsyncIterable[PeerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("storeAddresses")(source.asInstanceOf[js.Any], peerStore.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[PeerInfo]]
  
  inline def uniquePeers(source: Source[PeerInfo]): AsyncIterable[PeerInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniquePeers")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[PeerInfo]]
}
