package typings
package jsforceLib.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/connection", "Tooling")
@js.native
class Tooling () extends BaseConnection {
  var _logger: js.Any = js.native
  // Specific to tooling
  def executeAnonymous(body: java.lang.String): js.Promise[ExecuteAnonymousResult] = js.native
  // Specific to tooling
  def executeAnonymous(
    body: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): js.Promise[ExecuteAnonymousResult] = js.native
}

