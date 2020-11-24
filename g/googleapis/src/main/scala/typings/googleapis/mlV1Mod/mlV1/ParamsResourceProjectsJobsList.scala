package typings.googleapis.mlV1Mod.mlV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsJobsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional. Specifies the subset of jobs to retrieve. You can filter on the
    * value of one or more attributes of the job object. For example, retrieve
    * jobs with a job identifier that starts with 'census': <p><code>gcloud
    * ml-engine jobs list --filter='jobId:census*'</code> <p>List all failed
    * jobs with names that start with 'rnn': <p><code>gcloud ml-engine jobs
    * list --filter='jobId:rnn* AND state:FAILED'</code> <p>For more examples,
    * see the guide to <a
    * href="/ml-engine/docs/tensorflow/monitor-training">monitoring jobs</a>.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Optional. The number of jobs to retrieve per "page" of results. If there
    * are more remaining results than this number, the response message will
    * contain a valid value in the `next_page_token` field.  The default value
    * is 20, and the maximum page size is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional. A page token to request the next page of results.  You get the
    * token from the `next_page_token` field of the response from the previous
    * call.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required. The name of the project for which to list jobs.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsJobsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsJobsListOps[Self <: ParamsResourceProjectsJobsList] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
