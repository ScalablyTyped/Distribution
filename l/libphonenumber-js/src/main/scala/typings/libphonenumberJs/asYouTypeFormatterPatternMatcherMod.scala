package typings.libphonenumberJs

import typings.libphonenumberJs.asYouTypeFormatterPatternParserMod.character
import typings.libphonenumberJs.libphonenumberJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asYouTypeFormatterPatternMatcherMod {
  
  @JSImport("libphonenumber-js/source/AsYouTypeFormatter.PatternMatcher", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PatternMatcher {
    def this(pattern: String) = this()
  }
  
  trait MatchOptions extends StObject {
    
    var allowOverflow: js.UndefOr[Boolean] = js.undefined
  }
  object MatchOptions {
    
    inline def apply(): MatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchOptions]
    }
    
    extension [Self <: MatchOptions](x: Self) {
      
      inline def setAllowOverflow(value: Boolean): Self = StObject.set(x, "allowOverflow", value.asInstanceOf[js.Any])
      
      inline def setAllowOverflowUndefined: Self = StObject.set(x, "allowOverflow", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.libphonenumberJs.asYouTypeFormatterPatternMatcherMod.MatchResultOverflow
    - typings.libphonenumberJs.asYouTypeFormatterPatternMatcherMod.MatchResultFullMatch
    - typings.libphonenumberJs.asYouTypeFormatterPatternMatcherMod.MatchResultPartialMatch
    - typings.libphonenumberJs.asYouTypeFormatterPatternMatcherMod.MatchResultNoMatch
  */
  type MatchResult = _MatchResult | MatchResultNoMatch
  
  // When there's a ("full") match, returns a match result.
  //
  // A ("full") match is when the string matches the entire pattern.
  //
  // For example, "123" fully matches "12[0-5]|78" pattern.
  //
  trait MatchResultFullMatch
    extends StObject
       with _MatchResult {
    
    var `match`: `true`
    
    var matchedChars: js.Array[character]
  }
  object MatchResultFullMatch {
    
    inline def apply(matchedChars: js.Array[character]): MatchResultFullMatch = {
      val __obj = js.Dynamic.literal(matchedChars = matchedChars.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(true)
      __obj.asInstanceOf[MatchResultFullMatch]
    }
    
    extension [Self <: MatchResultFullMatch](x: Self) {
      
      inline def setMatch(value: `true`): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchedChars(value: js.Array[character]): Self = StObject.set(x, "matchedChars", value.asInstanceOf[js.Any])
      
      inline def setMatchedCharsVarargs(value: character*): Self = StObject.set(x, "matchedChars", js.Array(value*))
    }
  }
  
  // When there's no match, returns `undefined`.
  //
  // For example, "123" doesn't match "456|789" pattern.
  //
  type MatchResultNoMatch = Unit
  
  // An "overflow" match is when the string matches the pattern
  // and there're still some characters left in it.
  //
  // For example, "12345" matches "12[0-5]|78" pattern with an overflow
  // because "123" matches the "12[0-5]" variant of the pattern
  // and there're still "45" characters left.
  //
  // This type of match is only returned when `allowOverflow` option is `true`.
  // By default, `allowOverflow` is `false` and `undefined` ("no match" result)
  // is returned in case of an "overflow" match.
  //
  trait MatchResultOverflow
    extends StObject
       with _MatchResult {
    
    var overflow: `true`
  }
  object MatchResultOverflow {
    
    inline def apply(): MatchResultOverflow = {
      val __obj = js.Dynamic.literal(overflow = true)
      __obj.asInstanceOf[MatchResultOverflow]
    }
    
    extension [Self <: MatchResultOverflow](x: Self) {
      
      inline def setOverflow(value: `true`): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    }
  }
  
  // When there's a "partial" match, returns a "partial" match result.
  //
  // A "partial" match is when the string is not long enough
  // to match the whole matching tree.
  //
  // For example, "123" is a partial match for "12[0-5]4|78" pattern,
  // because "123" matched the "12[0-5]" part and the "4" part of the pattern
  // is left uninvolved.
  //
  trait MatchResultPartialMatch
    extends StObject
       with _MatchResult {
    
    var partialMatch: `true`
  }
  object MatchResultPartialMatch {
    
    inline def apply(): MatchResultPartialMatch = {
      val __obj = js.Dynamic.literal(partialMatch = true)
      __obj.asInstanceOf[MatchResultPartialMatch]
    }
    
    extension [Self <: MatchResultPartialMatch](x: Self) {
      
      inline def setPartialMatch(value: `true`): Self = StObject.set(x, "partialMatch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PatternMatcher extends StObject {
    
    def `match`(string: String): MatchResult = js.native
    def `match`(string: String, options: MatchOptions): MatchResult = js.native
  }
  
  trait _MatchResult extends StObject
  object _MatchResult {
    
    inline def MatchResultFullMatch(matchedChars: js.Array[character]): typings.libphonenumberJs.asYouTypeFormatterPatternMatcherMod.MatchResultFullMatch = {
      val __obj = js.Dynamic.literal(matchedChars = matchedChars.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(true)
      __obj.asInstanceOf[typings.libphonenumberJs.asYouTypeFormatterPatternMatcherMod.MatchResultFullMatch]
    }
    
    inline def MatchResultOverflow(): typings.libphonenumberJs.asYouTypeFormatterPatternMatcherMod.MatchResultOverflow = {
      val __obj = js.Dynamic.literal(overflow = true)
      __obj.asInstanceOf[typings.libphonenumberJs.asYouTypeFormatterPatternMatcherMod.MatchResultOverflow]
    }
    
    inline def MatchResultPartialMatch(): typings.libphonenumberJs.asYouTypeFormatterPatternMatcherMod.MatchResultPartialMatch = {
      val __obj = js.Dynamic.literal(partialMatch = true)
      __obj.asInstanceOf[typings.libphonenumberJs.asYouTypeFormatterPatternMatcherMod.MatchResultPartialMatch]
    }
  }
}
