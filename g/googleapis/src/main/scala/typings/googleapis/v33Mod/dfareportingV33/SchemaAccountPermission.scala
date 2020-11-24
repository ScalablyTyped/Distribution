package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AccountPermissions contains information about a particular account
  * permission. Some features of Campaign Manager require an account permission
  * to be present in the account.
  */
@js.native
trait SchemaAccountPermission extends js.Object {
  
  /**
    * Account profiles associated with this account permission.  Possible
    * values are: - &quot;ACCOUNT_PROFILE_BASIC&quot; -
    * &quot;ACCOUNT_PROFILE_STANDARD&quot;
    */
  var accountProfiles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * ID of this account permission.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermission&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Administrative level required to enable this account permission.
    */
  var level: js.UndefOr[String] = js.native
  
  /**
    * Name of this account permission.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Permission group of this account permission.
    */
  var permissionGroupId: js.UndefOr[String] = js.native
}
object SchemaAccountPermission {
  
  @scala.inline
  def apply(): SchemaAccountPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountPermission]
  }
  
  @scala.inline
  implicit class SchemaAccountPermissionOps[Self <: SchemaAccountPermission] (val x: Self) extends AnyVal {
    
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
    def setAccountProfilesVarargs(value: String*): Self = this.set("accountProfiles", js.Array(value :_*))
    
    @scala.inline
    def setAccountProfiles(value: js.Array[String]): Self = this.set("accountProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountProfiles: Self = this.set("accountProfiles", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPermissionGroupId(value: String): Self = this.set("permissionGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionGroupId: Self = this.set("permissionGroupId", js.undefined)
  }
}
