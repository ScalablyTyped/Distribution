package typings
package knexLib.knexMod

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

object MariaSqlConnectionConfig {
  @scala.inline
  def apply(
    charset: java.lang.String = null,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    connTimeout: scala.Int | scala.Double = null,
    db: java.lang.String = null,
    host: java.lang.String = null,
    keepQueries: js.UndefOr[scala.Boolean] = js.undefined,
    local_infile: js.UndefOr[scala.Boolean] = js.undefined,
    multiStatements: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    pingInterval: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    read_default_file: java.lang.String = null,
    read_default_group: java.lang.String = null,
    secureAuth: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: scala.Boolean | MariaSslConfiguration = null,
    streamHWM: scala.Int | scala.Double = null,
    unixSocket: java.lang.String = null,
    user: java.lang.String = null
  ): MariaSqlConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (connTimeout != null) __obj.updateDynamic("connTimeout")(connTimeout.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(keepQueries)) __obj.updateDynamic("keepQueries")(keepQueries)
    if (!js.isUndefined(local_infile)) __obj.updateDynamic("local_infile")(local_infile)
    if (!js.isUndefined(multiStatements)) __obj.updateDynamic("multiStatements")(multiStatements)
    if (password != null) __obj.updateDynamic("password")(password)
    if (pingInterval != null) __obj.updateDynamic("pingInterval")(pingInterval.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (read_default_file != null) __obj.updateDynamic("read_default_file")(read_default_file)
    if (read_default_group != null) __obj.updateDynamic("read_default_group")(read_default_group)
    if (!js.isUndefined(secureAuth)) __obj.updateDynamic("secureAuth")(secureAuth)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (streamHWM != null) __obj.updateDynamic("streamHWM")(streamHWM.asInstanceOf[js.Any])
    if (unixSocket != null) __obj.updateDynamic("unixSocket")(unixSocket)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[MariaSqlConnectionConfig]
  }
}

