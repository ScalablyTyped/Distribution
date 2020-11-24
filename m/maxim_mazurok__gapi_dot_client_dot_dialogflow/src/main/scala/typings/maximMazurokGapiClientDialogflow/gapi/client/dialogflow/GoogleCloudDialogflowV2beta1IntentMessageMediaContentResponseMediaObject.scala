package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject extends js.Object {
  
  /** Required. Url where the media is stored. */
  var contentUrl: js.UndefOr[String] = js.native
  
  /** Optional. Description of media card. */
  var description: js.UndefOr[String] = js.native
  
  /** Optional. Icon to display above media content. */
  var icon: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageImage] = js.native
  
  /** Optional. Image to display above media content. */
  var largeImage: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageImage] = js.native
  
  /** Required. Name of media card. */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject] (val x: Self) extends AnyVal {
    
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
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIcon(value: GoogleCloudDialogflowV2beta1IntentMessageImage): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLargeImage(value: GoogleCloudDialogflowV2beta1IntentMessageImage): Self = this.set("largeImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeImage: Self = this.set("largeImage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
