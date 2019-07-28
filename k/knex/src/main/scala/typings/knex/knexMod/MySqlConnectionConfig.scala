package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Config object for mysql: https://github.com/mysqljs/mysql#connection-options
trait MySqlConnectionConfig extends js.Object {
  var bigNumberStrings: js.UndefOr[Boolean] = js.undefined
  var charset: js.UndefOr[String] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var dateStrings: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var decimalNumbers: js.UndefOr[Boolean] = js.undefined
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
    connectTimeout: Int | Double = null,
    database: String = null,
    dateStrings: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    decimalNumbers: js.UndefOr[Boolean] = js.undefined,
    flags: String = null,
    host: String = null,
    insecureAuth: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    multipleStatements: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: Int | Double = null,
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
    if (!js.isUndefined(bigNumberStrings)) __obj.updateDynamic("bigNumberStrings")(bigNumberStrings)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database)
    if (!js.isUndefined(dateStrings)) __obj.updateDynamic("dateStrings")(dateStrings)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(decimalNumbers)) __obj.updateDynamic("decimalNumbers")(decimalNumbers)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(insecureAuth)) __obj.updateDynamic("insecureAuth")(insecureAuth)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (!js.isUndefined(multipleStatements)) __obj.updateDynamic("multipleStatements")(multipleStatements)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (queryFormat != null) __obj.updateDynamic("queryFormat")(js.Any.fromFunction2(queryFormat))
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifyObjects)) __obj.updateDynamic("stringifyObjects")(stringifyObjects)
    if (!js.isUndefined(supportBigNumbers)) __obj.updateDynamic("supportBigNumbers")(supportBigNumbers)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    if (typeCast != null) __obj.updateDynamic("typeCast")(typeCast)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[MySqlConnectionConfig]
  }
}

