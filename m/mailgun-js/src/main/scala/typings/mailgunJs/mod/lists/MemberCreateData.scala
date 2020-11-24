package typings.mailgunJs.mod.lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberCreateData extends js.Object {
  
  var address: String = js.native
  
  var name: String = js.native
  
  var subscribed: Boolean = js.native
  
  var vars: js.UndefOr[js.Object] = js.native
}
object MemberCreateData {
  
  @scala.inline
  def apply(address: String, name: String, subscribed: Boolean): MemberCreateData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberCreateData]
  }
  
  @scala.inline
  implicit class MemberCreateDataOps[Self <: MemberCreateData] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribed(value: Boolean): Self = this.set("subscribed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVars(value: js.Object): Self = this.set("vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVars: Self = this.set("vars", js.undefined)
  }
}
