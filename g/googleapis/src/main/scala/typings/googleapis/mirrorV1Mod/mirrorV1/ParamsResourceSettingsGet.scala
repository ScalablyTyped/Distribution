package typings.googleapis.mirrorV1Mod.mirrorV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSettingsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the setting. The following IDs are valid:  - locale - The key
    * to the user’s language/locale (BCP 47 identifier) that Glassware should
    * use to render localized content.  - timezone - The key to the user’s
    * current time zone region as defined in the tz database. Example:
    * America/Los_Angeles.
    */
  var id: js.UndefOr[String] = js.undefined
}
object ParamsResourceSettingsGet {
  
  @scala.inline
  def apply(): ParamsResourceSettingsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSettingsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceSettingsGetMutableBuilder[Self <: ParamsResourceSettingsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
