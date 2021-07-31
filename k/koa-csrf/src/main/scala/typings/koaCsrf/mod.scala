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
      
      @scala.inline
      def apply(csrf: String): Context = {
        val __obj = js.Dynamic.literal(csrf = csrf.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      @scala.inline
      implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCsrf(value: String): Self = StObject.set(x, "csrf", value.asInstanceOf[js.Any])
      }
    }
  }
}
