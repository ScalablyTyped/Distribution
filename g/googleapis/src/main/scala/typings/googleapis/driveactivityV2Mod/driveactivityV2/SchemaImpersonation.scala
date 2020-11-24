package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an impersonation, where an admin acts on behalf of an end
  * user. Information about the acting admin is not currently available.
  */
@js.native
trait SchemaImpersonation extends js.Object {
  
  /**
    * The impersonated user.
    */
  var impersonatedUser: js.UndefOr[SchemaUser] = js.native
}
object SchemaImpersonation {
  
  @scala.inline
  def apply(): SchemaImpersonation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImpersonation]
  }
  
  @scala.inline
  implicit class SchemaImpersonationOps[Self <: SchemaImpersonation] (val x: Self) extends AnyVal {
    
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
    def setImpersonatedUser(value: SchemaUser): Self = this.set("impersonatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpersonatedUser: Self = this.set("impersonatedUser", js.undefined)
  }
}
