package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListVersionFilesResponse extends js.Object {
  /**
    * The list path/hashes in the specified version.
    */
  var files: js.UndefOr[js.Array[SchemaVersionFile]] = js.native
  /**
    * The pagination token, if more results exist.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListVersionFilesResponse {
  @scala.inline
  def apply(files: js.Array[SchemaVersionFile] = null, nextPageToken: String = null): SchemaListVersionFilesResponse = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListVersionFilesResponse]
  }
}

