package typings.libp2pMplex.distSrcMessageTypesMod

import typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.RESET_INITIATOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetInitiatorMessage
  extends StObject
     with Message {
  
  var id: Double
  
  var `type`: RESET_INITIATOR
}
object ResetInitiatorMessage {
  
  inline def apply(id: Double, `type`: RESET_INITIATOR): ResetInitiatorMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetInitiatorMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetInitiatorMessage] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: RESET_INITIATOR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
