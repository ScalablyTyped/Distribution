package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse extends js.Object {
  
  /** A list of example comparisons matching the search criteria. */
  var exampleComparisons: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1ExampleComparison]] = js.native
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponseOps[Self <: GoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse] (val x: Self) extends AnyVal {
    
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
    def setExampleComparisonsVarargs(value: GoogleCloudDatalabelingV1beta1ExampleComparison*): Self = this.set("exampleComparisons", js.Array(value :_*))
    
    @scala.inline
    def setExampleComparisons(value: js.Array[GoogleCloudDatalabelingV1beta1ExampleComparison]): Self = this.set("exampleComparisons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExampleComparisons: Self = this.set("exampleComparisons", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
