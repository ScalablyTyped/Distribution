package typings.mailgunJs.mod.validation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationOptionsPublic extends js.Object {
  
  var api_key: js.UndefOr[String] = js.native
  
  var mailbox_verification: js.UndefOr[Boolean] = js.native
}
object ValidationOptionsPublic {
  
  @scala.inline
  def apply(): ValidationOptionsPublic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptionsPublic]
  }
  
  @scala.inline
  implicit class ValidationOptionsPublicOps[Self <: ValidationOptionsPublic] (val x: Self) extends AnyVal {
    
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
    def setApi_key(value: String): Self = this.set("api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi_key: Self = this.set("api_key", js.undefined)
    
    @scala.inline
    def setMailbox_verification(value: Boolean): Self = this.set("mailbox_verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailbox_verification: Self = this.set("mailbox_verification", js.undefined)
  }
}
