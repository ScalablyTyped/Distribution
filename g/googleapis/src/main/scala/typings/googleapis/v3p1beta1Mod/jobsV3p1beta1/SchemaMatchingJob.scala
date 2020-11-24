package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Job entry with metadata inside SearchJobsResponse.
  */
@js.native
trait SchemaMatchingJob extends js.Object {
  
  /**
    * Commute information which is generated based on specified  CommuteFilter.
    */
  var commuteInfo: js.UndefOr[SchemaCommuteInfo] = js.native
  
  /**
    * Job resource that matches the specified SearchJobsRequest.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  
  /**
    * A summary of the job with core information that&#39;s displayed on the
    * search results listing page.
    */
  var jobSummary: js.UndefOr[String] = js.native
  
  /**
    * Contains snippets of text from the Job.job_title field most closely
    * matching a search query&#39;s keywords, if available. The matching query
    * keywords are enclosed in HTML bold tags.
    */
  var jobTitleSnippet: js.UndefOr[String] = js.native
  
  /**
    * Contains snippets of text from the Job.description and similar fields
    * that most closely match a search query&#39;s keywords, if available. All
    * HTML tags in the original fields are stripped when returned in this
    * field, and matching query keywords are enclosed in HTML bold tags.
    */
  var searchTextSnippet: js.UndefOr[String] = js.native
}
object SchemaMatchingJob {
  
  @scala.inline
  def apply(): SchemaMatchingJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchingJob]
  }
  
  @scala.inline
  implicit class SchemaMatchingJobOps[Self <: SchemaMatchingJob] (val x: Self) extends AnyVal {
    
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
    def setCommuteInfo(value: SchemaCommuteInfo): Self = this.set("commuteInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommuteInfo: Self = this.set("commuteInfo", js.undefined)
    
    @scala.inline
    def setJob(value: SchemaJob): Self = this.set("job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
    
    @scala.inline
    def setJobSummary(value: String): Self = this.set("jobSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobSummary: Self = this.set("jobSummary", js.undefined)
    
    @scala.inline
    def setJobTitleSnippet(value: String): Self = this.set("jobTitleSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTitleSnippet: Self = this.set("jobTitleSnippet", js.undefined)
    
    @scala.inline
    def setSearchTextSnippet(value: String): Self = this.set("searchTextSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTextSnippet: Self = this.set("searchTextSnippet", js.undefined)
  }
}
