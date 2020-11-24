package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2ListEnvironmentsResponse extends js.Object {
  
  /** The list of agent environments. There will be a maximum number of items returned based on the page_size field in the request. */
  var environments: js.UndefOr[js.Array[GoogleCloudDialogflowV2Environment]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2ListEnvironmentsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ListEnvironmentsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ListEnvironmentsResponseOps[Self <: GoogleCloudDialogflowV2ListEnvironmentsResponse] (val x: Self) extends AnyVal {
    
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
    def setEnvironmentsVarargs(value: GoogleCloudDialogflowV2Environment*): Self = this.set("environments", js.Array(value :_*))
    
    @scala.inline
    def setEnvironments(value: js.Array[GoogleCloudDialogflowV2Environment]): Self = this.set("environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironments: Self = this.set("environments", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
