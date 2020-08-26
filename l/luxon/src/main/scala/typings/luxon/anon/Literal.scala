package typings.luxon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Literal extends js.Object {
  var literal: Boolean = js.native
  var `val`: String = js.native
}

object Literal {
  @scala.inline
  def apply(literal: Boolean, `val`: String): Literal = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  implicit class LiteralOps[Self <: Literal] (val x: Self) extends AnyVal {
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
    def setLiteral(value: Boolean): Self = this.set("literal", value.asInstanceOf[js.Any])
    @scala.inline
    def setVal(value: String): Self = this.set("val", value.asInstanceOf[js.Any])
  }
  
}

