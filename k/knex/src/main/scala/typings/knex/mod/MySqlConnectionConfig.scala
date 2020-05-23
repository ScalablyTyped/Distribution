package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Config object for mysql: https://github.com/mysqljs/mysql#connection-options
trait MySqlConnectionConfig extends _StaticConnectionConfig {
  var bigNumberStrings: js.UndefOr[Boolean] = js.undefined
  var charset: js.UndefOr[String] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var dateStrings: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var decimalNumbers: js.UndefOr[Boolean] = js.undefined
  var expirationChecker: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var insecureAuth: js.UndefOr[Boolean] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var multipleStatements: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var queryFormat: js.UndefOr[js.Function2[/* query */ String, /* values */ js.Any, String]] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
  var ssl: js.UndefOr[String | MariaSslConfiguration] = js.undefined
  var stringifyObjects: js.UndefOr[Boolean] = js.undefined
  var supportBigNumbers: js.UndefOr[Boolean] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var trace: js.UndefOr[Boolean] = js.undefined
  var typeCast: js.UndefOr[js.Any] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object MySqlConnectionConfig {
  @scala.inline
  def apply(
    bigNumberStrings: js.UndefOr[Boolean] = js.undefined,
    charset: String = null,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    database: String = null,
    dateStrings: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    decimalNumbers: js.UndefOr[Boolean] = js.undefined,
    expirationChecker: () => Boolean = null,
    flags: String = null,
    host: String = null,
    insecureAuth: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    multipleStatements: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    queryFormat: (/* query */ String, /* values */ js.Any) => String = null,
    socketPath: String = null,
    ssl: String | MariaSslConfiguration = null,
    stringifyObjects: js.UndefOr[Boolean] = js.undefined,
    supportBigNumbers: js.UndefOr[Boolean] = js.undefined,
    timezone: String = null,
    trace: js.UndefOr[Boolean] = js.undefined,
    typeCast: js.Any = null,
    user: String = null
  ): MySqlConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bigNumberStrings)) __obj.updateDynamic("bigNumberStrings")(bigNumberStrings.get.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (!js.isUndefined(dateStrings)) __obj.updateDynamic("dateStrings")(dateStrings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decimalNumbers)) __obj.updateDynamic("decimalNumbers")(decimalNumbers.get.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureAuth)) __obj.updateDynamic("insecureAuth")(insecureAuth.get.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleStatements)) __obj.updateDynamic("multipleStatements")(multipleStatements.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (queryFormat != null) __obj.updateDynamic("queryFormat")(js.Any.fromFunction2(queryFormat))
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifyObjects)) __obj.updateDynamic("stringifyObjects")(stringifyObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportBigNumbers)) __obj.updateDynamic("supportBigNumbers")(supportBigNumbers.get.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.get.asInstanceOf[js.Any])
    if (typeCast != null) __obj.updateDynamic("typeCast")(typeCast.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MySqlConnectionConfig]
  }
}

