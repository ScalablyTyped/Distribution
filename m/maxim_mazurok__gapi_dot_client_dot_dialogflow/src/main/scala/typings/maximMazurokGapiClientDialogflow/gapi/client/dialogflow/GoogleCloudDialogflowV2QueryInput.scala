package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2QueryInput extends js.Object {
  
  /** Instructs the speech recognizer how to process the speech audio. */
  var audioConfig: js.UndefOr[GoogleCloudDialogflowV2InputAudioConfig] = js.native
  
  /** The event to be processed. */
  var event: js.UndefOr[GoogleCloudDialogflowV2EventInput] = js.native
  
  /** The natural language text to be processed. */
  var text: js.UndefOr[GoogleCloudDialogflowV2TextInput] = js.native
}
object GoogleCloudDialogflowV2QueryInput {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2QueryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2QueryInput]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2QueryInputOps[Self <: GoogleCloudDialogflowV2QueryInput] (val x: Self) extends AnyVal {
    
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
    def setAudioConfig(value: GoogleCloudDialogflowV2InputAudioConfig): Self = this.set("audioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioConfig: Self = this.set("audioConfig", js.undefined)
    
    @scala.inline
    def setEvent(value: GoogleCloudDialogflowV2EventInput): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setText(value: GoogleCloudDialogflowV2TextInput): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
