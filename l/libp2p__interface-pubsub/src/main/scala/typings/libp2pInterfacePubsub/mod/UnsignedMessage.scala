package typings.libp2pInterfacePubsub.mod

import typings.libp2pInterfacePubsub.libp2pInterfacePubsubStrings.unsigned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsignedMessage
  extends StObject
     with Message {
  
  var data: js.typedarray.Uint8Array
  
  var topic: String
  
  var `type`: unsigned
}
object UnsignedMessage {
  
  inline def apply(data: js.typedarray.Uint8Array, topic: String): UnsignedMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unsigned")
    __obj.asInstanceOf[UnsignedMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnsignedMessage] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setType(value: unsigned): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
