package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import typings.log4js.log4jsStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternLayout
  extends StObject
     with Layout {
  
  // specifier for the output format, using placeholders as described below
  var pattern: String
  
  // user-defined tokens to be used in the pattern
  var tokens: js.UndefOr[StringDictionary[Token]] = js.undefined
  
  var `type`: pattern
}
object PatternLayout {
  
  @scala.inline
  def apply(pattern: String): PatternLayout = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[PatternLayout]
  }
  
  @scala.inline
  implicit class PatternLayoutMutableBuilder[Self <: PatternLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: StringDictionary[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    @scala.inline
    def setType(value: pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
