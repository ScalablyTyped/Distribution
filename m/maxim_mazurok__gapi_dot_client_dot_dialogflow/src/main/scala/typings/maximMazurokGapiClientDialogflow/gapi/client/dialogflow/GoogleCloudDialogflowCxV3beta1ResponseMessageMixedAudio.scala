package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio extends StObject {
  
  /** Segments this audio response is composed of. */
  var segments: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio] (val x: Self) extends AnyVal {
    
    inline def setSegments(value: js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment*): Self = StObject.set(x, "segments", js.Array(value*))
  }
}
