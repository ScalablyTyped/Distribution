package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConnectionConfig extends js.Object {
  var database: java.lang.String
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var password: java.lang.String
  var socketPath: java.lang.String
  var user: java.lang.String
}

object SocketConnectionConfig {
  @scala.inline
  def apply(
    database: java.lang.String,
    password: java.lang.String,
    socketPath: java.lang.String,
    user: java.lang.String,
    debug: js.UndefOr[scala.Boolean] = js.undefined
  ): SocketConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database, password = password, socketPath = socketPath, user = user)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[SocketConnectionConfig]
  }
}

