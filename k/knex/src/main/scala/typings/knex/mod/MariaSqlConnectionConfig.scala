package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Config object for mariasql: https://github.com/mscdex/node-mariasql#client-methods
trait MariaSqlConnectionConfig extends _StaticConnectionConfig {
  var charset: js.UndefOr[String] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var connTimeout: js.UndefOr[Double] = js.undefined
  var db: js.UndefOr[String] = js.undefined
  var expirationChecker: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
    connTimeout: js.UndefOr[Double] = js.undefined,
    db: String = null,
    expirationChecker: () => Boolean = null,
    host: String = null,
    keepQueries: js.UndefOr[Boolean] = js.undefined,
    local_infile: js.UndefOr[Boolean] = js.undefined,
    multiStatements: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    pingInterval: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    protocol: String = null,
    read_default_file: String = null,
    read_default_group: String = null,
    secureAuth: js.UndefOr[Boolean] = js.undefined,
    ssl: Boolean | MariaSslConfiguration = null,
    streamHWM: js.UndefOr[Double] = js.undefined,
    unixSocket: String = null,
    user: String = null
  ): MariaSqlConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connTimeout)) __obj.updateDynamic("connTimeout")(connTimeout.get.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(keepQueries)) __obj.updateDynamic("keepQueries")(keepQueries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_infile)) __obj.updateDynamic("local_infile")(local_infile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiStatements)) __obj.updateDynamic("multiStatements")(multiStatements.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(pingInterval)) __obj.updateDynamic("pingInterval")(pingInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (read_default_file != null) __obj.updateDynamic("read_default_file")(read_default_file.asInstanceOf[js.Any])
    if (read_default_group != null) __obj.updateDynamic("read_default_group")(read_default_group.asInstanceOf[js.Any])
    if (!js.isUndefined(secureAuth)) __obj.updateDynamic("secureAuth")(secureAuth.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(streamHWM)) __obj.updateDynamic("streamHWM")(streamHWM.get.asInstanceOf[js.Any])
    if (unixSocket != null) __obj.updateDynamic("unixSocket")(unixSocket.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MariaSqlConnectionConfig]
  }
}

