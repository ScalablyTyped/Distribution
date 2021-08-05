package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ResponseMessageMixedAudio extends StObject {
  
  /** Segments this audio response is composed of. */
  var segments: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment]] = js.undefined
}
object GoogleCloudDialogflowCxV3ResponseMessageMixedAudio {
  
  inline def apply(): GoogleCloudDialogflowCxV3ResponseMessageMixedAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResponseMessageMixedAudio]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ResponseMessageMixedAudio](x: Self) {
    
    inline def setSegments(value: js.Array[GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
