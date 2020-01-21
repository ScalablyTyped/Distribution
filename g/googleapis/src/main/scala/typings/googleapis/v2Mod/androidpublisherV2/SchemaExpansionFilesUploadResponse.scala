package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExpansionFilesUploadResponse extends js.Object {
  var expansionFile: js.UndefOr[SchemaExpansionFile] = js.native
}

object SchemaExpansionFilesUploadResponse {
  @scala.inline
  def apply(expansionFile: SchemaExpansionFile = null): SchemaExpansionFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (expansionFile != null) __obj.updateDynamic("expansionFile")(expansionFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExpansionFilesUploadResponse]
  }
}

