package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTailLogEntriesRequest extends StObject {
  
  /**
    * Optional. The amount of time to buffer log entries at the server before being returned to prevent out of order results due to late arriving log entries. Valid values are between 0-60000 milliseconds. Defaults to 2000 milliseconds.
    */
  var bufferWindow: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A filter that chooses which log entries to return. See Advanced Logs Filters (https://cloud.google.com/logging/docs/view/advanced_filters). Only log entries that match the filter are returned. An empty filter matches all log entries in the resources listed in resource_names. Referencing a parent resource that is not in resource_names will cause the filter to return no results. The maximum length of the filter is 20000 characters.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Name of a parent resource from which to retrieve log entries: projects/[PROJECT_ID] organizations/[ORGANIZATION_ID] billingAccounts/[BILLING_ACCOUNT_ID] folders/[FOLDER_ID]May alternatively be one or more views: projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID] folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]
    */
  var resourceNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaTailLogEntriesRequest {
  
  inline def apply(): SchemaTailLogEntriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTailLogEntriesRequest]
  }
  
  extension [Self <: SchemaTailLogEntriesRequest](x: Self) {
    
    inline def setBufferWindow(value: String): Self = StObject.set(x, "bufferWindow", value.asInstanceOf[js.Any])
    
    inline def setBufferWindowNull: Self = StObject.set(x, "bufferWindow", null)
    
    inline def setBufferWindowUndefined: Self = StObject.set(x, "bufferWindow", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesNull: Self = StObject.set(x, "resourceNames", null)
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value*))
  }
}
