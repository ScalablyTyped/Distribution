package typings.libp2pGossipsub.messageDeliveriesMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/score/message-deliveries", "MessageDeliveries")
@js.native
class MessageDeliveries () extends js.Object {
  
  def clear(): Unit = js.native
  
  def ensureRecord(msgId: Uint8Array): DeliveryRecord = js.native
  
  def gc(): Unit = js.native
  
  var queue: js.Any = js.native
  
  var records: js.Any = js.native
}
