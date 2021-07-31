package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ReportingService.ListJobs.
  */
trait SchemaListJobsResponse extends StObject {
  
  /**
    * The list of jobs.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.undefined
  
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListJobsRequest.page_token field in the subsequent call to `ListJobs`
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListJobsResponse {
  
  @scala.inline
  def apply(): SchemaListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListJobsResponse]
  }
  
  @scala.inline
  implicit class SchemaListJobsResponseMutableBuilder[Self <: SchemaListJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: js.Array[SchemaJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: SchemaJob*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
