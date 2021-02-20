package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import typings.log4js.log4jsStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatternLayout extends Layout {
  
  // specifier for the output format, using placeholders as described below
  var pattern: String = js.native
  
  // user-defined tokens to be used in the pattern
  var tokens: js.UndefOr[StringDictionary[Token]] = js.native
  
  var `type`: pattern = js.native
}
object PatternLayout {
  
  @scala.inline
  def apply(pattern: String, `type`: pattern): PatternLayout = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
