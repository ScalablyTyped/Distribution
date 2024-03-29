package typings.googleapis.securitycenterV1p1beta1Mod.securitycenterV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsNotificationconfigsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The value returned by the last `ListNotificationConfigsResponse`; indicates that this is a continuation of a prior `ListNotificationConfigs` call, and that the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Name of the organization to list notification configs. Its format is "organizations/[organization_id]".
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsNotificationconfigsList {
  
  inline def apply(): ParamsResourceOrganizationsNotificationconfigsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsNotificationconfigsList]
  }
  
  extension [Self <: ParamsResourceOrganizationsNotificationconfigsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
