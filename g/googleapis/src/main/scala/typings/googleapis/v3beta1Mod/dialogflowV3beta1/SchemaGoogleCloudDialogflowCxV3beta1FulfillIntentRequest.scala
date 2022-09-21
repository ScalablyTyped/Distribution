package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentRequest extends StObject {
  
  /**
    * The matched intent/event to fulfill.
    */
  var `match`: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1Match] = js.undefined
  
  /**
    * Must be same as the corresponding MatchIntent request, otherwise the behavior is undefined.
    */
  var matchIntentRequest: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1MatchIntentRequest] = js.undefined
  
  /**
    * Instructs the speech synthesizer how to generate output audio.
    */
  var outputAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1OutputAudioConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentRequest](x: Self) {
    
    inline def setMatch(value: SchemaGoogleCloudDialogflowCxV3beta1Match): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchIntentRequest(value: SchemaGoogleCloudDialogflowCxV3beta1MatchIntentRequest): Self = StObject.set(x, "matchIntentRequest", value.asInstanceOf[js.Any])
    
    inline def setMatchIntentRequestUndefined: Self = StObject.set(x, "matchIntentRequest", js.undefined)
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setOutputAudioConfig(value: SchemaGoogleCloudDialogflowCxV3beta1OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
  }
}
