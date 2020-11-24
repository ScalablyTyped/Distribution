package typings.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  /** Number of milliseconds to wait to be authenticated after a connection has been established. Default: 5000 */
  var authTimeout: js.UndefOr[Double] = js.native
  
  /** Set to 'always' to always attempt connection upgrades via STARTTLS, 'required' only if upgrading is required, or 'never' to never attempt upgrading. Default: 'never' */
  var autotls: js.UndefOr[String] = js.native
  
  /** Number of milliseconds to wait for a connection to be established. Default: 10000 */
  var connTimeout: js.UndefOr[Double] = js.native
  
    /* boolean|KeepAlive */ /** If set, the function will be called with one argument, a string containing some debug info Default: (no debug output) */
  var debug: js.UndefOr[js.Function] = js.native
  
  /** Hostname or IP address of the IMAP server. Default: "localhost" */
  var host: js.UndefOr[String] = js.native
  
  /** Configures the keepalive mechanism. Set to true to enable keepalive with defaults or set to object to enable and configure keepalive behavior: Default: true */
  var keepalive: js.UndefOr[js.Any] = js.native
  
  /** Password for plain-text authentication. */
  var password: String = js.native
  
  /** Port number of the IMAP server. Default: 143 */
  var port: js.UndefOr[Double] = js.native
  
  /** Perform implicit TLS connection? Default: false */
  var tls: js.UndefOr[Boolean] = js.native
  
  /** Options object to pass to tls.connect() Default: (none) */
  var tlsOptions: js.UndefOr[js.Object] = js.native
  
  /** Username for plain-text authentication. */
  var user: String = js.native
  
  /** Base64-encoded OAuth token for OAuth authentication for servers that support it (See Andris Reinman's xoauth.js module to help generate this string). */
  var xoauth: js.UndefOr[String] = js.native
  
  /** Base64-encoded OAuth2 token for The SASL XOAUTH2 Mechanism for servers that support it (See Andris Reinman's xoauth2 module to help generate this string). */
  var xoauth2: js.UndefOr[String] = js.native
}
object Config {
  
  @scala.inline
  def apply(password: String, user: String): Config = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTimeout(value: Double): Self = this.set("authTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTimeout: Self = this.set("authTimeout", js.undefined)
    
    @scala.inline
    def setAutotls(value: String): Self = this.set("autotls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutotls: Self = this.set("autotls", js.undefined)
    
    @scala.inline
    def setConnTimeout(value: Double): Self = this.set("connTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnTimeout: Self = this.set("connTimeout", js.undefined)
    
    @scala.inline
    def setDebug(value: js.Function): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setKeepalive(value: js.Any): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setTls(value: Boolean): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    
    @scala.inline
    def setTlsOptions(value: js.Object): Self = this.set("tlsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsOptions: Self = this.set("tlsOptions", js.undefined)
    
    @scala.inline
    def setXoauth(value: String): Self = this.set("xoauth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXoauth: Self = this.set("xoauth", js.undefined)
    
    @scala.inline
    def setXoauth2(value: String): Self = this.set("xoauth2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXoauth2: Self = this.set("xoauth2", js.undefined)
  }
}
