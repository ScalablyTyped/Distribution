package typings.lunr

import typings.lunr.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var boost: js.UndefOr[Double] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
      
      inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    }
  }
  
  trait Boost extends StObject {
    
    var boost: js.UndefOr[Double] = js.undefined
    
    var extractor: js.UndefOr[js.Function1[/* doc */ js.Object, String | js.Object | js.Array[js.Object]]] = js.undefined
  }
  object Boost {
    
    inline def apply(): Boost = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Boost]
    }
    
    extension [Self <: Boost](x: Self) {
      
      inline def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
      
      inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
      
      inline def setExtractor(value: /* doc */ js.Object => String | js.Object | js.Array[js.Object]): Self = StObject.set(x, "extractor", js.Any.fromFunction1(value))
      
      inline def setExtractorUndefined: Self = StObject.set(x, "extractor", js.undefined)
    }
  }
  
  @js.native
  trait Typeoftokenizer extends StObject {
    
    /**
      * A function for splitting a string into tokens ready to be inserted into
      * the search index. Uses `lunr.tokenizer.separator` to split strings, change
      * the value of this property to change how strings are split into tokens.
      *
      * This tokenizer will convert its parameter to a string by calling `toString` and
      * then will split this string on the character in `lunr.tokenizer.separator`.
      * Arrays will have their elements converted to strings and wrapped in a lunr.Token.
      *
      * @param obj - The object to convert into tokens
      */
    def apply(): js.Array[Token] = js.native
    def apply(obj: String): js.Array[Token] = js.native
    def apply(obj: js.Array[js.Object]): js.Array[Token] = js.native
    def apply(obj: js.Object): js.Array[Token] = js.native
    
    /**
      * The separator used to split a string into tokens. Override this property to change the behaviour of
      * `lunr.tokenizer` behaviour when tokenizing strings. By default this splits on whitespace and hyphens.
      *
      * @see lunr.tokenizer
      */
    var separator: js.RegExp = js.native
  }
}
