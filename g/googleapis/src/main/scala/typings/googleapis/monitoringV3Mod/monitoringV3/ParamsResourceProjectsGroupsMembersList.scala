package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGroupsMembersList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * An optional list filter describing the members to be returned. The filter
    * may reference the type, labels, and metadata of monitored resources that
    * comprise the group. For example, to return only resources representing
    * Compute Engine VM instances, use this filter: resource.type =
    * "gce_instance"
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The end of the time interval.
    */
  @JSName("interval.endTime")
  var intervalDotendTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The beginning of the time interval. The default value for the
    * start time is the end time. The start time must not be later than the end
    * time.
    */
  @JSName("interval.startTime")
  var intervalDotstartTime: js.UndefOr[String] = js.undefined
  
  /**
    * The group whose members are listed. The format is
    * "projects/{project_id_or_number}/groups/{group_id}".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A positive number that is the maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * If this field is not empty then it must contain the nextPageToken value
    * returned by a previous call to this method. Using this field causes the
    * method to return additional results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGroupsMembersList {
  
  inline def apply(): ParamsResourceProjectsGroupsMembersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGroupsMembersList]
  }
  
  extension [Self <: ParamsResourceProjectsGroupsMembersList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIntervalDotendTime(value: String): Self = StObject.set(x, "interval.endTime", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeUndefined: Self = StObject.set(x, "interval.endTime", js.undefined)
    
    inline def setIntervalDotstartTime(value: String): Self = StObject.set(x, "interval.startTime", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeUndefined: Self = StObject.set(x, "interval.startTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
