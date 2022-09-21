package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2Message extends StObject {
  
  /**
    * Required. The message content.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the message was created in Contact Center AI.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The message language. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The annotation for the message.
    */
  var messageAnnotation: js.UndefOr[SchemaGoogleCloudDialogflowV2MessageAnnotation] = js.undefined
  
  /**
    * Optional. The unique identifier of the message. Format: `projects//locations//conversations//messages/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The participant that sends this message.
    */
  var participant: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The role of the participant.
    */
  var participantRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The time when the message was sent.
    */
  var sendTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The sentiment analysis result for the message.
    */
  var sentimentAnalysis: js.UndefOr[SchemaGoogleCloudDialogflowV2SentimentAnalysisResult] = js.undefined
}
object SchemaGoogleCloudDialogflowV2Message {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Message]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2Message](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMessageAnnotation(value: SchemaGoogleCloudDialogflowV2MessageAnnotation): Self = StObject.set(x, "messageAnnotation", value.asInstanceOf[js.Any])
    
    inline def setMessageAnnotationUndefined: Self = StObject.set(x, "messageAnnotation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParticipant(value: String): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantNull: Self = StObject.set(x, "participant", null)
    
    inline def setParticipantRole(value: String): Self = StObject.set(x, "participantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleNull: Self = StObject.set(x, "participantRole", null)
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "participantRole", js.undefined)
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setSendTime(value: String): Self = StObject.set(x, "sendTime", value.asInstanceOf[js.Any])
    
    inline def setSendTimeNull: Self = StObject.set(x, "sendTime", null)
    
    inline def setSendTimeUndefined: Self = StObject.set(x, "sendTime", js.undefined)
    
    inline def setSentimentAnalysis(value: SchemaGoogleCloudDialogflowV2SentimentAnalysisResult): Self = StObject.set(x, "sentimentAnalysis", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisUndefined: Self = StObject.set(x, "sentimentAnalysis", js.undefined)
  }
}
