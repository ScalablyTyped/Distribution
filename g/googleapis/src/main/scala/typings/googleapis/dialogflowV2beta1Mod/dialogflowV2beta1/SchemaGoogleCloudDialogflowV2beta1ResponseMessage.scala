package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ResponseMessage extends StObject {
  
  /**
    * A signal that indicates the interaction with the Dialogflow agent has ended.
    */
  var endInteraction: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1ResponseMessageEndInteraction] = js.undefined
  
  /**
    * Hands off conversation to a live agent.
    */
  var liveAgentHandoff: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff] = js.undefined
  
  /**
    * An audio response message composed of both the synthesized Dialogflow agent responses and the audios hosted in places known to the client.
    */
  var mixedAudio: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1ResponseMessageMixedAudio] = js.undefined
  
  /**
    * Returns a response containing a custom, platform-specific payload.
    */
  var payload: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * A signal that the client should transfer the phone call connected to this agent to a third-party endpoint.
    */
  var telephonyTransferCall: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1ResponseMessageTelephonyTransferCall] = js.undefined
  
  /**
    * Returns a text response.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1ResponseMessageText] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ResponseMessage {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ResponseMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ResponseMessage]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ResponseMessage](x: Self) {
    
    inline def setEndInteraction(value: SchemaGoogleCloudDialogflowV2beta1ResponseMessageEndInteraction): Self = StObject.set(x, "endInteraction", value.asInstanceOf[js.Any])
    
    inline def setEndInteractionUndefined: Self = StObject.set(x, "endInteraction", js.undefined)
    
    inline def setLiveAgentHandoff(value: SchemaGoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff): Self = StObject.set(x, "liveAgentHandoff", value.asInstanceOf[js.Any])
    
    inline def setLiveAgentHandoffUndefined: Self = StObject.set(x, "liveAgentHandoff", js.undefined)
    
    inline def setMixedAudio(value: SchemaGoogleCloudDialogflowV2beta1ResponseMessageMixedAudio): Self = StObject.set(x, "mixedAudio", value.asInstanceOf[js.Any])
    
    inline def setMixedAudioUndefined: Self = StObject.set(x, "mixedAudio", js.undefined)
    
    inline def setPayload(value: StringDictionary[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setTelephonyTransferCall(value: SchemaGoogleCloudDialogflowV2beta1ResponseMessageTelephonyTransferCall): Self = StObject.set(x, "telephonyTransferCall", value.asInstanceOf[js.Any])
    
    inline def setTelephonyTransferCallUndefined: Self = StObject.set(x, "telephonyTransferCall", js.undefined)
    
    inline def setText(value: SchemaGoogleCloudDialogflowV2beta1ResponseMessageText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
