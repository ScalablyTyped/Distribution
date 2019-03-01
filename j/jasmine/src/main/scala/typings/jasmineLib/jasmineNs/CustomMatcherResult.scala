package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMatcherResult extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var pass: scala.Boolean
}

object CustomMatcherResult {
  @scala.inline
  def apply(pass: scala.Boolean, message: java.lang.String = null): CustomMatcherResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pass")(pass)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[CustomMatcherResult]
  }
}

