package typings.libp2pGossipsub

import typings.libp2pGossipsub.interfacesMod.MessageIdFunction
import typings.libp2pInterfaces.pubsubMod.InMessage
import typings.std.Map
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/tracer", JSImport.Namespace)
@js.native
object tracerMod extends js.Object {
  
  @js.native
  class IWantTracer protected () extends js.Object {
    def this(getMsgId: MessageIdFunction) = this()
    
    /**
      * Track a promise to deliver a message from a list of msgIDs we are requesting
      * @param {string} p peer id
      * @param {string[]} msgIds
      * @returns {void}
      */
    def addPromise(p: String, msgIds: js.Array[Uint8Array]): Unit = js.native
    
    def clear(): Unit = js.native
    
    /**
      * Someone delivered a message, stop tracking promises for it
      * @param {InMessage} msg
      * @returns {void}
      */
    def deliverMessage(msg: InMessage): Unit = js.native
    
    /**
      * Returns the number of broken promises for each peer who didn't follow up on an IWANT request.
      * @returns {Map<string, number>}
      */
    def getBrokenPromises(): Map[String, Double] = js.native
    
    def getMsgId(msg: InMessage): Uint8Array = js.native
    @JSName("getMsgId")
    var getMsgId_Original: MessageIdFunction = js.native
    
    /**
      * Promises to deliver a message
      * Map per message id, per peer, promise expiration time
      */
    var promises: Map[String, Map[String, Double]] = js.native
    
    /**
      * A message got rejected, so we can stop tracking promises and let the score penalty apply from invalid message delivery,
      * unless its an obviously invalid message.
      * @param {InMessage} msg
      * @param {string} reason
      * @returns {void}
      */
    def rejectMessage(msg: InMessage, reason: String): Unit = js.native
  }
}
