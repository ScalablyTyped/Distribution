package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Job entry with metadata inside SearchJobsResponse.
  */
@js.native
trait SchemaMatchingJob extends StObject {
  
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
  implicit class SchemaMatchingJobMutableBuilder[Self <: SchemaMatchingJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommuteInfo(value: SchemaCommuteInfo): Self = StObject.set(x, "commuteInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommuteInfoUndefined: Self = StObject.set(x, "commuteInfo", js.undefined)
    
    @scala.inline
    def setJob(value: SchemaJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobSummary(value: String): Self = StObject.set(x, "jobSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobSummaryUndefined: Self = StObject.set(x, "jobSummary", js.undefined)
    
    @scala.inline
    def setJobTitleSnippet(value: String): Self = StObject.set(x, "jobTitleSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTitleSnippetUndefined: Self = StObject.set(x, "jobTitleSnippet", js.undefined)
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    @scala.inline
    def setSearchTextSnippet(value: String): Self = StObject.set(x, "searchTextSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextSnippetUndefined: Self = StObject.set(x, "searchTextSnippet", js.undefined)
  }
}
