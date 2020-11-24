package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON request template for setting/revoking admin status of a user in
  * Directory API.
  */
@js.native
trait SchemaUserMakeAdmin extends js.Object {
  
  /**
    * Boolean indicating new admin status of the user
    */
  var status: js.UndefOr[Boolean] = js.native
}
object SchemaUserMakeAdmin {
  
  @scala.inline
  def apply(): SchemaUserMakeAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserMakeAdmin]
  }
  
  @scala.inline
  implicit class SchemaUserMakeAdminOps[Self <: SchemaUserMakeAdmin] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
