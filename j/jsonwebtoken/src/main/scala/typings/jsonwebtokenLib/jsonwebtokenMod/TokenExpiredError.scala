package typings
package jsonwebtokenLib.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken", "TokenExpiredError")
@js.native
class TokenExpiredError protected () extends JsonWebTokenError {
  def this(message: java.lang.String, expiredAt: scala.Double) = this()
  var expiredAt: scala.Double = js.native
}

