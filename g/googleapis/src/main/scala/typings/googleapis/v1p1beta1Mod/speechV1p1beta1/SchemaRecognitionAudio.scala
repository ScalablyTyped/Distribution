package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

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
  def apply(): SchemaRecognitionAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognitionAudio]
  }
  @scala.inline
  implicit class SchemaRecognitionAudioOps[Self <: SchemaRecognitionAudio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

