package typings.libp2pMplex.distSrcMessageTypesMod

import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.CLOSE_INITIATOR
import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.CLOSE_RECEIVER
import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.MESSAGE_INITIATOR
import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.MESSAGE_RECEIVER
import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.NEW_STREAM
import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.RESET_INITIATOR
import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.RESET_RECEIVER
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.libp2pMplex.distSrcMessageTypesMod.NewStreamMessage
  - typings.libp2pMplex.distSrcMessageTypesMod.MessageReceiverMessage
  - typings.libp2pMplex.distSrcMessageTypesMod.MessageInitiatorMessage
  - typings.libp2pMplex.distSrcMessageTypesMod.CloseReceiverMessage
  - typings.libp2pMplex.distSrcMessageTypesMod.CloseInitiatorMessage
  - typings.libp2pMplex.distSrcMessageTypesMod.ResetReceiverMessage
  - typings.libp2pMplex.distSrcMessageTypesMod.ResetInitiatorMessage
*/
trait Message extends StObject
object Message {
  
  inline def CloseInitiatorMessage(id: Double, `type`: CLOSE_INITIATOR): typings.libp2pMplex.distSrcMessageTypesMod.CloseInitiatorMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pMplex.distSrcMessageTypesMod.CloseInitiatorMessage]
  }
  
  inline def CloseReceiverMessage(id: Double, `type`: CLOSE_RECEIVER): typings.libp2pMplex.distSrcMessageTypesMod.CloseReceiverMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pMplex.distSrcMessageTypesMod.CloseReceiverMessage]
  }
  
  inline def MessageInitiatorMessage(data: Uint8ArrayList, id: Double, `type`: MESSAGE_INITIATOR): typings.libp2pMplex.distSrcMessageTypesMod.MessageInitiatorMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pMplex.distSrcMessageTypesMod.MessageInitiatorMessage]
  }
  
  inline def MessageReceiverMessage(data: Uint8ArrayList, id: Double, `type`: MESSAGE_RECEIVER): typings.libp2pMplex.distSrcMessageTypesMod.MessageReceiverMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pMplex.distSrcMessageTypesMod.MessageReceiverMessage]
  }
  
  inline def NewStreamMessage(data: Uint8ArrayList, id: Double, `type`: NEW_STREAM): typings.libp2pMplex.distSrcMessageTypesMod.NewStreamMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pMplex.distSrcMessageTypesMod.NewStreamMessage]
  }
  
  inline def ResetInitiatorMessage(id: Double, `type`: RESET_INITIATOR): typings.libp2pMplex.distSrcMessageTypesMod.ResetInitiatorMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pMplex.distSrcMessageTypesMod.ResetInitiatorMessage]
  }
  
  inline def ResetReceiverMessage(id: Double, `type`: RESET_RECEIVER): typings.libp2pMplex.distSrcMessageTypesMod.ResetReceiverMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pMplex.distSrcMessageTypesMod.ResetReceiverMessage]
  }
}
