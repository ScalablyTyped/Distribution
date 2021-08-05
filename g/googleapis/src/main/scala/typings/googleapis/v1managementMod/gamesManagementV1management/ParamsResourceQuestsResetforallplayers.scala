package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQuestsResetforallplayers
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the quest.
    */
  var questId: js.UndefOr[String] = js.undefined
}
object ParamsResourceQuestsResetforallplayers {
  
  inline def apply(): ParamsResourceQuestsResetforallplayers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuestsResetforallplayers]
  }
  
  extension [Self <: ParamsResourceQuestsResetforallplayers](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setQuestId(value: String): Self = StObject.set(x, "questId", value.asInstanceOf[js.Any])
    
    inline def setQuestIdUndefined: Self = StObject.set(x, "questId", js.undefined)
  }
}
