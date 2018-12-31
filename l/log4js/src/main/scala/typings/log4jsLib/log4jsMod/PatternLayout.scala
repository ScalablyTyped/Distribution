package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternLayout extends js.Object {
  // specifier for the output format, using placeholders as described below
  var pattern: java.lang.String
  // user-defined tokens to be used in the pattern
  var tokens: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Token]] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.pattern
}

