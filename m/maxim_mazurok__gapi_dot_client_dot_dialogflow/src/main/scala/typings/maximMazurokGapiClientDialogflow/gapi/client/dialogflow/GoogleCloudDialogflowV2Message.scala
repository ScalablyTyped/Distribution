package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2Message extends js.Object {
  
  /** Required. The message content. */
  var content: js.UndefOr[String] = js.native
  
  /** Output only. The time when the message was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. The message language. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US". */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Output only. The annotation for the message. */
  var messageAnnotation: js.UndefOr[GoogleCloudDialogflowV2MessageAnnotation] = js.native
  
  /** The unique identifier of the message. Format: `projects//conversations//messages/`. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The participant that sends this message. */
  var participant: js.UndefOr[String] = js.native
  
  /** Output only. The role of the participant. */
  var participantRole: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2Message {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Message]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2MessageOps[Self <: GoogleCloudDialogflowV2Message] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setMessageAnnotation(value: GoogleCloudDialogflowV2MessageAnnotation): Self = this.set("messageAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageAnnotation: Self = this.set("messageAnnotation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParticipant(value: String): Self = this.set("participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipant: Self = this.set("participant", js.undefined)
    
    @scala.inline
    def setParticipantRole(value: String): Self = this.set("participantRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipantRole: Self = this.set("participantRole", js.undefined)
  }
}
