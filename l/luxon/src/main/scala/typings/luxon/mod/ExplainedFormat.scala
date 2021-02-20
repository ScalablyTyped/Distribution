package typings.luxon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.luxon.anon.Literal
import typings.std.RegExp
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplainedFormat extends StObject {
  
  var input: String = js.native
  
  var invalidReason: js.UndefOr[String] = js.native
  
  var matches: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var rawMatches: js.UndefOr[RegExpMatchArray | Null] = js.native
  
  var regex: js.UndefOr[RegExp] = js.native
  
  var result: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  
  var tokens: js.Array[Literal] = js.native
  
  var zone: js.UndefOr[Zone | Null] = js.native
}
object ExplainedFormat {
  
  @scala.inline
  def apply(input: String, tokens: js.Array[Literal]): ExplainedFormat = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainedFormat]
  }
  
  @scala.inline
  implicit class ExplainedFormatMutableBuilder[Self <: ExplainedFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidReason(value: String): Self = StObject.set(x, "invalidReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidReasonUndefined: Self = StObject.set(x, "invalidReason", js.undefined)
    
    @scala.inline
    def setMatches(value: StringDictionary[js.Any]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setRawMatches(value: RegExpMatchArray): Self = StObject.set(x, "rawMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawMatchesNull: Self = StObject.set(x, "rawMatches", null)
    
    @scala.inline
    def setRawMatchesUndefined: Self = StObject.set(x, "rawMatches", js.undefined)
    
    @scala.inline
    def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setResult(value: StringDictionary[js.Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultNull: Self = StObject.set(x, "result", null)
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setTokens(value: js.Array[Literal]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: Literal*): Self = StObject.set(x, "tokens", js.Array(value :_*))
    
    @scala.inline
    def setZone(value: Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneNull: Self = StObject.set(x, "zone", null)
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
