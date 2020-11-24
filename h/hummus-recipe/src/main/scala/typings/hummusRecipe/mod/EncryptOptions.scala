package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptOptions extends js.Object {
  
  var ownerPassword: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var userProtectionFlag: js.UndefOr[Double] = js.native
}
object EncryptOptions {
  
  @scala.inline
  def apply(): EncryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptOptions]
  }
  
  @scala.inline
  implicit class EncryptOptionsOps[Self <: EncryptOptions] (val x: Self) extends AnyVal {
    
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
    def setOwnerPassword(value: String): Self = this.set("ownerPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerPassword: Self = this.set("ownerPassword", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setUserProtectionFlag(value: Double): Self = this.set("userProtectionFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProtectionFlag: Self = this.set("userProtectionFlag", js.undefined)
  }
}
