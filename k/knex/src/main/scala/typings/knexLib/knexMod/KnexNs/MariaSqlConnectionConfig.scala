package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Config object for mariasql: https://github.com/mscdex/node-mariasql#client-methods

trait MariaSqlConnectionConfig extends js.Object {
  var charset: js.UndefOr[java.lang.String] = js.undefined
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var connTimeout: js.UndefOr[scala.Double] = js.undefined
  var db: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var keepQueries: js.UndefOr[scala.Boolean] = js.undefined
  var local_infile: js.UndefOr[scala.Boolean] = js.undefined
  var multiStatements: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var pingInterval: js.UndefOr[scala.Double] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var read_default_file: js.UndefOr[java.lang.String] = js.undefined
  var read_default_group: js.UndefOr[java.lang.String] = js.undefined
  var secureAuth: js.UndefOr[scala.Boolean] = js.undefined
  var ssl: js.UndefOr[scala.Boolean | MariaSslConfiguration] = js.undefined
  var streamHWM: js.UndefOr[scala.Double] = js.undefined
  var unixSocket: js.UndefOr[java.lang.String] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
}

