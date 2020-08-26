package typings.ky.mod

import typings.std.Error
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ky", "HTTPError")
@js.native
class HTTPError protected () extends Error {
  def this(response: Response) = this()
  var response: Response = js.native
}

