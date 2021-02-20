package typings.libp2pGossipsub

import typings.libp2pGossipsub.anon.PartialPeerStats
import typings.libp2pGossipsub.anon.PartialTopicStats
import typings.libp2pGossipsub.peerScoreParamsMod.PeerScoreParams
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peerStatsMod {
  
  @JSImport("libp2p-gossipsub/src/score/peer-stats", "createPeerStats")
  @js.native
  def createPeerStats(): PeerStats = js.native
  @JSImport("libp2p-gossipsub/src/score/peer-stats", "createPeerStats")
  @js.native
  def createPeerStats(ps: PartialPeerStats): PeerStats = js.native
  
  @JSImport("libp2p-gossipsub/src/score/peer-stats", "createTopicStats")
  @js.native
  def createTopicStats(): TopicStats = js.native
  @JSImport("libp2p-gossipsub/src/score/peer-stats", "createTopicStats")
  @js.native
  def createTopicStats(ts: PartialTopicStats): TopicStats = js.native
  
  @JSImport("libp2p-gossipsub/src/score/peer-stats", "ensureTopicStats")
  @js.native
  def ensureTopicStats(topic: String, ps: PeerStats, params: PeerScoreParams): js.UndefOr[TopicStats] = js.native
  
  @js.native
  trait PeerStats extends StObject {
    
    /**
      * behavioural pattern penalties (applied by the router)
      */
    var behaviourPenalty: Double = js.native
    
    /**
      * true if the peer is currently connected
      */
    var connected: Boolean = js.native
    
    /**
      * expiration time of the score stats for disconnected peers
      */
    var expire: Double = js.native
    
    /**
      * IP tracking; store as string for easy processing
      */
    var ips: js.Array[String] = js.native
    
    /**
      * per topic stats
      */
    var topics: Record[String, TopicStats] = js.native
  }
  object PeerStats {
    
    @scala.inline
    def apply(
      behaviourPenalty: Double,
      connected: Boolean,
      expire: Double,
      ips: js.Array[String],
      topics: Record[String, TopicStats]
    ): PeerStats = {
      val __obj = js.Dynamic.literal(behaviourPenalty = behaviourPenalty.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], ips = ips.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerStats]
    }
    
    @scala.inline
    implicit class PeerStatsMutableBuilder[Self <: PeerStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehaviourPenalty(value: Double): Self = StObject.set(x, "behaviourPenalty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIps(value: js.Array[String]): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpsVarargs(value: String*): Self = StObject.set(x, "ips", js.Array(value :_*))
      
      @scala.inline
      def setTopics(value: Record[String, TopicStats]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TopicStats extends StObject {
    
    /**
      * first message deliveries
      */
    var firstMessageDeliveries: Double = js.native
    
    /**
      * time when the peer was (last) GRAFTed; valid only when in mesh
      */
    var graftTime: Double = js.native
    
    /**
      * true if the peer is in the mesh
      */
    var inMesh: Boolean = js.native
    
    /**
      * invalid message counter
      */
    var invalidMessageDeliveries: Double = js.native
    
    /**
      * sticky mesh rate failure penalty counter
      */
    var meshFailurePenalty: Double = js.native
    
    /**
      * mesh message deliveries
      */
    var meshMessageDeliveries: Double = js.native
    
    /**
      * true if the peer has been enough time in the mesh to activate mess message deliveries
      */
    var meshMessageDeliveriesActive: Boolean = js.native
    
    /**
      * time in mesh (updated during refresh/decay to avoid calling gettimeofday on
      * every score invocation)
      */
    var meshTime: Double = js.native
  }
  object TopicStats {
    
    @scala.inline
    def apply(
      firstMessageDeliveries: Double,
      graftTime: Double,
      inMesh: Boolean,
      invalidMessageDeliveries: Double,
      meshFailurePenalty: Double,
      meshMessageDeliveries: Double,
      meshMessageDeliveriesActive: Boolean,
      meshTime: Double
    ): TopicStats = {
      val __obj = js.Dynamic.literal(firstMessageDeliveries = firstMessageDeliveries.asInstanceOf[js.Any], graftTime = graftTime.asInstanceOf[js.Any], inMesh = inMesh.asInstanceOf[js.Any], invalidMessageDeliveries = invalidMessageDeliveries.asInstanceOf[js.Any], meshFailurePenalty = meshFailurePenalty.asInstanceOf[js.Any], meshMessageDeliveries = meshMessageDeliveries.asInstanceOf[js.Any], meshMessageDeliveriesActive = meshMessageDeliveriesActive.asInstanceOf[js.Any], meshTime = meshTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicStats]
    }
    
    @scala.inline
    implicit class TopicStatsMutableBuilder[Self <: TopicStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstMessageDeliveries(value: Double): Self = StObject.set(x, "firstMessageDeliveries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraftTime(value: Double): Self = StObject.set(x, "graftTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInMesh(value: Boolean): Self = StObject.set(x, "inMesh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidMessageDeliveries(value: Double): Self = StObject.set(x, "invalidMessageDeliveries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshFailurePenalty(value: Double): Self = StObject.set(x, "meshFailurePenalty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshMessageDeliveries(value: Double): Self = StObject.set(x, "meshMessageDeliveries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshMessageDeliveriesActive(value: Boolean): Self = StObject.set(x, "meshMessageDeliveriesActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshTime(value: Double): Self = StObject.set(x, "meshTime", value.asInstanceOf[js.Any])
    }
  }
}
