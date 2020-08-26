package typings.markdownIt.stateInlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenMata extends js.Object {
  var delimiters: js.Array[Delimiter] = js.native
}

object TokenMata {
  @scala.inline
  def apply(delimiters: js.Array[Delimiter]): TokenMata = {
    val __obj = js.Dynamic.literal(delimiters = delimiters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenMata]
  }
  @scala.inline
  implicit class TokenMataOps[Self <: TokenMata] (val x: Self) extends AnyVal {
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
    def setDelimitersVarargs(value: Delimiter*): Self = this.set("delimiters", js.Array(value :_*))
    @scala.inline
    def setDelimiters(value: js.Array[Delimiter]): Self = this.set("delimiters", value.asInstanceOf[js.Any])
  }
  
}

