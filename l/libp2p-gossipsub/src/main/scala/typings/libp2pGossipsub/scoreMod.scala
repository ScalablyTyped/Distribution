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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scoreMod {
  
  @JSImport("libp2p-gossipsub/src/score", "PeerScore")
  @js.native
  class PeerScore protected ()
    extends typings.libp2pGossipsub.peerScoreMod.PeerScore {
    def this(params: PeerScoreParams, connectionManager: ConnectionManager, msgId: MessageIdFunction) = this()
  }
  
  @JSImport("libp2p-gossipsub/src/score", "createPeerScoreParams")
  @js.native
  def createPeerScoreParams(): PeerScoreParams = js.native
  @JSImport("libp2p-gossipsub/src/score", "createPeerScoreParams")
  @js.native
  def createPeerScoreParams(p: PartialPeerScoreParams): PeerScoreParams = js.native
  
  @JSImport("libp2p-gossipsub/src/score", "createPeerScoreThresholds")
  @js.native
  def createPeerScoreThresholds(): PeerScoreThresholds = js.native
  @JSImport("libp2p-gossipsub/src/score", "createPeerScoreThresholds")
  @js.native
  def createPeerScoreThresholds(p: PartialPeerScoreThreshold): PeerScoreThresholds = js.native
  
  @JSImport("libp2p-gossipsub/src/score", "createTopicScoreParams")
  @js.native
  def createTopicScoreParams(): TopicScoreParams = js.native
  @JSImport("libp2p-gossipsub/src/score", "createTopicScoreParams")
  @js.native
  def createTopicScoreParams(p: PartialTopicScoreParams): TopicScoreParams = js.native
  
  @JSImport("libp2p-gossipsub/src/score", "defaultPeerScoreParams")
  @js.native
  val defaultPeerScoreParams: PeerScoreParams = js.native
  
  @JSImport("libp2p-gossipsub/src/score", "defaultPeerScoreThresholds")
  @js.native
  val defaultPeerScoreThresholds: PeerScoreThresholds = js.native
  
  @JSImport("libp2p-gossipsub/src/score", "defaultTopicScoreParams")
  @js.native
  val defaultTopicScoreParams: TopicScoreParams = js.native
  
  @JSImport("libp2p-gossipsub/src/score", "validatePeerScoreParams")
  @js.native
  def validatePeerScoreParams(p: PeerScoreParams): Unit = js.native
  
  @JSImport("libp2p-gossipsub/src/score", "validatePeerScoreThresholds")
  @js.native
  def validatePeerScoreThresholds(p: PeerScoreThresholds): Unit = js.native
  
  @JSImport("libp2p-gossipsub/src/score", "validateTopicScoreParams")
  @js.native
  def validateTopicScoreParams(p: TopicScoreParams): Unit = js.native
}
