package typings
package knexLib.knexMod.KnexNs

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

