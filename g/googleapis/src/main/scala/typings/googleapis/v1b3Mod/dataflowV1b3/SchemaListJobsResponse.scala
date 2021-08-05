package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a request to list Cloud Dataflow jobs.  This may be a partial
  * response, depending on the page size in the ListJobsRequest.
  */
trait SchemaListJobsResponse extends StObject {
  
  /**
    * Zero or more messages describing the [regional endpoints]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * failed to respond.
    */
  var failedLocation: js.UndefOr[js.Array[SchemaFailedLocation]] = js.undefined
  
  /**
    * A subset of the requested job information.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.undefined
  
  /**
    * Set if there may be more results than fit in this response.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListJobsResponse {
  
  inline def apply(): SchemaListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListJobsResponse]
  }
  
  extension [Self <: SchemaListJobsResponse](x: Self) {
    
    inline def setFailedLocation(value: js.Array[SchemaFailedLocation]): Self = StObject.set(x, "failedLocation", value.asInstanceOf[js.Any])
    
    inline def setFailedLocationUndefined: Self = StObject.set(x, "failedLocation", js.undefined)
    
    inline def setFailedLocationVarargs(value: SchemaFailedLocation*): Self = StObject.set(x, "failedLocation", js.Array(value :_*))
    
    inline def setJobs(value: js.Array[SchemaJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: SchemaJob*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
