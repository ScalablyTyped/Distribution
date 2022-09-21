package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCommitCursorRequest] = js.undefined
  
  /**
    * The subscription for which to update the cursor.
    */
  var subscription: js.UndefOr[String] = js.undefined
}
object ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor {
  
  inline def apply(): ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor]
  }
  
  extension [Self <: ParamsResourceCursorProjectsLocationsSubscriptionsCommitcursor](x: Self) {
    
    inline def setRequestBody(value: SchemaCommitCursorRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
