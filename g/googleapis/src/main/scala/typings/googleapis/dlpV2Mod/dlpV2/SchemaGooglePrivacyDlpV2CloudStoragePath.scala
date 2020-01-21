package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message representing a single file or path in Cloud Storage.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CloudStoragePath extends js.Object {
  /**
    * A url representing a file or path (no wildcards) in Cloud Storage.
    * Example: gs://[BUCKET_NAME]/dictionary.txt
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CloudStoragePath {
  @scala.inline
  def apply(path: String = null): SchemaGooglePrivacyDlpV2CloudStoragePath = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStoragePath]
  }
}

