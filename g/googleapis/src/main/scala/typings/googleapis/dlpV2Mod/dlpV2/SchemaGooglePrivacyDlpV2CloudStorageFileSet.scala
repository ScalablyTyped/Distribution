package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message representing a set of files in Cloud Storage.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CloudStorageFileSet extends js.Object {
  /**
    * The url, in the format `gs://&lt;bucket&gt;/&lt;path&gt;`. Trailing
    * wildcard in the path is allowed.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CloudStorageFileSet {
  @scala.inline
  def apply(url: String = null): SchemaGooglePrivacyDlpV2CloudStorageFileSet = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageFileSet]
  }
}

