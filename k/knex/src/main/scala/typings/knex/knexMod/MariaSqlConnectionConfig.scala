package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Config object for mariasql: https://github.com/mscdex/node-mariasql#client-methods
trait MariaSqlConnectionConfig extends js.Object {
  var charset: js.UndefOr[String] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var connTimeout: js.UndefOr[Double] = js.undefined
  var db: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var keepQueries: js.UndefOr[Boolean] = js.undefined
  var local_infile: js.UndefOr[Boolean] = js.undefined
  var multiStatements: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var pingInterval: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var read_default_file: js.UndefOr[String] = js.undefined
  var read_default_group: js.UndefOr[String] = js.undefined
  var secureAuth: js.UndefOr[Boolean] = js.undefined
  var ssl: js.UndefOr[Boolean | MariaSslConfiguration] = js.undefined
  var streamHWM: js.UndefOr[Double] = js.undefined
  var unixSocket: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object MariaSqlConnectionConfig {
  @scala.inline
  def apply(
    charset: String = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    connTimeout: Int | Double = null,
    db: String = null,
    host: String = null,
    keepQueries: js.UndefOr[Boolean] = js.undefined,
    local_infile: js.UndefOr[Boolean] = js.undefined,
    multiStatements: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    pingInterval: Int | Double = null,
    port: Int | Double = null,
    protocol: String = null,
    read_default_file: String = null,
    read_default_group: String = null,
    secureAuth: js.UndefOr[Boolean] = js.undefined,
    ssl: Boolean | MariaSslConfiguration = null,
    streamHWM: Int | Double = null,
    unixSocket: String = null,
    user: String = null
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

