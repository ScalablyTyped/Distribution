package typings.jsonwebtoken.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken", "JsonWebTokenError")
@js.native
class JsonWebTokenError protected ()
  extends Error
     with VerifyErrors {
  def this(message: String) = this()
  def this(message: String, error: Error) = this()
  var inner: Error = js.native
}

