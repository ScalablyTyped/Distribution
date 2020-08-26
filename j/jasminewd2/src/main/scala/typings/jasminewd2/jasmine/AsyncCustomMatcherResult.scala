package typings.jasminewd2.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncCustomMatcherResult extends js.Object {
  var message: js.UndefOr[String] = js.native
  var pass: Boolean | js.Promise[Boolean] = js.native
}

object AsyncCustomMatcherResult {
  @scala.inline
  def apply(pass: Boolean | js.Promise[Boolean]): AsyncCustomMatcherResult = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncCustomMatcherResult]
  }
  @scala.inline
  implicit class AsyncCustomMatcherResultOps[Self <: AsyncCustomMatcherResult] (val x: Self) extends AnyVal {
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
    def setPass(value: Boolean | js.Promise[Boolean]): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

