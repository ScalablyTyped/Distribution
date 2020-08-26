package typings.kiiCloudSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `37` extends js.Object {
  def failure(errString: String): js.Any = js.native
  def success(): js.Any = js.native
}

object `37` {
  @scala.inline
  def apply(failure: String => js.Any, success: () => js.Any): `37` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
    __obj.asInstanceOf[`37`]
  }
  @scala.inline
  implicit class `37Ops`[Self <: `37`] (val x: Self) extends AnyVal {
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
    def setFailure(value: String => js.Any): Self = this.set("failure", js.Any.fromFunction1(value))
    @scala.inline
    def setSuccess(value: () => js.Any): Self = this.set("success", js.Any.fromFunction0(value))
  }
  
}

