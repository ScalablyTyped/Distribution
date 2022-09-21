package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of cursors to return. The service may return fewer than this value. If unset or zero, all cursors for the parent will be returned.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous `ListPartitionCursors` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListPartitionCursors` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The subscription for which to retrieve cursors. Structured like `projects/{project_number\}/locations/{location\}/subscriptions/{subscription_id\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList {
  
  inline def apply(): ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList]
  }
  
  extension [Self <: ParamsResourceCursorProjectsLocationsSubscriptionsCursorsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
