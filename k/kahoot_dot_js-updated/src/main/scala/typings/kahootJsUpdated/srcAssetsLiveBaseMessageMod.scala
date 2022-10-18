package typings.kahootJsUpdated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAssetsLiveBaseMessageMod {
  
  @JSImport("kahoot.js-updated/src/assets/LiveBaseMessage", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LiveBaseMessage {
    def this(client: typings.kahootJsUpdated.mod.^, channel: String) = this()
    def this(client: typings.kahootJsUpdated.mod.^, channel: String, data: Any) = this()
    
    /* CompleteClass */
    var channel: String = js.native
    
    /* CompleteClass */
    var clientId: Unit = js.native
  }
  
  trait LiveBaseMessage extends StObject {
    
    var channel: String
    
    var clientId: Unit
  }
  object LiveBaseMessage {
    
    inline def apply(channel: String, clientId: Unit): LiveBaseMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveBaseMessage]
    }
    
    extension [Self <: LiveBaseMessage](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: Unit): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    }
  }
}
