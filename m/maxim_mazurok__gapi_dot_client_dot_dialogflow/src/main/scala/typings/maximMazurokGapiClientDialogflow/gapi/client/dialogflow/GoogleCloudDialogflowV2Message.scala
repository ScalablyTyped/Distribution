package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2Message extends StObject {
  
  /** Required. The message content. */
  var content: js.UndefOr[String] = js.undefined
  
  /** Output only. The time when the message was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. The message language. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US". */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Output only. The annotation for the message. */
  var messageAnnotation: js.UndefOr[GoogleCloudDialogflowV2MessageAnnotation] = js.undefined
  
  /** The unique identifier of the message. Format: `projects//conversations//messages/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The participant that sends this message. */
  var participant: js.UndefOr[String] = js.undefined
  
  /** Output only. The role of the participant. */
  var participantRole: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2Message {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Message]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2MessageMutableBuilder[Self <: GoogleCloudDialogflowV2Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setMessageAnnotation(value: GoogleCloudDialogflowV2MessageAnnotation): Self = StObject.set(x, "messageAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageAnnotationUndefined: Self = StObject.set(x, "messageAnnotation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParticipant(value: String): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantRole(value: String): Self = StObject.set(x, "participantRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantRoleUndefined: Self = StObject.set(x, "participantRole", js.undefined)
    
    @scala.inline
    def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
  }
}
