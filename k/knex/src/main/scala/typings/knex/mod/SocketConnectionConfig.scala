package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConnectionConfig extends _StaticConnectionConfig {
  var database: String
  var debug: js.UndefOr[Boolean] = js.undefined
  var expirationChecker: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
    debug: js.UndefOr[Boolean] = js.undefined,
    expirationChecker: () => Boolean = null
  ): SocketConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], socketPath = socketPath.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    __obj.asInstanceOf[SocketConnectionConfig]
  }
}

