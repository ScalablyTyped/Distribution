package typings.libp2pMplex.distSrcMessageTypesMod

import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.RESET_RECEIVER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetReceiverMessage
  extends StObject
     with Message {
  
  var id: Double
  
  var `type`: RESET_RECEIVER
}
object ResetReceiverMessage {
  
  inline def apply(id: Double, `type`: RESET_RECEIVER): ResetReceiverMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetReceiverMessage]
  }
  
  extension [Self <: ResetReceiverMessage](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: RESET_RECEIVER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
