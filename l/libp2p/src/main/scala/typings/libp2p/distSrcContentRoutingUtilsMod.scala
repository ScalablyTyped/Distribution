package typings.libp2p

import typings.itStreamTypes.mod.Source
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcContentRoutingUtilsMod {
  
  @JSImport("libp2p/dist/src/content-routing/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requirePeers(source: Source[PeerInfo]): AsyncGenerator[PeerInfo, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requirePeers")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[PeerInfo, Unit, Any]]
  inline def requirePeers(source: Source[PeerInfo], min: Double): AsyncGenerator[PeerInfo, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requirePeers")(source.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[PeerInfo, Unit, Any]]
  
  inline def storeAddresses(source: Source[PeerInfo], peerStore: PeerStore): AsyncGenerator[PeerInfo, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("storeAddresses")(source.asInstanceOf[js.Any], peerStore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[PeerInfo, Unit, Unit]]
  
  inline def uniquePeers(source: Source[PeerInfo]): AsyncGenerator[PeerInfo, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniquePeers")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[PeerInfo, Unit, Any]]
}
