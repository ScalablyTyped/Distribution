package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Config object for mysql: https://github.com/mysqljs/mysql#connection-options
trait MySqlConnectionConfig extends js.Object {
  var bigNumberStrings: js.UndefOr[scala.Boolean] = js.undefined
  var charset: js.UndefOr[java.lang.String] = js.undefined
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  var database: js.UndefOr[java.lang.String] = js.undefined
  var dateStrings: js.UndefOr[scala.Boolean] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var decimalNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var insecureAuth: js.UndefOr[scala.Boolean] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var multipleStatements: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var queryFormat: js.UndefOr[
    js.Function2[/* query */ java.lang.String, /* values */ js.Any, java.lang.String]
  ] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  var ssl: js.UndefOr[java.lang.String | MariaSslConfiguration] = js.undefined
  var stringifyObjects: js.UndefOr[scala.Boolean] = js.undefined
  var supportBigNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  var trace: js.UndefOr[scala.Boolean] = js.undefined
  var typeCast: js.UndefOr[js.Any] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object MySqlConnectionConfig {
  @scala.inline
  def apply(
    bigNumberStrings: js.UndefOr[scala.Boolean] = js.undefined,
    charset: java.lang.String = null,
    connectTimeout: scala.Int | scala.Double = null,
    database: java.lang.String = null,
    dateStrings: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    decimalNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    flags: java.lang.String = null,
    host: java.lang.String = null,
    insecureAuth: js.UndefOr[scala.Boolean] = js.undefined,
    localAddress: java.lang.String = null,
    multipleStatements: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    queryFormat: (/* query */ java.lang.String, /* values */ js.Any) => java.lang.String = null,
    socketPath: java.lang.String = null,
    ssl: java.lang.String | MariaSslConfiguration = null,
    stringifyObjects: js.UndefOr[scala.Boolean] = js.undefined,
    supportBigNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    timezone: java.lang.String = null,
    trace: js.UndefOr[scala.Boolean] = js.undefined,
    typeCast: js.Any = null,
    user: java.lang.String = null
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

