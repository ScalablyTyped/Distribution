package typings.loopback.loopbackMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loopback", "rest")
@js.native
object rest extends js.Object {
  /**
    * Expose models over REST
    * For example:
    * ```js
    * app.use(loopback.rest());
    * ```
    * For more information, see [Exposing models over a REST API](docs.strongloop.com/display/DOC/Exposing+models+over+a+REST+API).
    * @header loopback.rest(
    */
  def apply(): RequestHandler = js.native
}

