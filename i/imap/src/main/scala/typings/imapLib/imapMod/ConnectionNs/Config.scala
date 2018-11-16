package typings
package imapLib.imapMod.ConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Config extends js.Object {
  /** Number of milliseconds to wait to be authenticated after a connection has been established. Default: 5000 */
  var authTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Set to 'always' to always attempt connection upgrades via STARTTLS, 'required' only if upgrading is required, or 'never' to never attempt upgrading. Default: 'never' */
  var autotls: js.UndefOr[java.lang.String] = js.undefined
  /** Number of milliseconds to wait for a connection to be established. Default: 10000 */
  var connTimeout: js.UndefOr[scala.Double] = js.undefined
    /* boolean|KeepAlive *//** If set, the function will be called with one argument, a string containing some debug info Default: (no debug output) */
  var debug: js.UndefOr[js.Function] = js.undefined
  /** Hostname or IP address of the IMAP server. Default: "localhost" */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** Configures the keepalive mechanism. Set to true to enable keepalive with defaults or set to object to enable and configure keepalive behavior: Default: true */
  var keepalive: js.UndefOr[js.Any] = js.undefined
  /** Password for plain-text authentication. */
  var password: java.lang.String
  /** Port number of the IMAP server. Default: 143 */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** Perform implicit TLS connection? Default: false */
  var tls: js.UndefOr[scala.Boolean] = js.undefined
  /** Options object to pass to tls.connect() Default: (none) */
  var tlsOptions: js.UndefOr[js.Object] = js.undefined
  /** Username for plain-text authentication. */
  var user: java.lang.String
  /** Base64-encoded OAuth token for OAuth authentication for servers that support it (See Andris Reinman's xoauth.js module to help generate this string). */
  var xoauth: js.UndefOr[java.lang.String] = js.undefined
  /** Base64-encoded OAuth2 token for The SASL XOAUTH2 Mechanism for servers that support it (See Andris Reinman's xoauth2 module to help generate this string). */
  var xoauth2: js.UndefOr[java.lang.String] = js.undefined
}

