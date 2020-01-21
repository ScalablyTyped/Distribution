package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An item in the carousel.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem extends js.Object {
  /**
    * Optional. The body text of the card.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. The image to display.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageImage] = js.native
  /**
    * Required. Additional info about the option item.
    */
  var info: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo] = js.native
  /**
    * Required. Title of the carousel item.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem {
  @scala.inline
  def apply(
    description: String = null,
    image: SchemaGoogleCloudDialogflowV2beta1IntentMessageImage = null,
    info: SchemaGoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo = null,
    title: String = null
  ): SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem]
  }
}

