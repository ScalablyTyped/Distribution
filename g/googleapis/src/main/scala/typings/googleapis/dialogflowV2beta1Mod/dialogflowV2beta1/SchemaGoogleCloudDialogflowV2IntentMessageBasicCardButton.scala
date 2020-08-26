package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The button object that appears at the bottom of a card.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton extends js.Object {
  /**
    * Required. Action to take when a user taps on the button.
    */
  var openUriAction: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction] = js.native
  /**
    * Required. The title of the button.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton] (val x: Self) extends AnyVal {
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
    def setOpenUriAction(value: SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction): Self = this.set("openUriAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenUriAction: Self = this.set("openUriAction", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

