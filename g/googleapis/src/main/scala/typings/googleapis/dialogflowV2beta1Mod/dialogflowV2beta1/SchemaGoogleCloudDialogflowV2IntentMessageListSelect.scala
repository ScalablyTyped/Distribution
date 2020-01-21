package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The card for presenting a list of options to select from.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageListSelect extends js.Object {
  /**
    * Required. List items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem]] = js.native
  /**
    * Optional. The overall title of the list.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageListSelect {
  @scala.inline
  def apply(
    items: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem] = null,
    title: String = null
  ): SchemaGoogleCloudDialogflowV2IntentMessageListSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageListSelect]
  }
}

