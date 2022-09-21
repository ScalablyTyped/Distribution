package typings.koaCsrf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait DefaultState extends StObject {
      
      var _csrf: String
    }
    object DefaultState {
      
      inline def apply(_csrf: String): DefaultState = {
        val __obj = js.Dynamic.literal(_csrf = _csrf.asInstanceOf[js.Any])
        __obj.asInstanceOf[DefaultState]
      }
      
      extension [Self <: DefaultState](x: Self) {
        
        inline def set_csrf(value: String): Self = StObject.set(x, "_csrf", value.asInstanceOf[js.Any])
      }
    }
  }
}
