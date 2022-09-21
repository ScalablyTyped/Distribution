package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio extends StObject {
  
  /**
    * Segments this audio response is composed of.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio](x: Self) {
    
    inline def setSegments(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment*): Self = StObject.set(x, "segments", js.Array(value*))
  }
}
