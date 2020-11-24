package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The editors of a protected range.
  */
@js.native
trait SchemaEditors extends js.Object {
  
  /**
    * True if anyone in the document&#39;s domain has edit access to the
    * protected range.  Domain protection is only supported on documents within
    * a domain.
    */
  var domainUsersCanEdit: js.UndefOr[Boolean] = js.native
  
  /**
    * The email addresses of groups with edit access to the protected range.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The email addresses of users with edit access to the protected range.
    */
  var users: js.UndefOr[js.Array[String]] = js.native
}
object SchemaEditors {
  
  @scala.inline
  def apply(): SchemaEditors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditors]
  }
  
  @scala.inline
  implicit class SchemaEditorsOps[Self <: SchemaEditors] (val x: Self) extends AnyVal {
    
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
    def setDomainUsersCanEdit(value: Boolean): Self = this.set("domainUsersCanEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainUsersCanEdit: Self = this.set("domainUsersCanEdit", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: String*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[String]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
