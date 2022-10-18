package typings.libp2pMdns

import typings.dnsPacket.mod.Answer
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCompatUtilsMod {
  
  @JSImport("@libp2p/mdns/dist/src/compat/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findPeerInfoInAnswers(answers: js.Array[Answer], ourPeerId: PeerId): js.UndefOr[PeerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPeerInfoInAnswers")(answers.asInstanceOf[js.Any], ourPeerId.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PeerInfo]]
}
