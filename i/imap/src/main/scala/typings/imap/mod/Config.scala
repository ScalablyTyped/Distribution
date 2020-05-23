package typings.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /** Number of milliseconds to wait to be authenticated after a connection has been established. Default: 5000 */
  var authTimeout: js.UndefOr[Double] = js.undefined
  /** Set to 'always' to always attempt connection upgrades via STARTTLS, 'required' only if upgrading is required, or 'never' to never attempt upgrading. Default: 'never' */
  var autotls: js.UndefOr[String] = js.undefined
  /** Number of milliseconds to wait for a connection to be established. Default: 10000 */
  var connTimeout: js.UndefOr[Double] = js.undefined
    /* boolean|KeepAlive */ /** If set, the function will be called with one argument, a string containing some debug info Default: (no debug output) */
  var debug: js.UndefOr[js.Function] = js.undefined
  /** Hostname or IP address of the IMAP server. Default: "localhost" */
  var host: js.UndefOr[String] = js.undefined
  /** Configures the keepalive mechanism. Set to true to enable keepalive with defaults or set to object to enable and configure keepalive behavior: Default: true */
  var keepalive: js.UndefOr[js.Any] = js.undefined
  /** Password for plain-text authentication. */
  var password: String
  /** Port number of the IMAP server. Default: 143 */
  var port: js.UndefOr[Double] = js.undefined
  /** Perform implicit TLS connection? Default: false */
  var tls: js.UndefOr[Boolean] = js.undefined
  /** Options object to pass to tls.connect() Default: (none) */
  var tlsOptions: js.UndefOr[js.Object] = js.undefined
  /** Username for plain-text authentication. */
  var user: String
  /** Base64-encoded OAuth token for OAuth authentication for servers that support it (See Andris Reinman's xoauth.js module to help generate this string). */
  var xoauth: js.UndefOr[String] = js.undefined
  /** Base64-encoded OAuth2 token for The SASL XOAUTH2 Mechanism for servers that support it (See Andris Reinman's xoauth2 module to help generate this string). */
  var xoauth2: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    password: String,
    user: String,
    authTimeout: js.UndefOr[Double] = js.undefined,
    autotls: String = null,
    connTimeout: js.UndefOr[Double] = js.undefined,
    debug: js.Function = null,
    host: String = null,
    keepalive: js.Any = null,
    port: js.UndefOr[Double] = js.undefined,
    tls: js.UndefOr[Boolean] = js.undefined,
    tlsOptions: js.Object = null,
    xoauth: String = null,
    xoauth2: String = null
  ): Config = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(authTimeout)) __obj.updateDynamic("authTimeout")(authTimeout.get.asInstanceOf[js.Any])
    if (autotls != null) __obj.updateDynamic("autotls")(autotls.asInstanceOf[js.Any])
    if (!js.isUndefined(connTimeout)) __obj.updateDynamic("connTimeout")(connTimeout.get.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.get.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions.asInstanceOf[js.Any])
    if (xoauth != null) __obj.updateDynamic("xoauth")(xoauth.asInstanceOf[js.Any])
    if (xoauth2 != null) __obj.updateDynamic("xoauth2")(xoauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

