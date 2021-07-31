package typings.libp2pGossipsub

import typings.libp2pGossipsub.anon.PartialControlMessage
import typings.libp2pGossipsub.messageMod.Message
import typings.libp2pGossipsub.messageMod.RPC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCreateGossipRpcMod {
  
  @JSImport("libp2p-gossipsub/src/utils/createGossipRpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createGossipRpc(): RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")().asInstanceOf[RPC]
  @scala.inline
  def createGossipRpc(msgs: js.Array[Message]): RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")(msgs.asInstanceOf[js.Any]).asInstanceOf[RPC]
  @scala.inline
  def createGossipRpc(msgs: js.Array[Message], control: PartialControlMessage): RPC = (^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")(msgs.asInstanceOf[js.Any], control.asInstanceOf[js.Any])).asInstanceOf[RPC]
  @scala.inline
  def createGossipRpc(msgs: Unit, control: PartialControlMessage): RPC = (^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")(msgs.asInstanceOf[js.Any], control.asInstanceOf[js.Any])).asInstanceOf[RPC]
}
