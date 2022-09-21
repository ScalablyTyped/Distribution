package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1GcsSource extends StObject {
  
  /**
    * Cloud Storage URI that points to a file that contains the conversation audio.
    */
  var audioUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Cloud Storage URI that points to a file that contains the conversation transcript.
    */
  var transcriptUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1GcsSource {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1GcsSource]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1GcsSource](x: Self) {
    
    inline def setAudioUri(value: String): Self = StObject.set(x, "audioUri", value.asInstanceOf[js.Any])
    
    inline def setAudioUriNull: Self = StObject.set(x, "audioUri", null)
    
    inline def setAudioUriUndefined: Self = StObject.set(x, "audioUri", js.undefined)
    
    inline def setTranscriptUri(value: String): Self = StObject.set(x, "transcriptUri", value.asInstanceOf[js.Any])
    
    inline def setTranscriptUriNull: Self = StObject.set(x, "transcriptUri", null)
    
    inline def setTranscriptUriUndefined: Self = StObject.set(x, "transcriptUri", js.undefined)
  }
}
