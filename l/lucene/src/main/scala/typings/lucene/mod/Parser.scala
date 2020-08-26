package typings.lucene.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  def escape(str: String): String = js.native
  def unescape(str: String): String = js.native
}

object Parser {
  @scala.inline
  def apply(escape: String => String, unescape: String => String): Parser = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape), unescape = js.Any.fromFunction1(unescape))
    __obj.asInstanceOf[Parser]
  }
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
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
    def setEscape(value: String => String): Self = this.set("escape", js.Any.fromFunction1(value))
    @scala.inline
    def setUnescape(value: String => String): Self = this.set("unescape", js.Any.fromFunction1(value))
  }
  
}

