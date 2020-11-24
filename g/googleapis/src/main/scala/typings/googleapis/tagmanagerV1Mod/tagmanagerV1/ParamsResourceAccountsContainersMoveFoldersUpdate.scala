package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccountsContainersMoveFoldersUpdate extends StandardParameters {
  
  /**
    * The GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  
  /**
    * The GTM Folder ID.
    */
  var folderId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFolder] = js.native
  
  /**
    * The tags to be moved to the folder.
    */
  var tagId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The triggers to be moved to the folder.
    */
  var triggerId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The variables to be moved to the folder.
    */
  var variableId: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceAccountsContainersMoveFoldersUpdate {
  
  @scala.inline
  def apply(): ParamsResourceAccountsContainersMoveFoldersUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersMoveFoldersUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsContainersMoveFoldersUpdateOps[Self <: ParamsResourceAccountsContainersMoveFoldersUpdate] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setFolderId(value: String): Self = this.set("folderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderId: Self = this.set("folderId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaFolder): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setTagIdVarargs(value: String*): Self = this.set("tagId", js.Array(value :_*))
    
    @scala.inline
    def setTagId(value: js.Array[String]): Self = this.set("tagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagId: Self = this.set("tagId", js.undefined)
    
    @scala.inline
    def setTriggerIdVarargs(value: String*): Self = this.set("triggerId", js.Array(value :_*))
    
    @scala.inline
    def setTriggerId(value: js.Array[String]): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerId: Self = this.set("triggerId", js.undefined)
    
    @scala.inline
    def setVariableIdVarargs(value: String*): Self = this.set("variableId", js.Array(value :_*))
    
    @scala.inline
    def setVariableId(value: js.Array[String]): Self = this.set("variableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableId: Self = this.set("variableId", js.undefined)
  }
}
