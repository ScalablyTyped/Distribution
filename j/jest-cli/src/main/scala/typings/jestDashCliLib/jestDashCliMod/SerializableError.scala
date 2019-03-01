package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializableError extends js.Object {
  var code: js.UndefOr[js.Any] = js.undefined
  var message: java.lang.String
  var stack: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SerializableError {
  @scala.inline
  def apply(
    message: java.lang.String,
    code: js.Any = null,
    stack: java.lang.String = null,
    `type`: java.lang.String = null
  ): SerializableError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (code != null) __obj.updateDynamic("code")(code)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SerializableError]
  }
}

