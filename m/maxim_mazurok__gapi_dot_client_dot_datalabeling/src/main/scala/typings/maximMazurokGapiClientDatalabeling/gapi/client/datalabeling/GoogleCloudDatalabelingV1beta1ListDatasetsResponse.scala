package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ListDatasetsResponse extends js.Object {
  
  /** The list of datasets to return. */
  var datasets: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Dataset]] = js.native
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ListDatasetsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListDatasetsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ListDatasetsResponseOps[Self <: GoogleCloudDatalabelingV1beta1ListDatasetsResponse] (val x: Self) extends AnyVal {
    
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
    def setDatasetsVarargs(value: GoogleCloudDatalabelingV1beta1Dataset*): Self = this.set("datasets", js.Array(value :_*))
    
    @scala.inline
    def setDatasets(value: js.Array[GoogleCloudDatalabelingV1beta1Dataset]): Self = this.set("datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasets: Self = this.set("datasets", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
