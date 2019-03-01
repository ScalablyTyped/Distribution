package typings
package jwtDashExpressLib.jwtDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTExpressError
  extends nodeLib.Error {
  var message: java.lang.String
  var name: java.lang.String
}

object JWTExpressError {
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String, stack: java.lang.String = null): JWTExpressError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[JWTExpressError]
  }
}

