package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON request template to undelete a user in Directory API.
  */
@js.native
trait SchemaUserUndelete extends js.Object {
  
  /**
    * OrgUnit of User
    */
  var orgUnitPath: js.UndefOr[String] = js.native
}
object SchemaUserUndelete {
  
  @scala.inline
  def apply(): SchemaUserUndelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserUndelete]
  }
  
  @scala.inline
  implicit class SchemaUserUndeleteOps[Self <: SchemaUserUndelete] (val x: Self) extends AnyVal {
    
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
    def setOrgUnitPath(value: String): Self = this.set("orgUnitPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitPath: Self = this.set("orgUnitPath", js.undefined)
  }
}
