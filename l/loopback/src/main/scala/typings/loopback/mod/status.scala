package typings.loopback.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loopback", "status")
@js.native
object status extends js.Object {
  /**
    * Return HTTP response with basic application status information:
    * date the application was started and uptime, in JSON format. For example:
    * ```
    * {
    *    "started": "2014-06-05T00:26:49.750Z",
    *    "uptime": 9.394
    * }
    * ```
    */
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

