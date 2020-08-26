package typings.luaparse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  var line: Double = js.native
  var lineStart: Double = js.native
  var range: js.Tuple2[Double, Double] = js.native
  var `type`: Double = js.native
  var value: String = js.native
}

object Token {
  @scala.inline
  def apply(line: Double, lineStart: Double, range: js.Tuple2[Double, Double], `type`: Double, value: String): Token = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineStart(value: Double): Self = this.set("lineStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: js.Tuple2[Double, Double]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

