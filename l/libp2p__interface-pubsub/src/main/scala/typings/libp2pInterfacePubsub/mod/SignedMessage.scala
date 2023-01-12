package typings.libp2pInterfacePubsub.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.libp2pInterfacePubsubStrings.signed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedMessage
  extends StObject
     with Message {
  
  var data: js.typedarray.Uint8Array
  
  var from: PeerId
  
  var key: js.typedarray.Uint8Array
  
  var sequenceNumber: js.BigInt
  
  var signature: js.typedarray.Uint8Array
  
  var topic: String
  
  var `type`: signed
}
object SignedMessage {
  
  inline def apply(
    data: js.typedarray.Uint8Array,
    from: PeerId,
    key: js.typedarray.Uint8Array,
    sequenceNumber: js.BigInt,
    signature: js.typedarray.Uint8Array,
    topic: String
  ): SignedMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("signed")
    __obj.asInstanceOf[SignedMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignedMessage] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: js.BigInt): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setType(value: signed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
