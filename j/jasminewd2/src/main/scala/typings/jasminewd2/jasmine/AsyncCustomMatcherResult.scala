package typings.jasminewd2.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncCustomMatcherResult extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var pass: Boolean | js.Promise[Boolean]
}

object AsyncCustomMatcherResult {
  @scala.inline
  def apply(pass: Boolean | js.Promise[Boolean], message: String = null): AsyncCustomMatcherResult = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncCustomMatcherResult]
  }
}

