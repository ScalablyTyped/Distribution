package typings.googleapis.speechV1Mod.speechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains audio data in the encoding specified in the `RecognitionConfig`.
  * Either `content` or `uri` must be supplied. Supplying both or neither
  * returns google.rpc.Code.INVALID_ARGUMENT. See [content
  * limits](/speech-to-text/quotas#content).
  */
@js.native
trait SchemaRecognitionAudio extends js.Object {
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
  def apply(content: String = null, uri: String = null): SchemaRecognitionAudio = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRecognitionAudio]
  }
}

