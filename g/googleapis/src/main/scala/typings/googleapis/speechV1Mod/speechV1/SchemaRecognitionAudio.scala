package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains audio data in the encoding specified in the `RecognitionConfig`.
  * Either `content` or `uri` must be supplied. Supplying both or neither
  * returns google.rpc.Code.INVALID_ARGUMENT. See [content
  * limits](/speech-to-text/quotas#content).
  */
trait SchemaRecognitionAudio extends StObject {
  
  /**
    * The audio data bytes encoded as specified in `RecognitionConfig`. Note:
    * as with all bytes fields, protobuffers use a pure binary representation,
    * whereas JSON representations use base64.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * URI that points to a file that contains audio data bytes as specified in
    * `RecognitionConfig`. The file must not be compressed (for example, gzip).
    * Currently, only Google Cloud Storage URIs are supported, which must be
    * specified in the following format: `gs://bucket_name/object_name` (other
    * URI formats return google.rpc.Code.INVALID_ARGUMENT). For more
    * information, see [Request
    * URIs](https://cloud.google.com/storage/docs/reference-uris).
    */
  var uri: js.UndefOr[String] = js.undefined
}
object SchemaRecognitionAudio {
  
  inline def apply(): SchemaRecognitionAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognitionAudio]
  }
  
  extension [Self <: SchemaRecognitionAudio](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
