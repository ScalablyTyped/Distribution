package typings.libp2pInterfaceConnection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofStatus extends StObject {
    
    val CLOSED: /* "CLOSED" */ String
    
    val CLOSING: /* "CLOSING" */ String
    
    val OPEN: /* "OPEN" */ String
  }
  object TypeofStatus {
    
    inline def apply(CLOSED: /* "CLOSED" */ String, CLOSING: /* "CLOSING" */ String, OPEN: /* "OPEN" */ String): TypeofStatus = {
      val __obj = js.Dynamic.literal(CLOSED = CLOSED.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofStatus]
    }
    
    extension [Self <: TypeofStatus](x: Self) {
      
      inline def setCLOSED(value: /* "CLOSED" */ String): Self = StObject.set(x, "CLOSED", value.asInstanceOf[js.Any])
      
      inline def setCLOSING(value: /* "CLOSING" */ String): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
      
      inline def setOPEN(value: /* "OPEN" */ String): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
    }
  }
}
