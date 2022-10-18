package typings.mafmt

import typings.multiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  trait Mafmt extends StObject {
    
    var input: js.UndefOr[js.Array[Mafmt | js.Function0[this.type]]] = js.undefined
    
    def matches(a: String): Boolean
    def matches(a: js.typedarray.Uint8Array): Boolean
    def matches(a: Multiaddr_): Boolean
    @JSName("matches")
    var matches_Original: MatchesFunction
    
    def partialMatch(protos: js.Array[String]): Boolean | js.Array[String] | Null
    @JSName("partialMatch")
    var partialMatch_Original: PartialMatchesFunction
  }
  object Mafmt {
    
    inline def apply(
      matches: /* a */ String | js.typedarray.Uint8Array | Multiaddr_ => Boolean,
      partialMatch: /* protos */ js.Array[String] => Boolean | js.Array[String] | Null
    ): Mafmt = {
      val __obj = js.Dynamic.literal(matches = js.Any.fromFunction1(matches), partialMatch = js.Any.fromFunction1(partialMatch))
      __obj.asInstanceOf[Mafmt]
    }
    
    extension [Self <: Mafmt](x: Self) {
      
      inline def setInput(value: js.Array[Mafmt | js.Function0[Mafmt]]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setInputVarargs(value: (Mafmt | js.Function0[Mafmt])*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setMatches(value: /* a */ String | js.typedarray.Uint8Array | Multiaddr_ => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
      
      inline def setPartialMatch(value: /* protos */ js.Array[String] => Boolean | js.Array[String] | Null): Self = StObject.set(x, "partialMatch", js.Any.fromFunction1(value))
    }
  }
  
  type MatchesFunction = js.Function1[/* a */ String | js.typedarray.Uint8Array | Multiaddr_, Boolean]
  
  type PartialMatchesFunction = js.Function1[/* protos */ js.Array[String], Boolean | js.Array[String] | Null]
}
