package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2ListJobsResponse extends StObject {
  
  /**
    * The resulting list of Jobs.
    */
  var jobs: js.UndefOr[js.Array[SchemaGoogleCloudRunV2Job]] = js.undefined
  
  /**
    * A token indicating there are more items than page_size. Use it in the next ListJobs request to continue.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRunV2ListJobsResponse {
  
  inline def apply(): SchemaGoogleCloudRunV2ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2ListJobsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2ListJobsResponse](x: Self) {
    
    inline def setJobs(value: js.Array[SchemaGoogleCloudRunV2Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: SchemaGoogleCloudRunV2Job*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
