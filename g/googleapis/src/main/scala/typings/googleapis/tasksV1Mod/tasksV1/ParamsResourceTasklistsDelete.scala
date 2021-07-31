package typings.googleapis.tasksV1Mod.tasksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTasklistsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.undefined
}
object ParamsResourceTasklistsDelete {
  
  @scala.inline
  def apply(): ParamsResourceTasklistsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasklistsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceTasklistsDeleteMutableBuilder[Self <: ParamsResourceTasklistsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setTasklist(value: String): Self = StObject.set(x, "tasklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasklistUndefined: Self = StObject.set(x, "tasklist", js.undefined)
  }
}
