package typings.jestExpect

import typings.expect.mod.AsymmetricMatcher2
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<expect.expect.AsymmetricMatchers, 'any' | 'anything'> */
  trait OmitAsymmetricMatchersany extends StObject {
    
    var arrayContaining: js.Function1[/* sample */ js.Array[Any], AsymmetricMatcher2]
    
    var closeTo: js.Function1[/* sample */ Double, AsymmetricMatcher2]
    
    var objectContaining: js.Function1[/* sample */ Record[String, Any], AsymmetricMatcher2]
    
    var stringContaining: js.Function1[/* sample */ String, AsymmetricMatcher2]
    
    var stringMatching: js.Function1[/* sample */ String, AsymmetricMatcher2]
  }
  object OmitAsymmetricMatchersany {
    
    inline def apply(
      arrayContaining: /* sample */ js.Array[Any] => AsymmetricMatcher2,
      closeTo: /* sample */ Double => AsymmetricMatcher2,
      objectContaining: /* sample */ Record[String, Any] => AsymmetricMatcher2,
      stringContaining: /* sample */ String => AsymmetricMatcher2,
      stringMatching: /* sample */ String => AsymmetricMatcher2
    ): OmitAsymmetricMatchersany = {
      val __obj = js.Dynamic.literal(arrayContaining = js.Any.fromFunction1(arrayContaining), closeTo = js.Any.fromFunction1(closeTo), objectContaining = js.Any.fromFunction1(objectContaining), stringContaining = js.Any.fromFunction1(stringContaining), stringMatching = js.Any.fromFunction1(stringMatching))
      __obj.asInstanceOf[OmitAsymmetricMatchersany]
    }
    
    extension [Self <: OmitAsymmetricMatchersany](x: Self) {
      
      inline def setArrayContaining(value: /* sample */ js.Array[Any] => AsymmetricMatcher2): Self = StObject.set(x, "arrayContaining", js.Any.fromFunction1(value))
      
      inline def setCloseTo(value: /* sample */ Double => AsymmetricMatcher2): Self = StObject.set(x, "closeTo", js.Any.fromFunction1(value))
      
      inline def setObjectContaining(value: /* sample */ Record[String, Any] => AsymmetricMatcher2): Self = StObject.set(x, "objectContaining", js.Any.fromFunction1(value))
      
      inline def setStringContaining(value: /* sample */ String => AsymmetricMatcher2): Self = StObject.set(x, "stringContaining", js.Any.fromFunction1(value))
      
      inline def setStringMatching(value: /* sample */ String => AsymmetricMatcher2): Self = StObject.set(x, "stringMatching", js.Any.fromFunction1(value))
    }
  }
}
