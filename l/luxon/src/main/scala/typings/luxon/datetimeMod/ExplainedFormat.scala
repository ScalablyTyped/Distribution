package typings.luxon.datetimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.luxon.anon.Literal
import typings.luxon.zoneMod.Zone
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainedFormat extends StObject {
  
  var input: String
  
  var invalidReason: js.UndefOr[String] = js.undefined
  
  var matches: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var rawMatches: js.UndefOr[RegExpMatchArray | Null] = js.undefined
  
  var regex: js.UndefOr[js.RegExp] = js.undefined
  
  var result: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  var tokens: js.Array[Literal]
  
  var zone: js.UndefOr[Zone | Null] = js.undefined
}
object ExplainedFormat {
  
  inline def apply(input: String, tokens: js.Array[Literal]): ExplainedFormat = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainedFormat]
  }
  
  extension [Self <: ExplainedFormat](x: Self) {
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInvalidReason(value: String): Self = StObject.set(x, "invalidReason", value.asInstanceOf[js.Any])
    
    inline def setInvalidReasonUndefined: Self = StObject.set(x, "invalidReason", js.undefined)
    
    inline def setMatches(value: StringDictionary[Any]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setRawMatches(value: RegExpMatchArray): Self = StObject.set(x, "rawMatches", value.asInstanceOf[js.Any])
    
    inline def setRawMatchesNull: Self = StObject.set(x, "rawMatches", null)
    
    inline def setRawMatchesUndefined: Self = StObject.set(x, "rawMatches", js.undefined)
    
    inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setResult(value: StringDictionary[Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setTokens(value: js.Array[Literal]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: Literal*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setZone(value: Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
