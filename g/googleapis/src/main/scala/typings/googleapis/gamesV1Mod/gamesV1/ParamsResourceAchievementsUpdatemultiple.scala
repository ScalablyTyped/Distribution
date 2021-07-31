package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAchievementsUpdatemultiple
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Override used only by built-in games in Play Games application.
    */
  var builtinGameId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAchievementUpdateMultipleRequest] = js.undefined
}
object ParamsResourceAchievementsUpdatemultiple {
  
  @scala.inline
  def apply(): ParamsResourceAchievementsUpdatemultiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementsUpdatemultiple]
  }
  
  @scala.inline
  implicit class ParamsResourceAchievementsUpdatemultipleMutableBuilder[Self <: ParamsResourceAchievementsUpdatemultiple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBuiltinGameId(value: String): Self = StObject.set(x, "builtinGameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltinGameIdUndefined: Self = StObject.set(x, "builtinGameId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAchievementUpdateMultipleRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
