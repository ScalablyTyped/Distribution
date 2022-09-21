package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternToken extends StObject {
  
  var pattern: String
  
  // TODO type this to enforce good pattern...
  var tokens: StringDictionary[js.Function0[Any]]
}
object PatternToken {
  
  inline def apply(pattern: String, tokens: StringDictionary[js.Function0[Any]]): PatternToken = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternToken]
  }
  
  extension [Self <: PatternToken](x: Self) {
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: StringDictionary[js.Function0[Any]]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
  }
}
