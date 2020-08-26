package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Opens the given URI.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction extends js.Object {
  /**
    * Required. The HTTP or HTTPS scheme URI.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction] (val x: Self) extends AnyVal {
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

