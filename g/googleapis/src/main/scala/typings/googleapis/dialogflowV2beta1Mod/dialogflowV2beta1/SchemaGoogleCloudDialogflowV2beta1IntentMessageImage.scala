package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The image response message.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageImage extends js.Object {
  /**
    * A text description of the image to be used for accessibility, e.g.,
    * screen readers. Required if image_uri is set for CarouselSelect.
    */
  var accessibilityText: js.UndefOr[String] = js.native
  /**
    * Optional. The public URI to an image file.
    */
  var imageUri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageImage {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageImage]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageImageOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageImage] (val x: Self) extends AnyVal {
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

