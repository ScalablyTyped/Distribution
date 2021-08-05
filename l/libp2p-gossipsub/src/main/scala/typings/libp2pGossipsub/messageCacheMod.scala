package typings.libp2pGossipsub

import typings.libp2pGossipsub.interfacesMod.MessageIdFunction
import typings.libp2pInterfaces.pubsubMod.InMessage
import typings.std.Map
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageCacheMod {
  
  @JSImport("libp2p-gossipsub/src/message-cache", "MessageCache")
  @js.native
  class MessageCache protected () extends StObject {
    /**
      * @param {Number} gossip
      * @param {Number} history
      * @param {msgIdFn} msgIdFn a function that returns message id from a message
      *
      * @constructor
      */
    def this(gossip: Double, history: Double, msgIdFn: MessageIdFunction) = this()
    
    /**
      * Retrieves a message from the cache by its ID, if it is still present
      *
      * @param {Uint8Array} msgID
      * @returns {Message}
      */
    def get(msgID: Uint8Array): js.UndefOr[InMessage] = js.native
    
    /**
      * Retrieves a message from the cache by its ID, if it is present
      * for a specific peer.
      * Returns the message and the number of times the peer has requested the message
      *
      * @param {string} msgID
      * @param {string} p
      * @returns {[InMessage | undefined, number]}
      */
    def getForPeer(msgID: Uint8Array, p: String): js.Tuple2[js.UndefOr[InMessage], Double] = js.native
    
    /**
      * Retrieves a list of message IDs for a given topic
      *
      * @param {String} topic
      *
      * @returns {Array<Uint8Array>}
      */
    def getGossipIDs(topic: String): js.Array[Uint8Array] = js.native
    
    /**
      * Get message id of message.
      * @param {RPC.Message} msg
      * @returns {Uint8Array}
      */
    def getMsgId(msg: InMessage): Uint8Array = js.native
    
    var gossip: Double = js.native
    
    var history: js.Array[js.Array[CacheEntry]] = js.native
    
    def msgIdFn(msg: InMessage): Uint8Array = js.native
    @JSName("msgIdFn")
    var msgIdFn_Original: MessageIdFunction = js.native
    
    var msgs: Map[String, InMessage] = js.native
    
    var peertx: Map[String, Map[String, Double]] = js.native
    
    /**
      * Adds a message to the current window and the cache
      *
      * @param {RPC.Message} msg
      * @returns {void}
      */
    def put(msg: InMessage): Unit = js.native
    
    /**
      * Shifts the current window, discarding messages older than this.history.length of the cache
      *
      * @returns {void}
      */
    def shift(): Unit = js.native
  }
  
  trait CacheEntry extends StObject {
    
    var msgID: Uint8Array
    
    var topics: js.Array[String]
  }
  object CacheEntry {
    
    inline def apply(msgID: Uint8Array, topics: js.Array[String]): CacheEntry = {
      val __obj = js.Dynamic.literal(msgID = msgID.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheEntry]
    }
    
    extension [Self <: CacheEntry](x: Self) {
      
      inline def setMsgID(value: Uint8Array): Self = StObject.set(x, "msgID", value.asInstanceOf[js.Any])
      
      inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value :_*))
    }
  }
}
