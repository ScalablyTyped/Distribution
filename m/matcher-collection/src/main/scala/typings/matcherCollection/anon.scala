package typings.matcherCollection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Match extends StObject {
    
    def `match`(value: String): Boolean
    
    var matchers: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any
      ]
    
    def mayContain(value: String): Boolean
  }
  object Match {
    
    inline def apply(
      `match`: String => Boolean,
      matchers: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any
        ],
      mayContain: String => Boolean
    ): Match = {
      val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any], mayContain = js.Any.fromFunction1(mayContain))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      inline def setMatch(value: String => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setMatchers(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any
            ]
      ): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setMatchersVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any)*
      ): Self = StObject.set(x, "matchers", js.Array(value*))
      
      inline def setMayContain(value: String => Boolean): Self = StObject.set(x, "mayContain", js.Any.fromFunction1(value))
    }
  }
}
