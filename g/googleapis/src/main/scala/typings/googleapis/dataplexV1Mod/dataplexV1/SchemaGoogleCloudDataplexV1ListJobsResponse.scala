package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ListJobsResponse extends StObject {
  
  /**
    * Jobs under a given task.
    */
  var jobs: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1Job]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ListJobsResponse {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ListJobsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ListJobsResponse](x: Self) {
    
    inline def setJobs(value: js.Array[SchemaGoogleCloudDataplexV1Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: SchemaGoogleCloudDataplexV1Job*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
