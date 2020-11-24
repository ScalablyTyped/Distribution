package typings.ltijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeepAlive extends js.Object {
  
  var keepAlive: js.UndefOr[Boolean] = js.native
  
  var keepAliveInitialDelay: js.UndefOr[Double] = js.native
  
  var pass: String = js.native
  
  var useNewUrlParser: js.UndefOr[Boolean] = js.native
  
  var user: String = js.native
}
object KeepAlive {
  
  @scala.inline
  def apply(pass: String, user: String): KeepAlive = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepAlive]
  }
  
  @scala.inline
  implicit class KeepAliveOps[Self <: KeepAlive] (val x: Self) extends AnyVal {
    
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
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setKeepAliveInitialDelay(value: Double): Self = this.set("keepAliveInitialDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAliveInitialDelay: Self = this.set("keepAliveInitialDelay", js.undefined)
    
    @scala.inline
    def setUseNewUrlParser(value: Boolean): Self = this.set("useNewUrlParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNewUrlParser: Self = this.set("useNewUrlParser", js.undefined)
  }
}
