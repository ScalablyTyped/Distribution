package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImportJobsResponse extends StObject {
  
  /** The list of ImportJobs. */
  var importJobs: js.UndefOr[js.Array[ImportJob]] = js.native
  
  /** A token to retrieve next page of results. Pass this value in ListImportJobsRequest.page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total number of ImportJobs that matched the query. */
  var totalSize: js.UndefOr[Double] = js.native
}
object ListImportJobsResponse {
  
  @scala.inline
  def apply(): ListImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportJobsResponse]
  }
  
  @scala.inline
  implicit class ListImportJobsResponseMutableBuilder[Self <: ListImportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportJobs(value: js.Array[ImportJob]): Self = StObject.set(x, "importJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportJobsUndefined: Self = StObject.set(x, "importJobs", js.undefined)
    
    @scala.inline
    def setImportJobsVarargs(value: ImportJob*): Self = StObject.set(x, "importJobs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
