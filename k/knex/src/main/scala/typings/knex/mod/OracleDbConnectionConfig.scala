package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OracleDbConnectionConfig extends js.Object {
  var connectString: js.UndefOr[String] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var host: String
  var instanceName: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var user: String
}

object OracleDbConnectionConfig {
  @scala.inline
  def apply(
    host: String,
    user: String,
    connectString: String = null,
    database: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    instanceName: String = null,
    password: String = null,
    requestTimeout: Int | Double = null
  ): OracleDbConnectionConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (connectString != null) __obj.updateDynamic("connectString")(connectString.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[OracleDbConnectionConfig]
  }
}

