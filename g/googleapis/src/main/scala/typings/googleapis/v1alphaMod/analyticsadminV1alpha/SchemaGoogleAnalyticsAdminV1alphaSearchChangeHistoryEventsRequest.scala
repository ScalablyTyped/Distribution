package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsRequest extends StObject {
  
  /**
    * Optional. If set, only return changes that match one or more of these types of actions.
    */
  var action: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. If set, only return changes if they are made by a user in this list.
    */
  var actorEmail: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. If set, only return changes made after this time (inclusive).
    */
  var earliestChangeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If set, only return changes made before this time (inclusive).
    */
  var latestChangeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The maximum number of ChangeHistoryEvent items to return. The service may return fewer than this value, even if there are additional pages. If unspecified, at most 50 items will be returned. The maximum value is 200 (higher values will be coerced to the maximum).
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. A page token, received from a previous `SearchChangeHistoryEvents` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `SearchChangeHistoryEvents` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Resource name for a child property. If set, only return changes made to this property or its child resources.
    */
  var property: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If set, only return changes if they are for a resource that matches at least one of these types.
    */
  var resourceType: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsRequest {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsRequest]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsRequest](x: Self) {
    
    inline def setAction(value: js.Array[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setActorEmail(value: js.Array[String]): Self = StObject.set(x, "actorEmail", value.asInstanceOf[js.Any])
    
    inline def setActorEmailNull: Self = StObject.set(x, "actorEmail", null)
    
    inline def setActorEmailUndefined: Self = StObject.set(x, "actorEmail", js.undefined)
    
    inline def setActorEmailVarargs(value: String*): Self = StObject.set(x, "actorEmail", js.Array(value*))
    
    inline def setEarliestChangeTime(value: String): Self = StObject.set(x, "earliestChangeTime", value.asInstanceOf[js.Any])
    
    inline def setEarliestChangeTimeNull: Self = StObject.set(x, "earliestChangeTime", null)
    
    inline def setEarliestChangeTimeUndefined: Self = StObject.set(x, "earliestChangeTime", js.undefined)
    
    inline def setLatestChangeTime(value: String): Self = StObject.set(x, "latestChangeTime", value.asInstanceOf[js.Any])
    
    inline def setLatestChangeTimeNull: Self = StObject.set(x, "latestChangeTime", null)
    
    inline def setLatestChangeTimeUndefined: Self = StObject.set(x, "latestChangeTime", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyNull: Self = StObject.set(x, "property", null)
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setResourceType(value: js.Array[String]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourceTypeVarargs(value: String*): Self = StObject.set(x, "resourceType", js.Array(value*))
  }
}
