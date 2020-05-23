package typings.httpTerminator.mod

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpTerminatorConfig extends js.Object {
  /**
    * Number of milliseconds to allow for the active sockets to complete
    * serving the response (default: 5000).
    */
  var gracefulTerminationTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Intsance of http.Server or https.Server.
    */
  var server: Server | typings.node.httpsMod.Server
}

object HttpTerminatorConfig {
  @scala.inline
  def apply(
    server: Server | typings.node.httpsMod.Server,
    gracefulTerminationTimeout: js.UndefOr[Double] = js.undefined
  ): HttpTerminatorConfig = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    if (!js.isUndefined(gracefulTerminationTimeout)) __obj.updateDynamic("gracefulTerminationTimeout")(gracefulTerminationTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpTerminatorConfig]
  }
}

