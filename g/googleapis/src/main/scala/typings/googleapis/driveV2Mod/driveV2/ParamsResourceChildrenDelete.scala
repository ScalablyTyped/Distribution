package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChildrenDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the child.
    */
  var childId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the folder.
    */
  var folderId: js.UndefOr[String] = js.undefined
}
object ParamsResourceChildrenDelete {
  
  @scala.inline
  def apply(): ParamsResourceChildrenDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChildrenDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceChildrenDeleteMutableBuilder[Self <: ParamsResourceChildrenDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
    
    @scala.inline
    def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
  }
}
