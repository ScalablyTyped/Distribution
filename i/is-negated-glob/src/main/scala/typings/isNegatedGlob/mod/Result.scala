package typings.isNegatedGlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var negated: Boolean = js.native
  var original: String = js.native
  var pattern: String = js.native
}

object Result {
  @scala.inline
  def apply(negated: Boolean, original: String, pattern: String): Result = {
    val __obj = js.Dynamic.literal(negated = negated.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setNegated(value: Boolean): Self = this.set("negated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal(value: String): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
  }
  
}

