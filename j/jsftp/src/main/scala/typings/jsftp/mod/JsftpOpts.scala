package typings.jsftp.mod

import typings.jsftp.anon.Host
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsftpOpts extends js.Object {
  
  var createSocket: js.UndefOr[
    js.Function2[/* hasPortHost */ Host, /* firstAction */ js.Function0[js.Object], Socket]
  ] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var pass: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var useList: js.UndefOr[Boolean] = js.native
  
  var user: js.UndefOr[String] = js.native
}
object JsftpOpts {
  
  @scala.inline
  def apply(): JsftpOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsftpOpts]
  }
  
  @scala.inline
  implicit class JsftpOptsOps[Self <: JsftpOpts] (val x: Self) extends AnyVal {
    
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
    def setCreateSocket(value: (/* hasPortHost */ Host, /* firstAction */ js.Function0[js.Object]) => Socket): Self = this.set("createSocket", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateSocket: Self = this.set("createSocket", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setUseList(value: Boolean): Self = this.set("useList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseList: Self = this.set("useList", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
