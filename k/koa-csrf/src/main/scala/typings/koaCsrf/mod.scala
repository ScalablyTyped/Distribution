package typings.koaCsrf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait Context extends StObject {
      
      var csrf: String
    }
    object Context {
      
      inline def apply(csrf: String): Context = {
        val __obj = js.Dynamic.literal(csrf = csrf.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      extension [Self <: Context](x: Self) {
        
        inline def setCsrf(value: String): Self = StObject.set(x, "csrf", value.asInstanceOf[js.Any])
      }
    }
  }
}
