package typings.jsforce.connectionMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/connection", "Tooling")
@js.native
class Tooling () extends BaseConnection {
  var _logger: js.Any = js.native
  // Specific to tooling
  def executeAnonymous(body: String): js.Promise[ExecuteAnonymousResult] = js.native
  def executeAnonymous(body: String, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): js.Promise[ExecuteAnonymousResult] = js.native
}

