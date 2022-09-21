package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdminProjectsLocationsSubscriptionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent location in which to create the subscription. Structured like `projects/{project_number\}/locations/{location\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSubscription] = js.undefined
  
  /**
    * If true, the newly created subscription will only receive messages published after the subscription was created. Otherwise, the entire message backlog will be received on the subscription. Defaults to false.
    */
  var skipBacklog: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The ID to use for the subscription, which will become the final component of the subscription's name. This value is structured like: `my-sub-name`.
    */
  var subscriptionId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdminProjectsLocationsSubscriptionsCreate {
  
  inline def apply(): ParamsResourceAdminProjectsLocationsSubscriptionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdminProjectsLocationsSubscriptionsCreate]
  }
  
  extension [Self <: ParamsResourceAdminProjectsLocationsSubscriptionsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaSubscription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSkipBacklog(value: Boolean): Self = StObject.set(x, "skipBacklog", value.asInstanceOf[js.Any])
    
    inline def setSkipBacklogUndefined: Self = StObject.set(x, "skipBacklog", js.undefined)
    
    inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
  }
}
