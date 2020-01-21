package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The card for presenting a carousel of options to select from.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect extends js.Object {
  /**
    * Required. Carousel items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem]] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect {
  @scala.inline
  def apply(items: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem] = null): SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect]
  }
}

