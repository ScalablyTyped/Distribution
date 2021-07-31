package typings.googleapis.dataprocV1Mod.dataprocV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRegionsJobsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Optional. If set, the returned jobs list includes only jobs that were
    * submitted to the named cluster.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A filter constraining the jobs to list. Filters are
    * case-sensitive and have the following syntax:field = value AND field =
    * value ...where field is status.state or labels.[KEY], and [KEY] is a
    * label key. value can be * to match all values. status.state can be either
    * ACTIVE or NON_ACTIVE. Only the logical AND operator is supported;
    * space-separated items are treated as having an implicit AND
    * operator.Example filter:status.state = ACTIVE AND labels.env = staging
    * AND labels.starred = *
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Specifies enumerated categories of jobs to list. (default =
    * match ALL jobs).If filter is provided, jobStateMatcher will be ignored.
    */
  var jobStateMatcher: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The number of results to return in each response.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The page token, returned by a previous call, to request the
    * next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the Google Cloud Platform project that the job
    * belongs to.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Cloud Dataproc region in which to handle the request.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsRegionsJobsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsRegionsJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsJobsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsRegionsJobsListMutableBuilder[Self <: ParamsResourceProjectsRegionsJobsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setJobStateMatcher(value: String): Self = StObject.set(x, "jobStateMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStateMatcherUndefined: Self = StObject.set(x, "jobStateMatcher", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
