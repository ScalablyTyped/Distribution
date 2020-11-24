package typings.jju.mod

import typings.jju.jjuStrings.comment
import typings.jju.jjuStrings.key
import typings.jju.jjuStrings.literal
import typings.jju.jjuStrings.newline
import typings.jju.jjuStrings.separator
import typings.jju.jjuStrings.whitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends js.Object {
  
  /** Raw text of this token. If you join all raws, you will get the original document. */
  var raw: String = js.native
  
  /** Path to the current token in the syntax tree. */
  var stack: js.Array[String] = js.native
  
  /** Type of the token. */
  var `type`: whitespace | comment | key | literal | separator | newline = js.native
  
  /** Value of the token if token is a key or literal. */
  var value: js.UndefOr[js.Any] = js.native
}
object Token {
  
  @scala.inline
  def apply(
    raw: String,
    stack: js.Array[String],
    `type`: whitespace | comment | key | literal | separator | newline
  ): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    
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
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackVarargs(value: String*): Self = this.set("stack", js.Array(value :_*))
    
    @scala.inline
    def setStack(value: js.Array[String]): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: whitespace | comment | key | literal | separator | newline): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
