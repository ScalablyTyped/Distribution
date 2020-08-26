package typings.jsonwebtokenPromisified.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken-promisified", "JsonWebTokenError")
@js.native
class JsonWebTokenError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, error: Error) = this()
  var inner: Error = js.native
}

