package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The card response message.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageCard extends js.Object {
  /**
    * Optional. The collection of card buttons.
    */
  var buttons: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageCardButton]] = js.native
  /**
    * Optional. The public URI to an image file for the card.
    */
  var imageUri: js.UndefOr[String] = js.native
  /**
    * Optional. The subtitle of the card.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * Optional. The title of the card.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageCard {
  @scala.inline
  def apply(
    buttons: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageCardButton] = null,
    imageUri: String = null,
    subtitle: String = null,
    title: String = null
  ): SchemaGoogleCloudDialogflowV2IntentMessageCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageCard]
  }
}

