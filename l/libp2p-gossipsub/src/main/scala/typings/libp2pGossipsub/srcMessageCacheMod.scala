package typings.libp2pGossipsub

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMessageCacheMod {
  
  @JSImport("libp2p-gossipsub/src/messageCache", "MessageCache")
  @js.native
  class MessageCache protected () extends StObject {
    /**
      * @param {Number} gossip
      * @param {Number} history
      * @param {msgIdFn} msgIdFn a function that returns message id from a message
      *
      * @constructor
      */
    def this(
      gossip: Double,
      history: Double,
      msgIdFn: js.Function1[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ /* msg */ js.Any, 
            String
          ]
    ) = this()
    
    /**
      * Retrieves a message from the cache by its ID, if it is still present
      *
      * @param {String} msgID
      * @returns {Message}
      */
    def get(msgID: String): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ js.Any
      ] = js.native
    
    /**
      * Retrieves a list of message IDs for a given topic
      *
      * @param {String} topic
      *
      * @returns {Array<String>}
      */
    def getGossipIDs(topic: String): js.Array[String] = js.native
    
    /**
      * Get message id of message.
      * @param {RPC.Message} msg
      * @returns {string}
      */
    def getMsgId(
      msg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ js.Any
    ): String = js.native
    
    var gossip: Double = js.native
    
    var history: js.Array[js.Array[CacheEntry]] = js.native
    
    def msgIdFn(
      msg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ js.Any
    ): String = js.native
    
    var msgs: Map[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ js.Any
      ] = js.native
    
    /**
      * Adds a message to the current window and the cache
      *
      * @param {RPC.Message} msg
      * @returns {void}
      */
    def put(
      msg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ js.Any
    ): Unit = js.native
    
    /**
      * Shifts the current window, discarding messages older than this.history.length of the cache
      *
      * @returns {void}
      */
    def shift(): Unit = js.native
  }
  
  trait CacheEntry extends StObject {
    
    var msgID: String
    
    var topics: js.Array[String]
  }
  object CacheEntry {
    
    inline def apply(msgID: String, topics: js.Array[String]): CacheEntry = {
      val __obj = js.Dynamic.literal(msgID = msgID.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheEntry]
    }
    
    extension [Self <: CacheEntry](x: Self) {
      
      inline def setMsgID(value: String): Self = StObject.set(x, "msgID", value.asInstanceOf[js.Any])
      
      inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value :_*))
    }
  }
}
