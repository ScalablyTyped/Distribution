package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest extends js.Object {
  
  /** Required. The names entity types to delete. All names must point to the same agent as `parent`. */
  var entityTypeNames: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2BatchDeleteEntityTypesRequestOps[Self <: GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest] (val x: Self) extends AnyVal {
    
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
    def setEntityTypeNamesVarargs(value: String*): Self = this.set("entityTypeNames", js.Array(value :_*))
    
    @scala.inline
    def setEntityTypeNames(value: js.Array[String]): Self = this.set("entityTypeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityTypeNames: Self = this.set("entityTypeNames", js.undefined)
  }
}
