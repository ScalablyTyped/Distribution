package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudio extends StObject {
  
  /**
    * Segments this audio response is composed of.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudio {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudio]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudio](x: Self) {
    
    inline def setSegments(value: js.Array[SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment*): Self = StObject.set(x, "segments", js.Array(value*))
  }
}
