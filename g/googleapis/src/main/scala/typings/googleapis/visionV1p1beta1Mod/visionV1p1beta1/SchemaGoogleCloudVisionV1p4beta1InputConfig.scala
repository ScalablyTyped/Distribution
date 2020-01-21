package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The desired input location and metadata.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1InputConfig extends js.Object {
  /**
    * File content, represented as a stream of bytes. Note: As with all `bytes`
    * fields, protobuffers use a pure binary representation, whereas JSON
    * representations use base64.  Currently, this field only works for
    * BatchAnnotateFiles requests. It does not work for AsyncBatchAnnotateFiles
    * requests.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The Google Cloud Storage location to read the input from.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1GcsSource] = js.native
  /**
    * The type of the file. Currently only &quot;application/pdf&quot; and
    * &quot;image/tiff&quot; are supported. Wildcards are not supported.
    */
  var mimeType: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1InputConfig {
  @scala.inline
  def apply(
    content: String = null,
    gcsSource: SchemaGoogleCloudVisionV1p4beta1GcsSource = null,
    mimeType: String = null
  ): SchemaGoogleCloudVisionV1p4beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (gcsSource != null) __obj.updateDynamic("gcsSource")(gcsSource.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1InputConfig]
  }
}

