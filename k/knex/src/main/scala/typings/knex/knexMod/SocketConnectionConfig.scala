package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConnectionConfig extends js.Object {
  var database: String
  var debug: js.UndefOr[Boolean] = js.undefined
  var password: String
  var socketPath: String
  var user: String
}

object SocketConnectionConfig {
  @scala.inline
  def apply(
    database: String,
    password: String,
    socketPath: String,
    user: String,
    debug: js.UndefOr[Boolean] = js.undefined
  ): SocketConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database, password = password, socketPath = socketPath, user = user)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[SocketConnectionConfig]
  }
}

