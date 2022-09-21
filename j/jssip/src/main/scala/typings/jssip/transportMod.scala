package typings.jssip

import typings.jssip.webSocketInterfaceMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  @JSImport("jssip/lib/Transport", "Transport")
  @js.native
  open class Transport protected () extends Socket {
    def this(sockets: js.Array[Socket]) = this()
    def this(sockets: Socket) = this()
    def this(sockets: js.Array[Socket], recovery_options: RecoveryOptions) = this()
    def this(sockets: Socket, recovery_options: RecoveryOptions) = this()
  }
  
  trait RecoveryOptions extends StObject {
    
    var max_interval: Double
    
    var min_interval: Double
  }
  object RecoveryOptions {
    
    inline def apply(max_interval: Double, min_interval: Double): RecoveryOptions = {
      val __obj = js.Dynamic.literal(max_interval = max_interval.asInstanceOf[js.Any], min_interval = min_interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecoveryOptions]
    }
    
    extension [Self <: RecoveryOptions](x: Self) {
      
      inline def setMax_interval(value: Double): Self = StObject.set(x, "max_interval", value.asInstanceOf[js.Any])
      
      inline def setMin_interval(value: Double): Self = StObject.set(x, "min_interval", value.asInstanceOf[js.Any])
    }
  }
}
