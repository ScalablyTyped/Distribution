package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1DialogflowSource extends StObject {
  
  /**
    * Cloud Storage URI that points to a file that contains the conversation audio.
    */
  var audioUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the Dialogflow conversation that this conversation resource is derived from. Format: projects/{project\}/locations/{location\}/conversations/{conversation\}
    */
  var dialogflowConversation: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1DialogflowSource {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1DialogflowSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1DialogflowSource]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1DialogflowSource](x: Self) {
    
    inline def setAudioUri(value: String): Self = StObject.set(x, "audioUri", value.asInstanceOf[js.Any])
    
    inline def setAudioUriNull: Self = StObject.set(x, "audioUri", null)
    
    inline def setAudioUriUndefined: Self = StObject.set(x, "audioUri", js.undefined)
    
    inline def setDialogflowConversation(value: String): Self = StObject.set(x, "dialogflowConversation", value.asInstanceOf[js.Any])
    
    inline def setDialogflowConversationNull: Self = StObject.set(x, "dialogflowConversation", null)
    
    inline def setDialogflowConversationUndefined: Self = StObject.set(x, "dialogflowConversation", js.undefined)
  }
}
