package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQuestsAccept
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the quest.
    */
  var questId: js.UndefOr[String] = js.undefined
}
object ParamsResourceQuestsAccept {
  
  @scala.inline
  def apply(): ParamsResourceQuestsAccept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuestsAccept]
  }
  
  @scala.inline
  implicit class ParamsResourceQuestsAcceptMutableBuilder[Self <: ParamsResourceQuestsAccept] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setQuestId(value: String): Self = StObject.set(x, "questId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestIdUndefined: Self = StObject.set(x, "questId", js.undefined)
  }
}
