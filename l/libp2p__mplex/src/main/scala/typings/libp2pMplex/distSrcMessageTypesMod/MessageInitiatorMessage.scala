package typings.libp2pMplex.distSrcMessageTypesMod

import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.MESSAGE_INITIATOR
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageInitiatorMessage
  extends StObject
     with Message {
  
  var data: Uint8ArrayList
  
  var id: Double
  
  var `type`: MESSAGE_INITIATOR
}
object MessageInitiatorMessage {
  
  inline def apply(data: Uint8ArrayList, id: Double, `type`: MESSAGE_INITIATOR): MessageInitiatorMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageInitiatorMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageInitiatorMessage] (val x: Self) extends AnyVal {
    
    inline def setData(value: Uint8ArrayList): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: MESSAGE_INITIATOR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
