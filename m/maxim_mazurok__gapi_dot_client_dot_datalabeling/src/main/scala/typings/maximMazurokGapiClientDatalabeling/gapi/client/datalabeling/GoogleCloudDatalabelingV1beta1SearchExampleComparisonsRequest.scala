package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest extends js.Object {
  
  /** Optional. Requested page size. Server may return fewer results than requested. Default value is 100. */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional. A token identifying a page of results for the server to return. Typically obtained by the nextPageToken of the response to a previous search rquest. If you don't specify
    * this field, the API call requests the first page of the search.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequestOps[Self <: GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest] (val x: Self) extends AnyVal {
    
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
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
}
