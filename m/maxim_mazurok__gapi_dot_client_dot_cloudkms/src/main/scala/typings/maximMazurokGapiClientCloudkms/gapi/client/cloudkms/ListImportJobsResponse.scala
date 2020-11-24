package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImportJobsResponse extends js.Object {
  
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
  implicit class ListImportJobsResponseOps[Self <: ListImportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImportJobsVarargs(value: ImportJob*): Self = this.set("importJobs", js.Array(value :_*))
    
    @scala.inline
    def setImportJobs(value: js.Array[ImportJob]): Self = this.set("importJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportJobs: Self = this.set("importJobs", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
}
