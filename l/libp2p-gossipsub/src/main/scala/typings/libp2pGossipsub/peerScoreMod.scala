package typings.libp2pGossipsub

import typings.libp2pGossipsub.interfacesMod.ConnectionManager
import typings.libp2pGossipsub.interfacesMod.MessageIdFunction
import typings.libp2pGossipsub.messageDeliveriesMod.MessageDeliveries
import typings.libp2pGossipsub.peerScoreParamsMod.PeerScoreParams
import typings.libp2pGossipsub.peerStatsMod.PeerStats
import typings.libp2pInterfaces.pubsubMod.InMessage
import typings.node.NodeJS.Timeout
import typings.std.Map
import typings.std.Set
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peerScoreMod {
  
  @JSImport("libp2p-gossipsub/src/score/peer-score", "PeerScore")
  @js.native
  class PeerScore protected () extends StObject {
    def this(params: PeerScoreParams, connectionManager: ConnectionManager, msgId: MessageIdFunction) = this()
    
    var _backgroundInterval: js.UndefOr[Timeout] = js.native
    
    var _connectionManager: ConnectionManager = js.native
    
    /**
      * Gets the current IPs for a peer.
      * @param {string} id
      * @returns {Array<string>}
      */
    def _getIPs(id: String): js.Array[String] = js.native
    
    /**
      * Increments the "mesh message deliveries" counter for messages we've seen before,
      * as long the message was received within the P3 window.
      * @param {string} id
      * @param {InMessage} message
      * @param {number} validatedTime
      * @returns {void}
      */
    def _markDuplicateMessageDelivery(id: String, message: InMessage): Unit = js.native
    def _markDuplicateMessageDelivery(id: String, message: InMessage, validatedTime: Double): Unit = js.native
    
    /**
      * Increments the "first message deliveries" counter for all scored topics the message is published in,
      * as well as the "mesh message deliveries" counter, if the peer is in the mesh for the topic.
      * @param {string} id
      * @param {InMessage} message
      * @returns {void}
      */
    def _markFirstMessageDelivery(id: String, message: InMessage): Unit = js.native
    
    /**
      * Increments the "invalid message deliveries" counter for all scored topics the message is published in.
      * @param {string} id
      * @param {InMessage} message
      * @returns {void}
      */
    def _markInvalidMessageDelivery(id: String, message: InMessage): Unit = js.native
    
    /**
      * Decays scores, and purges score records for disconnected peers once their expiry has elapsed.
      * @returns {void}
      */
    def _refreshScores(): Unit = js.native
    
    /**
      * Removes an IP list from the tracking list for a peer.
      * @param {string} id
      * @param {Array<string>} ips
      * @returns {void}
      */
    def _removeIPs(id: String, ips: js.Array[String]): Unit = js.native
    
    /**
      * Adds tracking for the new IPs in the list, and removes tracking from the obsolete IPs.
      * @param {string} id
      * @param {Array<string>} newIPs
      * @param {Array<string>} oldIPs
      * @returns {void}
      */
    def _setIPs(id: String, newIPs: js.Array[String], oldIPs: js.Array[String]): Unit = js.native
    
    /**
      * Update all peer IPs to currently open connections
      * @returns {void}
      */
    def _updateIPs(): Unit = js.native
    
    /**
      * @param {string} id
      * @returns {void}
      */
    def addPeer(id: String): Unit = js.native
    
    /**
      * Apply a behavioural penalty to a peer
      * @param {string} id
      * @param {Number} penalty
      * @returns {void}
      */
    def addPenalty(id: String, penalty: Double): Unit = js.native
    
    /**
      * Periodic maintenance
      * @returns {void}
      */
    def background(): Unit = js.native
    
    /**
      * @param {InMessage} message
      * @returns {void}
      */
    def deliverMessage(message: InMessage): Unit = js.native
    
    /**
      * Recent message delivery timing/participants
      */
    var deliveryRecords: MessageDeliveries = js.native
    
    /**
      * @param {InMessage} message
      * @returns {void}
      */
    def duplicateMessage(message: InMessage): Unit = js.native
    
    /**
      * @param {string} id
      * @param {String} topic
      * @returns {void}
      */
    def graft(id: String, topic: String): Unit = js.native
    
    /**
      * Message ID function
      */
    def msgId(msg: InMessage): Uint8Array = js.native
    /**
      * Message ID function
      */
    @JSName("msgId")
    var msgId_Original: MessageIdFunction = js.native
    
    /**
      * The score parameters
      */
    var params: PeerScoreParams = js.native
    
    /**
      * IP colocation tracking; maps IP => set of peers.
      */
    var peerIPs: Map[String, Set[String]] = js.native
    
    /**
      * Per-peer stats for score calculation
      */
    var peerStats: Map[String, PeerStats] = js.native
    
    /**
      * @param {string} id
      * @param {string} topic
      * @returns {void}
      */
    def prune(id: String, topic: String): Unit = js.native
    
    /**
      * @param {InMessage} message
      * @param {string} reason
      * @returns {void}
      */
    def rejectMessage(message: InMessage, reason: String): Unit = js.native
    
    /**
      * @param {string} id
      * @returns {void}
      */
    def removePeer(id: String): Unit = js.native
    
    /**
      * Return the score for a peer
      * @param {string} id
      * @returns {Number}
      */
    def score(id: String): Double = js.native
    
    /**
      * Start PeerScore instance
      * @returns {void}
      */
    def start(): Unit = js.native
    
    /**
      * Stop PeerScore instance
      * @returns {void}
      */
    def stop(): Unit = js.native
    
    /**
      * @param {InMessage} message
      * @returns {void}
      */
    def validateMessage(message: InMessage): Unit = js.native
  }
}
