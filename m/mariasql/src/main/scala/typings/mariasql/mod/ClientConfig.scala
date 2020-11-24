package typings.mariasql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConfig extends js.Object {
  
  var charset: js.UndefOr[String] = js.native
  
  var compress: js.UndefOr[Boolean] = js.native
  
  var connTimeout: js.UndefOr[Double] = js.native
  
  var db: js.UndefOr[String] = js.native
  
  var host: String = js.native
  
  var keepQueries: js.UndefOr[Boolean] = js.native
  
  var local_infile: js.UndefOr[Boolean] = js.native
  
  var multiStatements: js.UndefOr[Boolean] = js.native
  
  var password: String = js.native
  
  var pingInterval: js.UndefOr[Double] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var read_default_group: js.UndefOr[String] = js.native
  
  var secureAuth: js.UndefOr[Boolean] = js.native
  
  var ssl: js.UndefOr[js.Any] = js.native
  
  var unixSocket: js.UndefOr[String] = js.native
  
  var user: String = js.native
}
object ClientConfig {
  
  @scala.inline
  def apply(host: String, password: String, user: String): ClientConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
  
  @scala.inline
  implicit class ClientConfigOps[Self <: ClientConfig] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setConnTimeout(value: Double): Self = this.set("connTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnTimeout: Self = this.set("connTimeout", js.undefined)
    
    @scala.inline
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    
    @scala.inline
    def setKeepQueries(value: Boolean): Self = this.set("keepQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepQueries: Self = this.set("keepQueries", js.undefined)
    
    @scala.inline
    def setLocal_infile(value: Boolean): Self = this.set("local_infile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_infile: Self = this.set("local_infile", js.undefined)
    
    @scala.inline
    def setMultiStatements(value: Boolean): Self = this.set("multiStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiStatements: Self = this.set("multiStatements", js.undefined)
    
    @scala.inline
    def setPingInterval(value: Double): Self = this.set("pingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingInterval: Self = this.set("pingInterval", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRead_default_group(value: String): Self = this.set("read_default_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead_default_group: Self = this.set("read_default_group", js.undefined)
    
    @scala.inline
    def setSecureAuth(value: Boolean): Self = this.set("secureAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureAuth: Self = this.set("secureAuth", js.undefined)
    
    @scala.inline
    def setSsl(value: js.Any): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setUnixSocket(value: String): Self = this.set("unixSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnixSocket: Self = this.set("unixSocket", js.undefined)
  }
}
