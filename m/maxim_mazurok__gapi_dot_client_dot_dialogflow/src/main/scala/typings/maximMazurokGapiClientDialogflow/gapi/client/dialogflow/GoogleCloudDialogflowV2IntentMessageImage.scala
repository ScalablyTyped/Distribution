package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageImage extends js.Object {
  
  /** Optional. A text description of the image to be used for accessibility, e.g., screen readers. */
  var accessibilityText: js.UndefOr[String] = js.native
  
  /** Optional. The public URI to an image file. */
  var imageUri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageImage {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageImage]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageImageOps[Self <: GoogleCloudDialogflowV2IntentMessageImage] (val x: Self) extends AnyVal {
    
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
    def setAccessibilityText(value: String): Self = this.set("accessibilityText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityText: Self = this.set("accessibilityText", js.undefined)
    
    @scala.inline
    def setImageUri(value: String): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUri: Self = this.set("imageUri", js.undefined)
  }
}
