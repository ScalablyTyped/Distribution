package typings.jwtDashExpress.jwtDashExpressMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTExpressError extends Error

object JWTExpressError {
  @scala.inline
  def apply(message: String, name: String, stack: String = null): JWTExpressError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[JWTExpressError]
  }
}

