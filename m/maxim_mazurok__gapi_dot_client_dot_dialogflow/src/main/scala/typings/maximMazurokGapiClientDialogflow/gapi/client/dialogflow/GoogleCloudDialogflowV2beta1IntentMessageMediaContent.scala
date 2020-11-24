package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageMediaContent extends js.Object {
  
  /** Required. List of media objects. */
  var mediaObjects: js.UndefOr[
    js.Array[GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject]
  ] = js.native
  
  /** Optional. What type of media is the content (ie "audio"). */
  var mediaType: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageMediaContent {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageMediaContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageMediaContent]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageMediaContentOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageMediaContent] (val x: Self) extends AnyVal {
    
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
    def setMediaObjectsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject*): Self = this.set("mediaObjects", js.Array(value :_*))
    
    @scala.inline
    def setMediaObjects(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject]): Self = this.set("mediaObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaObjects: Self = this.set("mediaObjects", js.undefined)
    
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
  }
}
