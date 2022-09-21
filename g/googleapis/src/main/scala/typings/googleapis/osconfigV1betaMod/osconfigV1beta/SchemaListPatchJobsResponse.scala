package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPatchJobsResponse extends StObject {
  
  /**
    * A pagination token that can be used to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of patch jobs.
    */
  var patchJobs: js.UndefOr[js.Array[SchemaPatchJob]] = js.undefined
}
object SchemaListPatchJobsResponse {
  
  inline def apply(): SchemaListPatchJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPatchJobsResponse]
  }
  
  extension [Self <: SchemaListPatchJobsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPatchJobs(value: js.Array[SchemaPatchJob]): Self = StObject.set(x, "patchJobs", value.asInstanceOf[js.Any])
    
    inline def setPatchJobsUndefined: Self = StObject.set(x, "patchJobs", js.undefined)
    
    inline def setPatchJobsVarargs(value: SchemaPatchJob*): Self = StObject.set(x, "patchJobs", js.Array(value*))
  }
}
