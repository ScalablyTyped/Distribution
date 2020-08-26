package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMatcherResult extends js.Object {
  var message: js.UndefOr[String] = js.native
  var pass: Boolean = js.native
}

object CustomMatcherResult {
  @scala.inline
  def apply(pass: Boolean): CustomMatcherResult = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMatcherResult]
  }
  @scala.inline
  implicit class CustomMatcherResultOps[Self <: CustomMatcherResult] (val x: Self) extends AnyVal {
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
    def setPass(value: Boolean): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

