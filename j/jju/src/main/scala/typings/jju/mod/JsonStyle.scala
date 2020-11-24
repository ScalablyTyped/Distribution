package typings.jju.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonStyle extends js.Object {
  
  /** True if input has a comment token. */
  var has_comments: Boolean = js.native
  
  /** True if input has a newline token. */
  var has_newlines: Boolean = js.native
  
  /** True if input has at least one trailing comma. */
  var has_trailing_comma: Boolean = js.native
  
  /** True if input has a whitespace token. */
  var has_whitespace: Boolean = js.native
  
  /** Preferred indentation. */
  var indent: String = js.native
  
  /** Preferred newline. */
  var newline: String = js.native
  
  /** " or ' depending on which quote is preferred. */
  var quote: String = js.native
  
  /** True if unquoted keys were used at least once. */
  var quote_keys: Boolean = js.native
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
    val __obj = js.Dynamic.literal(has_comments = has_comments.asInstanceOf[js.Any], has_newlines = has_newlines.asInstanceOf[js.Any], has_trailing_comma = has_trailing_comma.asInstanceOf[js.Any], has_whitespace = has_whitespace.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any], quote_keys = quote_keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonStyle]
  }
  
  @scala.inline
  implicit class JsonStyleOps[Self <: JsonStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHas_comments(value: Boolean): Self = this.set("has_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_newlines(value: Boolean): Self = this.set("has_newlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_trailing_comma(value: Boolean): Self = this.set("has_trailing_comma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_whitespace(value: Boolean): Self = this.set("has_whitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuote_keys(value: Boolean): Self = this.set("quote_keys", value.asInstanceOf[js.Any])
  }
}
