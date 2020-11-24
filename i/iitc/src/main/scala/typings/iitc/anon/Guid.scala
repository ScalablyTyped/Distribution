package typings.iitc.anon

import typings.iitc.hooksMod.global.EventPortalDetailLoaded
import typings.iitc.iitcBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Guid extends EventPortalDetailLoaded {
  
  var guid: String = js.native
  
  var success: `false` = js.native
}
object Guid {
  
  @scala.inline
  def apply(guid: String, success: `false`): Guid = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guid]
  }
  
  @scala.inline
  implicit class GuidOps[Self <: Guid] (val x: Self) extends AnyVal {
    
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
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: `false`): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
