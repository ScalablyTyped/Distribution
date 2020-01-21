package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPopulateVersionFilesResponse extends js.Object {
  /**
    * The content hashes of the specified files that need to be uploaded to the
    * specified endpoint.
    */
  var uploadRequiredHashes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The URL to which the files should be uploaded, in the format:
    * &lt;br&gt;&quot;https://upload-firebasehosting.googleapis.com/upload/sites/&lt;var&gt;site-name&lt;/var&gt;/versions/&lt;var&gt;versionID&lt;/var&gt;/files&quot;.
    * &lt;br&gt;Perform a multipart `POST` of the Gzipped file contents to the
    * URL using a forward slash and the hash of the file appended to the end.
    */
  var uploadUrl: js.UndefOr[String] = js.native
}

object SchemaPopulateVersionFilesResponse {
  @scala.inline
  def apply(uploadRequiredHashes: js.Array[String] = null, uploadUrl: String = null): SchemaPopulateVersionFilesResponse = {
    val __obj = js.Dynamic.literal()
    if (uploadRequiredHashes != null) __obj.updateDynamic("uploadRequiredHashes")(uploadRequiredHashes.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPopulateVersionFilesResponse]
  }
}

