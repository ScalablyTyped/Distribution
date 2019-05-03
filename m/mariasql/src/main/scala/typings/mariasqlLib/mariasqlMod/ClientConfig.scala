package typings
package mariasqlLib.mariasqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends js.Object {
  var charset: js.UndefOr[java.lang.String] = js.undefined
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var connTimeout: js.UndefOr[scala.Double] = js.undefined
  var db: js.UndefOr[java.lang.String] = js.undefined
  var host: java.lang.String
  var keepQueries: js.UndefOr[scala.Boolean] = js.undefined
  var local_infile: js.UndefOr[scala.Boolean] = js.undefined
  var multiStatements: js.UndefOr[scala.Boolean] = js.undefined
  var password: java.lang.String
  var pingInterval: js.UndefOr[scala.Double] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var read_default_group: js.UndefOr[java.lang.String] = js.undefined
  var secureAuth: js.UndefOr[scala.Boolean] = js.undefined
  var ssl: js.UndefOr[js.Any] = js.undefined
  var unixSocket: js.UndefOr[java.lang.String] = js.undefined
  var user: java.lang.String
}

object ClientConfig {
  @scala.inline
  def apply(
    host: java.lang.String,
    password: java.lang.String,
    user: java.lang.String,
    charset: java.lang.String = null,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    connTimeout: scala.Int | scala.Double = null,
    db: java.lang.String = null,
    keepQueries: js.UndefOr[scala.Boolean] = js.undefined,
    local_infile: js.UndefOr[scala.Boolean] = js.undefined,
    multiStatements: js.UndefOr[scala.Boolean] = js.undefined,
    pingInterval: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    read_default_group: java.lang.String = null,
    secureAuth: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: js.Any = null,
    unixSocket: java.lang.String = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal(host = host, password = password, user = user)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (connTimeout != null) __obj.updateDynamic("connTimeout")(connTimeout.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db)
    if (!js.isUndefined(keepQueries)) __obj.updateDynamic("keepQueries")(keepQueries)
    if (!js.isUndefined(local_infile)) __obj.updateDynamic("local_infile")(local_infile)
    if (!js.isUndefined(multiStatements)) __obj.updateDynamic("multiStatements")(multiStatements)
    if (pingInterval != null) __obj.updateDynamic("pingInterval")(pingInterval.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (read_default_group != null) __obj.updateDynamic("read_default_group")(read_default_group)
    if (!js.isUndefined(secureAuth)) __obj.updateDynamic("secureAuth")(secureAuth)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (unixSocket != null) __obj.updateDynamic("unixSocket")(unixSocket)
    __obj.asInstanceOf[ClientConfig]
  }
}

