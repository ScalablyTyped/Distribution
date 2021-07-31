package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMembersHasmember
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Identifies the group in the API request. The value can be the group's
    * email address, group alias, or the unique group ID.
    */
  var groupKey: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the user member in the API request. The value can be the
    * user's primary email address, alias, or unique ID.
    */
  var memberKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceMembersHasmember {
  
  @scala.inline
  def apply(): ParamsResourceMembersHasmember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMembersHasmember]
  }
  
  @scala.inline
  implicit class ParamsResourceMembersHasmemberMutableBuilder[Self <: ParamsResourceMembersHasmember] (val x: Self) extends AnyVal {
    
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
  }
}
