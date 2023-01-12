package typings.libp2pMplex.distSrcMessageTypesMod

import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.CLOSE_RECEIVER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseReceiverMessage
  extends StObject
     with Message {
  
  var id: Double
  
  var `type`: CLOSE_RECEIVER
}
object CloseReceiverMessage {
  
  inline def apply(id: Double, `type`: CLOSE_RECEIVER): CloseReceiverMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseReceiverMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseReceiverMessage] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: CLOSE_RECEIVER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
