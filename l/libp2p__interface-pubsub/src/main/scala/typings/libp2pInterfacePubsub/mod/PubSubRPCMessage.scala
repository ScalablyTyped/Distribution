package typings.libp2pInterfacePubsub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubSubRPCMessage extends StObject {
  
  var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var from: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var key: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var sequenceNumber: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var signature: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var topic: js.UndefOr[String] = js.undefined
}
object PubSubRPCMessage {
  
  inline def apply(): PubSubRPCMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubSubRPCMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PubSubRPCMessage] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFrom(value: js.typedarray.Uint8Array): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setSequenceNumber(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "sequenceNumber", js.undefined)
    
    inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
