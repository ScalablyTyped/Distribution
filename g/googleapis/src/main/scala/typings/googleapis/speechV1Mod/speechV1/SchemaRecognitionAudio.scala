package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains audio data in the encoding specified in the `RecognitionConfig`.
  * Either `content` or `uri` must be supplied. Supplying both or neither
  * returns google.rpc.Code.INVALID_ARGUMENT. See [content
  * limits](/speech-to-text/quotas#content).
  */
@js.native
trait SchemaRecognitionAudio extends StObject {
  
  /**
    * The audio data bytes encoded as specified in `RecognitionConfig`. Note:
    * as with all bytes fields, protobuffers use a pure binary representation,
    * whereas JSON representations use base64.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * URI that points to a file that contains audio data bytes as specified in
    * `RecognitionConfig`. The file must not be compressed (for example, gzip).
    * Currently, only Google Cloud Storage URIs are supported, which must be
    * specified in the following format: `gs://bucket_name/object_name` (other
    * URI formats return google.rpc.Code.INVALID_ARGUMENT). For more
    * information, see [Request
    * URIs](https://cloud.google.com/storage/docs/reference-uris).
    */
  var uri: js.UndefOr[String] = js.native
}
object SchemaRecognitionAudio {
  
  @scala.inline
  def apply(): SchemaRecognitionAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognitionAudio]
  }
  
  @scala.inline
  implicit class SchemaRecognitionAudioMutableBuilder[Self <: SchemaRecognitionAudio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
