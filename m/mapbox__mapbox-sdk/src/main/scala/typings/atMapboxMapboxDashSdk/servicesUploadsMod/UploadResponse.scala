package typings.atMapboxMapboxDashSdk.servicesUploadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadResponse extends js.Object {
  var complete: Boolean
  var created: String
  var error: js.UndefOr[js.Any] = js.undefined
  var id: String
  var modified: String
  var name: String
  var owner: String
  var progress: Double
  var tileset: String
}

object UploadResponse {
  @scala.inline
  def apply(
    complete: Boolean,
    created: String,
    id: String,
    modified: String,
    name: String,
    owner: String,
    progress: Double,
    tileset: String,
    error: js.Any = null
  ): UploadResponse = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], tileset = tileset.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadResponse]
  }
}

