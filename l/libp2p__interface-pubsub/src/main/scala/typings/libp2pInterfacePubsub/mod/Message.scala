package typings.libp2pInterfacePubsub.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.libp2pInterfacePubsub.mod.SignedMessage
  - typings.libp2pInterfacePubsub.mod.UnsignedMessage
*/
trait Message extends StObject
object Message {
  
  inline def SignedMessage(
    data: js.typedarray.Uint8Array,
    from: PeerId,
    key: js.typedarray.Uint8Array,
    sequenceNumber: js.BigInt,
    signature: js.typedarray.Uint8Array,
    topic: String
  ): typings.libp2pInterfacePubsub.mod.SignedMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("signed")
    __obj.asInstanceOf[typings.libp2pInterfacePubsub.mod.SignedMessage]
  }
  
  inline def UnsignedMessage(data: js.typedarray.Uint8Array, topic: String): typings.libp2pInterfacePubsub.mod.UnsignedMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unsigned")
    __obj.asInstanceOf[typings.libp2pInterfacePubsub.mod.UnsignedMessage]
  }
}
