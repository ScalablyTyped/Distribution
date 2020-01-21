package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends js.Object {
  var database: String
  var debug: js.UndefOr[Boolean] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var host: String
  var instanceName: js.UndefOr[String] = js.undefined
  var password: String
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var user: String
}

object ConnectionConfig {
  @scala.inline
  def apply(
    database: String,
    host: String,
    password: String,
    user: String,
    debug: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    instanceName: String = null,
    requestTimeout: Int | Double = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfig]
  }
}

