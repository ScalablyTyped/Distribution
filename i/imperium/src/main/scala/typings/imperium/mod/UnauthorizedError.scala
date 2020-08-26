package typings.imperium.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "UnauthorizedError")
@js.native
class UnauthorizedError protected () extends Error {
  def this(message: String, status: Double, context: js.Any) = this()
}

