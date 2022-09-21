package typings.googleapis.essentialcontactsV1Mod.essentialcontactsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersContactsCompute
  extends StObject
     with StandardParameters {
  
  /**
    * The categories of notifications to compute contacts for. If ALL is included in this list, contacts subscribed to any notification category will be returned.
    */
  var notificationCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of `next_page_token` in the response indicates that more results might be available. If not specified, the default page_size is 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. If present, retrieves the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response. The values of other method parameters should be identical to those in the previous call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the resource to compute contacts for. Format: organizations/{organization_id\}, folders/{folder_id\} or projects/{project_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersContactsCompute {
  
  inline def apply(): ParamsResourceFoldersContactsCompute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersContactsCompute]
  }
  
  extension [Self <: ParamsResourceFoldersContactsCompute](x: Self) {
    
    inline def setNotificationCategories(value: js.Array[String]): Self = StObject.set(x, "notificationCategories", value.asInstanceOf[js.Any])
    
    inline def setNotificationCategoriesUndefined: Self = StObject.set(x, "notificationCategories", js.undefined)
    
    inline def setNotificationCategoriesVarargs(value: String*): Self = StObject.set(x, "notificationCategories", js.Array(value*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
