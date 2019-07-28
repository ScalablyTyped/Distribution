package typings.jju.jjuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonStyle extends js.Object {
  /** True if input has a comment token. */
  var has_comments: Boolean
  /** True if input has a newline token. */
  var has_newlines: Boolean
  /** True if input has at least one trailing comma. */
  var has_trailing_comma: Boolean
  /** True if input has a whitespace token. */
  var has_whitespace: Boolean
  /** Preferred indentation. */
  var indent: String
  /** Preferred newline. */
  var newline: String
  /** " or ' depending on which quote is preferred. */
  var quote: String
  /** True if unquoted keys were used at least once. */
  var quote_keys: Boolean
}

object JsonStyle {
  @scala.inline
  def apply(
    has_comments: Boolean,
    has_newlines: Boolean,
    has_trailing_comma: Boolean,
    has_whitespace: Boolean,
    indent: String,
    newline: String,
    quote: String,
    quote_keys: Boolean
  ): JsonStyle = {
    val __obj = js.Dynamic.literal(has_comments = has_comments, has_newlines = has_newlines, has_trailing_comma = has_trailing_comma, has_whitespace = has_whitespace, indent = indent, newline = newline, quote = quote, quote_keys = quote_keys)
  
    __obj.asInstanceOf[JsonStyle]
  }
}

