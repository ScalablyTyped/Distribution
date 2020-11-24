package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ListExamplesResponse extends js.Object {
  
  /** The list of examples to return. */
  var examples: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Example]] = js.native
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ListExamplesResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ListExamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListExamplesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ListExamplesResponseOps[Self <: GoogleCloudDatalabelingV1beta1ListExamplesResponse] (val x: Self) extends AnyVal {
    
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
    def setExamplesVarargs(value: GoogleCloudDatalabelingV1beta1Example*): Self = this.set("examples", js.Array(value :_*))
    
    @scala.inline
    def setExamples(value: js.Array[GoogleCloudDatalabelingV1beta1Example]): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
