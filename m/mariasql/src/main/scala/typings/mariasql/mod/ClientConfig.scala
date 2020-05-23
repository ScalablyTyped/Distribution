package typings.mariasql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends js.Object {
  var charset: js.UndefOr[String] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var connTimeout: js.UndefOr[Double] = js.undefined
  var db: js.UndefOr[String] = js.undefined
  var host: String
  var keepQueries: js.UndefOr[Boolean] = js.undefined
  var local_infile: js.UndefOr[Boolean] = js.undefined
  var multiStatements: js.UndefOr[Boolean] = js.undefined
  var password: String
  var pingInterval: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var read_default_group: js.UndefOr[String] = js.undefined
  var secureAuth: js.UndefOr[Boolean] = js.undefined
  var ssl: js.UndefOr[js.Any] = js.undefined
  var unixSocket: js.UndefOr[String] = js.undefined
  var user: String
}

object ClientConfig {
  @scala.inline
  def apply(
    host: String,
    password: String,
    user: String,
    charset: String = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    connTimeout: js.UndefOr[Double] = js.undefined,
    db: String = null,
    keepQueries: js.UndefOr[Boolean] = js.undefined,
    local_infile: js.UndefOr[Boolean] = js.undefined,
    multiStatements: js.UndefOr[Boolean] = js.undefined,
    pingInterval: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    read_default_group: String = null,
    secureAuth: js.UndefOr[Boolean] = js.undefined,
    ssl: js.Any = null,
    unixSocket: String = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connTimeout)) __obj.updateDynamic("connTimeout")(connTimeout.get.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (!js.isUndefined(keepQueries)) __obj.updateDynamic("keepQueries")(keepQueries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_infile)) __obj.updateDynamic("local_infile")(local_infile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiStatements)) __obj.updateDynamic("multiStatements")(multiStatements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pingInterval)) __obj.updateDynamic("pingInterval")(pingInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (read_default_group != null) __obj.updateDynamic("read_default_group")(read_default_group.asInstanceOf[js.Any])
    if (!js.isUndefined(secureAuth)) __obj.updateDynamic("secureAuth")(secureAuth.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (unixSocket != null) __obj.updateDynamic("unixSocket")(unixSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}

