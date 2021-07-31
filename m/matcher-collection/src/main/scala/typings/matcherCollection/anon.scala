package typings.matcherCollection

import typings.minimatch.mod.IMinimatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Match extends StObject {
    
    def `match`(value: String): Boolean
    
    var matchers: js.Array[IMinimatch]
    
    def mayContain(value: String): Boolean
  }
  object Match {
    
    @scala.inline
    def apply(`match`: String => Boolean, matchers: js.Array[IMinimatch], mayContain: String => Boolean): Match = {
      val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any], mayContain = js.Any.fromFunction1(mayContain))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit class MatchMutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatch(value: String => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatchers(value: js.Array[IMinimatch]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchersVarargs(value: IMinimatch*): Self = StObject.set(x, "matchers", js.Array(value :_*))
      
      @scala.inline
      def setMayContain(value: String => Boolean): Self = StObject.set(x, "mayContain", js.Any.fromFunction1(value))
    }
  }
}
