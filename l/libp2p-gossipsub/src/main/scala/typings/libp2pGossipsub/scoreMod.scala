package typings.libp2pGossipsub

import typings.libp2pGossipsub.anon.PartialPeerScoreParams
import typings.libp2pGossipsub.anon.PartialPeerScoreThreshold
import typings.libp2pGossipsub.anon.PartialTopicScoreParams
import typings.libp2pGossipsub.interfacesMod.ConnectionManager
import typings.libp2pGossipsub.interfacesMod.MessageIdFunction
import typings.libp2pGossipsub.peerScoreParamsMod.PeerScoreParams
import typings.libp2pGossipsub.peerScoreParamsMod.TopicScoreParams
import typings.libp2pGossipsub.peerScoreThresholdsMod.PeerScoreThresholds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scoreMod {
  
  @JSImport("libp2p-gossipsub/src/score", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libp2p-gossipsub/src/score", "PeerScore")
  @js.native
  class PeerScore protected ()
    extends typings.libp2pGossipsub.peerScoreMod.PeerScore {
    def this(params: PeerScoreParams, connectionManager: ConnectionManager, msgId: MessageIdFunction) = this()
  }
  
  inline def createPeerScoreParams(): PeerScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreParams")().asInstanceOf[PeerScoreParams]
  inline def createPeerScoreParams(p: PartialPeerScoreParams): PeerScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[PeerScoreParams]
  
  inline def createPeerScoreThresholds(): PeerScoreThresholds = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreThresholds")().asInstanceOf[PeerScoreThresholds]
  inline def createPeerScoreThresholds(p: PartialPeerScoreThreshold): PeerScoreThresholds = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreThresholds")(p.asInstanceOf[js.Any]).asInstanceOf[PeerScoreThresholds]
  
  inline def createTopicScoreParams(): TopicScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createTopicScoreParams")().asInstanceOf[TopicScoreParams]
  inline def createTopicScoreParams(p: PartialTopicScoreParams): TopicScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createTopicScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[TopicScoreParams]
  
  @JSImport("libp2p-gossipsub/src/score", "defaultPeerScoreParams")
  @js.native
  val defaultPeerScoreParams: PeerScoreParams = js.native
  
  @JSImport("libp2p-gossipsub/src/score", "defaultPeerScoreThresholds")
  @js.native
  val defaultPeerScoreThresholds: PeerScoreThresholds = js.native
  
  @JSImport("libp2p-gossipsub/src/score", "defaultTopicScoreParams")
  @js.native
  val defaultTopicScoreParams: TopicScoreParams = js.native
  
  inline def validatePeerScoreParams(p: PeerScoreParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePeerScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validatePeerScoreThresholds(p: PeerScoreThresholds): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePeerScoreThresholds")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateTopicScoreParams(p: TopicScoreParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTopicScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
