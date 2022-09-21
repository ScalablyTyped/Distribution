package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaChangeHistoryChange extends StObject {
  
  /**
    * The type of action that changed this resource.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of the resource whose changes are described by this entry.
    */
  var resource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource contents from after the change was made. If this resource was deleted in this change, this field will be missing.
    */
  var resourceAfterChange: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource] = js.undefined
  
  /**
    * Resource contents from before the change was made. If this resource was created in this change, this field will be missing.
    */
  var resourceBeforeChange: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaChangeHistoryChange {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaChangeHistoryChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaChangeHistoryChange]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaChangeHistoryChange](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceAfterChange(value: SchemaGoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource): Self = StObject.set(x, "resourceAfterChange", value.asInstanceOf[js.Any])
    
    inline def setResourceAfterChangeUndefined: Self = StObject.set(x, "resourceAfterChange", js.undefined)
    
    inline def setResourceBeforeChange(value: SchemaGoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource): Self = StObject.set(x, "resourceBeforeChange", value.asInstanceOf[js.Any])
    
    inline def setResourceBeforeChangeUndefined: Self = StObject.set(x, "resourceBeforeChange", js.undefined)
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
