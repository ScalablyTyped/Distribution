package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceQuestsReset extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the quest.
    */
  var questId: js.UndefOr[String] = js.native
}
object ParamsResourceQuestsReset {
  
  @scala.inline
  def apply(): ParamsResourceQuestsReset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuestsReset]
  }
  
  @scala.inline
  implicit class ParamsResourceQuestsResetMutableBuilder[Self <: ParamsResourceQuestsReset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setQuestId(value: String): Self = StObject.set(x, "questId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestIdUndefined: Self = StObject.set(x, "questId", js.undefined)
  }
}
