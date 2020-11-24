package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List user permissions response.
  */
@js.native
trait SchemaListUserPermissionsResponse extends js.Object {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * All GTM UserPermissions of a GTM Account.
    */
  var userPermission: js.UndefOr[js.Array[SchemaUserPermission]] = js.native
}
object SchemaListUserPermissionsResponse {
  
  @scala.inline
  def apply(): SchemaListUserPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUserPermissionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListUserPermissionsResponseOps[Self <: SchemaListUserPermissionsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setUserPermissionVarargs(value: SchemaUserPermission*): Self = this.set("userPermission", js.Array(value :_*))
    
    @scala.inline
    def setUserPermission(value: js.Array[SchemaUserPermission]): Self = this.set("userPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPermission: Self = this.set("userPermission", js.undefined)
  }
}
