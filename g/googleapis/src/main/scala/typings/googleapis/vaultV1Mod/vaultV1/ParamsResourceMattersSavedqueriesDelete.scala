package typings.googleapis.vaultV1Mod.vaultV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMattersSavedqueriesDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The matter id of the parent matter for which the saved query is to be
    * deleted.
    */
  var matterId: js.UndefOr[String] = js.native
  
  /**
    * Id of the saved query to be deleted.
    */
  var savedQueryId: js.UndefOr[String] = js.native
}
object ParamsResourceMattersSavedqueriesDelete {
  
  @scala.inline
  def apply(): ParamsResourceMattersSavedqueriesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersSavedqueriesDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceMattersSavedqueriesDeleteMutableBuilder[Self <: ParamsResourceMattersSavedqueriesDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    @scala.inline
    def setSavedQueryId(value: String): Self = StObject.set(x, "savedQueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedQueryIdUndefined: Self = StObject.set(x, "savedQueryId", js.undefined)
  }
}
