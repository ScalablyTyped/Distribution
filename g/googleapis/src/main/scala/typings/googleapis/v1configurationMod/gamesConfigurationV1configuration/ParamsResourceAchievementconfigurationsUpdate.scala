package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAchievementconfigurationsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the achievement used by this method.
    */
  var achievementId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAchievementConfiguration] = js.undefined
}
object ParamsResourceAchievementconfigurationsUpdate {
  
  inline def apply(): ParamsResourceAchievementconfigurationsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementconfigurationsUpdate]
  }
  
  extension [Self <: ParamsResourceAchievementconfigurationsUpdate](x: Self) {
    
    inline def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    inline def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setRequestBody(value: SchemaAchievementConfiguration): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
