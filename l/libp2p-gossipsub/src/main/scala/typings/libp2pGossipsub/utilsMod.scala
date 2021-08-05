package typings.libp2pGossipsub

import typings.libp2pGossipsub.anon.PartialControlMessage
import typings.libp2pGossipsub.messageMod.Message
import typings.libp2pGossipsub.messageMod.RPC
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("libp2p-gossipsub/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createGossipRpc(): RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")().asInstanceOf[RPC]
  inline def createGossipRpc(msgs: js.Array[Message]): RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")(msgs.asInstanceOf[js.Any]).asInstanceOf[RPC]
  inline def createGossipRpc(msgs: js.Array[Message], control: PartialControlMessage): RPC = (^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")(msgs.asInstanceOf[js.Any], control.asInstanceOf[js.Any])).asInstanceOf[RPC]
  inline def createGossipRpc(msgs: Unit, control: PartialControlMessage): RPC = (^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")(msgs.asInstanceOf[js.Any], control.asInstanceOf[js.Any])).asInstanceOf[RPC]
  
  inline def hasGossipProtocol(protocol: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasGossipProtocol")(protocol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def messageIdToString(msgId: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("messageIdToString")(msgId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def shuffle[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
