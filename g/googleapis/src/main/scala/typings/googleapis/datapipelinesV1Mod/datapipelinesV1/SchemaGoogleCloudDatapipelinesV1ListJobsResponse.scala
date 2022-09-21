package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1ListJobsResponse extends StObject {
  
  /**
    * Results that were accessible to the caller. Results are always in descending order of job creation date.
    */
  var jobs: js.UndefOr[js.Array[SchemaGoogleCloudDatapipelinesV1Job]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1ListJobsResponse {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1ListJobsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1ListJobsResponse](x: Self) {
    
    inline def setJobs(value: js.Array[SchemaGoogleCloudDatapipelinesV1Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: SchemaGoogleCloudDatapipelinesV1Job*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
