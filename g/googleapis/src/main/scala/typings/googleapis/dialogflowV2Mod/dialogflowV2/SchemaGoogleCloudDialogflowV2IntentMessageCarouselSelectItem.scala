package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An item in the carousel.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem extends js.Object {
  /**
    * Optional. The body text of the card.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. The image to display.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageImage] = js.native
  /**
    * Required. Additional info about the option item.
    */
  var info: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageSelectItemInfo] = js.native
  /**
    * Required. Title of the carousel item.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItemOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setImage(value: SchemaGoogleCloudDialogflowV2IntentMessageImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setInfo(value: SchemaGoogleCloudDialogflowV2IntentMessageSelectItemInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

