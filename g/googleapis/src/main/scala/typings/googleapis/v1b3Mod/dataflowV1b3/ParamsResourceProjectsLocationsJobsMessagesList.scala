package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsJobsMessagesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Return only messages with timestamps < end_time. The default is now (i.e.
    * return up to the latest messages available).
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The job to get messages about.
    */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the job specified by job_id.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Filter to only get messages with importance >= level
    */
  var minimumImportance: js.UndefOr[String] = js.native
  
  /**
    * If specified, determines the maximum number of messages to return.  If
    * unspecified, the service may choose an appropriate default, or may return
    * an arbitrarily large number of results.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * If supplied, this should be the value of next_page_token returned by an
    * earlier call. This will cause the next page of results to be returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * A project id.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * If specified, return only messages with timestamps >= start_time. The
    * default is the job creation time (i.e. beginning of messages).
    */
  var startTime: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsJobsMessagesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsJobsMessagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsMessagesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsJobsMessagesListOps[Self <: ParamsResourceProjectsLocationsJobsMessagesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMinimumImportance(value: String): Self = this.set("minimumImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumImportance: Self = this.set("minimumImportance", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
