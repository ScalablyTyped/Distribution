package typings.loopback.loopbackMod

import typings.express.expressMod.RequestHandler
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
  def apply(): RequestHandler = js.native
}

