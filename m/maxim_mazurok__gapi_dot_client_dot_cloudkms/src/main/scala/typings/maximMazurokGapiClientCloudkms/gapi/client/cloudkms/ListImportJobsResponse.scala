package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportJobsResponse extends StObject {
  
  /** The list of ImportJobs. */
  var importJobs: js.UndefOr[js.Array[ImportJob]] = js.undefined
  
  /** A token to retrieve next page of results. Pass this value in ListImportJobsRequest.page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The total number of ImportJobs that matched the query. */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object ListImportJobsResponse {
  
  inline def apply(): ListImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportJobsResponse]
  }
  
  extension [Self <: ListImportJobsResponse](x: Self) {
    
    inline def setImportJobs(value: js.Array[ImportJob]): Self = StObject.set(x, "importJobs", value.asInstanceOf[js.Any])
    
    inline def setImportJobsUndefined: Self = StObject.set(x, "importJobs", js.undefined)
    
    inline def setImportJobsVarargs(value: ImportJob*): Self = StObject.set(x, "importJobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
