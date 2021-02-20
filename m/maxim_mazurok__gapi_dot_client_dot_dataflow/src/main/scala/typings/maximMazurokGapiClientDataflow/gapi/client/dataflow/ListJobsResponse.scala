package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsResponse extends StObject {
  
  /** Zero or more messages describing the [regional endpoints] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that failed to respond. */
  var failedLocation: js.UndefOr[js.Array[FailedLocation]] = js.native
  
  /** A subset of the requested job information. */
  var jobs: js.UndefOr[js.Array[Job]] = js.native
  
  /** Set if there may be more results than fit in this response. */
  var nextPageToken: js.UndefOr[String] = js.native
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
    def setFailedLocation(value: js.Array[FailedLocation]): Self = StObject.set(x, "failedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedLocationUndefined: Self = StObject.set(x, "failedLocation", js.undefined)
    
    @scala.inline
    def setFailedLocationVarargs(value: FailedLocation*): Self = StObject.set(x, "failedLocation", js.Array(value :_*))
    
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
