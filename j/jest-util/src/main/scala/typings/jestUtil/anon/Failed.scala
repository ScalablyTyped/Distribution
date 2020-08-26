package typings.jestUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failed extends js.Object {
  var failed: String = js.native
  var pending: String = js.native
  var success: String = js.native
  var todo: String = js.native
}

object Failed {
  @scala.inline
  def apply(failed: String, pending: String, success: String, todo: String): Failed = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], todo = todo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failed]
  }
  @scala.inline
  implicit class FailedOps[Self <: Failed] (val x: Self) extends AnyVal {
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
    def setFailed(value: String): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: String): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: String): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setTodo(value: String): Self = this.set("todo", value.asInstanceOf[js.Any])
  }
  
}

