package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of `GenerateUploadUrl` method.
  */
@js.native
trait SchemaGenerateUploadUrlResponse extends js.Object {
  /**
    * The generated Google Cloud Storage signed URL that should be used for a
    * function source code upload. The uploaded file should be a zip archive
    * which contains a function.
    */
  var uploadUrl: js.UndefOr[String] = js.native
}

object SchemaGenerateUploadUrlResponse {
  @scala.inline
  def apply(uploadUrl: String = null): SchemaGenerateUploadUrlResponse = {
    val __obj = js.Dynamic.literal()
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGenerateUploadUrlResponse]
  }
}

