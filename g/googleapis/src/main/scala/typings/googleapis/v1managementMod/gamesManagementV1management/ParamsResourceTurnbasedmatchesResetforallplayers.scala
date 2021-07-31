package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTurnbasedmatchesResetforallplayers
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
}
object ParamsResourceTurnbasedmatchesResetforallplayers {
  
  @scala.inline
  def apply(): ParamsResourceTurnbasedmatchesResetforallplayers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTurnbasedmatchesResetforallplayers]
  }
  
  @scala.inline
  implicit class ParamsResourceTurnbasedmatchesResetforallplayersMutableBuilder[Self <: ParamsResourceTurnbasedmatchesResetforallplayers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
