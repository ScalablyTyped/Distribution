package typings
package jjuLib.jjuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonStyle extends js.Object {
  /** True if input has a comment token. */
  var has_comments: scala.Boolean
  /** True if input has a newline token. */
  var has_newlines: scala.Boolean
  /** True if input has at least one trailing comma. */
  var has_trailing_comma: scala.Boolean
  /** True if input has a whitespace token. */
  var has_whitespace: scala.Boolean
  /** Preferred indentation. */
  var indent: java.lang.String
  /** Preferred newline. */
  var newline: java.lang.String
  /** " or ' depending on which quote is preferred. */
  var quote: java.lang.String
  /** True if unquoted keys were used at least once. */
  var quote_keys: scala.Boolean
}

