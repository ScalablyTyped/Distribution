package typings.libp2pMdns

import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.multicastDns.mod.MulticastDNS
import typings.multicastDns.mod.QueryPacket
import typings.multicastDns.mod.ResponsePacket
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueryMod {
  
  @JSImport("@libp2p/mdns/dist/src/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gotQuery(
    qry: QueryPacket,
    mdns: MulticastDNS,
    peerName: String,
    multiaddrs: js.Array[Multiaddr_],
    serviceTag: String,
    broadcast: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gotQuery")(qry.asInstanceOf[js.Any], mdns.asInstanceOf[js.Any], peerName.asInstanceOf[js.Any], multiaddrs.asInstanceOf[js.Any], serviceTag.asInstanceOf[js.Any], broadcast.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def gotResponse(rsp: ResponsePacket, localPeerName: String, serviceTag: String): js.UndefOr[PeerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("gotResponse")(rsp.asInstanceOf[js.Any], localPeerName.asInstanceOf[js.Any], serviceTag.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PeerInfo]]
  
  inline def queryLAN(mdns: MulticastDNS, serviceTag: String, interval: Double): Timer = (^.asInstanceOf[js.Dynamic].applyDynamic("queryLAN")(mdns.asInstanceOf[js.Any], serviceTag.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Timer]
}
