package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMembersPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Email or immutable ID of the group. If ID, it should match with id of
    * group object
    */
  var groupKey: js.UndefOr[String] = js.native
  
  /**
    * Email or immutable ID of the user. If ID, it should match with id of
    * member object
    */
  var memberKey: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMember] = js.native
}
object ParamsResourceMembersPatch {
  
  @scala.inline
  def apply(): ParamsResourceMembersPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMembersPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceMembersPatchMutableBuilder[Self <: ParamsResourceMembersPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    @scala.inline
    def setMemberKey(value: String): Self = StObject.set(x, "memberKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberKeyUndefined: Self = StObject.set(x, "memberKey", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaMember): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
