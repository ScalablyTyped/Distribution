package typings.libp2pMplex.distSrcMessageTypesMod

import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.MESSAGE_RECEIVER
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageReceiverMessage
  extends StObject
     with Message {
  
  var data: Uint8ArrayList
  
  var id: Double
  
  var `type`: MESSAGE_RECEIVER
}
object MessageReceiverMessage {
  
  inline def apply(data: Uint8ArrayList, id: Double, `type`: MESSAGE_RECEIVER): MessageReceiverMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageReceiverMessage]
  }
  
  extension [Self <: MessageReceiverMessage](x: Self) {
    
    inline def setData(value: Uint8ArrayList): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: MESSAGE_RECEIVER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
