package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio extends StObject {
  
  /** Segments this audio response is composed of. */
  var segments: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment]] = js.native
}
object GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioMutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
