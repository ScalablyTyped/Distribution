package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternLayout extends Layout {
  // specifier for the output format, using placeholders as described below
  var pattern: java.lang.String
  // user-defined tokens to be used in the pattern
  var tokens: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Token]] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.pattern
}

object PatternLayout {
  @scala.inline
  def apply(
    pattern: java.lang.String,
    `type`: log4jsLib.log4jsLibStrings.pattern,
    tokens: org.scalablytyped.runtime.StringDictionary[Token] = null
  ): PatternLayout = {
    val __obj = js.Dynamic.literal(pattern = pattern)
    __obj.updateDynamic("type")(`type`)
    if (tokens != null) __obj.updateDynamic("tokens")(tokens)
    __obj.asInstanceOf[PatternLayout]
  }
}

