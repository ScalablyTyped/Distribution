package typings.leafletFullscreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PseudoFullscreen extends StObject {
    
    var pseudoFullscreen: Boolean
  }
  object PseudoFullscreen {
    
    inline def apply(pseudoFullscreen: Boolean): PseudoFullscreen = {
      val __obj = js.Dynamic.literal(pseudoFullscreen = pseudoFullscreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[PseudoFullscreen]
    }
    
    extension [Self <: PseudoFullscreen](x: Self) {
      
      inline def setPseudoFullscreen(value: Boolean): Self = StObject.set(x, "pseudoFullscreen", value.asInstanceOf[js.Any])
    }
  }
}
