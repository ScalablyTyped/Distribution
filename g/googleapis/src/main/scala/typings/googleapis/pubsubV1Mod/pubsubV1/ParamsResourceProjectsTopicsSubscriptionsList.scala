package typings.googleapis.pubsubV1Mod.pubsubV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTopicsSubscriptionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Maximum number of subscription names to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The value returned by the last `ListTopicSubscriptionsResponse`;
    * indicates that this is a continuation of a prior `ListTopicSubscriptions`
    * call, and that the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the topic that subscriptions are attached to. Format is
    * `projects/{project}/topics/{topic}`.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTopicsSubscriptionsList {
  
  inline def apply(): ParamsResourceProjectsTopicsSubscriptionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTopicsSubscriptionsList]
  }
  
  extension [Self <: ParamsResourceProjectsTopicsSubscriptionsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
