package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ResponseMessageMixedAudio extends StObject {
  
  /** Segments this audio response is composed of. */
  var segments: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment]] = js.undefined
}
object GoogleCloudDialogflowCxV3ResponseMessageMixedAudio {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3ResponseMessageMixedAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResponseMessageMixedAudio]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3ResponseMessageMixedAudioMutableBuilder[Self <: GoogleCloudDialogflowCxV3ResponseMessageMixedAudio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
