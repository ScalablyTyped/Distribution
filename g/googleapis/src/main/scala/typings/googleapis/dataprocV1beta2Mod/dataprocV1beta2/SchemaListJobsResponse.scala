package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListJobsResponse extends StObject {
  
  /**
    * Output only. Jobs list.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.undefined
  
  /**
    * Optional. This token is included in the response if there are more results to fetch. To fetch additional results, provide this value as the page_token in a subsequent ListJobsRequest.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListJobsResponse {
  
  inline def apply(): SchemaListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListJobsResponse]
  }
  
  extension [Self <: SchemaListJobsResponse](x: Self) {
    
    inline def setJobs(value: js.Array[SchemaJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: SchemaJob*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
