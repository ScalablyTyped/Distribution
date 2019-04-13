package typings
package jsenLib.jsenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsenValidateError extends js.Object {
  var keyword: java.lang.String
  var message: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
}

object JsenValidateError {
  @scala.inline
  def apply(keyword: java.lang.String, path: java.lang.String, message: java.lang.String = null): JsenValidateError = {
    val __obj = js.Dynamic.literal(keyword = keyword, path = path)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[JsenValidateError]
  }
}

