package typings.log4js.log4jsMod

import org.scalablytyped.runtime.StringDictionary
import typings.log4js.log4jsStrings.pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternLayout extends Layout {
  // specifier for the output format, using placeholders as described below
  var pattern: String
  // user-defined tokens to be used in the pattern
  var tokens: js.UndefOr[StringDictionary[Token]] = js.undefined
  var `type`: pattern
}

object PatternLayout {
  @scala.inline
  def apply(pattern: String, `type`: pattern, tokens: StringDictionary[Token] = null): PatternLayout = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternLayout]
  }
}

