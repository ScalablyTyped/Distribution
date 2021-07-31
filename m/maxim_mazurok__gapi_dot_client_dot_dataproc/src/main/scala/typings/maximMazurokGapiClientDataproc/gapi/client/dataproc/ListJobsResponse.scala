package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsResponse extends StObject {
  
  /** Output only. Jobs list. */
  var jobs: js.UndefOr[js.Array[Job]] = js.undefined
  
  /**
    * Optional. This token is included in the response if there are more results to fetch. To fetch additional results, provide this value as the page_token in a subsequent
    * ListJobsRequest.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListJobsResponse {
  
  @scala.inline
  def apply(): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsResponse]
  }
  
  @scala.inline
  implicit class ListJobsResponseMutableBuilder[Self <: ListJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: js.Array[Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: Job*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
