package typings.googleapis.licensingV1Mod.licensingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template for LicenseAssignment Insert request
  */
@js.native
trait SchemaLicenseAssignmentInsert extends js.Object {
  
  /**
    * Email id of the user
    */
  var userId: js.UndefOr[String] = js.native
}
object SchemaLicenseAssignmentInsert {
  
  @scala.inline
  def apply(): SchemaLicenseAssignmentInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseAssignmentInsert]
  }
  
  @scala.inline
  implicit class SchemaLicenseAssignmentInsertOps[Self <: SchemaLicenseAssignmentInsert] (val x: Self) extends AnyVal {
    
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
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
