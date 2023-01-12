package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsResponse extends StObject {
  
  /** Zero or more messages describing the [regional endpoints] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that failed to respond. */
  var failedLocation: js.UndefOr[js.Array[FailedLocation]] = js.undefined
  
  /** A subset of the requested job information. */
  var jobs: js.UndefOr[js.Array[Job]] = js.undefined
  
  /** Set if there may be more results than fit in this response. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListJobsResponse {
  
  inline def apply(): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedLocation(value: js.Array[FailedLocation]): Self = StObject.set(x, "failedLocation", value.asInstanceOf[js.Any])
    
    inline def setFailedLocationUndefined: Self = StObject.set(x, "failedLocation", js.undefined)
    
    inline def setFailedLocationVarargs(value: FailedLocation*): Self = StObject.set(x, "failedLocation", js.Array(value*))
    
    inline def setJobs(value: js.Array[Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
