package typings.googleapis.dataprocV1Mod.dataprocV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRegionsClustersList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Optional. A filter constraining the clusters to list. Filters are
    * case-sensitive and have the following syntax:field = value AND field =
    * value ...where field is one of status.state, clusterName, or
    * labels.[KEY], and [KEY] is a label key. value can be * to match all
    * values. status.state can be one of the following: ACTIVE, INACTIVE,
    * CREATING, RUNNING, ERROR, DELETING, or UPDATING. ACTIVE contains the
    * CREATING, UPDATING, and RUNNING states. INACTIVE contains the DELETING
    * and ERROR states. clusterName is the name of the cluster provided at
    * creation time. Only the logical AND operator is supported;
    * space-separated items are treated as having an implicit AND
    * operator.Example filter:status.state = ACTIVE AND clusterName = mycluster
    * AND labels.env = staging AND labels.starred = *
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The standard List page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The standard List page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the Google Cloud Platform project that the cluster
    * belongs to.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Cloud Dataproc region in which to handle the request.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsRegionsClustersList {
  
  inline def apply(): ParamsResourceProjectsRegionsClustersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsClustersList]
  }
  
  extension [Self <: ParamsResourceProjectsRegionsClustersList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
