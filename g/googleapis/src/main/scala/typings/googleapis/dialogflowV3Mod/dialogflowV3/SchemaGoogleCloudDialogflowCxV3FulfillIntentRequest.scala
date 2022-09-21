package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3FulfillIntentRequest extends StObject {
  
  /**
    * The matched intent/event to fulfill.
    */
  var `match`: js.UndefOr[SchemaGoogleCloudDialogflowCxV3Match] = js.undefined
  
  /**
    * Must be same as the corresponding MatchIntent request, otherwise the behavior is undefined.
    */
  var matchIntentRequest: js.UndefOr[SchemaGoogleCloudDialogflowCxV3MatchIntentRequest] = js.undefined
  
  /**
    * Instructs the speech synthesizer how to generate output audio.
    */
  var outputAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowCxV3OutputAudioConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3FulfillIntentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3FulfillIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3FulfillIntentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3FulfillIntentRequest](x: Self) {
    
    inline def setMatch(value: SchemaGoogleCloudDialogflowCxV3Match): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchIntentRequest(value: SchemaGoogleCloudDialogflowCxV3MatchIntentRequest): Self = StObject.set(x, "matchIntentRequest", value.asInstanceOf[js.Any])
    
    inline def setMatchIntentRequestUndefined: Self = StObject.set(x, "matchIntentRequest", js.undefined)
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setOutputAudioConfig(value: SchemaGoogleCloudDialogflowCxV3OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
  }
}
