package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The card for presenting a carousel of options to select from.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect extends js.Object {
  /**
    * Required. Carousel items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect {
  @scala.inline
  def apply(items: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem] = null): SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect]
  }
}

