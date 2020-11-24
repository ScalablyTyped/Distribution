package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for roleAssignment resource in Directory API.
  */
@js.native
trait SchemaRoleAssignment extends js.Object {
  
  /**
    * The unique ID of the user this role is assigned to.
    */
  var assignedTo: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The type of the API resource. This is always
    * admin#directory#roleAssignment.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * If the role is restricted to an organization unit, this contains the ID
    * for the organization unit the exercise of this role is restricted to.
    */
  var orgUnitId: js.UndefOr[String] = js.native
  
  /**
    * ID of this roleAssignment.
    */
  var roleAssignmentId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the role that is assigned.
    */
  var roleId: js.UndefOr[String] = js.native
  
  /**
    * The scope in which this role is assigned. Possible values are:  -
    * CUSTOMER - ORG_UNIT
    */
  var scopeType: js.UndefOr[String] = js.native
}
object SchemaRoleAssignment {
  
  @scala.inline
  def apply(): SchemaRoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoleAssignment]
  }
  
  @scala.inline
  implicit class SchemaRoleAssignmentOps[Self <: SchemaRoleAssignment] (val x: Self) extends AnyVal {
    
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
    def setAssignedTo(value: String): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedTo: Self = this.set("assignedTo", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setOrgUnitId(value: String): Self = this.set("orgUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitId: Self = this.set("orgUnitId", js.undefined)
    
    @scala.inline
    def setRoleAssignmentId(value: String): Self = this.set("roleAssignmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleAssignmentId: Self = this.set("roleAssignmentId", js.undefined)
    
    @scala.inline
    def setRoleId(value: String): Self = this.set("roleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleId: Self = this.set("roleId", js.undefined)
    
    @scala.inline
    def setScopeType(value: String): Self = this.set("scopeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeType: Self = this.set("scopeType", js.undefined)
  }
}
