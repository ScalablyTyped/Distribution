package typings.loopback.mod

import typings.loopback.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  var acls: js.Array[ACL] = js.native
  
  var http: Path = js.native
}
object Settings {
  
  @scala.inline
  def apply(acls: js.Array[ACL], http: Path): Settings = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
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
    def setAclsVarargs(value: ACL*): Self = this.set("acls", js.Array(value :_*))
    
    @scala.inline
    def setAcls(value: js.Array[ACL]): Self = this.set("acls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp(value: Path): Self = this.set("http", value.asInstanceOf[js.Any])
  }
}
