package typings.libp2pGossipsub

import typings.libp2pGossipsub.anon.PartialControlMessage
import typings.libp2pGossipsub.messageMod.Message
import typings.libp2pGossipsub.messageMod.RPC
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def createGossipRpc(): RPC = js.native
  def createGossipRpc(msgs: js.UndefOr[scala.Nothing], control: PartialControlMessage): RPC = js.native
  def createGossipRpc(msgs: js.Array[Message]): RPC = js.native
  def createGossipRpc(msgs: js.Array[Message], control: PartialControlMessage): RPC = js.native
  
  def hasGossipProtocol(protocol: String): Boolean = js.native
  
  def messageIdToString(msgId: Uint8Array): String = js.native
  
  def shuffle[T](arr: js.Array[T]): js.Array[T] = js.native
}
