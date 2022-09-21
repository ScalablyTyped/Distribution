package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ResponseMessageMixedAudio extends StObject {
  
  /**
    * Segments this audio response is composed of.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1ResponseMessageMixedAudioSegment]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ResponseMessageMixedAudio {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ResponseMessageMixedAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ResponseMessageMixedAudio]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ResponseMessageMixedAudio](x: Self) {
    
    inline def setSegments(value: js.Array[SchemaGoogleCloudDialogflowV2beta1ResponseMessageMixedAudioSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SchemaGoogleCloudDialogflowV2beta1ResponseMessageMixedAudioSegment*): Self = StObject.set(x, "segments", js.Array(value*))
  }
}
