package typings.markdownIt.parseLinkDestinationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseResult extends js.Object {
  var lines: Double = js.native
  var ok: Boolean = js.native
  var pos: Double = js.native
  var str: String = js.native
}

object ParseResult {
  @scala.inline
  def apply(lines: Double, ok: Boolean, pos: Double, str: String): ParseResult = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
  @scala.inline
  implicit class ParseResultOps[Self <: ParseResult] (val x: Self) extends AnyVal {
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
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setStr(value: String): Self = this.set("str", value.asInstanceOf[js.Any])
  }
  
}

