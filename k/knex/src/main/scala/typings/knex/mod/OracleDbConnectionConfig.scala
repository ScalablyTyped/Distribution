package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OracleDbConnectionConfig extends _StaticConnectionConfig {
  var connectString: js.UndefOr[String] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var expirationChecker: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
    expirationChecker: () => Boolean = null,
    instanceName: String = null,
    password: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined
  ): OracleDbConnectionConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (connectString != null) __obj.updateDynamic("connectString")(connectString.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OracleDbConnectionConfig]
  }
}

