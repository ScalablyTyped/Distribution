package typings.libp2pGossipsub

import typings.libp2pGossipsub.anon.PartialPeerScoreParams
import typings.libp2pGossipsub.anon.PartialPeerScoreThreshold
import typings.libp2pGossipsub.anon.PartialTopicScoreParams
import typings.libp2pGossipsub.interfacesMod.ConnectionManager
import typings.libp2pGossipsub.interfacesMod.MessageIdFunction
import typings.libp2pGossipsub.peerScoreParamsMod.PeerScoreParams
import typings.libp2pGossipsub.peerScoreParamsMod.TopicScoreParams
import typings.libp2pGossipsub.peerScoreThresholdsMod.PeerScoreThresholds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/score", JSImport.Namespace)
@js.native
object scoreMod extends js.Object {
  
  def createPeerScoreParams(): PeerScoreParams = js.native
  def createPeerScoreParams(p: PartialPeerScoreParams): PeerScoreParams = js.native
  
  def createPeerScoreThresholds(): PeerScoreThresholds = js.native
  def createPeerScoreThresholds(p: PartialPeerScoreThreshold): PeerScoreThresholds = js.native
  
  def createTopicScoreParams(): TopicScoreParams = js.native
  def createTopicScoreParams(p: PartialTopicScoreParams): TopicScoreParams = js.native
  
  val defaultPeerScoreParams: PeerScoreParams = js.native
  
  val defaultPeerScoreThresholds: PeerScoreThresholds = js.native
  
  val defaultTopicScoreParams: TopicScoreParams = js.native
  
  def validatePeerScoreParams(p: PeerScoreParams): Unit = js.native
  
  def validatePeerScoreThresholds(p: PeerScoreThresholds): Unit = js.native
  
  def validateTopicScoreParams(p: TopicScoreParams): Unit = js.native
  
  @js.native
  class PeerScore protected ()
    extends typings.libp2pGossipsub.peerScoreMod.PeerScore {
    def this(params: PeerScoreParams, connectionManager: ConnectionManager, msgId: MessageIdFunction) = this()
  }
}
