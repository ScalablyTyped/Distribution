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

object JsonStyle {
  @scala.inline
  def apply(
    has_comments: scala.Boolean,
    has_newlines: scala.Boolean,
    has_trailing_comma: scala.Boolean,
    has_whitespace: scala.Boolean,
    indent: java.lang.String,
    newline: java.lang.String,
    quote: java.lang.String,
    quote_keys: scala.Boolean
  ): JsonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("has_comments")(has_comments)
    __obj.updateDynamic("has_newlines")(has_newlines)
    __obj.updateDynamic("has_trailing_comma")(has_trailing_comma)
    __obj.updateDynamic("has_whitespace")(has_whitespace)
    __obj.updateDynamic("indent")(indent)
    __obj.updateDynamic("newline")(newline)
    __obj.updateDynamic("quote")(quote)
    __obj.updateDynamic("quote_keys")(quote_keys)
    __obj.asInstanceOf[JsonStyle]
  }
}

