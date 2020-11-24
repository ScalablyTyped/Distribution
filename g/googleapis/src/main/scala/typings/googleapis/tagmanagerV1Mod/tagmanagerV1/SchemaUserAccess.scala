package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a user&#39;s permissions to an account and its container.
  */
@js.native
trait SchemaUserAccess extends js.Object {
  
  /**
    * GTM Account access permissions.
    */
  var accountAccess: js.UndefOr[SchemaAccountAccess] = js.native
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * GTM Container access permissions.
    */
  var containerAccess: js.UndefOr[js.Array[SchemaContainerAccess]] = js.native
  
  /**
    * User&#39;s email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
  
  /**
    * Account Permission ID.
    */
  var permissionId: js.UndefOr[String] = js.native
}
object SchemaUserAccess {
  
  @scala.inline
  def apply(): SchemaUserAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAccess]
  }
  
  @scala.inline
  implicit class SchemaUserAccessOps[Self <: SchemaUserAccess] (val x: Self) extends AnyVal {
    
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
    def setAccountAccess(value: SchemaAccountAccess): Self = this.set("accountAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountAccess: Self = this.set("accountAccess", js.undefined)
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setContainerAccessVarargs(value: SchemaContainerAccess*): Self = this.set("containerAccess", js.Array(value :_*))
    
    @scala.inline
    def setContainerAccess(value: js.Array[SchemaContainerAccess]): Self = this.set("containerAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerAccess: Self = this.set("containerAccess", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setPermissionId(value: String): Self = this.set("permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionId: Self = this.set("permissionId", js.undefined)
  }
}
