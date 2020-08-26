package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An item in the list.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem extends js.Object {
  /**
    * Optional. The main text describing the item.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. The image to display.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageImage] = js.native
  /**
    * Required. Additional information about this option.
    */
  var info: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo] = js.native
  /**
    * Required. The title of the list item.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItemOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem] (val x: Self) extends AnyVal {
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
    def setImage(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setInfo(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

