package typings.humanparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullerNameOutput extends js.Object {
  var fullName: String = js.native
}

object FullerNameOutput {
  @scala.inline
  def apply(fullName: String): FullerNameOutput = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullerNameOutput]
  }
  @scala.inline
  implicit class FullerNameOutputOps[Self <: FullerNameOutput] (val x: Self) extends AnyVal {
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
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
  }
  
}

