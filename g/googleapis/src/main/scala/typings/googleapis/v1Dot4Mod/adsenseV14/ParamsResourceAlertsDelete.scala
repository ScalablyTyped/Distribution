package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAlertsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Alert to delete.
    */
  var alertId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
}
object ParamsResourceAlertsDelete {
  
  @scala.inline
  def apply(): ParamsResourceAlertsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAlertsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceAlertsDeleteMutableBuilder[Self <: ParamsResourceAlertsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertId(value: String): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
