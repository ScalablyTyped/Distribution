package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The suggestion chip message that allows the user to jump out to the app or
  * website associated with this agent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion extends js.Object {
  /**
    * Required. The name of the app or site this chip is linking to.
    */
  var destinationName: js.UndefOr[String] = js.native
  /**
    * Required. The URI of the app or site to open when the user taps the
    * suggestion chip.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion] (val x: Self) extends AnyVal {
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
    def setDestinationName(value: String): Self = this.set("destinationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationName: Self = this.set("destinationName", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

