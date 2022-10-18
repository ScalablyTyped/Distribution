package typings.karmaIeLauncher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object karmaMod {
  
  trait CustomLauncher extends StObject {
    
    /** run IE in emulation mode */
    var `x-ua-compatible`: js.UndefOr[String] = js.undefined
  }
  object CustomLauncher {
    
    inline def apply(): CustomLauncher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomLauncher]
    }
    
    extension [Self <: CustomLauncher](x: Self) {
      
      inline def `setX-ua-compatible`(value: String): Self = StObject.set(x, "x-ua-compatible", value.asInstanceOf[js.Any])
      
      inline def `setX-ua-compatibleUndefined`: Self = StObject.set(x, "x-ua-compatible", js.undefined)
    }
  }
}
