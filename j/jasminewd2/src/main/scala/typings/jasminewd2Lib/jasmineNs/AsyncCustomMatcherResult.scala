package typings
package jasminewd2Lib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncCustomMatcherResult extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var pass: scala.Boolean | js.Promise[scala.Boolean]
}

object AsyncCustomMatcherResult {
  @scala.inline
  def apply(pass: scala.Boolean | js.Promise[scala.Boolean], message: java.lang.String = null): AsyncCustomMatcherResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pass")(pass.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[AsyncCustomMatcherResult]
  }
}

