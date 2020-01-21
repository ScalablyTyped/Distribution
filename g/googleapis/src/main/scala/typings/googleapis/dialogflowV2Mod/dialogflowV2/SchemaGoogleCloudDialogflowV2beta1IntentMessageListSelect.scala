package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The card for presenting a list of options to select from.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect extends js.Object {
  /**
    * Required. List items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem]] = js.native
  /**
    * Optional. The overall title of the list.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect {
  @scala.inline
  def apply(
    items: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem] = null,
    title: String = null
  ): SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect]
  }
}

