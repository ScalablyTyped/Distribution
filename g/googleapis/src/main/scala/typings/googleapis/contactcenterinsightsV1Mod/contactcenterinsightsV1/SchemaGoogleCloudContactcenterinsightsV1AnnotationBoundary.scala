package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary extends StObject {
  
  /**
    * The index in the sequence of transcribed pieces of the conversation where the boundary is located. This index starts at zero.
    */
  var transcriptIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The word index of this boundary with respect to the first word in the transcript piece. This index starts at zero.
    */
  var wordIndex: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary](x: Self) {
    
    inline def setTranscriptIndex(value: Double): Self = StObject.set(x, "transcriptIndex", value.asInstanceOf[js.Any])
    
    inline def setTranscriptIndexNull: Self = StObject.set(x, "transcriptIndex", null)
    
    inline def setTranscriptIndexUndefined: Self = StObject.set(x, "transcriptIndex", js.undefined)
    
    inline def setWordIndex(value: Double): Self = StObject.set(x, "wordIndex", value.asInstanceOf[js.Any])
    
    inline def setWordIndexNull: Self = StObject.set(x, "wordIndex", null)
    
    inline def setWordIndexUndefined: Self = StObject.set(x, "wordIndex", js.undefined)
  }
}
