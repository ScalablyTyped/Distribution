package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsNotificationchannelsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * If true, the notification channel will be deleted regardless of its use
    * in alert policies (the policies will be updated to remove the channel).
    * If false, channels that are still referenced by an existing alerting
    * policy will fail to be deleted in a delete operation.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The channel for which to execute the request. The format is
    * projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID].
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsNotificationchannelsDelete {
  
  @scala.inline
  def apply(): ParamsResourceProjectsNotificationchannelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsNotificationchannelsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsNotificationchannelsDeleteMutableBuilder[Self <: ParamsResourceProjectsNotificationchannelsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
